package cyclone.core.spi;

import java.util.Collection;
import java.util.Collections;

public class CloneSearch {
	public final long id;
	public final String target_file;
	public final long start_line;
	public final long end_line;
	public final Collection<String> source_files;
	
	/**
	 * 
	 * @param id
	 * @param target_file		Should *always* be absolute file location,
	 * 							because some strategies rely on this for
	 * 							rejection of candidates from the same
	 * 							code that is being searched. Ugly,
	 * 							but meh.
	 * @param start_line
	 * @param end_line
	 * @param source_files
	 */
	public CloneSearch(long id, String target_file, long start_line, long end_line, Collection<String> source_files)
	{
		this.id = id;
		this.target_file = target_file;
		this.start_line = start_line;
		this.end_line = end_line;
		this.source_files = Collections.unmodifiableCollection(source_files);
	}
}
