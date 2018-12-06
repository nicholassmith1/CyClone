package cyclone.core.cloneDetector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import cyclone.core.spi.CloneDetectorService;
import cyclone.core.spi.CloneListener;
import cyclone.core.spi.CloneSearch;
import cyclone.core.spi.CloneSearchStatusListener;

public class CloneDetectorServiceProvider {
	
	private static CloneDetectorServiceProvider instance = null;
	private ServiceLoader<CloneDetectorService> loader;
	private long id;

	private CloneDetectorServiceProvider() {
		loader = ServiceLoader.load(CloneDetectorService.class);
	}
	
	public static synchronized CloneDetectorServiceProvider getInstance() {
		if (instance == null) {
			instance = new CloneDetectorServiceProvider();
		}
		
		return instance;
	}

	public String[] getSupportedExtensions() {
        	HashSet<String> exported = new HashSet<>();
    		
            try {
                Iterator<CloneDetectorService> detectors = loader.iterator();
                while (detectors != null && detectors.hasNext()) {
                    CloneDetectorService d = detectors.next();
                    
                    exported.addAll(Arrays.asList(d.getSupportedExtensions()));
                }
            } catch (ServiceConfigurationError serviceError) {
                serviceError.printStackTrace();
            }
            
            String[] rtn = new String[exported.size()];
            exported.toArray(rtn);
            
            return rtn;
        }
	
	public CloneSearch getClones(String target_file, long start_line,
			long end_line, Collection<String> source_files,
			CloneListener listener,
			CloneSearchStatusListener statusListener) {
		CloneSearch search;
		
		search = new CloneSearch(id++, target_file,
				start_line, end_line, source_files);
		
        try {
            Iterator<CloneDetectorService> detectors = loader.iterator();
            while (detectors != null && detectors.hasNext()) {
                CloneDetectorService d = detectors.next();
                d.search(search, listener, statusListener);
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
        
        return search;
	}
	
	public void cancelSearch(CloneSearch search) {
		try {
            Iterator<CloneDetectorService> detectors = loader.iterator();
            while (detectors != null && detectors.hasNext()) {
                CloneDetectorService d = detectors.next();
                d.cancel(search);
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
	}
	
	public void updateCache(String filename) {
		try {
            Iterator<CloneDetectorService> detectors = loader.iterator();
            while (detectors != null && detectors.hasNext()) {
                CloneDetectorService d = detectors.next();
                d.updateCache(filename);
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
	}
}
