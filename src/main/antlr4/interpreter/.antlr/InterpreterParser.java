// Generated from /Users/mustafamohamed/Downloads/pascal mvn/src/main/antlr4/interpreter/Interpreter.g4 by ANTLR 4.7.1

    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;
    import javax.script.ScriptEngineManager;
    import javax.script.ScriptEngine;
    import javax.script.ScriptException;
    import javax.script.ScriptContext;
    import javax.script.Bindings;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CHR=7, CONST=8, COS=9, 
		DIV=10, DO=11, DOWNTO=12, ELSE=13, END=14, EXP=15, FILE=16, FOR=17, FUNCTION=18, 
		GOTO=19, IF=20, IN=21, INTEGER=22, LABEL=23, LN=24, MOD=25, NIL=26, NOT=27, 
		OF=28, OR=29, PACKED=30, PROCEDURE=31, PROGRAM=32, READ=33, READLN=34, 
		REAL=35, RECORD=36, REPEAT=37, SET=38, SIN=39, SQRT=40, THEN=41, TO=42, 
		TYPE=43, UNTIL=44, VAR=45, WHILE=46, WITH=47, WRITE=48, WRITELN=49, PLUS=50, 
		MINUS=51, STAR=52, SLASH=53, ASSIGN=54, COMMA=55, SEMI=56, COLON=57, EQUAL=58, 
		NOT_EQUAL=59, LT=60, LE=61, GE=62, GT=63, LPAREN=64, RPAREN=65, LBRACK=66, 
		LBRACK2=67, RBRACK=68, RBRACK2=69, POINTER=70, AT=71, DOT=72, DOTDOT=73, 
		LCURLY=74, RCURLY=75, UNIT=76, INTERFACE=77, USES=78, STRING=79, IMPLEMENTATION=80, 
		TRUE=81, FALSE=82, WS=83, COMMENT=84, IDENT=85, STRINGLITERAL=86, NUM_INT=87, 
		NUM_REAL=88, SPC=89;
	public static final int
		RULE_program = 0, RULE_heading = 1, RULE_block = 2, RULE_variableDeclarationPart = 3, 
		RULE_variableDeclaration = 4, RULE_constantDeclarationPart = 5, RULE_constantDeclaration = 6, 
		RULE_constVar = 7, RULE_identifierList = 8, RULE_identifier = 9, RULE_type = 10, 
		RULE_compoundStatement = 11, RULE_statements = 12, RULE_statement = 13, 
		RULE_emptyStmt = 14, RULE_varAssignment = 15, RULE_var = 16, RULE_expression = 17, 
		RULE_term = 18, RULE_bool = 19, RULE_operator = 20, RULE_specialExp = 21, 
		RULE_specialFunct = 22, RULE_readFunct = 23, RULE_writeFunct = 24, RULE_sqrtFunct = 25, 
		RULE_sinFunct = 26, RULE_cosFunct = 27, RULE_lnFunct = 28, RULE_expFunct = 29, 
		RULE_boolExp = 30, RULE_relatExp = 31, RULE_arithExp = 32, RULE_decisStates = 33, 
		RULE_ifthenelse = 34, RULE_caseStmt = 35, RULE_spcIdent = 36, RULE_loop = 37, 
		RULE_whileloop = 38, RULE_forloop = 39;
	public static final String[] ruleNames = {
		"program", "heading", "block", "variableDeclarationPart", "variableDeclaration", 
		"constantDeclarationPart", "constantDeclaration", "constVar", "identifierList", 
		"identifier", "type", "compoundStatement", "statements", "statement", 
		"emptyStmt", "varAssignment", "var", "expression", "term", "bool", "operator", 
		"specialExp", "specialFunct", "readFunct", "writeFunct", "sqrtFunct", 
		"sinFunct", "cosFunct", "lnFunct", "expFunct", "boolExp", "relatExp", 
		"arithExp", "decisStates", "ifthenelse", "caseStmt", "spcIdent", "loop", 
		"whileloop", "forloop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", 
		"'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", 
		"'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", 
		"COS", "DIV", "DO", "DOWNTO", "ELSE", "END", "EXP", "FILE", "FOR", "FUNCTION", 
		"GOTO", "IF", "IN", "INTEGER", "LABEL", "LN", "MOD", "NIL", "NOT", "OF", 
		"OR", "PACKED", "PROCEDURE", "PROGRAM", "READ", "READLN", "REAL", "RECORD", 
		"REPEAT", "SET", "SIN", "SQRT", "THEN", "TO", "TYPE", "UNTIL", "VAR", 
		"WHILE", "WITH", "WRITE", "WRITELN", "PLUS", "MINUS", "STAR", "SLASH", 
		"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", 
		"POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", 
		"USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", "COMMENT", 
		"IDENT", "STRINGLITERAL", "NUM_INT", "NUM_REAL", "SPC"
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
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String, String[]> varmem = new HashMap<>();
	    Scanner scanner = new Scanner(System.in);
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String input;
	    String temp1 = "";
	    String temp2 = "";
	    Double tempRet = 0.0;
	    Boolean evalBool = true;

	public InterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(InterpreterParser.DOT, 0); }
		public TerminalNode EOF() { return getToken(InterpreterParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			heading();
			setState(81);
			block();
			setState(82);
			match(DOT);
			setState(83);
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

	public static class HeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(InterpreterParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(InterpreterParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_heading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PROGRAM);
			setState(86);
			identifier();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(87);
				match(LPAREN);
				setState(88);
				identifierList();
				setState(89);
				match(RPAREN);
				}
			}

			setState(93);
			match(SEMI);
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

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ConstantDeclarationPartContext> constantDeclarationPart() {
			return getRuleContexts(ConstantDeclarationPartContext.class);
		}
		public ConstantDeclarationPartContext constantDeclarationPart(int i) {
			return getRuleContext(ConstantDeclarationPartContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==VAR) {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(95);
					variableDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(96);
					constantDeclarationPart();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			compoundStatement();
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(InterpreterParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(InterpreterParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(InterpreterParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VAR);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				variableDeclaration();
				setState(106);
				match(SEMI);
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList;
		public TypeContext type;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((VariableDeclarationContext)_localctx).identifierList = identifierList();
			setState(113);
			match(COLON);
			setState(114);
			((VariableDeclarationContext)_localctx).type = type();

			        temp1 = (((VariableDeclarationContext)_localctx).identifierList!=null?_input.getText(((VariableDeclarationContext)_localctx).identifierList.start,((VariableDeclarationContext)_localctx).identifierList.stop):null);
			        for(int i=0;i<temp1.length();i++){
			            if(temp1.charAt(i) != ','){
			                temp2 += temp1.charAt(i);
			            }
			            if(temp1.charAt(i) == ',' || i == temp1.length() - 1){
			                varmem.put(temp2, new String[]{(((VariableDeclarationContext)_localctx).type!=null?_input.getText(((VariableDeclarationContext)_localctx).type.start,((VariableDeclarationContext)_localctx).type.stop):null),null});
			                temp2 = "";
			            }
			        }
			        temp1 = "";
			        temp2 = "";
			    
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

	public static class ConstantDeclarationPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(InterpreterParser.CONST, 0); }
		public List<ConstantDeclarationContext> constantDeclaration() {
			return getRuleContexts(ConstantDeclarationContext.class);
		}
		public ConstantDeclarationContext constantDeclaration(int i) {
			return getRuleContext(ConstantDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(InterpreterParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(InterpreterParser.SEMI, i);
		}
		public ConstantDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarationPart; }
	}

	public final ConstantDeclarationPartContext constantDeclarationPart() throws RecognitionException {
		ConstantDeclarationPartContext _localctx = new ConstantDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(CONST);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				constantDeclaration();
				setState(119);
				match(SEMI);
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public ConstVarContext constVar;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(InterpreterParser.EQUAL, 0); }
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((ConstantDeclarationContext)_localctx).identifier = identifier();
			setState(126);
			match(EQUAL);
			setState(127);
			((ConstantDeclarationContext)_localctx).constVar = constVar();
			varmem.put((((ConstantDeclarationContext)_localctx).identifier!=null?_input.getText(((ConstantDeclarationContext)_localctx).identifier.start,((ConstantDeclarationContext)_localctx).identifier.stop):null), new String[]{"constant", (((ConstantDeclarationContext)_localctx).constVar!=null?_input.getText(((ConstantDeclarationContext)_localctx).constVar.start,((ConstantDeclarationContext)_localctx).constVar.stop):null)});
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

	public static class ConstVarContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(InterpreterParser.NUM_INT, 0); }
		public TerminalNode MINUS() { return getToken(InterpreterParser.MINUS, 0); }
		public TerminalNode NUM_REAL() { return getToken(InterpreterParser.NUM_REAL, 0); }
		public ConstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVar; }
	}

	public final ConstVarContext constVar() throws RecognitionException {
		ConstVarContext _localctx = new ConstVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constVar);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(130);
					match(MINUS);
					}
				}

				setState(133);
				match(NUM_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(134);
					match(MINUS);
					}
				}

				setState(137);
				match(NUM_REAL);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			identifier();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				identifier();
				}
				}
				setState(147);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(InterpreterParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENT);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(InterpreterParser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(InterpreterParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(InterpreterParser.INTEGER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(BEGIN);
			setState(153);
			statements();
			setState(154);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(InterpreterParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(InterpreterParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			statement();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(157);
				match(SEMI);
				setState(158);
				statement();
				}
				}
				setState(163);
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

	public static class StatementContext extends ParserRuleContext {
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public DecisStatesContext decisStates() {
			return getRuleContext(DecisStatesContext.class,0);
		}
		public SpecialExpContext specialExp() {
			return getRuleContext(SpecialExpContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				varAssignment();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				decisStates();
				}
				break;
			case COS:
			case EXP:
			case LN:
			case READ:
			case READLN:
			case SIN:
			case SQRT:
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				specialExp();
				}
				break;
			case ELSE:
			case END:
			case SEMI:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				emptyStmt();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				loop();
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarContext var;
		public ExpressionContext expression;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((VarAssignmentContext)_localctx).var = var();
			setState(174);
			match(ASSIGN);
			setState(175);
			((VarAssignmentContext)_localctx).expression = expression();

			        if(evalBool){
			            if(varmem.containsKey((((VarAssignmentContext)_localctx).var!=null?_input.getText(((VarAssignmentContext)_localctx).var.start,((VarAssignmentContext)_localctx).var.stop):null))){
			                //System.out.println("varass: " + (((VarAssignmentContext)_localctx).expression!=null?_input.getText(((VarAssignmentContext)_localctx).expression.start,((VarAssignmentContext)_localctx).expression.stop):null));
			                String vtype = varmem.get((((VarAssignmentContext)_localctx).var!=null?_input.getText(((VarAssignmentContext)_localctx).var.start,((VarAssignmentContext)_localctx).var.stop):null))[0];
			                if (vtype.equalsIgnoreCase("constant")) {
			                    throw new java.lang.RuntimeException("Cannot assign a value to a constant variable");
			                } else if(vtype.equalsIgnoreCase("boolean")){
			                    varmem.replace((((VarAssignmentContext)_localctx).var!=null?_input.getText(((VarAssignmentContext)_localctx).var.start,((VarAssignmentContext)_localctx).var.stop):null),new String[]{vtype,(((VarAssignmentContext)_localctx).expression!=null?_input.getText(((VarAssignmentContext)_localctx).expression.start,((VarAssignmentContext)_localctx).expression.stop):null)});
			                } else varmem.replace((((VarAssignmentContext)_localctx).var!=null?_input.getText(((VarAssignmentContext)_localctx).var.start,((VarAssignmentContext)_localctx).var.stop):null),new String[]{vtype,((VarAssignmentContext)_localctx).expression.s2});
			            }
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

	public static class VarContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			identifier();
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

	public static class ExpressionContext extends ParserRuleContext {
		public String s2;
		public TermContext term;
		public OperatorContext operator;
		public ExpressionContext expression;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((ExpressionContext)_localctx).term = term();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					((ExpressionContext)_localctx).operator = operator();
					setState(182);
					((ExpressionContext)_localctx).expression = expression();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}

			        //System.out.println("Term s5: " + ((ExpressionContext)_localctx).term.s5 + " operator: " + (((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null) + " expression: " + (((ExpressionContext)_localctx).expression!=null?_input.getText(((ExpressionContext)_localctx).expression.start,((ExpressionContext)_localctx).expression.stop):null));
			        String foo = ((ExpressionContext)_localctx).term.s5;
			        if((((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null) != null && !(((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null).isEmpty()) {
			            foo = foo + " " + (((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null) + " " + ((ExpressionContext)_localctx).expression.s2;
			        }
			                //System.out.println("Term s5: " + ((ExpressionContext)_localctx).term.s5 + " operator: " + (((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null) + " expression: " + (((ExpressionContext)_localctx).expression!=null?_input.getText(((ExpressionContext)_localctx).expression.start,((ExpressionContext)_localctx).expression.stop):null));
			        /*
			        if((((ExpressionContext)_localctx).term.s5) != null && !(((ExpressionContext)_localctx).term.s5).isEmpty()){
			            if(((((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null)) != null && !((((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null)).isEmpty()){
			                foo = (((ExpressionContext)_localctx).term.s5) + " " + (((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null) + " " + (((ExpressionContext)_localctx).expression!=null?_input.getText(((ExpressionContext)_localctx).expression.start,((ExpressionContext)_localctx).expression.stop):null);
			            }
			        } */
			        if (foo != null && !foo.isEmpty()) {
			            foo = foo.replaceAll("(?i)and", "&&");
			            foo = foo.replaceAll("(?i)or", "||");
			            foo = foo.replaceAll("(?i)not", "!");
			            foo = foo.replaceAll("(?i)<>", "!=");
			            foo = foo.replaceAll("(?i)=", "==");
			        }
			                //System.out.println("Term s5: " + ((ExpressionContext)_localctx).term.s5 + " operator: " + (((ExpressionContext)_localctx).operator!=null?_input.getText(((ExpressionContext)_localctx).operator.start,((ExpressionContext)_localctx).operator.stop):null) + " expression: " + (((ExpressionContext)_localctx).expression!=null?_input.getText(((ExpressionContext)_localctx).expression.start,((ExpressionContext)_localctx).expression.stop):null));
			        try {
			            //System.out.println("foo: " + foo);
			            //System.out.println(engine.eval(foo));
			            if(foo != null && !foo.isEmpty()) {
			                ((ExpressionContext)_localctx).s2 =  engine.eval(foo).toString();
			            } else ((ExpressionContext)_localctx).s2 =  "foo is null";
			        } catch (Exception e) {
			            //System.out.println(e);
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

	public static class TermContext extends ParserRuleContext {
		public String s5;
		public Token MINUS;
		public Token NUM_REAL;
		public Token NUM_INT;
		public ExpressionContext expression;
		public Token STRINGLITERAL;
		public BoolContext bool;
		public VarContext var;
		public SpecialFunctContext specialFunct;
		public TerminalNode NUM_REAL() { return getToken(InterpreterParser.NUM_REAL, 0); }
		public TerminalNode MINUS() { return getToken(InterpreterParser.MINUS, 0); }
		public TerminalNode NUM_INT() { return getToken(InterpreterParser.NUM_INT, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(InterpreterParser.STRINGLITERAL, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SpecialFunctContext specialFunct() {
			return getRuleContext(SpecialFunctContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(191);
					((TermContext)_localctx).MINUS = match(MINUS);
					}
				}

				setState(194);
				((TermContext)_localctx).NUM_REAL = match(NUM_REAL);

				            if((((TermContext)_localctx).MINUS!=null?((TermContext)_localctx).MINUS.getText():null) != null && !(((TermContext)_localctx).MINUS!=null?((TermContext)_localctx).MINUS.getText():null).isEmpty()) {
				                ((TermContext)_localctx).s5 =  '-'+(((TermContext)_localctx).NUM_REAL!=null?((TermContext)_localctx).NUM_REAL.getText():null);
				            } else ((TermContext)_localctx).s5 =  (((TermContext)_localctx).NUM_REAL!=null?((TermContext)_localctx).NUM_REAL.getText():null);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(196);
					((TermContext)_localctx).MINUS = match(MINUS);
					}
				}

				setState(199);
				((TermContext)_localctx).NUM_INT = match(NUM_INT);

				            if((((TermContext)_localctx).MINUS!=null?((TermContext)_localctx).MINUS.getText():null) != null && !(((TermContext)_localctx).MINUS!=null?((TermContext)_localctx).MINUS.getText():null).isEmpty()) {
				                ((TermContext)_localctx).s5 =  '-'+(((TermContext)_localctx).NUM_INT!=null?((TermContext)_localctx).NUM_INT.getText():null);
				            } else ((TermContext)_localctx).s5 =  (((TermContext)_localctx).NUM_INT!=null?((TermContext)_localctx).NUM_INT.getText():null);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(LPAREN);
				setState(202);
				((TermContext)_localctx).expression = expression();
				setState(203);
				match(RPAREN);
				((TermContext)_localctx).s5 =  '('+((TermContext)_localctx).expression.s2+')';
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				((TermContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((TermContext)_localctx).s5 =  (((TermContext)_localctx).STRINGLITERAL!=null?((TermContext)_localctx).STRINGLITERAL.getText():null);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				((TermContext)_localctx).bool = bool();
				((TermContext)_localctx).s5 =  ((TermContext)_localctx).bool.s;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				((TermContext)_localctx).var = var();
				((TermContext)_localctx).s5 =  varmem.get((((TermContext)_localctx).var!=null?_input.getText(((TermContext)_localctx).var.start,((TermContext)_localctx).var.stop):null))[1];
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				((TermContext)_localctx).specialFunct = specialFunct();
				((TermContext)_localctx).s5 =  ((TermContext)_localctx).specialFunct.s3;
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

	public static class BoolContext extends ParserRuleContext {
		public String s;
		public BoolContext bool;
		public VarContext var;
		public Token NUM_INT;
		public TerminalNode TRUE() { return getToken(InterpreterParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(InterpreterParser.FALSE, 0); }
		public List<TerminalNode> NOT() { return getTokens(InterpreterParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(InterpreterParser.NOT, i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(InterpreterParser.NUM_INT, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(219);
					match(NOT);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(NOT);
				setState(227);
				match(NOT);
				setState(228);
				((BoolContext)_localctx).bool = bool();
				((BoolContext)_localctx).s =  "" + ((BoolContext)_localctx).bool.s;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(NOT);
				setState(232);
				((BoolContext)_localctx).var = var();

				            String type = varmem.get((((BoolContext)_localctx).var!=null?_input.getText(((BoolContext)_localctx).var.start,((BoolContext)_localctx).var.stop):null))[0];
				            if(!type.equalsIgnoreCase("real")) {
				                if (type.equalsIgnoreCase("integer")) {
				                    int x = Integer.parseInt(varmem.get((((BoolContext)_localctx).var!=null?_input.getText(((BoolContext)_localctx).var.start,((BoolContext)_localctx).var.stop):null))[1]);
				                    x = -x-1;
				                    ((BoolContext)_localctx).s =  Integer.toString(x);
				                } else ((BoolContext)_localctx).s =  "NOT" + (((BoolContext)_localctx).var!=null?_input.getText(((BoolContext)_localctx).var.start,((BoolContext)_localctx).var.stop):null);
				            } else throw new java.lang.RuntimeException("Cannot negate a real variable");
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				((BoolContext)_localctx).var = var();
				((BoolContext)_localctx).s =  varmem.get((((BoolContext)_localctx).var!=null?_input.getText(((BoolContext)_localctx).var.start,((BoolContext)_localctx).var.stop):null))[1];
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(NOT);
				setState(239);
				((BoolContext)_localctx).NUM_INT = match(NUM_INT);

				            int x = Integer.parseInt((((BoolContext)_localctx).NUM_INT!=null?((BoolContext)_localctx).NUM_INT.getText():null));
				            x = -x-1;
				            ((BoolContext)_localctx).s =  Integer.toString(x);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				((BoolContext)_localctx).NUM_INT = match(NUM_INT);
				((BoolContext)_localctx).s =  (((BoolContext)_localctx).NUM_INT!=null?((BoolContext)_localctx).NUM_INT.getText():null);
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

	public static class OperatorContext extends ParserRuleContext {
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public ArithExpContext arithExp() {
			return getRuleContext(ArithExpContext.class,0);
		}
		public RelatExpContext relatExp() {
			return getRuleContext(RelatExpContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operator);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				boolExp();
				}
				break;
			case DIV:
			case MOD:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				arithExp();
				}
				break;
			case EQUAL:
			case NOT_EQUAL:
			case LT:
			case LE:
			case GE:
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				relatExp();
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

	public static class SpecialExpContext extends ParserRuleContext {
		public ReadFunctContext readFunct() {
			return getRuleContext(ReadFunctContext.class,0);
		}
		public WriteFunctContext writeFunct() {
			return getRuleContext(WriteFunctContext.class,0);
		}
		public SpecialFunctContext specialFunct() {
			return getRuleContext(SpecialFunctContext.class,0);
		}
		public SpecialExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialExp; }
	}

	public final SpecialExpContext specialExp() throws RecognitionException {
		SpecialExpContext _localctx = new SpecialExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_specialExp);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case READLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				readFunct();
				}
				break;
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				writeFunct();
				}
				break;
			case COS:
			case EXP:
			case LN:
			case SIN:
			case SQRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				specialFunct();
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

	public static class SpecialFunctContext extends ParserRuleContext {
		public String s3;
		public SqrtFunctContext sqrtFunct;
		public SinFunctContext sinFunct;
		public CosFunctContext cosFunct;
		public LnFunctContext lnFunct;
		public ExpFunctContext expFunct;
		public SqrtFunctContext sqrtFunct() {
			return getRuleContext(SqrtFunctContext.class,0);
		}
		public SinFunctContext sinFunct() {
			return getRuleContext(SinFunctContext.class,0);
		}
		public CosFunctContext cosFunct() {
			return getRuleContext(CosFunctContext.class,0);
		}
		public LnFunctContext lnFunct() {
			return getRuleContext(LnFunctContext.class,0);
		}
		public ExpFunctContext expFunct() {
			return getRuleContext(ExpFunctContext.class,0);
		}
		public SpecialFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunct; }
	}

	public final SpecialFunctContext specialFunct() throws RecognitionException {
		SpecialFunctContext _localctx = new SpecialFunctContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_specialFunct);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((SpecialFunctContext)_localctx).sqrtFunct = sqrtFunct();
				((SpecialFunctContext)_localctx).s3 =  ((SpecialFunctContext)_localctx).sqrtFunct.s1;
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((SpecialFunctContext)_localctx).sinFunct = sinFunct();
				((SpecialFunctContext)_localctx).s3 =  ((SpecialFunctContext)_localctx).sinFunct.s1;
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				((SpecialFunctContext)_localctx).cosFunct = cosFunct();
				((SpecialFunctContext)_localctx).s3 =  ((SpecialFunctContext)_localctx).cosFunct.s1;
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				((SpecialFunctContext)_localctx).lnFunct = lnFunct();
				((SpecialFunctContext)_localctx).s3 =  ((SpecialFunctContext)_localctx).lnFunct.s1;
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				((SpecialFunctContext)_localctx).expFunct = expFunct();
				((SpecialFunctContext)_localctx).s3 =  ((SpecialFunctContext)_localctx).expFunct.s1;
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

	public static class ReadFunctContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public TerminalNode READ() { return getToken(InterpreterParser.READ, 0); }
		public TerminalNode READLN() { return getToken(InterpreterParser.READLN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public ReadFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunct; }
	}

	public final ReadFunctContext readFunct() throws RecognitionException {
		ReadFunctContext _localctx = new ReadFunctContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_readFunct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==READLN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
			match(LPAREN);
			setState(274);
			((ReadFunctContext)_localctx).e1 = expression();
			if(evalBool){
			                                                               if(varmem.containsKey((((ReadFunctContext)_localctx).e1!=null?_input.getText(((ReadFunctContext)_localctx).e1.start,((ReadFunctContext)_localctx).e1.stop):null))){
			                                                                   input = scanner.nextLine();
			                                                                   if((input.toLowerCase()).equals("true") || (input.toLowerCase()).equals("false")){
			                                                                       if((varmem.get((((ReadFunctContext)_localctx).e1!=null?_input.getText(((ReadFunctContext)_localctx).e1.start,((ReadFunctContext)_localctx).e1.stop):null))[0].toLowerCase()).equals("boolean")){
			                                                                           varmem.replace((((ReadFunctContext)_localctx).e1!=null?_input.getText(((ReadFunctContext)_localctx).e1.start,((ReadFunctContext)_localctx).e1.stop):null),new String[]{varmem.get((((ReadFunctContext)_localctx).e1!=null?_input.getText(((ReadFunctContext)_localctx).e1.start,((ReadFunctContext)_localctx).e1.stop):null))[0],input.toUpperCase()});
			                                                                       }
			                                                                   }
			                                                                   else if(input.matches("-?\\d+(\\.\\d+)?")){
			                                                                         varmem.replace((((ReadFunctContext)_localctx).e1!=null?_input.getText(((ReadFunctContext)_localctx).e1.start,((ReadFunctContext)_localctx).e1.stop):null),new String[]{varmem.get((((ReadFunctContext)_localctx).e1!=null?_input.getText(((ReadFunctContext)_localctx).e1.start,((ReadFunctContext)_localctx).e1.stop):null))[0],input});
			                                                                   }
			                                                               }
			                                                           }
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				match(COMMA);
				setState(277);
				((ReadFunctContext)_localctx).e2 = expression();
				if(evalBool){
				                                                                                        if(varmem.containsKey((((ReadFunctContext)_localctx).e2!=null?_input.getText(((ReadFunctContext)_localctx).e2.start,((ReadFunctContext)_localctx).e2.stop):null))){
				                                                                                            input = scanner.nextLine();
				                                                                                            if((input.toLowerCase()).equals("true") || (input.toLowerCase()).equals("false")){
				                                                                                                if((varmem.get((((ReadFunctContext)_localctx).e2!=null?_input.getText(((ReadFunctContext)_localctx).e2.start,((ReadFunctContext)_localctx).e2.stop):null))[0].toLowerCase()).equals("boolean")){
				                                                                                                    varmem.replace((((ReadFunctContext)_localctx).e2!=null?_input.getText(((ReadFunctContext)_localctx).e2.start,((ReadFunctContext)_localctx).e2.stop):null),new String[]{varmem.get((((ReadFunctContext)_localctx).e2!=null?_input.getText(((ReadFunctContext)_localctx).e2.start,((ReadFunctContext)_localctx).e2.stop):null))[0],input.toUpperCase()});
				                                                                                                }
				                                                                                            }
				                                                                                            else if(input.matches("-?\\d+(\\.\\d+)?")){
				                                                                                                  varmem.replace((((ReadFunctContext)_localctx).e2!=null?_input.getText(((ReadFunctContext)_localctx).e2.start,((ReadFunctContext)_localctx).e2.stop):null),new String[]{varmem.get((((ReadFunctContext)_localctx).e2!=null?_input.getText(((ReadFunctContext)_localctx).e2.start,((ReadFunctContext)_localctx).e2.stop):null))[0],input});
				                                                                                            }
				                                                                                        }
				                                                                                    }
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(RPAREN);
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

	public static class WriteFunctContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public TerminalNode WRITE() { return getToken(InterpreterParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(InterpreterParser.WRITELN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public WriteFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunct; }
	}

	public final WriteFunctContext writeFunct() throws RecognitionException {
		WriteFunctContext _localctx = new WriteFunctContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_writeFunct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==WRITE || _la==WRITELN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(288);
			match(LPAREN);
			setState(289);
			((WriteFunctContext)_localctx).e1 = expression();
			if(evalBool){
			                                                                  //Removes quotes from string: ex. write('hello world') makes hello world instead of 'hello world'
			                                                                  if(((((WriteFunctContext)_localctx).e1!=null?_input.getText(((WriteFunctContext)_localctx).e1.start,((WriteFunctContext)_localctx).e1.stop):null)).charAt(0) == '\'' && ((((WriteFunctContext)_localctx).e1!=null?_input.getText(((WriteFunctContext)_localctx).e1.start,((WriteFunctContext)_localctx).e1.stop):null)).charAt(((((WriteFunctContext)_localctx).e1!=null?_input.getText(((WriteFunctContext)_localctx).e1.start,((WriteFunctContext)_localctx).e1.stop):null)).length()-1) == '\''){
			                                                                      System.out.print(((((WriteFunctContext)_localctx).e1!=null?_input.getText(((WriteFunctContext)_localctx).e1.start,((WriteFunctContext)_localctx).e1.stop):null)).substring(1,((((WriteFunctContext)_localctx).e1!=null?_input.getText(((WriteFunctContext)_localctx).e1.start,((WriteFunctContext)_localctx).e1.stop):null)).length()-1));
			                                                                  }
			                                                                  else{
			                                                                      System.out.print(((WriteFunctContext)_localctx).e1.s2);
			                                                                  }
			                                                              }
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(291);
				match(COMMA);
				setState(292);
				((WriteFunctContext)_localctx).e2 = expression();
				if(evalBool){
				                                                                                                     //Removes quotes from string: ex. write('hello world') makes hello world instead of 'hello world'
				                                                                                                     if(((((WriteFunctContext)_localctx).e2!=null?_input.getText(((WriteFunctContext)_localctx).e2.start,((WriteFunctContext)_localctx).e2.stop):null)).charAt(0) == '\'' && ((((WriteFunctContext)_localctx).e2!=null?_input.getText(((WriteFunctContext)_localctx).e2.start,((WriteFunctContext)_localctx).e2.stop):null)).charAt(((((WriteFunctContext)_localctx).e2!=null?_input.getText(((WriteFunctContext)_localctx).e2.start,((WriteFunctContext)_localctx).e2.stop):null)).length()-1) == '\''){
				                                                                                                         System.out.print(((((WriteFunctContext)_localctx).e2!=null?_input.getText(((WriteFunctContext)_localctx).e2.start,((WriteFunctContext)_localctx).e2.stop):null)).substring(1,((((WriteFunctContext)_localctx).e2!=null?_input.getText(((WriteFunctContext)_localctx).e2.start,((WriteFunctContext)_localctx).e2.stop):null)).length()-1));
				                                                                                                     }
				                                                                                                     else{
				                                                                                                         System.out.print(((WriteFunctContext)_localctx).e2.s2);
				                                                                                                     }
				                                                                                                 }
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			match(RPAREN);

			        if(evalBool){
			            System.out.print('\n');
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

	public static class SqrtFunctContext extends ParserRuleContext {
		public String s1;
		public ExpressionContext expression;
		public TerminalNode SQRT() { return getToken(InterpreterParser.SQRT, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public SqrtFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrtFunct; }
	}

	public final SqrtFunctContext sqrtFunct() throws RecognitionException {
		SqrtFunctContext _localctx = new SqrtFunctContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sqrtFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(SQRT);
			setState(304);
			match(LPAREN);
			setState(305);
			((SqrtFunctContext)_localctx).expression = expression();
			setState(306);
			match(RPAREN);

			        String foo = "Math.sqrt(" + ((SqrtFunctContext)_localctx).expression.s2 + ")";
			        try{((SqrtFunctContext)_localctx).s1 =  engine.eval(foo).toString();}
			        catch(Exception e){}
			    
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

	public static class SinFunctContext extends ParserRuleContext {
		public String s1;
		public ExpressionContext expression;
		public TerminalNode SIN() { return getToken(InterpreterParser.SIN, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public SinFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinFunct; }
	}

	public final SinFunctContext sinFunct() throws RecognitionException {
		SinFunctContext _localctx = new SinFunctContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sinFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(SIN);
			setState(310);
			match(LPAREN);
			setState(311);
			((SinFunctContext)_localctx).expression = expression();
			setState(312);
			match(RPAREN);

			        String foo = "Math.sin(" + ((SinFunctContext)_localctx).expression.s2 + ")";
			        try{((SinFunctContext)_localctx).s1 =  engine.eval(foo).toString();}
			        catch(Exception e){}
			    
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

	public static class CosFunctContext extends ParserRuleContext {
		public String s1;
		public ExpressionContext expression;
		public TerminalNode COS() { return getToken(InterpreterParser.COS, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public CosFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cosFunct; }
	}

	public final CosFunctContext cosFunct() throws RecognitionException {
		CosFunctContext _localctx = new CosFunctContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cosFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(COS);
			setState(316);
			match(LPAREN);
			setState(317);
			((CosFunctContext)_localctx).expression = expression();
			setState(318);
			match(RPAREN);

			        String foo = "Math.cos(" + ((CosFunctContext)_localctx).expression.s2 + ")";
			        try{((CosFunctContext)_localctx).s1 =  engine.eval(foo).toString();}
			        catch(Exception e){}
			    
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

	public static class LnFunctContext extends ParserRuleContext {
		public String s1;
		public ExpressionContext expression;
		public TerminalNode LN() { return getToken(InterpreterParser.LN, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public LnFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lnFunct; }
	}

	public final LnFunctContext lnFunct() throws RecognitionException {
		LnFunctContext _localctx = new LnFunctContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lnFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(LN);
			setState(322);
			match(LPAREN);
			setState(323);
			((LnFunctContext)_localctx).expression = expression();
			setState(324);
			match(RPAREN);

			        String foo = "Math.log(" + ((LnFunctContext)_localctx).expression.s2 + ")";
			        try{((LnFunctContext)_localctx).s1 =  engine.eval(foo).toString();}
			        catch(Exception e){}
			    
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

	public static class ExpFunctContext extends ParserRuleContext {
		public String s1;
		public ExpressionContext expression;
		public TerminalNode EXP() { return getToken(InterpreterParser.EXP, 0); }
		public TerminalNode LPAREN() { return getToken(InterpreterParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(InterpreterParser.RPAREN, 0); }
		public ExpFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expFunct; }
	}

	public final ExpFunctContext expFunct() throws RecognitionException {
		ExpFunctContext _localctx = new ExpFunctContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(EXP);
			setState(328);
			match(LPAREN);
			setState(329);
			((ExpFunctContext)_localctx).expression = expression();
			setState(330);
			match(RPAREN);

			        String foo = "Math.exp(" + ((ExpFunctContext)_localctx).expression.s2 + ")";
			        try{((ExpFunctContext)_localctx).s1 =  engine.eval(foo).toString();}
			        catch(Exception e){}
			    
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

	public static class BoolExpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(InterpreterParser.AND, 0); }
		public TerminalNode OR() { return getToken(InterpreterParser.OR, 0); }
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		BoolExpContext _localctx = new BoolExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_boolExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RelatExpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(InterpreterParser.LT, 0); }
		public TerminalNode LE() { return getToken(InterpreterParser.LE, 0); }
		public TerminalNode GE() { return getToken(InterpreterParser.GE, 0); }
		public TerminalNode GT() { return getToken(InterpreterParser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(InterpreterParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(InterpreterParser.NOT_EQUAL, 0); }
		public RelatExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relatExp; }
	}

	public final RelatExpContext relatExp() throws RecognitionException {
		RelatExpContext _localctx = new RelatExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relatExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArithExpContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(InterpreterParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(InterpreterParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(InterpreterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(InterpreterParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(InterpreterParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(InterpreterParser.MINUS, 0); }
		public ArithExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExp; }
	}

	public final ArithExpContext arithExp() throws RecognitionException {
		ArithExpContext _localctx = new ArithExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arithExp);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(STAR);
				}
				break;
			case DIV:
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(MOD);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(MINUS);
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

	public static class DecisStatesContext extends ParserRuleContext {
		public IfthenelseContext ifthenelse() {
			return getRuleContext(IfthenelseContext.class,0);
		}
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public DecisStatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisStates; }
	}

	public final DecisStatesContext decisStates() throws RecognitionException {
		DecisStatesContext _localctx = new DecisStatesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_decisStates);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				ifthenelse();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				caseStmt();
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

	public static class IfthenelseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public StatementContext st1;
		public CompoundStatementContext cst1;
		public StatementContext st2;
		public CompoundStatementContext cst2;
		public TerminalNode IF() { return getToken(InterpreterParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(InterpreterParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(InterpreterParser.ELSE, 0); }
		public IfthenelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenelse; }
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(IF);
			setState(349);
			((IfthenelseContext)_localctx).expression = expression();
			setState(350);
			match(THEN);
			evalBool=false;
			if(Boolean.parseBoolean(((IfthenelseContext)_localctx).expression.s2)){evalBool=true;}
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case COS:
			case ELSE:
			case END:
			case EXP:
			case FOR:
			case IF:
			case LN:
			case READ:
			case READLN:
			case SIN:
			case SQRT:
			case WHILE:
			case WRITE:
			case WRITELN:
			case SEMI:
			case IDENT:
				{
				setState(353);
				((IfthenelseContext)_localctx).st1 = statement();
				}
				break;
			case BEGIN:
				{
				setState(354);
				((IfthenelseContext)_localctx).cst1 = compoundStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			evalBool=false;
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(358);
				match(ELSE);
				if(!Boolean.parseBoolean(((IfthenelseContext)_localctx).expression.s2)){evalBool=true;}
				setState(362);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case COS:
				case ELSE:
				case END:
				case EXP:
				case FOR:
				case IF:
				case LN:
				case READ:
				case READLN:
				case SIN:
				case SQRT:
				case WHILE:
				case WRITE:
				case WRITELN:
				case SEMI:
				case IDENT:
					{
					setState(360);
					((IfthenelseContext)_localctx).st2 = statement();
					}
					break;
				case BEGIN:
					{
					setState(361);
					((IfthenelseContext)_localctx).cst2 = compoundStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			evalBool=true;
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

	public static class CaseStmtContext extends ParserRuleContext {
		public ExpressionContext expression;
		public SpcIdentContext spcIdent;
		public TerminalNode CASE() { return getToken(InterpreterParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public List<SpcIdentContext> spcIdent() {
			return getRuleContexts(SpcIdentContext.class);
		}
		public SpcIdentContext spcIdent(int i) {
			return getRuleContext(SpcIdentContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(InterpreterParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(InterpreterParser.COLON, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(InterpreterParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(InterpreterParser.SEMI, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_caseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(CASE);
			setState(369);
			((CaseStmtContext)_localctx).expression = expression();
			setState(370);
			match(OF);
			evalBool=false;
			{
			setState(372);
			((CaseStmtContext)_localctx).spcIdent = spcIdent();
			setState(373);
			match(COLON);
			   //System.out.println(((((CaseStmtContext)_localctx).spcIdent!=null?_input.getText(((CaseStmtContext)_localctx).spcIdent.start,((CaseStmtContext)_localctx).spcIdent.stop):null)).toString());
			    if((((CaseStmtContext)_localctx).expression.s2).toString().equals(((((CaseStmtContext)_localctx).spcIdent!=null?_input.getText(((CaseStmtContext)_localctx).spcIdent.start,((CaseStmtContext)_localctx).spcIdent.stop):null)).toString())){
			        evalBool=true;
			    }

			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case COS:
			case END:
			case EXP:
			case FOR:
			case IF:
			case LN:
			case READ:
			case READLN:
			case SIN:
			case SQRT:
			case WHILE:
			case WRITE:
			case WRITELN:
			case SEMI:
			case IDENT:
				{
				setState(375);
				statement();
				}
				break;
			case BEGIN:
				{
				setState(376);
				compoundStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			evalBool=false;
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(381);
				match(SEMI);
				setState(382);
				((CaseStmtContext)_localctx).spcIdent = spcIdent();
				setState(383);
				match(COLON);

				                                                    if((((CaseStmtContext)_localctx).expression.s2).toString().equals(((((CaseStmtContext)_localctx).spcIdent!=null?_input.getText(((CaseStmtContext)_localctx).spcIdent.start,((CaseStmtContext)_localctx).spcIdent.stop):null)).toString())){
				                                                        evalBool=true;
				                                                    }
				                                                
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case COS:
				case END:
				case EXP:
				case FOR:
				case IF:
				case LN:
				case READ:
				case READLN:
				case SIN:
				case SQRT:
				case WHILE:
				case WRITE:
				case WRITELN:
				case SEMI:
				case IDENT:
					{
					setState(385);
					statement();
					}
					break;
				case BEGIN:
					{
					setState(386);
					compoundStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				evalBool=false;
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(END);
			evalBool=true;
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(398);
				match(SEMI);
				}
				break;
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

	public static class SpcIdentContext extends ParserRuleContext {
		public TerminalNode SPC() { return getToken(InterpreterParser.SPC, 0); }
		public TerminalNode IDENT() { return getToken(InterpreterParser.IDENT, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(InterpreterParser.STRINGLITERAL, 0); }
		public TerminalNode NUM_INT() { return getToken(InterpreterParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(InterpreterParser.NUM_REAL, 0); }
		public SpcIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spcIdent; }
	}

	public final SpcIdentContext spcIdent() throws RecognitionException {
		SpcIdentContext _localctx = new SpcIdentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_spcIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (IDENT - 85)) | (1L << (STRINGLITERAL - 85)) | (1L << (NUM_INT - 85)) | (1L << (NUM_REAL - 85)) | (1L << (SPC - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LoopContext extends ParserRuleContext {
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_loop);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				whileloop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				forloop();
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

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(InterpreterParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(WHILE);
			setState(408);
			expression();
			setState(409);
			match(DO);
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case COS:
			case ELSE:
			case END:
			case EXP:
			case FOR:
			case IF:
			case LN:
			case READ:
			case READLN:
			case SIN:
			case SQRT:
			case WHILE:
			case WRITE:
			case WRITELN:
			case SEMI:
			case IDENT:
				{
				setState(410);
				statement();
				}
				break;
			case BEGIN:
				{
				setState(411);
				compoundStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(InterpreterParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(FOR);
			setState(415);
			expression();
			setState(416);
			match(DO);
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case COS:
			case ELSE:
			case END:
			case EXP:
			case FOR:
			case IF:
			case LN:
			case READ:
			case READLN:
			case SIN:
			case SQRT:
			case WHILE:
			case WRITE:
			case WRITELN:
			case SEMI:
			case IDENT:
				{
				setState(417);
				statement();
				}
				break;
			case BEGIN:
				{
				setState(418);
				compoundStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u01a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\3\3\3\3\4\3\4\7\4d\n\4\f\4\16"+
		"\4g\13\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5o\n\5\r\5\16\5p\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\6\7|\n\7\r\7\16\7}\3\b\3\b\3\b\3\b\3\b\3\t\5\t\u0086"+
		"\n\t\3\t\3\t\5\t\u008a\n\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\7\n\u0092\n\n"+
		"\f\n\16\n\u0095\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00ac\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\7\23\u00bb\n\23\f\23\16\23\u00be\13\23\3\23\3\23\3\24\5\24\u00c3"+
		"\n\24\3\24\3\24\3\24\5\24\u00c8\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00dc\n\24"+
		"\3\25\7\25\u00df\n\25\f\25\16\25\u00e2\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00f6\n\25\3\26\3\26\3\26\5\26\u00fb\n\26\3\27\3\27\3\27\5\27\u0100\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0111\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u011b\n\31\f\31\16\31\u011e\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u012a\n\32\f\32\16\32\u012d\13\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0159\n\"\3#\3#\5#\u015d"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\5$\u0166\n$\3$\3$\3$\3$\3$\5$\u016d\n$\5$\u016f"+
		"\n$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u017c\n%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\5%\u0186\n%\3%\3%\7%\u018a\n%\f%\16%\u018d\13%\3%\3%\3%\5%\u0192\n"+
		"%\3&\3&\3\'\3\'\5\'\u0198\n\'\3(\3(\3(\3(\3(\5(\u019f\n(\3)\3)\3)\3)\3"+
		")\5)\u01a6\n)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNP\2\n\5\2\6\6\30\30%%\3\2ST\3\2#$\3\2\62\63\4"+
		"\2\3\3\37\37\3\2<A\4\2\f\f\67\67\3\2W[\2\u01b5\2R\3\2\2\2\4W\3\2\2\2\6"+
		"e\3\2\2\2\bj\3\2\2\2\nr\3\2\2\2\fw\3\2\2\2\16\177\3\2\2\2\20\u008c\3\2"+
		"\2\2\22\u008e\3\2\2\2\24\u0096\3\2\2\2\26\u0098\3\2\2\2\30\u009a\3\2\2"+
		"\2\32\u009e\3\2\2\2\34\u00ab\3\2\2\2\36\u00ad\3\2\2\2 \u00af\3\2\2\2\""+
		"\u00b4\3\2\2\2$\u00b6\3\2\2\2&\u00db\3\2\2\2(\u00f5\3\2\2\2*\u00fa\3\2"+
		"\2\2,\u00ff\3\2\2\2.\u0110\3\2\2\2\60\u0112\3\2\2\2\62\u0121\3\2\2\2\64"+
		"\u0131\3\2\2\2\66\u0137\3\2\2\28\u013d\3\2\2\2:\u0143\3\2\2\2<\u0149\3"+
		"\2\2\2>\u014f\3\2\2\2@\u0151\3\2\2\2B\u0158\3\2\2\2D\u015c\3\2\2\2F\u015e"+
		"\3\2\2\2H\u0172\3\2\2\2J\u0193\3\2\2\2L\u0197\3\2\2\2N\u0199\3\2\2\2P"+
		"\u01a0\3\2\2\2RS\5\4\3\2ST\5\6\4\2TU\7J\2\2UV\7\2\2\3V\3\3\2\2\2WX\7\""+
		"\2\2X]\5\24\13\2YZ\7B\2\2Z[\5\22\n\2[\\\7C\2\2\\^\3\2\2\2]Y\3\2\2\2]^"+
		"\3\2\2\2^_\3\2\2\2_`\7:\2\2`\5\3\2\2\2ad\5\b\5\2bd\5\f\7\2ca\3\2\2\2c"+
		"b\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5\30\r\2"+
		"i\7\3\2\2\2jn\7/\2\2kl\5\n\6\2lm\7:\2\2mo\3\2\2\2nk\3\2\2\2op\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2q\t\3\2\2\2rs\5\22\n\2st\7;\2\2tu\5\26\f\2uv\b\6\1"+
		"\2v\13\3\2\2\2w{\7\n\2\2xy\5\16\b\2yz\7:\2\2z|\3\2\2\2{x\3\2\2\2|}\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\r\3\2\2\2\177\u0080\5\24\13\2\u0080\u0081\7"+
		"<\2\2\u0081\u0082\5\20\t\2\u0082\u0083\b\b\1\2\u0083\17\3\2\2\2\u0084"+
		"\u0086\7\65\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u008d\7Y\2\2\u0088\u008a\7\65\2\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7Z\2\2\u008c\u0085\3\2"+
		"\2\2\u008c\u0089\3\2\2\2\u008d\21\3\2\2\2\u008e\u0093\5\24\13\2\u008f"+
		"\u0090\79\2\2\u0090\u0092\5\24\13\2\u0091\u008f\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7W\2\2\u0097\25\3\2\2\2\u0098\u0099\t\2\2\2"+
		"\u0099\27\3\2\2\2\u009a\u009b\7\5\2\2\u009b\u009c\5\32\16\2\u009c\u009d"+
		"\7\20\2\2\u009d\31\3\2\2\2\u009e\u00a3\5\34\17\2\u009f\u00a0\7:\2\2\u00a0"+
		"\u00a2\5\34\17\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00ac\5 \21\2\u00a7\u00ac\5D#\2\u00a8\u00ac\5,\27\2\u00a9\u00ac\5\36"+
		"\20\2\u00aa\u00ac\5L\'\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\35\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1"+
		"\78\2\2\u00b1\u00b2\5$\23\2\u00b2\u00b3\b\21\1\2\u00b3!\3\2\2\2\u00b4"+
		"\u00b5\5\24\13\2\u00b5#\3\2\2\2\u00b6\u00bc\5&\24\2\u00b7\u00b8\5*\26"+
		"\2\u00b8\u00b9\5$\23\2\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\b\23\1\2\u00c0%\3\2\2\2\u00c1\u00c3\7\65\2"+
		"\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\7Z\2\2\u00c5\u00dc\b\24\1\2\u00c6\u00c8\7\65\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7Y\2\2\u00ca\u00dc"+
		"\b\24\1\2\u00cb\u00cc\7B\2\2\u00cc\u00cd\5$\23\2\u00cd\u00ce\7C\2\2\u00ce"+
		"\u00cf\b\24\1\2\u00cf\u00dc\3\2\2\2\u00d0\u00d1\7X\2\2\u00d1\u00dc\b\24"+
		"\1\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\b\24\1\2\u00d4\u00dc\3\2\2\2\u00d5"+
		"\u00d6\5\"\22\2\u00d6\u00d7\b\24\1\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\5"+
		".\30\2\u00d9\u00da\b\24\1\2\u00da\u00dc\3\2\2\2\u00db\u00c2\3\2\2\2\u00db"+
		"\u00c7\3\2\2\2\u00db\u00cb\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d2\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00df"+
		"\7\35\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00f6"+
		"\t\3\2\2\u00e4\u00e5\7\35\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\5(\25\2"+
		"\u00e7\u00e8\b\25\1\2\u00e8\u00f6\3\2\2\2\u00e9\u00ea\7\35\2\2\u00ea\u00eb"+
		"\5\"\22\2\u00eb\u00ec\b\25\1\2\u00ec\u00f6\3\2\2\2\u00ed\u00ee\5\"\22"+
		"\2\u00ee\u00ef\b\25\1\2\u00ef\u00f6\3\2\2\2\u00f0\u00f1\7\35\2\2\u00f1"+
		"\u00f2\7Y\2\2\u00f2\u00f6\b\25\1\2\u00f3\u00f4\7Y\2\2\u00f4\u00f6\b\25"+
		"\1\2\u00f5\u00e0\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5"+
		"\u00ed\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6)\3\2\2\2"+
		"\u00f7\u00fb\5> \2\u00f8\u00fb\5B\"\2\u00f9\u00fb\5@!\2\u00fa\u00f7\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb+\3\2\2\2\u00fc\u0100"+
		"\5\60\31\2\u00fd\u0100\5\62\32\2\u00fe\u0100\5.\30\2\u00ff\u00fc\3\2\2"+
		"\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100-\3\2\2\2\u0101\u0102"+
		"\5\64\33\2\u0102\u0103\b\30\1\2\u0103\u0111\3\2\2\2\u0104\u0105\5\66\34"+
		"\2\u0105\u0106\b\30\1\2\u0106\u0111\3\2\2\2\u0107\u0108\58\35\2\u0108"+
		"\u0109\b\30\1\2\u0109\u0111\3\2\2\2\u010a\u010b\5:\36\2\u010b\u010c\b"+
		"\30\1\2\u010c\u0111\3\2\2\2\u010d\u010e\5<\37\2\u010e\u010f\b\30\1\2\u010f"+
		"\u0111\3\2\2\2\u0110\u0101\3\2\2\2\u0110\u0104\3\2\2\2\u0110\u0107\3\2"+
		"\2\2\u0110\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111/\3\2\2\2\u0112\u0113"+
		"\t\4\2\2\u0113\u0114\7B\2\2\u0114\u0115\5$\23\2\u0115\u011c\b\31\1\2\u0116"+
		"\u0117\79\2\2\u0117\u0118\5$\23\2\u0118\u0119\b\31\1\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0116\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7C"+
		"\2\2\u0120\61\3\2\2\2\u0121\u0122\t\5\2\2\u0122\u0123\7B\2\2\u0123\u0124"+
		"\5$\23\2\u0124\u012b\b\32\1\2\u0125\u0126\79\2\2\u0126\u0127\5$\23\2\u0127"+
		"\u0128\b\32\1\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2\2\2\u012a\u012d\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7C\2\2\u012f\u0130\b\32\1\2\u0130\63\3\2\2"+
		"\2\u0131\u0132\7*\2\2\u0132\u0133\7B\2\2\u0133\u0134\5$\23\2\u0134\u0135"+
		"\7C\2\2\u0135\u0136\b\33\1\2\u0136\65\3\2\2\2\u0137\u0138\7)\2\2\u0138"+
		"\u0139\7B\2\2\u0139\u013a\5$\23\2\u013a\u013b\7C\2\2\u013b\u013c\b\34"+
		"\1\2\u013c\67\3\2\2\2\u013d\u013e\7\13\2\2\u013e\u013f\7B\2\2\u013f\u0140"+
		"\5$\23\2\u0140\u0141\7C\2\2\u0141\u0142\b\35\1\2\u01429\3\2\2\2\u0143"+
		"\u0144\7\32\2\2\u0144\u0145\7B\2\2\u0145\u0146\5$\23\2\u0146\u0147\7C"+
		"\2\2\u0147\u0148\b\36\1\2\u0148;\3\2\2\2\u0149\u014a\7\21\2\2\u014a\u014b"+
		"\7B\2\2\u014b\u014c\5$\23\2\u014c\u014d\7C\2\2\u014d\u014e\b\37\1\2\u014e"+
		"=\3\2\2\2\u014f\u0150\t\6\2\2\u0150?\3\2\2\2\u0151\u0152\t\7\2\2\u0152"+
		"A\3\2\2\2\u0153\u0159\7\66\2\2\u0154\u0159\t\b\2\2\u0155\u0159\7\33\2"+
		"\2\u0156\u0159\7\64\2\2\u0157\u0159\7\65\2\2\u0158\u0153\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2"+
		"\2\2\u0159C\3\2\2\2\u015a\u015d\5F$\2\u015b\u015d\5H%\2\u015c\u015a\3"+
		"\2\2\2\u015c\u015b\3\2\2\2\u015dE\3\2\2\2\u015e\u015f\7\26\2\2\u015f\u0160"+
		"\5$\23\2\u0160\u0161\7+\2\2\u0161\u0162\b$\1\2\u0162\u0165\b$\1\2\u0163"+
		"\u0166\5\34\17\2\u0164\u0166\5\30\r\2\u0165\u0163\3\2\2\2\u0165\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016e\b$\1\2\u0168\u0169\7\17\2\2\u0169"+
		"\u016c\b$\1\2\u016a\u016d\5\34\17\2\u016b\u016d\5\30\r\2\u016c\u016a\3"+
		"\2\2\2\u016c\u016b\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0168\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b$\1\2\u0171G\3\2\2\2\u0172"+
		"\u0173\7\7\2\2\u0173\u0174\5$\23\2\u0174\u0175\7\36\2\2\u0175\u0176\b"+
		"%\1\2\u0176\u0177\5J&\2\u0177\u0178\7;\2\2\u0178\u017b\b%\1\2\u0179\u017c"+
		"\5\34\17\2\u017a\u017c\5\30\r\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u017e\b%\1\2\u017e\u018b\3\2\2\2\u017f\u0180"+
		"\7:\2\2\u0180\u0181\5J&\2\u0181\u0182\7;\2\2\u0182\u0185\b%\1\2\u0183"+
		"\u0186\5\34\17\2\u0184\u0186\5\30\r\2\u0185\u0183\3\2\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b%\1\2\u0188\u018a\3\2\2\2\u0189"+
		"\u017f\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\20\2\2\u018f"+
		"\u0191\b%\1\2\u0190\u0192\7:\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2"+
		"\2\u0192I\3\2\2\2\u0193\u0194\t\t\2\2\u0194K\3\2\2\2\u0195\u0198\5N(\2"+
		"\u0196\u0198\5P)\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198M\3\2"+
		"\2\2\u0199\u019a\7\60\2\2\u019a\u019b\5$\23\2\u019b\u019e\7\r\2\2\u019c"+
		"\u019f\5\34\17\2\u019d\u019f\5\30\r\2\u019e\u019c\3\2\2\2\u019e\u019d"+
		"\3\2\2\2\u019fO\3\2\2\2\u01a0\u01a1\7\23\2\2\u01a1\u01a2\5$\23\2\u01a2"+
		"\u01a5\7\r\2\2\u01a3\u01a6\5\34\17\2\u01a4\u01a6\5\30\r\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6Q\3\2\2\2$]cep}\u0085\u0089\u008c\u0093"+
		"\u00a3\u00ab\u00bc\u00c2\u00c7\u00db\u00e0\u00f5\u00fa\u00ff\u0110\u011c"+
		"\u012b\u0158\u015c\u0165\u016c\u016e\u017b\u0185\u018b\u0191\u0197\u019e"+
		"\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}