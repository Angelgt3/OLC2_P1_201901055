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
		FUNC=32, NUMBER=33, CHARACTER=34, STRING=35, ID=36, DIF=37, IG_IG=38, 
		NOT=39, OR=40, AND=41, IG=42, MAY_IG=43, MEN_IG=44, MAYOR=45, MENOR=46, 
		MOD=47, MUL=48, DIV=49, ADD=50, SUB=51, PARIZQ=52, PARDER=53, LLAVEIZQ=54, 
		LLAVEDER=55, CORIZQ=56, CORDER=57, DOSP=58, COMA=59, INTCE=60, FLECHA=61, 
		AMP=62, WHITESPACE=63, COMMENT=64, LINE_COMMENT=65;
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
			"NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", 
			"IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD", "MUL", "DIV", "ADD", 
			"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"DOSP", "COMA", "INTCE", "FLECHA", "AMP", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
			null, null, null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", 
			"'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "':'", "','", "'?'", "'->'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "TSTRING", "BOOL", "CHAR", "VAR", "LET", "TRU", 
			"FAL", "PRINT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"RETURN", "WHILE", "FOR", "IN", "GUARD", "APPEND", "REMOVELAST", "REMOVE", 
			"ISEMPTY", "COUNT", "REPEATING", "STRUCT", "SELF", "MUTATING", "FUNC", 
			"NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", 
			"IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD", "MUL", "DIV", "ADD", 
			"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"DOSP", "COMA", "INTCE", "FLECHA", "AMP", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\6\"\u0150\n\"\r\"\16\"\u0151"+
		"\3\"\3\"\6\"\u0156\n\"\r\"\16\"\u0157\5\"\u015a\n\"\3#\3#\5#\u015e\n#"+
		"\3#\3#\3$\3$\7$\u0164\n$\f$\16$\u0167\13$\3$\3$\3%\3%\7%\u016d\n%\f%\16"+
		"%\u0170\13%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3="+
		"\3>\3>\3>\3?\3?\3@\6@\u01ae\n@\r@\16@\u01af\3@\3@\3A\3A\3A\3A\7A\u01b8"+
		"\nA\fA\16A\u01bb\13A\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u01c6\nB\fB\16B\u01c9"+
		"\13B\3B\3B\3\u01b9\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\3\2\t\3\2\62;\3"+
		"\2))\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17"+
		"\2\u01d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\3\u0085\3\2\2\2\5\u0089\3\2\2\2\7\u008f\3\2\2\2\t\u0096\3\2\2\2"+
		"\13\u009b\3\2\2\2\r\u00a5\3\2\2\2\17\u00a9\3\2\2\2\21\u00ad\3\2\2\2\23"+
		"\u00b2\3\2\2\2\25\u00b8\3\2\2\2\27\u00be\3\2\2\2\31\u00c1\3\2\2\2\33\u00c6"+
		"\3\2\2\2\35\u00cd\3\2\2\2\37\u00d2\3\2\2\2!\u00da\3\2\2\2#\u00e0\3\2\2"+
		"\2%\u00e9\3\2\2\2\'\u00f0\3\2\2\2)\u00f6\3\2\2\2+\u00fa\3\2\2\2-\u00fd"+
		"\3\2\2\2/\u0103\3\2\2\2\61\u010a\3\2\2\2\63\u0115\3\2\2\2\65\u011c\3\2"+
		"\2\2\67\u0124\3\2\2\29\u012a\3\2\2\2;\u0134\3\2\2\2=\u013b\3\2\2\2?\u0140"+
		"\3\2\2\2A\u0149\3\2\2\2C\u014f\3\2\2\2E\u015b\3\2\2\2G\u0161\3\2\2\2I"+
		"\u016a\3\2\2\2K\u0171\3\2\2\2M\u0174\3\2\2\2O\u0177\3\2\2\2Q\u0179\3\2"+
		"\2\2S\u017c\3\2\2\2U\u017f\3\2\2\2W\u0181\3\2\2\2Y\u0184\3\2\2\2[\u0187"+
		"\3\2\2\2]\u0189\3\2\2\2_\u018b\3\2\2\2a\u018d\3\2\2\2c\u018f\3\2\2\2e"+
		"\u0191\3\2\2\2g\u0193\3\2\2\2i\u0195\3\2\2\2k\u0197\3\2\2\2m\u0199\3\2"+
		"\2\2o\u019b\3\2\2\2q\u019d\3\2\2\2s\u019f\3\2\2\2u\u01a1\3\2\2\2w\u01a3"+
		"\3\2\2\2y\u01a5\3\2\2\2{\u01a7\3\2\2\2}\u01aa\3\2\2\2\177\u01ad\3\2\2"+
		"\2\u0081\u01b3\3\2\2\2\u0083\u01c1\3\2\2\2\u0085\u0086\7K\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7v\2\2\u0088\4\3\2\2\2\u0089\u008a\7H\2\2\u008a\u008b"+
		"\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d\7c\2\2\u008d\u008e\7v\2\2\u008e"+
		"\6\3\2\2\2\u008f\u0090\7U\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7i\2\2\u0095\b\3\2\2\2\u0096"+
		"\u0097\7D\2\2\u0097\u0098\7q\2\2\u0098\u0099\7q\2\2\u0099\u009a\7n\2\2"+
		"\u009a\n\3\2\2\2\u009b\u009c\7E\2\2\u009c\u009d\7j\2\2\u009d\u009e\7c"+
		"\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7t\2\2\u00a4\f\3\2\2\2\u00a5\u00a6"+
		"\7x\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\16\3\2\2\2\u00a9\u00aa"+
		"\7n\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac\20\3\2\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\22\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\24\3\2\2\2\u00b8\u00b9\7r\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd\26\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0\30\3\2\2"+
		"\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5"+
		"\7g\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7j\2\2\u00cc"+
		"\34\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7u\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\u00d5\7h\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7n\2\2"+
		"\u00d8\u00d9\7v\2\2\u00d9 \3\2\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7t\2"+
		"\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7m\2\2\u00df\"\3"+
		"\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7w\2\2"+
		"\u00e7\u00e8\7g\2\2\u00e8$\3\2\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7g\2"+
		"\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7y\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5(\3\2\2\2\u00f6\u00f7"+
		"\7h\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7t\2\2\u00f9*\3\2\2\2\u00fa\u00fb"+
		"\7k\2\2\u00fb\u00fc\7p\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7i\2\2\u00fe\u00ff"+
		"\7w\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7t\2\2\u0101\u0102\7f\2\2\u0102"+
		".\3\2\2\2\u0103\u0104\7c\2\2\u0104\u0105\7r\2\2\u0105\u0106\7r\2\2\u0106"+
		"\u0107\7g\2\2\u0107\u0108\7p\2\2\u0108\u0109\7f\2\2\u0109\60\3\2\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d\7o\2\2\u010d\u010e\7q\2\2"+
		"\u010e\u010f\7x\2\2\u010f\u0110\7g\2\2\u0110\u0111\7N\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7u\2\2\u0113\u0114\7v\2\2\u0114\62\3\2\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7g\2\2\u0117\u0118\7o\2\2\u0118\u0119\7q\2\2\u0119"+
		"\u011a\7x\2\2\u011a\u011b\7g\2\2\u011b\64\3\2\2\2\u011c\u011d\7K\2\2\u011d"+
		"\u011e\7u\2\2\u011e\u011f\7G\2\2\u011f\u0120\7o\2\2\u0120\u0121\7r\2\2"+
		"\u0121\u0122\7v\2\2\u0122\u0123\7{\2\2\u0123\66\3\2\2\2\u0124\u0125\7"+
		"e\2\2\u0125\u0126\7q\2\2\u0126\u0127\7w\2\2\u0127\u0128\7p\2\2\u0128\u0129"+
		"\7v\2\2\u01298\3\2\2\2\u012a\u012b\7t\2\2\u012b\u012c\7g\2\2\u012c\u012d"+
		"\7r\2\2\u012d\u012e\7g\2\2\u012e\u012f\7c\2\2\u012f\u0130\7v\2\2\u0130"+
		"\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132\u0133\7i\2\2\u0133:\3\2\2\2\u0134"+
		"\u0135\7u\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2"+
		"\u0138\u0139\7e\2\2\u0139\u013a\7v\2\2\u013a<\3\2\2\2\u013b\u013c\7u\2"+
		"\2\u013c\u013d\7g\2\2\u013d\u013e\7n\2\2\u013e\u013f\7h\2\2\u013f>\3\2"+
		"\2\2\u0140\u0141\7o\2\2\u0141\u0142\7w\2\2\u0142\u0143\7v\2\2\u0143\u0144"+
		"\7c\2\2\u0144\u0145\7v\2\2\u0145\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147"+
		"\u0148\7i\2\2\u0148@\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b\7w\2\2\u014b"+
		"\u014c\7p\2\2\u014c\u014d\7e\2\2\u014dB\3\2\2\2\u014e\u0150\t\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0159\3\2\2\2\u0153\u0155\7\60\2\2\u0154\u0156\t\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"D\3\2\2\2\u015b\u015d\7$\2\2\u015c\u015e\n\3\2\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7$\2\2\u0160F\3\2\2\2\u0161"+
		"\u0165\7$\2\2\u0162\u0164\n\4\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\7$\2\2\u0169H\3\2\2\2\u016a\u016e\t\5\2\2\u016b"+
		"\u016d\t\6\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016fJ\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172"+
		"\7#\2\2\u0172\u0173\7?\2\2\u0173L\3\2\2\2\u0174\u0175\7?\2\2\u0175\u0176"+
		"\7?\2\2\u0176N\3\2\2\2\u0177\u0178\7#\2\2\u0178P\3\2\2\2\u0179\u017a\7"+
		"~\2\2\u017a\u017b\7~\2\2\u017bR\3\2\2\2\u017c\u017d\7(\2\2\u017d\u017e"+
		"\7(\2\2\u017eT\3\2\2\2\u017f\u0180\7?\2\2\u0180V\3\2\2\2\u0181\u0182\7"+
		"@\2\2\u0182\u0183\7?\2\2\u0183X\3\2\2\2\u0184\u0185\7>\2\2\u0185\u0186"+
		"\7?\2\2\u0186Z\3\2\2\2\u0187\u0188\7@\2\2\u0188\\\3\2\2\2\u0189\u018a"+
		"\7>\2\2\u018a^\3\2\2\2\u018b\u018c\7\'\2\2\u018c`\3\2\2\2\u018d\u018e"+
		"\7,\2\2\u018eb\3\2\2\2\u018f\u0190\7\61\2\2\u0190d\3\2\2\2\u0191\u0192"+
		"\7-\2\2\u0192f\3\2\2\2\u0193\u0194\7/\2\2\u0194h\3\2\2\2\u0195\u0196\7"+
		"*\2\2\u0196j\3\2\2\2\u0197\u0198\7+\2\2\u0198l\3\2\2\2\u0199\u019a\7}"+
		"\2\2\u019an\3\2\2\2\u019b\u019c\7\177\2\2\u019cp\3\2\2\2\u019d\u019e\7"+
		"]\2\2\u019er\3\2\2\2\u019f\u01a0\7_\2\2\u01a0t\3\2\2\2\u01a1\u01a2\7<"+
		"\2\2\u01a2v\3\2\2\2\u01a3\u01a4\7.\2\2\u01a4x\3\2\2\2\u01a5\u01a6\7A\2"+
		"\2\u01a6z\3\2\2\2\u01a7\u01a8\7/\2\2\u01a8\u01a9\7@\2\2\u01a9|\3\2\2\2"+
		"\u01aa\u01ab\7(\2\2\u01ab~\3\2\2\2\u01ac\u01ae\t\7\2\2\u01ad\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\b@\2\2\u01b2\u0080\3\2\2\2\u01b3\u01b4\7\61"+
		"\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\13\2\2\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01ba\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7,\2\2\u01bd"+
		"\u01be\7\61\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\bA\2\2\u01c0\u0082\3\2"+
		"\2\2\u01c1\u01c2\7\61\2\2\u01c2\u01c3\7\61\2\2\u01c3\u01c7\3\2\2\2\u01c4"+
		"\u01c6\n\b\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01cb\bB\2\2\u01cb\u0084\3\2\2\2\f\2\u0151\u0157\u0159\u015d\u0165\u016e"+
		"\u01af\u01b9\u01c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}