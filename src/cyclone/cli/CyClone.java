package cyclone.cli;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

import cyclone.core.cloneDetector.CloneDetectorServiceProvider;
import cyclone.core.spi.CloneListener;
import cyclone.core.spi.CloneSearch;
import cyclone.core.spi.CloneSearchStatusListener;

//import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import java.util.*;

import picocli.CommandLine;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

public class CyClone implements Callable<Void> {

	// https://github.com/clonebench/BigCloneBench seems broken, but leads to
	// https://jeffsvajlenko.weebly.com/bigcloneeval.html, which leads to
	// https://www.dropbox.com/s/z2k8r78l63r68os/BigCloneBench_BCEvalVersion.tar.gz?dl=0
	// 
	
//    @Parameters(index = "0", description = "The file whose checksum to calculate.")
//    private File file;

    @Option(names = {"-S", "--sources"}, split=":", description = "source directories to investigate")
    private String[] src_dir = { "." };
    
    @Option(names = {"-R", "--recursive"}, description = "search source directories recursively")
    private boolean recursive;
    
    @Option(names = {"-v", "--verbose"}, description = "verbosity")
    private boolean verbose;
    
    @Option(names = {"-F"}, description = "force a refresh of partial file indices")
    private boolean force_refresh;
    
    @Option(names = {"-d", "--debug"}, description = "debug")
    private boolean debug;
    
    @Parameters(index = "0", description = "target code chunk (filename:start_line:end_line")
    private String target;
    
    
    private String work_dir = "/tmp/rawData/";
    private String top_work_dir = "/tmp/"; // anything other than partial index files in "/tmp/rawData" causes crashes
    
    private final static Logger LOGGER = Logger.getLogger(CyClone.class.getName());
    static {
    	LOGGER.setLevel(Level.OFF);
    }
    
    public static void main(String[] args) throws Exception {
        CommandLine.call(new CyClone(), args);
    }
    
	static class SourceWalker extends SimpleFileVisitor<Path> {
		private final PathMatcher matcher;
		
		private Set<String> visited = new HashSet<String>();
		
		public SourceWalker() {
			
			/*
			 * FIXME - I only support java files!
			 */
			matcher = FileSystems.getDefault()
                    .getPathMatcher("glob:" + "**.java");
		}
		
		public Set<String> get_visited() {
			return visited;
		}
		
		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			/* Early return for files that aren't processable */
			if (!this.matcher.matches(file)) {
				LOGGER.warning(file.toAbsolutePath().toString() + " does not match");
				return CONTINUE;
			}
			
			/* Marked as visited */
			visited.add(file.toAbsolutePath().normalize().toString());
			
			/* Add partial index of all interesting files to the working directory */
			LOGGER.fine("generating partial index for "
					+ file.toAbsolutePath().toString());
			
			return CONTINUE;
		}
	}
    
    @Override
    public Void call() throws Exception {
    	String t_file;
    	int t_start;
    	int t_end;
    	
    	String[] tgt_strings = target.split(":");
    	if (tgt_strings.length == 3) {
    		t_file = tgt_strings[0];
    		t_start = Integer.parseInt(tgt_strings[1]);
    		t_end = Integer.parseInt(tgt_strings[2]);
    	} else {
    		throw new Exception("not supported");
		}
    	
    	/* Sterilize path, always work in absolutes */
    	t_file = new File(t_file).toPath().toAbsolutePath().normalize().toString();
    	
    	LOGGER.fine("Searching for " + t_file + " start="
    			+ t_start + " end=" + t_end + ":");

		StringBuffer buffer = new StringBuffer();	
		
		try (Stream<String> lines = Files.lines(Paths.get(t_file))) {
			int first_line = Integer.max(t_start - 1, 0);
		    
		    Iterator<String> iter = lines.skip(first_line).iterator();
		    String line;
		    for (int i = first_line; i < t_end && iter.hasNext(); i++) {
		    	line = iter.next();
			    buffer.append(line);
				if (this.debug) {
					System.out.println("\t" + line);
				}
		    }
		}
		
		/*
		 * Generate or update the partial indices for all the files on the
		 * search path.
		 */
		SourceWalker finder = new SourceWalker();
		Set<FileVisitOption> options = new HashSet<FileVisitOption>();
		int depth;
		
		if (this.recursive) {
			depth = Integer.MAX_VALUE;
		} else {
			depth = 1;
		}
		
		/* Generate partial indices for source files */
		for (String s : this.src_dir) {			
	        Files.walkFileTree(Paths.get(s), options, depth, finder);
		}
		
		CloneDetectorServiceProvider detector;
		detector = CloneDetectorServiceProvider.getInstance();
		
		CloneListener listener = new CloneListener() {
			@Override
			public void notifyCloneDetected(CloneSearch search,
					String clone_file, long start_line, long end_line,
					double confidence, String strategy, long time) {
				System.out.printf("Discovered %s:%d:%d, strategy=%s "
						+ "confidence=%.2f time=%d ms\n",
						clone_file, start_line, end_line,
						strategy, confidence,  time);
			}
		};
		
		CloneSearchStatusListener statusListener = new CloneSearchStatusListener() {

			@Override
			public void notifyComplete(CloneSearch spec) {
				System.out.println("COMPLETE");
			}
			
		};
		
		detector.getClones(t_file, t_start, t_end, finder.get_visited(), listener, statusListener);
    	
        return null;
    }
}
