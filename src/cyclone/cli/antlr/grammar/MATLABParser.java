// Generated from grammar/MATLAB.g4 by ANTLR 4.7.1
package cyclone.cli.antlr.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATLABParser extends Parser {
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
	public static final int
		RULE_file = 0, RULE_functionMFile = 1, RULE_f_def_line = 2, RULE_f_input = 3, 
		RULE_f_argument_list = 4, RULE_f_body = 5, RULE_scriptMFile = 6, RULE_statement = 7, 
		RULE_assignment = 8, RULE_reference = 9, RULE_argument_list = 10, RULE_command_form = 11, 
		RULE_command_args = 12, RULE_for_command = 13, RULE_if_command = 14, RULE_global_command = 15, 
		RULE_while_command = 16, RULE_return_command = 17, RULE_expr = 18;
	public static final String[] ruleNames = {
		"file", "functionMFile", "f_def_line", "f_input", "f_argument_list", "f_body", 
		"scriptMFile", "statement", "assignment", "reference", "argument_list", 
		"command_form", "command_args", "for_command", "if_command", "global_command", 
		"while_command", "return_command", "expr"
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

	@Override
	public String getGrammarFileName() { return "MATLAB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MATLABParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public ScriptMFileContext scriptMFile() {
			return getRuleContext(ScriptMFileContext.class,0);
		}
		public FunctionMFileContext functionMFile() {
			return getRuleContext(FunctionMFileContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case NL:
			case FOR:
			case GLOBAL:
			case IF:
			case RETURNS:
			case WHILE:
			case PLUS:
			case MINUS:
			case NEG:
			case LPAREN:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				scriptMFile();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				functionMFile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionMFileContext extends ParserRuleContext {
		public F_def_lineContext f_def_line() {
			return getRuleContext(F_def_lineContext.class,0);
		}
		public F_bodyContext f_body() {
			return getRuleContext(F_bodyContext.class,0);
		}
		public FunctionMFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterFunctionMFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitFunctionMFile(this);
		}
	}

	public final FunctionMFileContext functionMFile() throws RecognitionException {
		FunctionMFileContext _localctx = new FunctionMFileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionMFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			f_def_line();
			setState(43);
			f_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_def_lineContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MATLABParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public F_inputContext f_input() {
			return getRuleContext(F_inputContext.class,0);
		}
		public F_def_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_def_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_def_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_def_line(this);
		}
	}

	public final F_def_lineContext f_def_line() throws RecognitionException {
		F_def_lineContext _localctx = new F_def_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_f_def_line);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(FUNCTION);
				setState(46);
				match(ID);
				setState(47);
				match(EQ);
				setState(48);
				match(ID);
				setState(49);
				f_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(FUNCTION);
				setState(51);
				match(ID);
				setState(52);
				f_input();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_inputContext extends ParserRuleContext {
		public F_argument_listContext f_argument_list() {
			return getRuleContext(F_argument_listContext.class,0);
		}
		public F_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_input(this);
		}
	}

	public final F_inputContext f_input() throws RecognitionException {
		F_inputContext _localctx = new F_inputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_f_input);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(LPAREN);
				setState(57);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(LPAREN);
				setState(59);
				f_argument_list();
				setState(60);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_argument_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public F_argument_listContext f_argument_list() {
			return getRuleContext(F_argument_listContext.class,0);
		}
		public F_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_argument_list(this);
		}
	}

	public final F_argument_listContext f_argument_list() throws RecognitionException {
		F_argument_listContext _localctx = new F_argument_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f_argument_list);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(ID);
				setState(65);
				match(COMMA);
				setState(66);
				f_argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_bodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public F_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_body(this);
		}
	}

	public final F_bodyContext f_body() throws RecognitionException {
		F_bodyContext _localctx = new F_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_f_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << FOR) | (1L << GLOBAL) | (1L << IF) | (1L << RETURNS) | (1L << WHILE) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAREN) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case GLOBAL:
				case IF:
				case RETURNS:
				case WHILE:
				case PLUS:
				case MINUS:
				case NEG:
				case LPAREN:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(70);
					statement();
					setState(71);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case NL:
					{
					setState(73);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptMFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MATLABParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public ScriptMFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptMFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterScriptMFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitScriptMFile(this);
		}
	}

	public final ScriptMFileContext scriptMFile() throws RecognitionException {
		ScriptMFileContext _localctx = new ScriptMFileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scriptMFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << FOR) | (1L << GLOBAL) | (1L << IF) | (1L << RETURNS) | (1L << WHILE) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAREN) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case GLOBAL:
				case IF:
				case RETURNS:
				case WHILE:
				case PLUS:
				case MINUS:
				case NEG:
				case LPAREN:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(79);
					statement();
					setState(80);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case NL:
					{
					setState(82);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Command_formContext command_form() {
			return getRuleContext(Command_formContext.class,0);
		}
		public For_commandContext for_command() {
			return getRuleContext(For_commandContext.class,0);
		}
		public If_commandContext if_command() {
			return getRuleContext(If_commandContext.class,0);
		}
		public Global_commandContext global_command() {
			return getRuleContext(Global_commandContext.class,0);
		}
		public While_commandContext while_command() {
			return getRuleContext(While_commandContext.class,0);
		}
		public Return_commandContext return_command() {
			return getRuleContext(Return_commandContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				command_form();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				for_command();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				if_command();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				global_command();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				while_command();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				return_command();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			reference();
			setState(102);
			match(EQ);
			setState(103);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reference);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID);
				setState(107);
				match(LPAREN);
				setState(108);
				argument_list();
				setState(109);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument_list);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(COLON);
				setState(116);
				match(COMMA);
				setState(117);
				argument_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				expr(0);
				setState(119);
				match(COMMA);
				setState(120);
				argument_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_formContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public Command_argsContext command_args() {
			return getRuleContext(Command_argsContext.class,0);
		}
		public Command_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterCommand_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitCommand_form(this);
		}
	}

	public final Command_formContext command_form() throws RecognitionException {
		Command_formContext _localctx = new Command_formContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_command_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			command_args();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_argsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public Command_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterCommand_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitCommand_args(this);
		}
	}

	public final Command_argsContext command_args() throws RecognitionException {
		Command_argsContext _localctx = new Command_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_command_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				match(ID);
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_commandContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MATLABParser.FOR, 0); }
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public For_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterFor_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitFor_command(this);
		}
	}

	public final For_commandContext for_command() throws RecognitionException {
		For_commandContext _localctx = new For_commandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FOR);
			setState(133);
			match(ID);
			setState(134);
			match(EQ);
			setState(135);
			expr(0);
			setState(136);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_commandContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MATLABParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public If_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterIf_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitIf_command(this);
		}
	}

	public final If_commandContext if_command() throws RecognitionException {
		If_commandContext _localctx = new If_commandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			expr(0);
			setState(140);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_commandContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(MATLABParser.GLOBAL, 0); }
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public Global_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterGlobal_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitGlobal_command(this);
		}
	}

	public final Global_commandContext global_command() throws RecognitionException {
		Global_commandContext _localctx = new Global_commandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_global_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(GLOBAL);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				match(ID);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_commandContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MATLABParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public While_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterWhile_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitWhile_command(this);
		}
	}

	public final While_commandContext while_command() throws RecognitionException {
		While_commandContext _localctx = new While_commandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(WHILE);
			setState(149);
			expr(0);
			setState(150);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_commandContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(MATLABParser.RETURNS, 0); }
		public Return_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterReturn_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitReturn_command(this);
		}
	}

	public final Return_commandContext return_command() throws RecognitionException {
		Return_commandContext _localctx = new Return_commandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(RETURNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode INT() { return getToken(MATLABParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MATLABParser.FLOAT, 0); }
		public TerminalNode RIGHTDIV() { return getToken(MATLABParser.RIGHTDIV, 0); }
		public TerminalNode EL_RIGHTDIV() { return getToken(MATLABParser.EL_RIGHTDIV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(155);
				match(LPAREN);
				setState(156);
				expr(0);
				setState(157);
				match(RPAREN);
				}
				break;
			case NEG:
				{
				setState(159);
				match(NEG);
				setState(160);
				expr(26);
				}
				break;
			case PLUS:
				{
				setState(161);
				match(PLUS);
				setState(162);
				expr(25);
				}
				break;
			case MINUS:
				{
				setState(163);
				match(MINUS);
				setState(164);
				expr(24);
				}
				break;
			case ID:
				{
				setState(165);
				reference();
				}
				break;
			case INT:
				{
				setState(166);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(167);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(171);
						match(EL_EXP);
						setState(172);
						expr(29);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(174);
						match(EXP);
						setState(175);
						expr(28);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(177);
						match(TIMES);
						setState(178);
						expr(24);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(180);
						match(RIGHTDIV);
						setState(181);
						expr(23);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(183);
						match(LEFTDIV);
						setState(184);
						expr(22);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(186);
						match(EL_TIMES);
						setState(187);
						expr(21);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(189);
						match(EL_RIGHTDIV);
						setState(190);
						expr(20);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(192);
						match(EL_LEFTDIV);
						setState(193);
						expr(19);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(195);
						match(PLUS);
						setState(196);
						expr(18);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(198);
						match(MINUS);
						setState(199);
						expr(17);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(201);
						match(COLON);
						setState(202);
						expr(16);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(204);
						match(LST);
						setState(205);
						expr(15);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(207);
						match(LSTE);
						setState(208);
						expr(14);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(210);
						match(GRT);
						setState(211);
						expr(13);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(213);
						match(GRTE);
						setState(214);
						expr(12);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(216);
						match(EQ);
						setState(217);
						expr(11);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(219);
						match(NEQ);
						setState(220);
						expr(10);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(222);
						match(LOG_AND);
						setState(223);
						expr(9);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(225);
						match(LOG_OR);
						setState(226);
						expr(8);
						}
						break;
					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(228);
						match(BIN_AND);
						setState(229);
						expr(7);
						}
						break;
					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(231);
						match(BIN_OR);
						setState(232);
						expr(6);
						}
						break;
					case 22:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(234);
						match(DOUBLE_EQ);
						setState(235);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 28);
		case 1:
			return precpred(_ctx, 27);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		case 16:
			return precpred(_ctx, 9);
		case 17:
			return precpred(_ctx, 8);
		case 18:
			return precpred(_ctx, 7);
		case 19:
			return precpred(_ctx, 6);
		case 20:
			return precpred(_ctx, 5);
		case 21:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6"+
		"\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3\b\3\b\3\b"+
		"\7\bV\n\b\f\b\16\bY\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tf\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13r\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\16\6\16\u0083\n"+
		"\16\r\16\16\16\u0084\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\6\21\u0093\n\21\r\21\16\21\u0094\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00ab\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u00ef\n\24\f\24\16\24\u00f2\13\24\3\24\2\3&\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\3\4\2\3\3\61\61\2\u0113\2*\3\2\2\2\4,\3\2"+
		"\2\2\6\67\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\fN\3\2\2\2\16W\3\2\2\2\20e\3\2"+
		"\2\2\22g\3\2\2\2\24q\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0082\3\2\2\2"+
		"\34\u0086\3\2\2\2\36\u008c\3\2\2\2 \u0090\3\2\2\2\"\u0096\3\2\2\2$\u009a"+
		"\3\2\2\2&\u00aa\3\2\2\2(+\5\16\b\2)+\5\4\3\2*(\3\2\2\2*)\3\2\2\2+\3\3"+
		"\2\2\2,-\5\6\4\2-.\5\f\7\2.\5\3\2\2\2/\60\7\f\2\2\60\61\7>\2\2\61\62\7"+
		"#\2\2\62\63\7>\2\2\638\5\b\5\2\64\65\7\f\2\2\65\66\7>\2\2\668\5\b\5\2"+
		"\67/\3\2\2\2\67\64\3\2\2\28\7\3\2\2\29A\3\2\2\2:;\7\62\2\2;A\7\63\2\2"+
		"<=\7\62\2\2=>\5\n\6\2>?\7\63\2\2?A\3\2\2\2@9\3\2\2\2@:\3\2\2\2@<\3\2\2"+
		"\2A\t\3\2\2\2BC\7>\2\2CD\7:\2\2DG\5\n\6\2EG\7>\2\2FB\3\2\2\2FE\3\2\2\2"+
		"G\13\3\2\2\2HI\5\20\t\2IJ\t\2\2\2JM\3\2\2\2KM\7\3\2\2LH\3\2\2\2LK\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PN\3\2\2\2QR\5\20\t\2RS\t"+
		"\2\2\2SV\3\2\2\2TV\7\3\2\2UQ\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\2\2\3[\17\3\2\2\2\\f\7>\2\2]f\5\22\n\2"+
		"^f\5&\24\2_f\5\30\r\2`f\5\34\17\2af\5\36\20\2bf\5 \21\2cf\5\"\22\2df\5"+
		"$\23\2e\\\3\2\2\2e]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb"+
		"\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\21\3\2\2\2gh\5\24\13\2hi\7#\2\2ij\5&\24"+
		"\2j\23\3\2\2\2kr\7>\2\2lm\7>\2\2mn\7\62\2\2no\5\26\f\2op\7\63\2\2pr\3"+
		"\2\2\2qk\3\2\2\2ql\3\2\2\2r\25\3\2\2\2s}\7(\2\2t}\5&\24\2uv\7(\2\2vw\7"+
		":\2\2w}\5\26\f\2xy\5&\24\2yz\7:\2\2z{\5\26\f\2{}\3\2\2\2|s\3\2\2\2|t\3"+
		"\2\2\2|u\3\2\2\2|x\3\2\2\2}\27\3\2\2\2~\177\7>\2\2\177\u0080\5\32\16\2"+
		"\u0080\31\3\2\2\2\u0081\u0083\7>\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\33\3\2\2\2\u0086"+
		"\u0087\7\13\2\2\u0087\u0088\7>\2\2\u0088\u0089\7#\2\2\u0089\u008a\5&\24"+
		"\2\u008a\u008b\7\n\2\2\u008b\35\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e"+
		"\5&\24\2\u008e\u008f\7\n\2\2\u008f\37\3\2\2\2\u0090\u0092\7\r\2\2\u0091"+
		"\u0093\7>\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095!\3\2\2\2\u0096\u0097\7\25\2\2\u0097\u0098"+
		"\5&\24\2\u0098\u0099\7\n\2\2\u0099#\3\2\2\2\u009a\u009b\7\21\2\2\u009b"+
		"%\3\2\2\2\u009c\u009d\b\24\1\2\u009d\u009e\7\62\2\2\u009e\u009f\5&\24"+
		"\2\u009f\u00a0\7\63\2\2\u00a0\u00ab\3\2\2\2\u00a1\u00a2\7+\2\2\u00a2\u00ab"+
		"\5&\24\34\u00a3\u00a4\7)\2\2\u00a4\u00ab\5&\24\33\u00a5\u00a6\7*\2\2\u00a6"+
		"\u00ab\5&\24\32\u00a7\u00ab\5\24\13\2\u00a8\u00ab\7?\2\2\u00a9\u00ab\7"+
		"@\2\2\u00aa\u009c\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa"+
		"\u00a5\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\u00f0\3\2\2\2\u00ac\u00ad\f\36\2\2\u00ad\u00ae\7!\2\2\u00ae"+
		"\u00ef\5&\24\37\u00af\u00b0\f\35\2\2\u00b0\u00b1\7/\2\2\u00b1\u00ef\5"+
		"&\24\36\u00b2\u00b3\f\31\2\2\u00b3\u00b4\7,\2\2\u00b4\u00ef\5&\24\32\u00b5"+
		"\u00b6\f\30\2\2\u00b6\u00b7\7.\2\2\u00b7\u00ef\5&\24\31\u00b8\u00b9\f"+
		"\27\2\2\u00b9\u00ba\7-\2\2\u00ba\u00ef\5&\24\30\u00bb\u00bc\f\26\2\2\u00bc"+
		"\u00bd\7\36\2\2\u00bd\u00ef\5&\24\27\u00be\u00bf\f\25\2\2\u00bf\u00c0"+
		"\7 \2\2\u00c0\u00ef\5&\24\26\u00c1\u00c2\f\24\2\2\u00c2\u00c3\7\37\2\2"+
		"\u00c3\u00ef\5&\24\25\u00c4\u00c5\f\23\2\2\u00c5\u00c6\7)\2\2\u00c6\u00ef"+
		"\5&\24\24\u00c7\u00c8\f\22\2\2\u00c8\u00c9\7*\2\2\u00c9\u00ef\5&\24\23"+
		"\u00ca\u00cb\f\21\2\2\u00cb\u00cc\7(\2\2\u00cc\u00ef\5&\24\22\u00cd\u00ce"+
		"\f\20\2\2\u00ce\u00cf\7&\2\2\u00cf\u00ef\5&\24\21\u00d0\u00d1\f\17\2\2"+
		"\u00d1\u00d2\7\33\2\2\u00d2\u00ef\5&\24\20\u00d3\u00d4\f\16\2\2\u00d4"+
		"\u00d5\7\'\2\2\u00d5\u00ef\5&\24\17\u00d6\u00d7\f\r\2\2\u00d7\u00d8\7"+
		"\34\2\2\u00d8\u00ef\5&\24\16\u00d9\u00da\f\f\2\2\u00da\u00db\7#\2\2\u00db"+
		"\u00ef\5&\24\r\u00dc\u00dd\f\13\2\2\u00dd\u00de\7\35\2\2\u00de\u00ef\5"+
		"&\24\f\u00df\u00e0\f\n\2\2\u00e0\u00e1\7\32\2\2\u00e1\u00ef\5&\24\13\u00e2"+
		"\u00e3\f\t\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00ef\5&\24\n\u00e5\u00e6\f"+
		"\b\2\2\u00e6\u00e7\7%\2\2\u00e7\u00ef\5&\24\t\u00e8\u00e9\f\7\2\2\u00e9"+
		"\u00ea\7$\2\2\u00ea\u00ef\5&\24\b\u00eb\u00ec\f\6\2\2\u00ec\u00ed\7\30"+
		"\2\2\u00ed\u00ef\5&\24\7\u00ee\u00ac\3\2\2\2\u00ee\u00af\3\2\2\2\u00ee"+
		"\u00b2\3\2\2\2\u00ee\u00b5\3\2\2\2\u00ee\u00b8\3\2\2\2\u00ee\u00bb\3\2"+
		"\2\2\u00ee\u00be\3\2\2\2\u00ee\u00c1\3\2\2\2\u00ee\u00c4\3\2\2\2\u00ee"+
		"\u00c7\3\2\2\2\u00ee\u00ca\3\2\2\2\u00ee\u00cd\3\2\2\2\u00ee\u00d0\3\2"+
		"\2\2\u00ee\u00d3\3\2\2\2\u00ee\u00d6\3\2\2\2\u00ee\u00d9\3\2\2\2\u00ee"+
		"\u00dc\3\2\2\2\u00ee\u00df\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e5\3\2"+
		"\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\'\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\22*\67@FLNUWeq|\u0084\u0094\u00aa\u00ee\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}