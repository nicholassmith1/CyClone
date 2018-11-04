package cyclone.core.spi;

public interface CloneDetectorService {
	public void search(CloneSearch spec, CloneListener listener);
	
	public void cancel(CloneSearch spec);
	
	public void updateCache(String source_file);
}
