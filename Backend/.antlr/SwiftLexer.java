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
		FUNC=32, AT=33, INOUT=34, NUMBER=35, CHARACTER=36, STRING=37, ID=38, DIF=39, 
		IG_IG=40, NOT=41, OR=42, AND=43, IG=44, MAY_IG=45, MEN_IG=46, MAYOR=47, 
		MENOR=48, MOD=49, MUL=50, DIV=51, ADD=52, SUB=53, PARIZQ=54, PARDER=55, 
		LLAVEIZQ=56, LLAVEDER=57, CORIZQ=58, CORDER=59, DOSP=60, PUNTO=61, COMA=62, 
		INTCE=63, FLECHA=64, AMP=65, PCOMA=66, GBAJO=67, TRESP=68, WHITESPACE=69, 
		COMMENT=70, LINE_COMMENT=71;
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
			"AT", "INOUT", "NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG", 
			"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD", 
			"MUL", "DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"CORIZQ", "CORDER", "DOSP", "PUNTO", "COMA", "INTCE", "FLECHA", "AMP", 
			"PCOMA", "GBAJO", "TRESP", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
			"'at'", "'inout'", null, null, null, null, "'!='", "'=='", "'!'", "'||'", 
			"'&&'", "'='", "'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'/'", "'+'", 
			"'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "'.'", "','", 
			"'?'", "'->'", "'&'", "';'", "'_'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "TSTRING", "BOOL", "CHAR", "VAR", "LET", "TRU", 
			"FAL", "PRINT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"RETURN", "WHILE", "FOR", "IN", "GUARD", "APPEND", "REMOVELAST", "REMOVE", 
			"ISEMPTY", "COUNT", "REPEATING", "STRUCT", "SELF", "MUTATING", "FUNC", 
			"AT", "INOUT", "NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG", 
			"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD", 
			"MUL", "DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"CORIZQ", "CORDER", "DOSP", "PUNTO", "COMA", "INTCE", "FLECHA", "AMP", 
			"PCOMA", "GBAJO", "TRESP", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u01eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\6$\u0165\n$\r$\16$\u0166\3$\3"+
		"$\6$\u016b\n$\r$\16$\u016c\5$\u016f\n$\3%\3%\5%\u0173\n%\3%\3%\3&\3&\7"+
		"&\u0179\n&\f&\16&\u017c\13&\3&\3&\3\'\3\'\7\'\u0182\n\'\f\'\16\'\u0185"+
		"\13\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3F\6F\u01cd\nF\rF\16F\u01ce\3F\3F\3"+
		"G\3G\3G\3G\7G\u01d7\nG\fG\16G\u01da\13G\3G\3G\3G\3G\3G\3H\3H\3H\3H\7H"+
		"\u01e5\nH\fH\16H\u01e8\13H\3H\3H\3\u01d8\2I\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\3\2\t\3\2\62;\3\2)"+
		")\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\2\u01f3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0095\3\2\2\2\7\u009b\3\2\2\2\t\u00a2"+
		"\3\2\2\2\13\u00a7\3\2\2\2\r\u00b1\3\2\2\2\17\u00b5\3\2\2\2\21\u00b9\3"+
		"\2\2\2\23\u00be\3\2\2\2\25\u00c4\3\2\2\2\27\u00ca\3\2\2\2\31\u00cd\3\2"+
		"\2\2\33\u00d2\3\2\2\2\35\u00d9\3\2\2\2\37\u00de\3\2\2\2!\u00e6\3\2\2\2"+
		"#\u00ec\3\2\2\2%\u00f5\3\2\2\2\'\u00fc\3\2\2\2)\u0102\3\2\2\2+\u0106\3"+
		"\2\2\2-\u0109\3\2\2\2/\u010f\3\2\2\2\61\u0116\3\2\2\2\63\u0121\3\2\2\2"+
		"\65\u0128\3\2\2\2\67\u0130\3\2\2\29\u0136\3\2\2\2;\u0140\3\2\2\2=\u0147"+
		"\3\2\2\2?\u014c\3\2\2\2A\u0155\3\2\2\2C\u015a\3\2\2\2E\u015d\3\2\2\2G"+
		"\u0164\3\2\2\2I\u0170\3\2\2\2K\u0176\3\2\2\2M\u017f\3\2\2\2O\u0186\3\2"+
		"\2\2Q\u0189\3\2\2\2S\u018c\3\2\2\2U\u018e\3\2\2\2W\u0191\3\2\2\2Y\u0194"+
		"\3\2\2\2[\u0196\3\2\2\2]\u0199\3\2\2\2_\u019c\3\2\2\2a\u019e\3\2\2\2c"+
		"\u01a0\3\2\2\2e\u01a2\3\2\2\2g\u01a4\3\2\2\2i\u01a6\3\2\2\2k\u01a8\3\2"+
		"\2\2m\u01aa\3\2\2\2o\u01ac\3\2\2\2q\u01ae\3\2\2\2s\u01b0\3\2\2\2u\u01b2"+
		"\3\2\2\2w\u01b4\3\2\2\2y\u01b6\3\2\2\2{\u01b8\3\2\2\2}\u01ba\3\2\2\2\177"+
		"\u01bc\3\2\2\2\u0081\u01be\3\2\2\2\u0083\u01c1\3\2\2\2\u0085\u01c3\3\2"+
		"\2\2\u0087\u01c5\3\2\2\2\u0089\u01c7\3\2\2\2\u008b\u01cc\3\2\2\2\u008d"+
		"\u01d2\3\2\2\2\u008f\u01e0\3\2\2\2\u0091\u0092\7K\2\2\u0092\u0093\7p\2"+
		"\2\u0093\u0094\7v\2\2\u0094\4\3\2\2\2\u0095\u0096\7H\2\2\u0096\u0097\7"+
		"n\2\2\u0097\u0098\7q\2\2\u0098\u0099\7c\2\2\u0099\u009a\7v\2\2\u009a\6"+
		"\3\2\2\2\u009b\u009c\7U\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1\b\3\2\2\2\u00a2"+
		"\u00a3\7D\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7n\2\2"+
		"\u00a6\n\3\2\2\2\u00a7\u00a8\7E\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7c"+
		"\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7t\2\2\u00b0\f\3\2\2\2\u00b1\u00b2"+
		"\7x\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7t\2\2\u00b4\16\3\2\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\20\3\2\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\22\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7n\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\24\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2"+
		"\u00c9\26\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00cc\30\3\2\2"+
		"\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\32\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7j\2\2\u00d8"+
		"\34\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\36\3\2\2\2\u00de\u00df\7f\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\u00e1\7h\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4\u00e5\7v\2\2\u00e5 \3\2\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7t\2"+
		"\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7m\2\2\u00eb\"\3"+
		"\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7p\2\2\u00ef"+
		"\u00f0\7v\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7w\2\2"+
		"\u00f3\u00f4\7g\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2"+
		"\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb"+
		"\7p\2\2\u00fb&\3\2\2\2\u00fc\u00fd\7y\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff"+
		"\7k\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7g\2\2\u0101(\3\2\2\2\u0102\u0103"+
		"\7h\2\2\u0103\u0104\7q\2\2\u0104\u0105\7t\2\2\u0105*\3\2\2\2\u0106\u0107"+
		"\7k\2\2\u0107\u0108\7p\2\2\u0108,\3\2\2\2\u0109\u010a\7i\2\2\u010a\u010b"+
		"\7w\2\2\u010b\u010c\7c\2\2\u010c\u010d\7t\2\2\u010d\u010e\7f\2\2\u010e"+
		".\3\2\2\2\u010f\u0110\7c\2\2\u0110\u0111\7r\2\2\u0111\u0112\7r\2\2\u0112"+
		"\u0113\7g\2\2\u0113\u0114\7p\2\2\u0114\u0115\7f\2\2\u0115\60\3\2\2\2\u0116"+
		"\u0117\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7o\2\2\u0119\u011a\7q\2\2"+
		"\u011a\u011b\7x\2\2\u011b\u011c\7g\2\2\u011c\u011d\7N\2\2\u011d\u011e"+
		"\7c\2\2\u011e\u011f\7u\2\2\u011f\u0120\7v\2\2\u0120\62\3\2\2\2\u0121\u0122"+
		"\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7o\2\2\u0124\u0125\7q\2\2\u0125"+
		"\u0126\7x\2\2\u0126\u0127\7g\2\2\u0127\64\3\2\2\2\u0128\u0129\7K\2\2\u0129"+
		"\u012a\7u\2\2\u012a\u012b\7G\2\2\u012b\u012c\7o\2\2\u012c\u012d\7r\2\2"+
		"\u012d\u012e\7v\2\2\u012e\u012f\7{\2\2\u012f\66\3\2\2\2\u0130\u0131\7"+
		"e\2\2\u0131\u0132\7q\2\2\u0132\u0133\7w\2\2\u0133\u0134\7p\2\2\u0134\u0135"+
		"\7v\2\2\u01358\3\2\2\2\u0136\u0137\7t\2\2\u0137\u0138\7g\2\2\u0138\u0139"+
		"\7r\2\2\u0139\u013a\7g\2\2\u013a\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7p\2\2\u013e\u013f\7i\2\2\u013f:\3\2\2\2\u0140"+
		"\u0141\7u\2\2\u0141\u0142\7v\2\2\u0142\u0143\7t\2\2\u0143\u0144\7w\2\2"+
		"\u0144\u0145\7e\2\2\u0145\u0146\7v\2\2\u0146<\3\2\2\2\u0147\u0148\7u\2"+
		"\2\u0148\u0149\7g\2\2\u0149\u014a\7n\2\2\u014a\u014b\7h\2\2\u014b>\3\2"+
		"\2\2\u014c\u014d\7o\2\2\u014d\u014e\7w\2\2\u014e\u014f\7v\2\2\u014f\u0150"+
		"\7c\2\2\u0150\u0151\7v\2\2\u0151\u0152\7k\2\2\u0152\u0153\7p\2\2\u0153"+
		"\u0154\7i\2\2\u0154@\3\2\2\2\u0155\u0156\7h\2\2\u0156\u0157\7w\2\2\u0157"+
		"\u0158\7p\2\2\u0158\u0159\7e\2\2\u0159B\3\2\2\2\u015a\u015b\7c\2\2\u015b"+
		"\u015c\7v\2\2\u015cD\3\2\2\2\u015d\u015e\7k\2\2\u015e\u015f\7p\2\2\u015f"+
		"\u0160\7q\2\2\u0160\u0161\7w\2\2\u0161\u0162\7v\2\2\u0162F\3\2\2\2\u0163"+
		"\u0165\t\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u016e\3\2\2\2\u0168\u016a\7\60\2\2\u0169"+
		"\u016b\t\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0168\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016fH\3\2\2\2\u0170\u0172\7$\2\2\u0171\u0173\n\3\2\2\u0172"+
		"\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7$"+
		"\2\2\u0175J\3\2\2\2\u0176\u017a\7$\2\2\u0177\u0179\n\4\2\2\u0178\u0177"+
		"\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7$\2\2\u017eL\3\2\2\2\u017f"+
		"\u0183\t\5\2\2\u0180\u0182\t\6\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184N\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0187\7#\2\2\u0187\u0188\7?\2\2\u0188P\3\2\2\2\u0189\u018a"+
		"\7?\2\2\u018a\u018b\7?\2\2\u018bR\3\2\2\2\u018c\u018d\7#\2\2\u018dT\3"+
		"\2\2\2\u018e\u018f\7~\2\2\u018f\u0190\7~\2\2\u0190V\3\2\2\2\u0191\u0192"+
		"\7(\2\2\u0192\u0193\7(\2\2\u0193X\3\2\2\2\u0194\u0195\7?\2\2\u0195Z\3"+
		"\2\2\2\u0196\u0197\7@\2\2\u0197\u0198\7?\2\2\u0198\\\3\2\2\2\u0199\u019a"+
		"\7>\2\2\u019a\u019b\7?\2\2\u019b^\3\2\2\2\u019c\u019d\7@\2\2\u019d`\3"+
		"\2\2\2\u019e\u019f\7>\2\2\u019fb\3\2\2\2\u01a0\u01a1\7\'\2\2\u01a1d\3"+
		"\2\2\2\u01a2\u01a3\7,\2\2\u01a3f\3\2\2\2\u01a4\u01a5\7\61\2\2\u01a5h\3"+
		"\2\2\2\u01a6\u01a7\7-\2\2\u01a7j\3\2\2\2\u01a8\u01a9\7/\2\2\u01a9l\3\2"+
		"\2\2\u01aa\u01ab\7*\2\2\u01abn\3\2\2\2\u01ac\u01ad\7+\2\2\u01adp\3\2\2"+
		"\2\u01ae\u01af\7}\2\2\u01afr\3\2\2\2\u01b0\u01b1\7\177\2\2\u01b1t\3\2"+
		"\2\2\u01b2\u01b3\7]\2\2\u01b3v\3\2\2\2\u01b4\u01b5\7_\2\2\u01b5x\3\2\2"+
		"\2\u01b6\u01b7\7<\2\2\u01b7z\3\2\2\2\u01b8\u01b9\7\60\2\2\u01b9|\3\2\2"+
		"\2\u01ba\u01bb\7.\2\2\u01bb~\3\2\2\2\u01bc\u01bd\7A\2\2\u01bd\u0080\3"+
		"\2\2\2\u01be\u01bf\7/\2\2\u01bf\u01c0\7@\2\2\u01c0\u0082\3\2\2\2\u01c1"+
		"\u01c2\7(\2\2\u01c2\u0084\3\2\2\2\u01c3\u01c4\7=\2\2\u01c4\u0086\3\2\2"+
		"\2\u01c5\u01c6\7a\2\2\u01c6\u0088\3\2\2\2\u01c7\u01c8\7\60\2\2\u01c8\u01c9"+
		"\7\60\2\2\u01c9\u01ca\7\60\2\2\u01ca\u008a\3\2\2\2\u01cb\u01cd\t\7\2\2"+
		"\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\bF\2\2\u01d1\u008c\3\2\2\2\u01d2"+
		"\u01d3\7\61\2\2\u01d3\u01d4\7,\2\2\u01d4\u01d8\3\2\2\2\u01d5\u01d7\13"+
		"\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7,"+
		"\2\2\u01dc\u01dd\7\61\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\bG\2\2\u01df"+
		"\u008e\3\2\2\2\u01e0\u01e1\7\61\2\2\u01e1\u01e2\7\61\2\2\u01e2\u01e6\3"+
		"\2\2\2\u01e3\u01e5\n\b\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ea\bH\2\2\u01ea\u0090\3\2\2\2\f\2\u0166\u016c\u016e\u0172"+
		"\u017a\u0183\u01ce\u01d8\u01e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}