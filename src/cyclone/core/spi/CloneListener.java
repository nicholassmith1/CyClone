package cyclone.core.spi;

public interface CloneListener {

	public void notifyCloneDetected(CloneSearch search, String clone_file,
			long start_line, long end_line, double confidence,
			String strategy, long time);
}
