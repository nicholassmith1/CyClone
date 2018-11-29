
package cyclone.core.cloneDetector;

import java.util.ArrayList;
import java.util.Random;
import cyclone.core.spi.CloneDetectorService;
import cyclone.core.spi.CloneListener;
import cyclone.core.spi.CloneSearch;


public class TestCCJar  implements CloneDetectorService {
	
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

	public void search(CloneSearch spec, CloneListener listener) {
		Random rand = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < rand.nextInt(MAX_CLONES_DISCOVERED); i++) {
			new Thread(new FakeCloneDetector(spec, listener, i)).start();
		}
	}
	
	public void cancel(CloneSearch spec) {
		// TODO - implement me
	}
	
	public void updateCache(String source_file) {
		;  // intentional NOP
	}
	public static void main(String[] args) {
		ArrayList<String> source_files = new ArrayList<>();
		source_files.add("/Users/stevenho/eclipse-workspace/CyClone/test/src/TestCC/TestCC2.java");
		source_files.add("/Users/stevenho/eclipse-workspace/CyClone/test/src/TestCC/TestCC.java");
		CloneSearch search = new CloneSearch(0, "/Users/stevenho/eclipse-workspace/CyClone/test/src/TestCC/TestCC.java", 0, 99, source_files);
		CloneListener listener = new CloneListener() {
			
			@Override
			public void notifyCloneDetected(CloneSearch search, String clone_file, long start_line, long end_line,
					double confidence, String strategy, long time) {
				// TODO Auto-generated method stub
				
			}
		};
		FakeCloneDetector detector = new TestCCJar.FakeCloneDetector(search, listener, 0);
		detector.run();
	}
	
}
