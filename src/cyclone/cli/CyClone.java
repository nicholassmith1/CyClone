package cyclone.cli;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

import cyclone.cli.antlr.MethodExtractor;
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
    private boolean verbose = false;
    
    /* FIXME - needs implementing */
    @Option(names = {"-F"}, description = "force a refresh of partial file indices")
    private boolean force_refresh;
    
    @Option(names = {"-d", "--debug"}, description = "debug")
    private boolean debug;
    
    @Parameters(index = "0", arity = "0..*", description = 
    		"Specifies what code to look for code clones of. The following options are supported:\n"
    		+ "--             Search for any clones in the source directories\n"
    		+ "<file>         Search for the clones of every method in <file>\n"
    		+ "<file>:<line>  Search for clones of the method that contains line number <line>\n"
    		+ "<file>:<start_line>:<end_line>  Search for clones of the define code chunk\n"
    		)
    private String target = null;

    
    private final static Logger LOGGER = Logger.getLogger("CyClone");
    static {
    	LOGGER.setLevel(Level.OFF);
    	ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.OFF);
        LOGGER.addHandler(handler);
    }
    
    public static void main(String[] args) throws Exception {
        CommandLine.call(new CyClone(), args);
    }
    
	static class SourceWalker extends SimpleFileVisitor<Path> {
		private final PathMatcher matcher;
		
		private Set<String> visited = new HashSet<String>();
		
		public SourceWalker() {
			CloneDetectorServiceProvider cloneDetector = 
					CloneDetectorServiceProvider.getInstance();
			
			String[] extensions = cloneDetector.getSupportedExtensions();
			String glob = String.join(",", extensions);
			
			matcher = FileSystems.getDefault()
                    .getPathMatcher("glob:" + "**.{" + glob + "}");
			
			LOGGER.info("SourceWalker: " + "glob:" + "**.{" + glob + "}");
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
			
			return CONTINUE;
		}
	}
	
	/**
	 * Get all the files in the search space that SPI modules are
	 * capable of processing.
	 * @return
	 * @throws IOException
	 */
	private Set<String> getSearchSources() throws IOException {
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
		
		return finder.get_visited();
	}
	
	private void searchAllMethods(String t_file) throws IOException {
		MethodExtractor methodExtractor = MethodExtractor.getInstance();
		int t_start;
		int t_end;
		
		Map<String, String> methods =
				methodExtractor.getMethods(t_file);
		
		for (String m : methods.keySet()) {
			String[] lines = m.split(",");
			t_start = Integer.parseInt(lines[0]);
			t_end = Integer.parseInt(lines[1]);
			
			searchSingle(t_file, t_start, t_end);
		}
	}
	
	private void searchSingle(String t_file, int t_start, int t_end) throws IOException {

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
		Set<String> searchSources = getSearchSources();
		
		CloneDetectorServiceProvider detector;
		detector = CloneDetectorServiceProvider.getInstance();
		
		CloneListener listener = new CloneListener() {
			@Override
			public void notifyCloneDetected(CloneSearch search,
					String clone_file, long start_line, long end_line,
					double confidence, String strategy, long time) {
				System.out.printf("Discovered %s:%d:%d <-->%s:%d:%d, strategy=%s "
						+ "confidence=%.2f time=%d ms\n",
						search.target_file, search.start_line, search.end_line,
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
		
		LOGGER.info("Beggining Search: target=" + t_file + ":" + t_start +
				"," + t_end + " sources=" + searchSources);
		detector.getClones(t_file, t_start, t_end, searchSources, listener, statusListener);
	}
    
    @Override
    public Void call() throws Exception {
    	MethodExtractor methodExtractor = MethodExtractor.getInstance();
    	String t_file;
    	int t_line;
    	int t_start;
    	int t_end;
    	
    	if (debug) {
    		LOGGER.setLevel(Level.FINEST);
    	}
    	
    	/* Determine run mode.
    	 * -  The reserved value "--" is used
    	 * -  No lines are specified: Search all methods
    	 * -  If there is only one line, get the start and end lines
    	 *    for a method containing that line.
    	 * -  If there are two lines, use those as the search bounds.
    	 */
    	if (target == null) {
    		/* Search everything */
    		Set<String> searchSources = getSearchSources();
    		
    		for (String f : searchSources) {
    			searchAllMethods(f);
    		}
    	} else {
    		String[] tgt_strings = target.split(":");

    		if (tgt_strings.length == 1) {
    			/* Search every method in the file */
    			
    			t_file = tgt_strings[0];
    			searchAllMethods(t_file);
    		} else if (tgt_strings.length == 2) {
    			/* Search for a code chunk around the specified line */
    			
    			boolean found = false;
    			t_file = tgt_strings[0];
        		t_line = Integer.parseInt(tgt_strings[1]);
    			
    			Map<String, String> methods =
    					methodExtractor.getMethods(t_file);
    			
    			for (String m : methods.keySet()) {
    				String[] lines = m.split(",");
    				t_start = Integer.parseInt(lines[0]);
    				t_end = Integer.parseInt(lines[1]);
    				if ((t_line >= t_start) && (t_line <= t_end)) {
    					searchSingle(t_file, t_start, t_end);
    					found = true;
    					break;
    				}
    			}
    			
    			/* Report errors */
    			if (!found) {
    				System.out.println("Unable to find code chunk for " +
    						t_file + ":" + t_line);
    				System.exit(1);
    			}
        	} else if (tgt_strings.length == 3) {
        		/* Search for a single fully bounded chunk */
        		
        		t_file = tgt_strings[0];
        		t_start = Integer.parseInt(tgt_strings[1]);
        		t_end = Integer.parseInt(tgt_strings[2]);
        		searchSingle(t_file, t_start, t_end);
        	}
        	else {
        		System.out.println("Invalid option \"" + target + "\"");
        		System.exit(1);;
    		}
    	}

        return null;
    }
}
