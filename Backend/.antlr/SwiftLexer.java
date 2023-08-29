// Generated from c:\Users\angge\Documents\GitHub\OLC2_P1_201901055\Backend\SwiftLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, TSTRING=3, BOOL=4, CHAR=5, VAR=6, LET=7, TRU=8, FAL=9, 
		PRINT=10, IF=11, ELSE=12, SWITCH=13, CASE=14, DEFAULT=15, BREAK=16, CONTINUE=17, 
		RETURN=18, WHILE=19, FOR=20, IN=21, GUARD=22, APPEND=23, REMOVELAST=24, 
		REMOVE=25, ISEMPTY=26, COUNT=27, REPEATING=28, STRUCT=29, SELF=30, MUTATING=31, 
		FUNC=32, AT=33, NUMBER=34, CHARACTER=35, STRING=36, ID=37, DIF=38, IG_IG=39, 
		NOT=40, OR=41, AND=42, IG=43, MAY_IG=44, MEN_IG=45, MAYOR=46, MENOR=47, 
		MOD=48, MUL=49, DIV=50, ADD=51, SUB=52, PARIZQ=53, PARDER=54, LLAVEIZQ=55, 
		LLAVEDER=56, CORIZQ=57, CORDER=58, DOSP=59, PUNTO=60, COMA=61, INTCE=62, 
		FLECHA=63, AMP=64, WHITESPACE=65, COMMENT=66, LINE_COMMENT=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "TSTRING", "BOOL", "CHAR", "VAR", "LET", "TRU", "FAL", 
			"PRINT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"RETURN", "WHILE", "FOR", "IN", "GUARD", "APPEND", "REMOVELAST", "REMOVE", 
			"ISEMPTY", "COUNT", "REPEATING", "STRUCT", "SELF", "MUTATING", "FUNC", 
			"AT", "NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", 
			"AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD", "MUL", "DIV", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"DOSP", "PUNTO", "COMA", "INTCE", "FLECHA", "AMP", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", "'var'", 
			"'let'", "'true'", "'false'", "'print'", "'if'", "'else'", "'switch'", 
			"'case'", "'default'", "'break'", "'continue'", "'return'", "'while'", 
			"'for'", "'in'", "'guard'", "'append'", "'removeLast'", "'remove'", "'IsEmpty'", 
			"'count'", "'repeating'", "'struct'", "'self'", "'mutating'", "'func'", 
			"'at'", null, null, null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", 
			"'='", "'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "'.'", "','", "'?'", 
			"'->'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "TSTRING", "BOOL", "CHAR", "VAR", "LET", "TRU", 
			"FAL", "PRINT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"RETURN", "WHILE", "FOR", "IN", "GUARD", "APPEND", "REMOVELAST", "REMOVE", 
			"ISEMPTY", "COUNT", "REPEATING", "STRUCT", "SELF", "MUTATING", "FUNC", 
			"AT", "NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", 
			"AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD", "MUL", "DIV", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"DOSP", "PUNTO", "COMA", "INTCE", "FLECHA", "AMP", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SwiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01d5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\6#\u0157"+
		"\n#\r#\16#\u0158\3#\3#\6#\u015d\n#\r#\16#\u015e\5#\u0161\n#\3$\3$\5$\u0165"+
		"\n$\3$\3$\3%\3%\7%\u016b\n%\f%\16%\u016e\13%\3%\3%\3&\3&\7&\u0174\n&\f"+
		"&\16&\u0177\13&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-"+
		"\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3@\3A\3A\3B\6B\u01b7\nB\rB\16B\u01b8\3B\3B\3C\3C\3C\3"+
		"C\7C\u01c1\nC\fC\16C\u01c4\13C\3C\3C\3C\3C\3C\3D\3D\3D\3D\7D\u01cf\nD"+
		"\fD\16D\u01d2\13D\3D\3D\3\u01c2\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\3\2\t\3\2\62;\3\2))\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2"+
		"\13\f\17\17\"\"^^\4\2\f\f\17\17\2\u01dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\3\u0089\3\2\2\2\5\u008d\3\2\2\2\7\u0093\3\2\2\2\t\u009a\3\2\2\2\13\u009f"+
		"\3\2\2\2\r\u00a9\3\2\2\2\17\u00ad\3\2\2\2\21\u00b1\3\2\2\2\23\u00b6\3"+
		"\2\2\2\25\u00bc\3\2\2\2\27\u00c2\3\2\2\2\31\u00c5\3\2\2\2\33\u00ca\3\2"+
		"\2\2\35\u00d1\3\2\2\2\37\u00d6\3\2\2\2!\u00de\3\2\2\2#\u00e4\3\2\2\2%"+
		"\u00ed\3\2\2\2\'\u00f4\3\2\2\2)\u00fa\3\2\2\2+\u00fe\3\2\2\2-\u0101\3"+
		"\2\2\2/\u0107\3\2\2\2\61\u010e\3\2\2\2\63\u0119\3\2\2\2\65\u0120\3\2\2"+
		"\2\67\u0128\3\2\2\29\u012e\3\2\2\2;\u0138\3\2\2\2=\u013f\3\2\2\2?\u0144"+
		"\3\2\2\2A\u014d\3\2\2\2C\u0152\3\2\2\2E\u0156\3\2\2\2G\u0162\3\2\2\2I"+
		"\u0168\3\2\2\2K\u0171\3\2\2\2M\u0178\3\2\2\2O\u017b\3\2\2\2Q\u017e\3\2"+
		"\2\2S\u0180\3\2\2\2U\u0183\3\2\2\2W\u0186\3\2\2\2Y\u0188\3\2\2\2[\u018b"+
		"\3\2\2\2]\u018e\3\2\2\2_\u0190\3\2\2\2a\u0192\3\2\2\2c\u0194\3\2\2\2e"+
		"\u0196\3\2\2\2g\u0198\3\2\2\2i\u019a\3\2\2\2k\u019c\3\2\2\2m\u019e\3\2"+
		"\2\2o\u01a0\3\2\2\2q\u01a2\3\2\2\2s\u01a4\3\2\2\2u\u01a6\3\2\2\2w\u01a8"+
		"\3\2\2\2y\u01aa\3\2\2\2{\u01ac\3\2\2\2}\u01ae\3\2\2\2\177\u01b0\3\2\2"+
		"\2\u0081\u01b3\3\2\2\2\u0083\u01b6\3\2\2\2\u0085\u01bc\3\2\2\2\u0087\u01ca"+
		"\3\2\2\2\u0089\u008a\7K\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c"+
		"\4\3\2\2\2\u008d\u008e\7H\2\2\u008e\u008f\7n\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092\6\3\2\2\2\u0093\u0094\7U\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2"+
		"\u0098\u0099\7i\2\2\u0099\b\3\2\2\2\u009a\u009b\7D\2\2\u009b\u009c\7q"+
		"\2\2\u009c\u009d\7q\2\2\u009d\u009e\7n\2\2\u009e\n\3\2\2\2\u009f\u00a0"+
		"\7E\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7c"+
		"\2\2\u00ab\u00ac\7t\2\2\u00ac\16\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7v\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7g\2\2\u00b5\22\3\2\2\2\u00b6\u00b7"+
		"\7h\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\26\3\2\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4\30\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9\32\3\2\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7v\2\2"+
		"\u00ce\u00cf\7e\2\2\u00cf\u00d0\7j\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7"+
		"e\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\36"+
		"\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7h\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7v\2\2"+
		"\u00dd \3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2"+
		"\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7m\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\7"+
		"e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"$\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7p\2\2\u00f3&\3\2\2\2\u00f4"+
		"\u00f5\7y\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7n\2\2"+
		"\u00f8\u00f9\7g\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7q\2"+
		"\2\u00fc\u00fd\7t\2\2\u00fd*\3\2\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7"+
		"p\2\2\u0100,\3\2\2\2\u0101\u0102\7i\2\2\u0102\u0103\7w\2\2\u0103\u0104"+
		"\7c\2\2\u0104\u0105\7t\2\2\u0105\u0106\7f\2\2\u0106.\3\2\2\2\u0107\u0108"+
		"\7c\2\2\u0108\u0109\7r\2\2\u0109\u010a\7r\2\2\u010a\u010b\7g\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7f\2\2\u010d\60\3\2\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7o\2\2\u0111\u0112\7q\2\2\u0112\u0113\7x\2\2"+
		"\u0113\u0114\7g\2\2\u0114\u0115\7N\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7u\2\2\u0117\u0118\7v\2\2\u0118\62\3\2\2\2\u0119\u011a\7t\2\2\u011a\u011b"+
		"\7g\2\2\u011b\u011c\7o\2\2\u011c\u011d\7q\2\2\u011d\u011e\7x\2\2\u011e"+
		"\u011f\7g\2\2\u011f\64\3\2\2\2\u0120\u0121\7K\2\2\u0121\u0122\7u\2\2\u0122"+
		"\u0123\7G\2\2\u0123\u0124\7o\2\2\u0124\u0125\7r\2\2\u0125\u0126\7v\2\2"+
		"\u0126\u0127\7{\2\2\u0127\66\3\2\2\2\u0128\u0129\7e\2\2\u0129\u012a\7"+
		"q\2\2\u012a\u012b\7w\2\2\u012b\u012c\7p\2\2\u012c\u012d\7v\2\2\u012d8"+
		"\3\2\2\2\u012e\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130\u0131\7r\2\2\u0131"+
		"\u0132\7g\2\2\u0132\u0133\7c\2\2\u0133\u0134\7v\2\2\u0134\u0135\7k\2\2"+
		"\u0135\u0136\7p\2\2\u0136\u0137\7i\2\2\u0137:\3\2\2\2\u0138\u0139\7u\2"+
		"\2\u0139\u013a\7v\2\2\u013a\u013b\7t\2\2\u013b\u013c\7w\2\2\u013c\u013d"+
		"\7e\2\2\u013d\u013e\7v\2\2\u013e<\3\2\2\2\u013f\u0140\7u\2\2\u0140\u0141"+
		"\7g\2\2\u0141\u0142\7n\2\2\u0142\u0143\7h\2\2\u0143>\3\2\2\2\u0144\u0145"+
		"\7o\2\2\u0145\u0146\7w\2\2\u0146\u0147\7v\2\2\u0147\u0148\7c\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u014a\7k\2\2\u014a\u014b\7p\2\2\u014b\u014c\7i\2\2"+
		"\u014c@\3\2\2\2\u014d\u014e\7h\2\2\u014e\u014f\7w\2\2\u014f\u0150\7p\2"+
		"\2\u0150\u0151\7e\2\2\u0151B\3\2\2\2\u0152\u0153\7c\2\2\u0153\u0154\7"+
		"v\2\2\u0154D\3\2\2\2\u0155\u0157\t\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0160\3\2\2\2\u015a"+
		"\u015c\7\60\2\2\u015b\u015d\t\2\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015a\3\2\2\2\u0160\u0161\3\2\2\2\u0161F\3\2\2\2\u0162\u0164\7$\2\2\u0163"+
		"\u0165\n\3\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0167\7$\2\2\u0167H\3\2\2\2\u0168\u016c\7$\2\2\u0169\u016b"+
		"\n\4\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7$"+
		"\2\2\u0170J\3\2\2\2\u0171\u0175\t\5\2\2\u0172\u0174\t\6\2\2\u0173\u0172"+
		"\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"L\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7#\2\2\u0179\u017a\7?\2\2\u017a"+
		"N\3\2\2\2\u017b\u017c\7?\2\2\u017c\u017d\7?\2\2\u017dP\3\2\2\2\u017e\u017f"+
		"\7#\2\2\u017fR\3\2\2\2\u0180\u0181\7~\2\2\u0181\u0182\7~\2\2\u0182T\3"+
		"\2\2\2\u0183\u0184\7(\2\2\u0184\u0185\7(\2\2\u0185V\3\2\2\2\u0186\u0187"+
		"\7?\2\2\u0187X\3\2\2\2\u0188\u0189\7@\2\2\u0189\u018a\7?\2\2\u018aZ\3"+
		"\2\2\2\u018b\u018c\7>\2\2\u018c\u018d\7?\2\2\u018d\\\3\2\2\2\u018e\u018f"+
		"\7@\2\2\u018f^\3\2\2\2\u0190\u0191\7>\2\2\u0191`\3\2\2\2\u0192\u0193\7"+
		"\'\2\2\u0193b\3\2\2\2\u0194\u0195\7,\2\2\u0195d\3\2\2\2\u0196\u0197\7"+
		"\61\2\2\u0197f\3\2\2\2\u0198\u0199\7-\2\2\u0199h\3\2\2\2\u019a\u019b\7"+
		"/\2\2\u019bj\3\2\2\2\u019c\u019d\7*\2\2\u019dl\3\2\2\2\u019e\u019f\7+"+
		"\2\2\u019fn\3\2\2\2\u01a0\u01a1\7}\2\2\u01a1p\3\2\2\2\u01a2\u01a3\7\177"+
		"\2\2\u01a3r\3\2\2\2\u01a4\u01a5\7]\2\2\u01a5t\3\2\2\2\u01a6\u01a7\7_\2"+
		"\2\u01a7v\3\2\2\2\u01a8\u01a9\7<\2\2\u01a9x\3\2\2\2\u01aa\u01ab\7\60\2"+
		"\2\u01abz\3\2\2\2\u01ac\u01ad\7.\2\2\u01ad|\3\2\2\2\u01ae\u01af\7A\2\2"+
		"\u01af~\3\2\2\2\u01b0\u01b1\7/\2\2\u01b1\u01b2\7@\2\2\u01b2\u0080\3\2"+
		"\2\2\u01b3\u01b4\7(\2\2\u01b4\u0082\3\2\2\2\u01b5\u01b7\t\7\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\bB\2\2\u01bb\u0084\3\2\2\2\u01bc"+
		"\u01bd\7\61\2\2\u01bd\u01be\7,\2\2\u01be\u01c2\3\2\2\2\u01bf\u01c1\13"+
		"\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7,"+
		"\2\2\u01c6\u01c7\7\61\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bC\2\2\u01c9"+
		"\u0086\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\7\61\2\2\u01cc\u01d0\3"+
		"\2\2\2\u01cd\u01cf\n\b\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01d4\bD\2\2\u01d4\u0088\3\2\2\2\f\2\u0158\u015e\u0160\u0164"+
		"\u016c\u0175\u01b8\u01c2\u01d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}