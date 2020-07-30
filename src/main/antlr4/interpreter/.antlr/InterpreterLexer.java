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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AND", "ARRAY", 
		"BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", "COS", "DIV", "DO", 
		"DOWNTO", "ELSE", "END", "EXP", "FILE", "FOR", "FUNCTION", "GOTO", "IF", 
		"IN", "INTEGER", "LABEL", "LN", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", 
		"PROCEDURE", "PROGRAM", "READ", "READLN", "REAL", "RECORD", "REPEAT", 
		"SET", "SIN", "SQRT", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", 
		"WRITE", "WRITELN", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
		"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", 
		"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", 
		"DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", "IMPLEMENTATION", 
		"TRUE", "FALSE", "WS", "COMMENT", "IDENT", "STRINGLITERAL", "NUM_INT", 
		"NUM_REAL", "SPC", "EXPONENT"
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


	    HashMap<String, String[]> varmem = new HashMap<>();
	    Scanner scanner = new Scanner(System.in);
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String input;
	    String temp1 = "";
	    String temp2 = "";
	    Double tempRet = 0.0;
	    Boolean evalBool = true;


	public InterpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u02de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?"+
		"\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C"+
		"\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H"+
		"\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3U"+
		"\3U\3V\3V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3"+
		"^\3_\3_\3`\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3d\3e\3e\3f\3f\3g\3g\3g\3g\3"+
		"g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3m\3m\3m\3"+
		"m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\7o\u0298\no\fo\16o\u029b\13o\3o\3o\3o"+
		"\3o\3o\3p\3p\7p\u02a4\np\fp\16p\u02a7\13p\3q\3q\3q\6q\u02ac\nq\rq\16q"+
		"\u02ad\7q\u02b0\nq\fq\16q\u02b3\13q\3q\3q\3r\6r\u02b8\nr\rr\16r\u02b9"+
		"\3s\6s\u02bd\ns\rs\16s\u02be\3s\3s\6s\u02c3\ns\rs\16s\u02c4\3s\5s\u02c8"+
		"\ns\5s\u02ca\ns\3s\5s\u02cd\ns\3t\3t\7t\u02d1\nt\ft\16t\u02d4\13t\3u\3"+
		"u\5u\u02d8\nu\3u\6u\u02db\nu\ru\16u\u02dc\3\u0299\2v\3\2\5\2\7\2\t\2\13"+
		"\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2"+
		"-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20"+
		"S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#"+
		"y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091"+
		"\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66\u009f\67\u00a1"+
		"8\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af?\u00b1@\u00b3A\u00b5"+
		"B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3I\u00c5J\u00c7K\u00c9"+
		"L\u00cbM\u00cdN\u00cfO\u00d1P\u00d3Q\u00d5R\u00d7S\u00d9T\u00dbU\u00dd"+
		"V\u00dfW\u00e1X\u00e3Y\u00e5Z\u00e7[\u00e9\2\3\2\"\4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\""+
		"\4\2C\\c|\6\2\62;C\\aac|\n\2\"\"..\60\60\62<AAC\\aac|\3\2))\4\2--//\2"+
		"\u02d0\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3"+
		"\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\3\u00eb\3\2\2\2\5\u00ed\3\2\2"+
		"\2\7\u00ef\3\2\2\2\t\u00f1\3\2\2\2\13\u00f3\3\2\2\2\r\u00f5\3\2\2\2\17"+
		"\u00f7\3\2\2\2\21\u00f9\3\2\2\2\23\u00fb\3\2\2\2\25\u00fd\3\2\2\2\27\u00ff"+
		"\3\2\2\2\31\u0101\3\2\2\2\33\u0103\3\2\2\2\35\u0105\3\2\2\2\37\u0107\3"+
		"\2\2\2!\u0109\3\2\2\2#\u010b\3\2\2\2%\u010d\3\2\2\2\'\u010f\3\2\2\2)\u0111"+
		"\3\2\2\2+\u0113\3\2\2\2-\u0115\3\2\2\2/\u0117\3\2\2\2\61\u0119\3\2\2\2"+
		"\63\u011b\3\2\2\2\65\u011d\3\2\2\2\67\u011f\3\2\2\29\u0123\3\2\2\2;\u0129"+
		"\3\2\2\2=\u012f\3\2\2\2?\u0137\3\2\2\2A\u013c\3\2\2\2C\u0141\3\2\2\2E"+
		"\u0145\3\2\2\2G\u014b\3\2\2\2I\u014f\3\2\2\2K\u0153\3\2\2\2M\u0156\3\2"+
		"\2\2O\u015d\3\2\2\2Q\u0162\3\2\2\2S\u0166\3\2\2\2U\u016a\3\2\2\2W\u016f"+
		"\3\2\2\2Y\u0173\3\2\2\2[\u017c\3\2\2\2]\u0181\3\2\2\2_\u0184\3\2\2\2a"+
		"\u0187\3\2\2\2c\u018f\3\2\2\2e\u0195\3\2\2\2g\u0198\3\2\2\2i\u019c\3\2"+
		"\2\2k\u01a0\3\2\2\2m\u01a4\3\2\2\2o\u01a7\3\2\2\2q\u01aa\3\2\2\2s\u01b1"+
		"\3\2\2\2u\u01bb\3\2\2\2w\u01c3\3\2\2\2y\u01c8\3\2\2\2{\u01cf\3\2\2\2}"+
		"\u01d4\3\2\2\2\177\u01db\3\2\2\2\u0081\u01e2\3\2\2\2\u0083\u01e6\3\2\2"+
		"\2\u0085\u01ea\3\2\2\2\u0087\u01ef\3\2\2\2\u0089\u01f4\3\2\2\2\u008b\u01f7"+
		"\3\2\2\2\u008d\u01fc\3\2\2\2\u008f\u0202\3\2\2\2\u0091\u0206\3\2\2\2\u0093"+
		"\u020c\3\2\2\2\u0095\u0211\3\2\2\2\u0097\u0217\3\2\2\2\u0099\u021f\3\2"+
		"\2\2\u009b\u0221\3\2\2\2\u009d\u0223\3\2\2\2\u009f\u0225\3\2\2\2\u00a1"+
		"\u0227\3\2\2\2\u00a3\u022a\3\2\2\2\u00a5\u022c\3\2\2\2\u00a7\u022e\3\2"+
		"\2\2\u00a9\u0230\3\2\2\2\u00ab\u0232\3\2\2\2\u00ad\u0235\3\2\2\2\u00af"+
		"\u0237\3\2\2\2\u00b1\u023a\3\2\2\2\u00b3\u023d\3\2\2\2\u00b5\u023f\3\2"+
		"\2\2\u00b7\u0241\3\2\2\2\u00b9\u0243\3\2\2\2\u00bb\u0245\3\2\2\2\u00bd"+
		"\u0248\3\2\2\2\u00bf\u024a\3\2\2\2\u00c1\u024d\3\2\2\2\u00c3\u024f\3\2"+
		"\2\2\u00c5\u0251\3\2\2\2\u00c7\u0253\3\2\2\2\u00c9\u0256\3\2\2\2\u00cb"+
		"\u0258\3\2\2\2\u00cd\u025a\3\2\2\2\u00cf\u025f\3\2\2\2\u00d1\u0269\3\2"+
		"\2\2\u00d3\u026e\3\2\2\2\u00d5\u0275\3\2\2\2\u00d7\u0284\3\2\2\2\u00d9"+
		"\u0289\3\2\2\2\u00db\u028f\3\2\2\2\u00dd\u0293\3\2\2\2\u00df\u02a1\3\2"+
		"\2\2\u00e1\u02a8\3\2\2\2\u00e3\u02b7\3\2\2\2\u00e5\u02bc\3\2\2\2\u00e7"+
		"\u02ce\3\2\2\2\u00e9\u02d5\3\2\2\2\u00eb\u00ec\t\2\2\2\u00ec\4\3\2\2\2"+
		"\u00ed\u00ee\t\3\2\2\u00ee\6\3\2\2\2\u00ef\u00f0\t\4\2\2\u00f0\b\3\2\2"+
		"\2\u00f1\u00f2\t\5\2\2\u00f2\n\3\2\2\2\u00f3\u00f4\t\6\2\2\u00f4\f\3\2"+
		"\2\2\u00f5\u00f6\t\7\2\2\u00f6\16\3\2\2\2\u00f7\u00f8\t\b\2\2\u00f8\20"+
		"\3\2\2\2\u00f9\u00fa\t\t\2\2\u00fa\22\3\2\2\2\u00fb\u00fc\t\n\2\2\u00fc"+
		"\24\3\2\2\2\u00fd\u00fe\t\13\2\2\u00fe\26\3\2\2\2\u00ff\u0100\t\f\2\2"+
		"\u0100\30\3\2\2\2\u0101\u0102\t\r\2\2\u0102\32\3\2\2\2\u0103\u0104\t\16"+
		"\2\2\u0104\34\3\2\2\2\u0105\u0106\t\17\2\2\u0106\36\3\2\2\2\u0107\u0108"+
		"\t\20\2\2\u0108 \3\2\2\2\u0109\u010a\t\21\2\2\u010a\"\3\2\2\2\u010b\u010c"+
		"\t\22\2\2\u010c$\3\2\2\2\u010d\u010e\t\23\2\2\u010e&\3\2\2\2\u010f\u0110"+
		"\t\24\2\2\u0110(\3\2\2\2\u0111\u0112\t\25\2\2\u0112*\3\2\2\2\u0113\u0114"+
		"\t\26\2\2\u0114,\3\2\2\2\u0115\u0116\t\27\2\2\u0116.\3\2\2\2\u0117\u0118"+
		"\t\30\2\2\u0118\60\3\2\2\2\u0119\u011a\t\31\2\2\u011a\62\3\2\2\2\u011b"+
		"\u011c\t\32\2\2\u011c\64\3\2\2\2\u011d\u011e\t\33\2\2\u011e\66\3\2\2\2"+
		"\u011f\u0120\5\3\2\2\u0120\u0121\5\35\17\2\u0121\u0122\5\t\5\2\u01228"+
		"\3\2\2\2\u0123\u0124\5\3\2\2\u0124\u0125\5%\23\2\u0125\u0126\5%\23\2\u0126"+
		"\u0127\5\3\2\2\u0127\u0128\5\63\32\2\u0128:\3\2\2\2\u0129\u012a\5\5\3"+
		"\2\u012a\u012b\5\13\6\2\u012b\u012c\5\17\b\2\u012c\u012d\5\23\n\2\u012d"+
		"\u012e\5\35\17\2\u012e<\3\2\2\2\u012f\u0130\5\5\3\2\u0130\u0131\5\37\20"+
		"\2\u0131\u0132\5\37\20\2\u0132\u0133\5\31\r\2\u0133\u0134\5\13\6\2\u0134"+
		"\u0135\5\3\2\2\u0135\u0136\5\35\17\2\u0136>\3\2\2\2\u0137\u0138\5\7\4"+
		"\2\u0138\u0139\5\3\2\2\u0139\u013a\5\'\24\2\u013a\u013b\5\13\6\2\u013b"+
		"@\3\2\2\2\u013c\u013d\5\7\4\2\u013d\u013e\5\21\t\2\u013e\u013f\5\3\2\2"+
		"\u013f\u0140\5%\23\2\u0140B\3\2\2\2\u0141\u0142\5\7\4\2\u0142\u0143\5"+
		"\21\t\2\u0143\u0144\5%\23\2\u0144D\3\2\2\2\u0145\u0146\5\7\4\2\u0146\u0147"+
		"\5\37\20\2\u0147\u0148\5\35\17\2\u0148\u0149\5\'\24\2\u0149\u014a\5)\25"+
		"\2\u014aF\3\2\2\2\u014b\u014c\5\7\4\2\u014c\u014d\5\37\20\2\u014d\u014e"+
		"\5\'\24\2\u014eH\3\2\2\2\u014f\u0150\5\t\5\2\u0150\u0151\5\23\n\2\u0151"+
		"\u0152\5-\27\2\u0152J\3\2\2\2\u0153\u0154\5\t\5\2\u0154\u0155\5\37\20"+
		"\2\u0155L\3\2\2\2\u0156\u0157\5\t\5\2\u0157\u0158\5\37\20\2\u0158\u0159"+
		"\5/\30\2\u0159\u015a\5\35\17\2\u015a\u015b\5)\25\2\u015b\u015c\5\37\20"+
		"\2\u015cN\3\2\2\2\u015d\u015e\5\13\6\2\u015e\u015f\5\31\r\2\u015f\u0160"+
		"\5\'\24\2\u0160\u0161\5\13\6\2\u0161P\3\2\2\2\u0162\u0163\5\13\6\2\u0163"+
		"\u0164\5\35\17\2\u0164\u0165\5\t\5\2\u0165R\3\2\2\2\u0166\u0167\5\13\6"+
		"\2\u0167\u0168\5\61\31\2\u0168\u0169\5!\21\2\u0169T\3\2\2\2\u016a\u016b"+
		"\5\r\7\2\u016b\u016c\5\23\n\2\u016c\u016d\5\31\r\2\u016d\u016e\5\13\6"+
		"\2\u016eV\3\2\2\2\u016f\u0170\5\r\7\2\u0170\u0171\5\37\20\2\u0171\u0172"+
		"\5%\23\2\u0172X\3\2\2\2\u0173\u0174\5\r\7\2\u0174\u0175\5+\26\2\u0175"+
		"\u0176\5\35\17\2\u0176\u0177\5\7\4\2\u0177\u0178\5)\25\2\u0178\u0179\5"+
		"\23\n\2\u0179\u017a\5\37\20\2\u017a\u017b\5\35\17\2\u017bZ\3\2\2\2\u017c"+
		"\u017d\5\17\b\2\u017d\u017e\5\37\20\2\u017e\u017f\5)\25\2\u017f\u0180"+
		"\5\37\20\2\u0180\\\3\2\2\2\u0181\u0182\5\23\n\2\u0182\u0183\5\r\7\2\u0183"+
		"^\3\2\2\2\u0184\u0185\5\23\n\2\u0185\u0186\5\35\17\2\u0186`\3\2\2\2\u0187"+
		"\u0188\5\23\n\2\u0188\u0189\5\35\17\2\u0189\u018a\5)\25\2\u018a\u018b"+
		"\5\13\6\2\u018b\u018c\5\17\b\2\u018c\u018d\5\13\6\2\u018d\u018e\5%\23"+
		"\2\u018eb\3\2\2\2\u018f\u0190\5\31\r\2\u0190\u0191\5\3\2\2\u0191\u0192"+
		"\5\5\3\2\u0192\u0193\5\13\6\2\u0193\u0194\5\31\r\2\u0194d\3\2\2\2\u0195"+
		"\u0196\5\31\r\2\u0196\u0197\5\35\17\2\u0197f\3\2\2\2\u0198\u0199\5\33"+
		"\16\2\u0199\u019a\5\37\20\2\u019a\u019b\5\t\5\2\u019bh\3\2\2\2\u019c\u019d"+
		"\5\35\17\2\u019d\u019e\5\23\n\2\u019e\u019f\5\31\r\2\u019fj\3\2\2\2\u01a0"+
		"\u01a1\5\35\17\2\u01a1\u01a2\5\37\20\2\u01a2\u01a3\5)\25\2\u01a3l\3\2"+
		"\2\2\u01a4\u01a5\5\37\20\2\u01a5\u01a6\5\r\7\2\u01a6n\3\2\2\2\u01a7\u01a8"+
		"\5\37\20\2\u01a8\u01a9\5%\23\2\u01a9p\3\2\2\2\u01aa\u01ab\5!\21\2\u01ab"+
		"\u01ac\5\3\2\2\u01ac\u01ad\5\7\4\2\u01ad\u01ae\5\27\f\2\u01ae\u01af\5"+
		"\13\6\2\u01af\u01b0\5\t\5\2\u01b0r\3\2\2\2\u01b1\u01b2\5!\21\2\u01b2\u01b3"+
		"\5%\23\2\u01b3\u01b4\5\37\20\2\u01b4\u01b5\5\7\4\2\u01b5\u01b6\5\13\6"+
		"\2\u01b6\u01b7\5\t\5\2\u01b7\u01b8\5+\26\2\u01b8\u01b9\5%\23\2\u01b9\u01ba"+
		"\5\13\6\2\u01bat\3\2\2\2\u01bb\u01bc\5!\21\2\u01bc\u01bd\5%\23\2\u01bd"+
		"\u01be\5\37\20\2\u01be\u01bf\5\17\b\2\u01bf\u01c0\5%\23\2\u01c0\u01c1"+
		"\5\3\2\2\u01c1\u01c2\5\33\16\2\u01c2v\3\2\2\2\u01c3\u01c4\5%\23\2\u01c4"+
		"\u01c5\5\13\6\2\u01c5\u01c6\5\3\2\2\u01c6\u01c7\5\t\5\2\u01c7x\3\2\2\2"+
		"\u01c8\u01c9\5%\23\2\u01c9\u01ca\5\13\6\2\u01ca\u01cb\5\3\2\2\u01cb\u01cc"+
		"\5\t\5\2\u01cc\u01cd\5\31\r\2\u01cd\u01ce\5\35\17\2\u01cez\3\2\2\2\u01cf"+
		"\u01d0\5%\23\2\u01d0\u01d1\5\13\6\2\u01d1\u01d2\5\3\2\2\u01d2\u01d3\5"+
		"\31\r\2\u01d3|\3\2\2\2\u01d4\u01d5\5%\23\2\u01d5\u01d6\5\13\6\2\u01d6"+
		"\u01d7\5\7\4\2\u01d7\u01d8\5\37\20\2\u01d8\u01d9\5%\23\2\u01d9\u01da\5"+
		"\t\5\2\u01da~\3\2\2\2\u01db\u01dc\5%\23\2\u01dc\u01dd\5\13\6\2\u01dd\u01de"+
		"\5!\21\2\u01de\u01df\5\13\6\2\u01df\u01e0\5\3\2\2\u01e0\u01e1\5)\25\2"+
		"\u01e1\u0080\3\2\2\2\u01e2\u01e3\5\'\24\2\u01e3\u01e4\5\13\6\2\u01e4\u01e5"+
		"\5)\25\2\u01e5\u0082\3\2\2\2\u01e6\u01e7\5\'\24\2\u01e7\u01e8\5\23\n\2"+
		"\u01e8\u01e9\5\35\17\2\u01e9\u0084\3\2\2\2\u01ea\u01eb\5\'\24\2\u01eb"+
		"\u01ec\5#\22\2\u01ec\u01ed\5%\23\2\u01ed\u01ee\5)\25\2\u01ee\u0086\3\2"+
		"\2\2\u01ef\u01f0\5)\25\2\u01f0\u01f1\5\21\t\2\u01f1\u01f2\5\13\6\2\u01f2"+
		"\u01f3\5\35\17\2\u01f3\u0088\3\2\2\2\u01f4\u01f5\5)\25\2\u01f5\u01f6\5"+
		"\37\20\2\u01f6\u008a\3\2\2\2\u01f7\u01f8\5)\25\2\u01f8\u01f9\5\63\32\2"+
		"\u01f9\u01fa\5!\21\2\u01fa\u01fb\5\13\6\2\u01fb\u008c\3\2\2\2\u01fc\u01fd"+
		"\5+\26\2\u01fd\u01fe\5\35\17\2\u01fe\u01ff\5)\25\2\u01ff\u0200\5\23\n"+
		"\2\u0200\u0201\5\31\r\2\u0201\u008e\3\2\2\2\u0202\u0203\5-\27\2\u0203"+
		"\u0204\5\3\2\2\u0204\u0205\5%\23\2\u0205\u0090\3\2\2\2\u0206\u0207\5/"+
		"\30\2\u0207\u0208\5\21\t\2\u0208\u0209\5\23\n\2\u0209\u020a\5\31\r\2\u020a"+
		"\u020b\5\13\6\2\u020b\u0092\3\2\2\2\u020c\u020d\5/\30\2\u020d\u020e\5"+
		"\23\n\2\u020e\u020f\5)\25\2\u020f\u0210\5\21\t\2\u0210\u0094\3\2\2\2\u0211"+
		"\u0212\5/\30\2\u0212\u0213\5%\23\2\u0213\u0214\5\23\n\2\u0214\u0215\5"+
		")\25\2\u0215\u0216\5\13\6\2\u0216\u0096\3\2\2\2\u0217\u0218\5/\30\2\u0218"+
		"\u0219\5%\23\2\u0219\u021a\5\23\n\2\u021a\u021b\5)\25\2\u021b\u021c\5"+
		"\13\6\2\u021c\u021d\5\31\r\2\u021d\u021e\5\35\17\2\u021e\u0098\3\2\2\2"+
		"\u021f\u0220\7-\2\2\u0220\u009a\3\2\2\2\u0221\u0222\7/\2\2\u0222\u009c"+
		"\3\2\2\2\u0223\u0224\7,\2\2\u0224\u009e\3\2\2\2\u0225\u0226\7\61\2\2\u0226"+
		"\u00a0\3\2\2\2\u0227\u0228\7<\2\2\u0228\u0229\7?\2\2\u0229\u00a2\3\2\2"+
		"\2\u022a\u022b\7.\2\2\u022b\u00a4\3\2\2\2\u022c\u022d\7=\2\2\u022d\u00a6"+
		"\3\2\2\2\u022e\u022f\7<\2\2\u022f\u00a8\3\2\2\2\u0230\u0231\7?\2\2\u0231"+
		"\u00aa\3\2\2\2\u0232\u0233\7>\2\2\u0233\u0234\7@\2\2\u0234\u00ac\3\2\2"+
		"\2\u0235\u0236\7>\2\2\u0236\u00ae\3\2\2\2\u0237\u0238\7>\2\2\u0238\u0239"+
		"\7?\2\2\u0239\u00b0\3\2\2\2\u023a\u023b\7@\2\2\u023b\u023c\7?\2\2\u023c"+
		"\u00b2\3\2\2\2\u023d\u023e\7@\2\2\u023e\u00b4\3\2\2\2\u023f\u0240\7*\2"+
		"\2\u0240\u00b6\3\2\2\2\u0241\u0242\7+\2\2\u0242\u00b8\3\2\2\2\u0243\u0244"+
		"\7]\2\2\u0244\u00ba\3\2\2\2\u0245\u0246\7*\2\2\u0246\u0247\7\60\2\2\u0247"+
		"\u00bc\3\2\2\2\u0248\u0249\7_\2\2\u0249\u00be\3\2\2\2\u024a\u024b\7\60"+
		"\2\2\u024b\u024c\7+\2\2\u024c\u00c0\3\2\2\2\u024d\u024e\7`\2\2\u024e\u00c2"+
		"\3\2\2\2\u024f\u0250\7B\2\2\u0250\u00c4\3\2\2\2\u0251\u0252\7\60\2\2\u0252"+
		"\u00c6\3\2\2\2\u0253\u0254\7\60\2\2\u0254\u0255\7\60\2\2\u0255\u00c8\3"+
		"\2\2\2\u0256\u0257\7}\2\2\u0257\u00ca\3\2\2\2\u0258\u0259\7\177\2\2\u0259"+
		"\u00cc\3\2\2\2\u025a\u025b\5+\26\2\u025b\u025c\5\35\17\2\u025c\u025d\5"+
		"\23\n\2\u025d\u025e\5)\25\2\u025e\u00ce\3\2\2\2\u025f\u0260\5\23\n\2\u0260"+
		"\u0261\5\35\17\2\u0261\u0262\5)\25\2\u0262\u0263\5\13\6\2\u0263\u0264"+
		"\5%\23\2\u0264\u0265\5\r\7\2\u0265\u0266\5\3\2\2\u0266\u0267\5\7\4\2\u0267"+
		"\u0268\5\13\6\2\u0268\u00d0\3\2\2\2\u0269\u026a\5+\26\2\u026a\u026b\5"+
		"\'\24\2\u026b\u026c\5\13\6\2\u026c\u026d\5\'\24\2\u026d\u00d2\3\2\2\2"+
		"\u026e\u026f\5\'\24\2\u026f\u0270\5)\25\2\u0270\u0271\5%\23\2\u0271\u0272"+
		"\5\23\n\2\u0272\u0273\5\35\17\2\u0273\u0274\5\17\b\2\u0274\u00d4\3\2\2"+
		"\2\u0275\u0276\5\23\n\2\u0276\u0277\5\33\16\2\u0277\u0278\5!\21\2\u0278"+
		"\u0279\5\31\r\2\u0279\u027a\5\13\6\2\u027a\u027b\5\33\16\2\u027b\u027c"+
		"\5\13\6\2\u027c\u027d\5\35\17\2\u027d\u027e\5)\25\2\u027e\u027f\5\3\2"+
		"\2\u027f\u0280\5)\25\2\u0280\u0281\5\23\n\2\u0281\u0282\5\37\20\2\u0282"+
		"\u0283\5\35\17\2\u0283\u00d6\3\2\2\2\u0284\u0285\5)\25\2\u0285\u0286\5"+
		"%\23\2\u0286\u0287\5+\26\2\u0287\u0288\5\13\6\2\u0288\u00d8\3\2\2\2\u0289"+
		"\u028a\5\r\7\2\u028a\u028b\5\3\2\2\u028b\u028c\5\31\r\2\u028c\u028d\5"+
		"\'\24\2\u028d\u028e\5\13\6\2\u028e\u00da\3\2\2\2\u028f\u0290\t\34\2\2"+
		"\u0290\u0291\3\2\2\2\u0291\u0292\bn\2\2\u0292\u00dc\3\2\2\2\u0293\u0294"+
		"\7*\2\2\u0294\u0295\7,\2\2\u0295\u0299\3\2\2\2\u0296\u0298\13\2\2\2\u0297"+
		"\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u029a\3\2\2\2\u0299\u0297\3\2"+
		"\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7,\2\2\u029d"+
		"\u029e\7+\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\bo\2\2\u02a0\u00de\3\2\2"+
		"\2\u02a1\u02a5\t\35\2\2\u02a2\u02a4\t\36\2\2\u02a3\u02a2\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u00e0\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02b1\7)\2\2\u02a9\u02b0\t\37\2\2\u02aa"+
		"\u02ac\n \2\2\u02ab\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ab\3\2"+
		"\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02a9\3\2\2\2\u02af"+
		"\u02ab\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\7)\2\2\u02b5"+
		"\u00e2\3\2\2\2\u02b6\u02b8\4\62;\2\u02b7\u02b6\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u00e4\3\2\2\2\u02bb"+
		"\u02bd\4\62;\2\u02bc\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02cc\3\2\2\2\u02c0\u02c2\7\60\2\2\u02c1"+
		"\u02c3\4\62;\2\u02c2\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c2\3\2"+
		"\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c8\5\u00e9u\2\u02c7"+
		"\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c0\3\2"+
		"\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02cd\5\u00e9u\2\u02cc"+
		"\u02c9\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u00e6\3\2\2\2\u02ce\u02d2\t\35"+
		"\2\2\u02cf\u02d1\t\36\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u00e8\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d5\u02d7\7g\2\2\u02d6\u02d8\t!\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8"+
		"\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02db\4\62;\2\u02da\u02d9\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u00ea\3\2"+
		"\2\2\21\2\u0299\u02a5\u02ad\u02af\u02b1\u02b9\u02be\u02c4\u02c7\u02c9"+
		"\u02cc\u02d2\u02d7\u02dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}