package cyclone.cli.antlr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import cyclone.cli.antlr.grammar.JavaScriptLexer;
import cyclone.cli.antlr.grammar.JavaScriptParser;
import cyclone.cli.antlr.grammar.JavaScriptParserBaseListener;


public class JavaScriptMethodExtractor implements MethodExtractorI {
	/***
	 * Excerpted from "The Definitive ANTLR 4 Reference",
	 * published by The Pragmatic Bookshelf.
	 * Copyrights apply to this code. It may not be used to create training material, 
	 * courses, books, articles, and the like. Contact us if you are in doubt.
	 * We make no guarantees that this code is fit for any purpose. 
	 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
	***/
	public static class ExtractMethodListener extends JavaScriptParserBaseListener{
		JavaScriptParser parser;
		HashMap<String, String> methods;

		public ExtractMethodListener(JavaScriptParser parser) {
			this.parser = parser;
			methods = new HashMap<String, String>();
		}
		
		/**
		 * Returns hashmap of unique method identifier and code
		 * @return
		 */
		public HashMap<String, String> getMethods() {
			return this.methods;
		}

		/** Listen to matches of methodDeclaration */
		@Override
		public void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
			Token start = ctx.getStart();
			Token stop = ctx.getStop();
			
			String key;
			String value = stop.getInputStream().getText(new Interval(start.getStartIndex(), stop.getStopIndex()));

			/* NOTE! This critical step glooms on the line number of the function */
			key = start.getLine() + "," + stop.getLine();
			
			methods.put(key, value);
		}
	}
	
	public Map<String, String> getMethods(String inputFile) {
		HashMap<String, String> methods = new HashMap<>();
		
		try {
	        InputStream is = System.in;
	        if (inputFile != null) {
	            is = new FileInputStream(inputFile);
	        }
	        
			ANTLRInputStream input = new ANTLRInputStream(is);
			
			JavaScriptLexer lexer = new JavaScriptLexer(input);
			lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JavaScriptParser parser = new JavaScriptParser(tokens);
			parser.removeErrorListeners();
			ParserRuleContext tree = parser.program(); // parse
			
			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			ExtractMethodListener extractor = new ExtractMethodListener(parser);
			walker.walk(extractor, tree); // initiate walk of tree with listener

			methods.putAll(extractor.getMethods());
		} catch (FileNotFoundException e) {
			;
		} catch (IOException e) {
			;
		}
		
		return methods;
	}	
}
