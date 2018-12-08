package cyclone.cli.antlr;

import java.util.Map;

public interface MethodExtractorI {
	
	/**
	 * The return map should have keys formatted as
	 * "<start_line>,<end_line>" (e.x "15,26"),
	 * and values of the entire string the comprises the function.
	 * This is critical to cleanly reconstructing the location of
	 * the discovered clones.
	 * @param inputFile
	 * @return
	 */
	public Map<String, String> getMethods(String inputFile);
}
