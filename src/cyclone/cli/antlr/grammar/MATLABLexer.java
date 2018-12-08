// Generated from grammar/MATLAB.g4 by ANTLR 4.7.1
package cyclone.cli.antlr.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATLABLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, BREAK=2, CASE=3, CATCH=4, CONTINUE=5, ELSE=6, ELSEIF=7, END=8, FOR=9, 
		FUNCTION=10, GLOBAL=11, IF=12, OTHERWISE=13, PERSISTENT=14, RETURNS=15, 
		SWITCH=16, TRY=17, VARARGIN=18, WHILE=19, CLEAR=20, ENDS=21, DOUBLE_EQ=22, 
		LOG_OR=23, LOG_AND=24, LSTE=25, GRTE=26, NEQ=27, EL_TIMES=28, EL_LEFTDIV=29, 
		EL_RIGHTDIV=30, EL_EXP=31, EL_CCT=32, EQ=33, BIN_OR=34, BIN_AND=35, LST=36, 
		GRT=37, COLON=38, PLUS=39, MINUS=40, NEG=41, TIMES=42, LEFTDIV=43, RIGHTDIV=44, 
		EXP=45, CCT=46, SEMI=47, LPAREN=48, RPAREN=49, LBRACE=50, RBRACE=51, LSBRACE=52, 
		RSBRACE=53, AT=54, DOT=55, COMMA=56, BLOCKCOMMENT=57, COMMENT=58, THREEDOTS=59, 
		ID=60, INT=61, FLOAT=62, STRING=63, WS=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NL", "BREAK", "CASE", "CATCH", "CONTINUE", "ELSE", "ELSEIF", "END", "FOR", 
		"FUNCTION", "GLOBAL", "IF", "OTHERWISE", "PERSISTENT", "RETURNS", "SWITCH", 
		"TRY", "VARARGIN", "WHILE", "CLEAR", "ENDS", "DOUBLE_EQ", "LOG_OR", "LOG_AND", 
		"LSTE", "GRTE", "NEQ", "EL_TIMES", "EL_LEFTDIV", "EL_RIGHTDIV", "EL_EXP", 
		"EL_CCT", "EQ", "BIN_OR", "BIN_AND", "LST", "GRT", "COLON", "PLUS", "MINUS", 
		"NEG", "TIMES", "LEFTDIV", "RIGHTDIV", "EXP", "CCT", "SEMI", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LSBRACE", "RSBRACE", "AT", "DOT", "COMMA", 
		"BLOCKCOMMENT", "COMMENT", "THREEDOTS", "ID", "INT", "FLOAT", "EXPONENT", 
		"DIGIT", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'break'", "'case'", "'catch'", "'continue'", "'else'", 
		"'elseif'", "'end'", "'for'", "'function'", "'global'", "'if'", "'otherwise'", 
		"'persistent'", "'return'", "'switch'", "'try'", "'varargin'", "'while'", 
		"'clear'", null, "'=='", "'||'", "'&&'", "'<='", "'>='", "'~='", "'.*'", 
		"'./'", "'.\\'", "'.^'", "'.''", "'='", "'|'", "'&'", "'<'", "'>'", "':'", 
		"'+'", "'-'", "'~'", "'*'", "'/'", "'\\'", "'^'", "'''", "';'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'@'", "'.'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NL", "BREAK", "CASE", "CATCH", "CONTINUE", "ELSE", "ELSEIF", "END", 
		"FOR", "FUNCTION", "GLOBAL", "IF", "OTHERWISE", "PERSISTENT", "RETURNS", 
		"SWITCH", "TRY", "VARARGIN", "WHILE", "CLEAR", "ENDS", "DOUBLE_EQ", "LOG_OR", 
		"LOG_AND", "LSTE", "GRTE", "NEQ", "EL_TIMES", "EL_LEFTDIV", "EL_RIGHTDIV", 
		"EL_EXP", "EL_CCT", "EQ", "BIN_OR", "BIN_AND", "LST", "GRT", "COLON", 
		"PLUS", "MINUS", "NEG", "TIMES", "LEFTDIV", "RIGHTDIV", "EXP", "CCT", 
		"SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSBRACE", "RSBRACE", 
		"AT", "DOT", "COMMA", "BLOCKCOMMENT", "COMMENT", "THREEDOTS", "ID", "INT", 
		"FLOAT", "STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MATLABLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MATLAB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\5\26\u010b\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3:\3:\7:\u0162\n:\f:\16:\u0165\13:\3:\3:\3:\3:\3:\3;\3;\7;\u016e"+
		"\n;\f;\16;\u0171\13;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\7=\u0181"+
		"\n=\f=\16=\u0184\13=\3>\6>\u0187\n>\r>\16>\u0188\3?\6?\u018c\n?\r?\16"+
		"?\u018d\3?\3?\7?\u0192\n?\f?\16?\u0195\13?\3?\5?\u0198\n?\3?\6?\u019b"+
		"\n?\r?\16?\u019c\3?\3?\3?\3?\6?\u01a3\n?\r?\16?\u01a4\3?\5?\u01a8\n?\5"+
		"?\u01aa\n?\3@\3@\5@\u01ae\n@\3@\6@\u01b1\n@\r@\16@\u01b2\3A\3A\3B\3B\7"+
		"B\u01b9\nB\fB\16B\u01bc\13B\3B\3B\3C\3C\3C\3C\4\u0163\u016f\2D\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177\2\u0081\2\u0083A\u0085B\3\2\t\4\2C\\c|\6\2\62;C\\aac|\4\2"+
		"GGgg\4\2--//\3\2\62;\4\2))^^\4\2\13\13\"\"\2\u01d0\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u008b\3\2\2\2\7\u0091"+
		"\3\2\2\2\t\u0096\3\2\2\2\13\u009c\3\2\2\2\r\u00a5\3\2\2\2\17\u00aa\3\2"+
		"\2\2\21\u00b1\3\2\2\2\23\u00b5\3\2\2\2\25\u00b9\3\2\2\2\27\u00c2\3\2\2"+
		"\2\31\u00c9\3\2\2\2\33\u00cc\3\2\2\2\35\u00d6\3\2\2\2\37\u00e1\3\2\2\2"+
		"!\u00e8\3\2\2\2#\u00ef\3\2\2\2%\u00f3\3\2\2\2\'\u00fc\3\2\2\2)\u0102\3"+
		"\2\2\2+\u0108\3\2\2\2-\u010c\3\2\2\2/\u010f\3\2\2\2\61\u0112\3\2\2\2\63"+
		"\u0115\3\2\2\2\65\u0118\3\2\2\2\67\u011b\3\2\2\29\u011e\3\2\2\2;\u0121"+
		"\3\2\2\2=\u0124\3\2\2\2?\u0127\3\2\2\2A\u012a\3\2\2\2C\u012d\3\2\2\2E"+
		"\u012f\3\2\2\2G\u0131\3\2\2\2I\u0133\3\2\2\2K\u0135\3\2\2\2M\u0137\3\2"+
		"\2\2O\u0139\3\2\2\2Q\u013b\3\2\2\2S\u013d\3\2\2\2U\u013f\3\2\2\2W\u0141"+
		"\3\2\2\2Y\u0143\3\2\2\2[\u0145\3\2\2\2]\u0147\3\2\2\2_\u0149\3\2\2\2a"+
		"\u014b\3\2\2\2c\u014d\3\2\2\2e\u014f\3\2\2\2g\u0151\3\2\2\2i\u0153\3\2"+
		"\2\2k\u0155\3\2\2\2m\u0157\3\2\2\2o\u0159\3\2\2\2q\u015b\3\2\2\2s\u015d"+
		"\3\2\2\2u\u016b\3\2\2\2w\u0176\3\2\2\2y\u017e\3\2\2\2{\u0186\3\2\2\2}"+
		"\u01a9\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01b4\3\2\2\2\u0083\u01b6\3\2\2"+
		"\2\u0085\u01bf\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\b\2\2\2\u008a\4\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7m\2\2\u0090\6\3\2\2\2\u0091\u0092"+
		"\7e\2\2\u0092\u0093\7c\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095"+
		"\b\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7e\2\2\u009a\u009b\7j\2\2\u009b\n\3\2\2\2\u009c\u009d\7e\2\2\u009d"+
		"\u009e\7q\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7k\2\2"+
		"\u00a1\u00a2\7p\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7g\2\2\u00a4\f\3\2"+
		"\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad"+
		"\7u\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7h\2\2\u00b0"+
		"\20\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4"+
		"\22\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\24\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\u00bd\7e\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7q\2\2"+
		"\u00c0\u00c1\7p\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7i\2\2\u00c3\u00c4\7"+
		"n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7h\2\2\u00cb\32"+
		"\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7j\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7k\2\2"+
		"\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\34\3\2\2\2\u00d6\u00d7\7"+
		"r\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7u\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7p\2\2\u00df\u00e0\7v\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2"+
		"\u00e6\u00e7\7p\2\2\u00e7 \3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7y\2"+
		"\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee"+
		"\7j\2\2\u00ee\"\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2"+
		"\7{\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7x\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7i\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb&\3\2\2\2\u00fc\u00fd\7y\2\2\u00fd"+
		"\u00fe\7j\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7g\2\2"+
		"\u0101(\3\2\2\2\u0102\u0103\7e\2\2\u0103\u0104\7n\2\2\u0104\u0105\7g\2"+
		"\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2\2\u0107*\3\2\2\2\u0108\u010a\5"+
		"\21\t\2\u0109\u010b\5_\60\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		",\3\2\2\2\u010c\u010d\7?\2\2\u010d\u010e\7?\2\2\u010e.\3\2\2\2\u010f\u0110"+
		"\7~\2\2\u0110\u0111\7~\2\2\u0111\60\3\2\2\2\u0112\u0113\7(\2\2\u0113\u0114"+
		"\7(\2\2\u0114\62\3\2\2\2\u0115\u0116\7>\2\2\u0116\u0117\7?\2\2\u0117\64"+
		"\3\2\2\2\u0118\u0119\7@\2\2\u0119\u011a\7?\2\2\u011a\66\3\2\2\2\u011b"+
		"\u011c\7\u0080\2\2\u011c\u011d\7?\2\2\u011d8\3\2\2\2\u011e\u011f\7\60"+
		"\2\2\u011f\u0120\7,\2\2\u0120:\3\2\2\2\u0121\u0122\7\60\2\2\u0122\u0123"+
		"\7\61\2\2\u0123<\3\2\2\2\u0124\u0125\7\60\2\2\u0125\u0126\7^\2\2\u0126"+
		">\3\2\2\2\u0127\u0128\7\60\2\2\u0128\u0129\7`\2\2\u0129@\3\2\2\2\u012a"+
		"\u012b\7\60\2\2\u012b\u012c\7)\2\2\u012cB\3\2\2\2\u012d\u012e\7?\2\2\u012e"+
		"D\3\2\2\2\u012f\u0130\7~\2\2\u0130F\3\2\2\2\u0131\u0132\7(\2\2\u0132H"+
		"\3\2\2\2\u0133\u0134\7>\2\2\u0134J\3\2\2\2\u0135\u0136\7@\2\2\u0136L\3"+
		"\2\2\2\u0137\u0138\7<\2\2\u0138N\3\2\2\2\u0139\u013a\7-\2\2\u013aP\3\2"+
		"\2\2\u013b\u013c\7/\2\2\u013cR\3\2\2\2\u013d\u013e\7\u0080\2\2\u013eT"+
		"\3\2\2\2\u013f\u0140\7,\2\2\u0140V\3\2\2\2\u0141\u0142\7\61\2\2\u0142"+
		"X\3\2\2\2\u0143\u0144\7^\2\2\u0144Z\3\2\2\2\u0145\u0146\7`\2\2\u0146\\"+
		"\3\2\2\2\u0147\u0148\7)\2\2\u0148^\3\2\2\2\u0149\u014a\7=\2\2\u014a`\3"+
		"\2\2\2\u014b\u014c\7*\2\2\u014cb\3\2\2\2\u014d\u014e\7+\2\2\u014ed\3\2"+
		"\2\2\u014f\u0150\7}\2\2\u0150f\3\2\2\2\u0151\u0152\7\177\2\2\u0152h\3"+
		"\2\2\2\u0153\u0154\7]\2\2\u0154j\3\2\2\2\u0155\u0156\7_\2\2\u0156l\3\2"+
		"\2\2\u0157\u0158\7B\2\2\u0158n\3\2\2\2\u0159\u015a\7\60\2\2\u015ap\3\2"+
		"\2\2\u015b\u015c\7.\2\2\u015cr\3\2\2\2\u015d\u015e\7\'\2\2\u015e\u015f"+
		"\7}\2\2\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\'\2\2\u0167\u0168\7\177\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\b:\2\2\u016at\3\2\2\2\u016b\u016f\7\'\2\2\u016c"+
		"\u016e\13\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\5\3\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b;\2\2\u0175v\3\2\2\2\u0176"+
		"\u0177\7\60\2\2\u0177\u0178\7\60\2\2\u0178\u0179\7\60\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\5\3\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b<\3\2\u017d"+
		"x\3\2\2\2\u017e\u0182\t\2\2\2\u017f\u0181\t\3\2\2\u0180\u017f\3\2\2\2"+
		"\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183z\3"+
		"\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\5\u0081A\2\u0186\u0185\3\2\2\2"+
		"\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189|\3"+
		"\2\2\2\u018a\u018c\5\u0081A\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2"+
		"\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0193"+
		"\7\60\2\2\u0190\u0192\5\u0081A\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2"+
		"\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0196\u0198\5\177@\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2"+
		"\u0198\u01aa\3\2\2\2\u0199\u019b\5\u0081A\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\5\177@\2\u019f\u01aa\3\2\2\2\u01a0\u01a2\7\60\2\2\u01a1"+
		"\u01a3\5\u0081A\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\5\177@\2"+
		"\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u018b"+
		"\3\2\2\2\u01a9\u019a\3\2\2\2\u01a9\u01a0\3\2\2\2\u01aa~\3\2\2\2\u01ab"+
		"\u01ad\t\4\2\2\u01ac\u01ae\t\5\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01b0\3\2\2\2\u01af\u01b1\5\u0081A\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u0080\3\2"+
		"\2\2\u01b4\u01b5\t\6\2\2\u01b5\u0082\3\2\2\2\u01b6\u01ba\7)\2\2\u01b7"+
		"\u01b9\n\7\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01be\7)\2\2\u01be\u0084\3\2\2\2\u01bf\u01c0\t\b\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c2\bC\3\2\u01c2\u0086\3\2\2\2\22\2\u010a\u0163\u016f\u0182"+
		"\u0188\u018d\u0193\u0197\u019c\u01a4\u01a7\u01a9\u01ad\u01b2\u01ba\4\2"+
		"\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}