
package TestCC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.io.*;
import cyclone.core.spi.CloneDetectorService;
import cyclone.core.spi.CloneListener;
import cyclone.core.spi.CloneSearch;
import cyclone.core.spi.CloneSearchStatusListener;

public class TestCC  implements CloneDetectorService {
	
	static final int MAX_CLONES_DISCOVERED = 10;
	static final int MAX_PROCESS_TIME_S = 20;
	static final int MAX_ADDITIONAL_CLONE_LINES = 15;
	
	static class FakeCloneDetector implements Runnable {
		private CloneSearch search;
		private CloneListener listener;
		private int seed;
		
		public FakeCloneDetector(CloneSearch search,
				CloneListener listener, int seed) {
			this.search = search;
			this.listener = listener;
			this.seed = seed;
		}
		
		public void run() {
			long start = System.currentTimeMillis();
			ArrayList<String> args = new ArrayList<>();
			args.add("java");
			args.add("-jar");
			args.add("/Users/stevenho/eclipse-workspace/CyClone/test/lib/simian-2.5.10.jar");
			for(String file: search.source_files) {
				args.add(file);
			}
			String[] arguments = new String[args.size()];
			arguments = args.toArray(arguments);
			try {
				Process ps=Runtime.getRuntime().exec(arguments);
		        ps.waitFor();
		        java.io.InputStream is=ps.getInputStream();
		        byte b[]=new byte[is.available()];
		        is.read(b,0,b.length);
		        String output = new String(b);
		        String[] lines = output.split("\\r?\\n");
		        for(String line:lines) {
		        	if(line.trim().startsWith("Between")) {
		        		String[] clone = line.trim().split(" ");
		        		Integer start_line = Integer.parseInt(clone[2]);
		        		Integer end_line = Integer.parseInt(clone[4]);
		        		String filename = clone[clone.length-1];
		        		listener.notifyCloneDetected(search, filename,
								start_line, end_line, 99.0,
								"SIMIAN", System.currentTimeMillis()-start);
		        	}
		        }
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
				
}
	
	public String[] getSupportedExtensions() {
		final String[] supportedExtensions = { "c", "cpp", "java", "python", "xml", "h", "hpp" };
		
		return supportedExtensions;
	}
	
	private class SearchEmulator implements Runnable {
		private CloneSearch spec;
		private CloneListener listener;
		private CloneSearchStatusListener statusListener;
		
		public SearchEmulator(CloneSearch spec, CloneListener listener,
				CloneSearchStatusListener statusListener) {
			this.spec = spec;
			this.listener = listener;
			this.statusListener = statusListener;
		}
		
		@Override
		public void run() {
			Random rand = new Random(System.currentTimeMillis());
			ArrayList<Thread> threads = new ArrayList<>();
			
			
			for (int i = 0; i < rand.nextInt(MAX_CLONES_DISCOVERED); i++) {
				Thread t = new Thread(new FakeCloneDetector(spec, listener, i));
				threads.add(t);
				t.start();
			}
			for (Thread t : threads) {
				try {
					t.join();
				} catch (Exception e) {
					;
				}
			}
			
			statusListener.notifyComplete(spec);
		}
	}

	public void search(CloneSearch spec, CloneListener listener,
			CloneSearchStatusListener statusListener) {
		new Thread(new SearchEmulator(spec, listener, statusListener)).start();
	}
	
	public void cancel(CloneSearch spec) {
		// TODO - implement me
	}
	
	public void updateCache(String source_file) {
		;  // intentional NOP
	}
}
