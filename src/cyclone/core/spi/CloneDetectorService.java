package cyclone.core.spi;

public interface CloneDetectorService {
	public String[] getSupportedExtensions();
    
	public void search(CloneSearch spec, CloneListener listener,
			CloneSearchStatusListener statusListener);
	
	public void cancel(CloneSearch spec);
	
	public void updateCache(String source_file);
}
