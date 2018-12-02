
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
			Random rand = new Random(System.currentTimeMillis() + seed);
			
			/* Pick random lines from the supplied sources */
			int file_idx = rand.nextInt(search.source_files.size());
			Iterator<String> iter = search.source_files.iterator();
			
			String filename = (String)search.source_files.toArray()
					[rand.nextInt(search.source_files.size())];
			while (iter.hasNext()) {
				String s = iter.next();
				
				if (--file_idx <= 0) {
					filename = s;
					break;
				}
			}
			
			int max_lines = 0;
			
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				while (reader.readLine() != null) max_lines++;
				reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			long start_line = rand.nextInt(max_lines);
			long end_line = Long.min(max_lines, start_line
					+ search.end_line
					- search.start_line
					+ (long)rand.nextInt(TestCC.MAX_ADDITIONAL_CLONE_LINES));
			
			long search_time = (long)(TestCC.MAX_PROCESS_TIME_S *
					rand.nextDouble() * 1000);
			double confidence = rand.nextFloat();
			
			try {
				Thread.sleep(search_time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			listener.notifyCloneDetected(search, filename,
					start_line, end_line, confidence,
					"RANDOM_STRATEGY", search_time);
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
