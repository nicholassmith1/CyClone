
package cyclone.core.cloneDetector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.io.*;
import cyclone.core.spi.CloneDetectorService;
import cyclone.core.spi.CloneListener;
import cyclone.core.spi.CloneSearch;

import org.eposoft.jccd.comparators.ast.AcceptFileNames;
import org.eposoft.jccd.comparators.ast.java.NumberLiteralToDouble;
import org.eposoft.jccd.data.ASourceUnit;
import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.SimilarityGroup;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.SimilarityPair;
import org.eposoft.jccd.data.SourceUnitPosition;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.detectors.APipeline;
import org.eposoft.jccd.detectors.ASTDetector;
import org.eposoft.jccd.preprocessors.java.CompleteToBlock;
import org.eposoft.jccd.preprocessors.java.GeneralizeClassDeclarationNames;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodArgumentTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodDeclarationNames;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodReturnTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeVariableDeclarationTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeVariableNames;

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
			//Random rand = new Random(System.currentTimeMillis() + seed);
			
			/* Pick random lines from the supplied sources */
			/**
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
			**/
			long start = System.currentTimeMillis();
			APipeline detector = new ASTDetector();
			ArrayList<JCCDFile> list = new ArrayList<>();
			for (String filename : search.source_files) {
				list.add(new JCCDFile(filename));
			}
			//http://jccd.sourceforge.net/getting_started.html
			JCCDFile[] files = new JCCDFile[search.source_files.size()];
			files = list.toArray(files);
			detector.setSourceFiles(files);
			SimilarityGroupManager m = detector.process();
			detector.addOperator(new GeneralizeMethodDeclarationNames());
			detector.addOperator(new GeneralizeVariableNames());
			detector.addOperator(new CompleteToBlock());
			detector.addOperator(new GeneralizeMethodArgumentTypes());
			detector.addOperator(new GeneralizeMethodReturnTypes());
			detector.addOperator(new GeneralizeVariableDeclarationTypes());
			detector.addOperator(new GeneralizeClassDeclarationNames());
			detector.addOperator(new NumberLiteralToDouble());
			detector.addOperator(new AcceptFileNames());
			//SimilarityPair[] ps = m.getPairs();
			SimilarityGroup[] simGroups = m.getSimilarityGroups();

			if (null == simGroups) {
				simGroups = new SimilarityGroup[0];
			}
			if ((null != simGroups) && (0 < simGroups.length)) {
				for (int i = 0; i < simGroups.length; i++) {
					final ASourceUnit[] nodes = simGroups[i].getNodes();
					for (int j = 0; j < nodes.length; j++) {
						final SourceUnitPosition minPos = getFirstNodePosition((ANode) nodes[j]);
						final SourceUnitPosition maxPos = getLastNodePosition((ANode) nodes[j]);

						ANode fileNode = (ANode) nodes[j];
						while (fileNode.getType() != NodeTypes.FILE.getType()) {
							fileNode = fileNode.getParent();
						}
						String filename = fileNode.getText();
						int start_line = minPos.getLine();
						int startchar = minPos.getCharacter();
						int end_line = maxPos.getLine();
						int endchar = maxPos.getCharacter();
						listener.notifyCloneDetected(search, filename,
								start_line, end_line, 99.0,
								"JCCD_AST", System.currentTimeMillis()-start);
					}
				}
			} else {
				System.out.println("No similar nodes found.");
			}

			APipeline.printSimilarityGroups(m);
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
		CloneSearch search = new CloneSearch(0, "/Users/stevenho/eclipse-workspace/CyClone/test/src/TestCC/TestCC.java", 0, 99, source_files);
		CloneListener listener = new CloneListener() {
			
			@Override
			public void notifyCloneDetected(CloneSearch search, String clone_file, long start_line, long end_line,
					double confidence, String strategy, long time) {
				// TODO Auto-generated method stub
				
			}
		};
		FakeCloneDetector detector = new TestCC.FakeCloneDetector(search, listener, 0);
		detector.run();
	}
	/**
	 * @param node
	 *            any node of the AST
	 * @return first usable position (!= -1) in the tree
	 */
	public static SourceUnitPosition getFirstNodePosition(final ANode node) {
		if (-1 != node.getLine() || node.isLeaf()) {
			return new SourceUnitPosition(node.getLine(), node
					.getCharPositionInLine());
		}

		for (int i = 0; i < node.getChildCount(); i++) {
			final SourceUnitPosition pos = getFirstNodePosition(node
					.getChild(i));
			if (-1 != pos.getLine()) {
				return pos;
			}
		}

		return new SourceUnitPosition(-1, -1);
	}

	/**
	 * @param node
	 *            any node of the AST
	 * @return biggest position in the tree
	 */
	public static SourceUnitPosition getLastNodePosition(final ANode node) {
		SourceUnitPosition max = new SourceUnitPosition(node.getLine(), node
				.getCharPositionInLine());
		if (node.isLeaf()) {
			return max;
		}

		for (int i = 0; i < node.getChildCount(); i++) {
			final SourceUnitPosition pos = getLastNodePosition(node.getChild(i));
			if (pos.getLine() > max.getLine()) {
				max = pos;
			} else if (pos.getLine() == max.getLine()) {
				if (pos.getCharacter() > max.getCharacter()) {
					max = pos;
				}
			}
		}

		return max;
	}
}
