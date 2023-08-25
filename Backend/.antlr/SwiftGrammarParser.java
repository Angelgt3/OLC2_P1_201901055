// Generated from c:\Users\angge\Documents\GitHub\OLC2_P1_201901055\Backend\SwiftGrammar.g4 by ANTLR 4.8

    import "Backend/interfaces"
    import "Backend/environment"
    import "Backend/expressions"
    import "Backend/instructions"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftGrammarParser extends Parser {
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
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_printstmt = 3, 
		RULE_variablestmt = 4, RULE_typestmt = 5, RULE_ifstmt = 6, RULE_elifs = 7, 
		RULE_switchstmt = 8, RULE_cases = 9, RULE_whilestmt = 10, RULE_expr = 11, 
		RULE_primitives = 12, RULE_listParams = 13, RULE_listArray = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "printstmt", "variablestmt", "typestmt", 
			"ifstmt", "elifs", "switchstmt", "cases", "whilestmt", "expr", "primitives", 
			"listParams", "listArray"
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

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public []interface{} code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwiftGrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((SContext)_localctx).block = block();
			setState(31);
			match(EOF);
			   
			        _localctx.code = ((SContext)_localctx).block.blk
			    
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
		public []interface{} blk;
		public InstructionContext instruction;
		public List<InstructionContext> ins = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);

		    _localctx.blk = []interface{}{}
		    var listInt []IInstructionContext
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					((BlockContext)_localctx).instruction = instruction();
					((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			        listInt = localctx.(*BlockContext).GetIns()
			        for _, e := range listInt {
			            _localctx.blk = append(_localctx.blk, e.GetInst())
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

	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public PrintstmtContext printstmt;
		public VariablestmtContext variablestmt;
		public IfstmtContext ifstmt;
		public SwitchstmtContext switchstmt;
		public WhilestmtContext whilestmt;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public VariablestmtContext variablestmt() {
			return getRuleContext(VariablestmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public SwitchstmtContext switchstmt() {
			return getRuleContext(SwitchstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case VAR:
			case LET:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((InstructionContext)_localctx).variablestmt = variablestmt();
				 _localctx.inst = ((InstructionContext)_localctx).variablestmt.vari
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				((InstructionContext)_localctx).switchstmt = switchstmt();
				 _localctx.inst = ((InstructionContext)_localctx).switchstmt.swinst 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whileinst 
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

	public static class PrintstmtContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ExprContext expr;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(59);
			match(PARIZQ);
			setState(60);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(61);
			match(PARDER);
			 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).expr.e)
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

	public static class VariablestmtContext extends ParserRuleContext {
		public interfaces.Instruction vari;
		public Token VAR;
		public Token ID;
		public TypestmtContext typestmt;
		public ExprContext expr;
		public Token LET;
		public PrimitivesContext primitives;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public TypestmtContext typestmt() {
			return getRuleContext(TypestmtContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTCE() { return getToken(SwiftGrammarParser.INTCE, 0); }
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public VariablestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablestmt; }
	}

	public final VariablestmtContext variablestmt() throws RecognitionException {
		VariablestmtContext _localctx = new VariablestmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variablestmt);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(65);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(66);
				match(DOSP);
				setState(67);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(68);
				match(IG);
				setState(69);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(73);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(74);
				match(IG);
				setState(75);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(79);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(80);
				match(DOSP);
				setState(81);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(82);
				match(INTCE);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, expressions.NewPrimitive((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), nil, environment.NULL), true) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(86);
				match(IG);
				setState(87);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(91);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(92);
				match(IG);
				setState(93);
				((VariablestmtContext)_localctx).primitives = primitives();
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).primitives.p, false) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(97);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(98);
				match(DOSP);
				setState(99);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(100);
				match(IG);
				setState(101);
				((VariablestmtContext)_localctx).primitives = primitives();
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).primitives.p, false) 
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

	public static class TypestmtContext extends ParserRuleContext {
		public environment.TipoExpresion type;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode TSTRING() { return getToken(SwiftGrammarParser.TSTRING, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(SwiftGrammarParser.CHAR, 0); }
		public TypestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typestmt; }
	}

	public final TypestmtContext typestmt() throws RecognitionException {
		TypestmtContext _localctx = new TypestmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typestmt);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(INT);
				 _localctx.type = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(FLOAT);
				 _localctx.type = environment.FLOAT 
				}
				break;
			case TSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(TSTRING);
				 _localctx.type = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(BOOL);
				 _localctx.type = environment.BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(CHAR);
				 _localctx.type = environment.CHAR 
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

	public static class IfstmtContext extends ParserRuleContext {
		public interfaces.Instruction ifinst;
		public Token IF;
		public ExprContext expr;
		public BlockContext block;
		public BlockContext bif;
		public BlockContext belse;
		public ElifsContext elifs;
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LLAVEIZQ() { return getTokens(SwiftGrammarParser.LLAVEIZQ); }
		public TerminalNode LLAVEIZQ(int i) {
			return getToken(SwiftGrammarParser.LLAVEIZQ, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> LLAVEDER() { return getTokens(SwiftGrammarParser.LLAVEDER); }
		public TerminalNode LLAVEDER(int i) {
			return getToken(SwiftGrammarParser.LLAVEDER, i);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public ElifsContext elifs() {
			return getRuleContext(ElifsContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstmt);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(119);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(120);
				match(LLAVEIZQ);
				setState(121);
				((IfstmtContext)_localctx).block = block();
				setState(122);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil,nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(126);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(127);
				match(LLAVEIZQ);
				setState(128);
				((IfstmtContext)_localctx).bif = block();
				setState(129);
				match(LLAVEDER);
				setState(130);
				match(ELSE);
				setState(131);
				match(LLAVEIZQ);
				setState(132);
				((IfstmtContext)_localctx).belse = block();
				setState(133);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).bif.blk, ((IfstmtContext)_localctx).belse.blk,nil) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(137);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(138);
				match(LLAVEIZQ);
				setState(139);
				((IfstmtContext)_localctx).bif = ((IfstmtContext)_localctx).block = block();
				setState(140);
				match(LLAVEDER);
				setState(141);
				((IfstmtContext)_localctx).elifs = elifs(0);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil, ((IfstmtContext)_localctx).elifs.elifinst) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(145);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(146);
				match(LLAVEIZQ);
				setState(147);
				((IfstmtContext)_localctx).bif = ((IfstmtContext)_localctx).block = block();
				setState(148);
				match(LLAVEDER);
				setState(149);
				((IfstmtContext)_localctx).elifs = elifs(0);
				setState(150);
				match(ELSE);
				setState(151);
				match(LLAVEIZQ);
				setState(152);
				((IfstmtContext)_localctx).belse = ((IfstmtContext)_localctx).block = block();
				setState(153);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, ((IfstmtContext)_localctx).belse.blk, ((IfstmtContext)_localctx).elifs.elifinst) 
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

	public static class ElifsContext extends ParserRuleContext {
		public []interface{} elifinst;
		public ElifsContext celif;
		public Token ELSE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public ElifsContext elifs() {
			return getRuleContext(ElifsContext.class,0);
		}
		public ElifsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifs; }
	}

	public final ElifsContext elifs() throws RecognitionException {
		return elifs(0);
	}

	private ElifsContext elifs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElifsContext _localctx = new ElifsContext(_ctx, _parentState);
		ElifsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_elifs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			((ElifsContext)_localctx).ELSE = match(ELSE);
			setState(160);
			match(IF);
			setState(161);
			((ElifsContext)_localctx).expr = expr(0);
			setState(162);
			match(LLAVEIZQ);
			setState(163);
			((ElifsContext)_localctx).block = block();
			setState(164);
			match(LLAVEDER);

			    _localctx.elifinst = []interface{}{}
			    _localctx.elifinst = append(_localctx.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElifsContext(_parentctx, _parentState);
					_localctx.celif = _prevctx;
					_localctx.celif = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_elifs);
					setState(167);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(168);
					((ElifsContext)_localctx).ELSE = match(ELSE);
					setState(169);
					match(IF);
					setState(170);
					((ElifsContext)_localctx).expr = expr(0);
					setState(171);
					match(LLAVEIZQ);
					setState(172);
					((ElifsContext)_localctx).block = block();
					setState(173);
					match(LLAVEDER);

					              var arrif []interface{}
					              arrif = append(((ElifsContext)_localctx).celif.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
					              _localctx.elifinst = arrif
					          
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class SwitchstmtContext extends ParserRuleContext {
		public interfaces.Instruction swinst;
		public Token SWITCH;
		public ExprContext expr;
		public CasesContext cases;
		public BlockContext block;
		public TerminalNode SWITCH() { return getToken(SwiftGrammarParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SwiftGrammarParser.DEFAULT, 0); }
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public SwitchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstmt; }
	}

	public final SwitchstmtContext switchstmt() throws RecognitionException {
		SwitchstmtContext _localctx = new SwitchstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switchstmt);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(182);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(183);
				match(LLAVEIZQ);
				setState(184);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(185);
				match(DEFAULT);
				setState(186);
				match(DOSP);
				setState(187);
				((SwitchstmtContext)_localctx).block = block();
				setState(188);
				match(LLAVEDER);
				 _localctx.swinst = instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, ((SwitchstmtContext)_localctx).cases.casesinst, ((SwitchstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(192);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(193);
				match(LLAVEIZQ);
				setState(194);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(195);
				match(LLAVEDER);
				 _localctx.swinst = instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, ((SwitchstmtContext)_localctx).cases.casesinst, nil) 
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

	public static class CasesContext extends ParserRuleContext {
		public []interface{} casesinst;
		public CasesContext ccases;
		public Token CASE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode CASE() { return getToken(SwiftGrammarParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	}

	public final CasesContext cases() throws RecognitionException {
		return cases(0);
	}

	private CasesContext cases(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CasesContext _localctx = new CasesContext(_ctx, _parentState);
		CasesContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			((CasesContext)_localctx).CASE = match(CASE);
			setState(202);
			((CasesContext)_localctx).expr = expr(0);
			setState(203);
			match(DOSP);
			setState(204);
			((CasesContext)_localctx).block = block();

			    _localctx.casesinst = []interface{}{}
			    _localctx.casesinst = append(_localctx.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CasesContext(_parentctx, _parentState);
					_localctx.ccases = _prevctx;
					_localctx.ccases = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_cases);
					setState(207);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(208);
					((CasesContext)_localctx).CASE = match(CASE);
					setState(209);
					((CasesContext)_localctx).expr = expr(0);
					setState(210);
					match(DOSP);
					setState(211);
					((CasesContext)_localctx).block = block();

					              var arrcase []interface{}
					              arrcase = append(((CasesContext)_localctx).ccases.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
					              _localctx.casesinst = arrcase
					          
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class WhilestmtContext extends ParserRuleContext {
		public interfaces.Instruction whileinst;
		public Token WHILE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(SwiftGrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(220);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(221);
			match(LLAVEIZQ);
			setState(222);
			((WhilestmtContext)_localctx).block = block();
			setState(223);
			match(LLAVEDER);
			 _localctx.whileinst = instructions.NewWhile((((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getLine():0), (((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getCharPositionInLine():0), ((WhilestmtContext)_localctx).expr.e, ((WhilestmtContext)_localctx).block.blk) 
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
		public interfaces.Expression e;
		public ExprContext left;
		public Token op;
		public ExprContext expr;
		public PrimitivesContext primitives;
		public ListArrayContext list;
		public Token CORIZQ;
		public ListParamsContext listParams;
		public ExprContext right;
		public TerminalNode NOT() { return getToken(SwiftGrammarParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SwiftGrammarParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode MAY_IG() { return getToken(SwiftGrammarParser.MAY_IG, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MEN_IG() { return getToken(SwiftGrammarParser.MEN_IG, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(SwiftGrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(227);
				((ExprContext)_localctx).op = match(NOT);
				setState(228);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(6);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 2:
				{
				setState(231);
				((ExprContext)_localctx).op = match(SUB);
				setState(232);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(5);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 3:
				{
				setState(235);
				match(PARIZQ);
				setState(236);
				((ExprContext)_localctx).expr = expr(0);
				setState(237);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(240);
				((ExprContext)_localctx).primitives = primitives();
				 _localctx.e = ((ExprContext)_localctx).primitives.p
				}
				break;
			case 5:
				{
				setState(243);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 6:
				{
				setState(246);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(247);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(248);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(254);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(259);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(264);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAY_IG || _la==MAYOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(269);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MEN_IG || _la==MENOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(274);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIF || _la==IG_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(10);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(279);
						((ExprContext)_localctx).op = match(AND);
						setState(280);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(9);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(284);
						((ExprContext)_localctx).op = match(OR);
						setState(285);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(8);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class PrimitivesContext extends ParserRuleContext {
		public interfaces.Expression p;
		public Token NUMBER;
		public Token CHARACTER;
		public Token STRING;
		public Token ID;
		public Token TRU;
		public Token FAL;
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode CHARACTER() { return getToken(SwiftGrammarParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public PrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitives; }
	}

	public final PrimitivesContext primitives() throws RecognitionException {
		PrimitivesContext _localctx = new PrimitivesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitives);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				((PrimitivesContext)_localctx).NUMBER = match(NUMBER);

				        if (strings.Contains((((PrimitivesContext)_localctx).NUMBER!=null?((PrimitivesContext)_localctx).NUMBER.getText():null),".")){
				            num,err := strconv.ParseFloat((((PrimitivesContext)_localctx).NUMBER!=null?((PrimitivesContext)_localctx).NUMBER.getText():null), 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).NUMBER!=null?((PrimitivesContext)_localctx).NUMBER.getLine():0),(((PrimitivesContext)_localctx).NUMBER!=null?((PrimitivesContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((PrimitivesContext)_localctx).NUMBER!=null?((PrimitivesContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).NUMBER!=null?((PrimitivesContext)_localctx).NUMBER.getLine():0),(((PrimitivesContext)_localctx).NUMBER!=null?((PrimitivesContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				        }
				    
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((PrimitivesContext)_localctx).CHARACTER = match(CHARACTER);

				        str := (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getLine():0), (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1],environment.CHAR)
				    
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				((PrimitivesContext)_localctx).STRING = match(STRING);

				        str := (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getLine():0), (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				((PrimitivesContext)_localctx).ID = match(ID);

				        _localctx.p = expressions.NewCallVariable((((PrimitivesContext)_localctx).ID!=null?((PrimitivesContext)_localctx).ID.getLine():0), (((PrimitivesContext)_localctx).ID!=null?((PrimitivesContext)_localctx).ID.getCharPositionInLine():0), (((PrimitivesContext)_localctx).ID!=null?((PrimitivesContext)_localctx).ID.getText():null))
				    
				}
				break;
			case TRU:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				((PrimitivesContext)_localctx).TRU = match(TRU);
				 _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getLine():0), (((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				((PrimitivesContext)_localctx).FAL = match(FAL);
				 _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).FAL!=null?((PrimitivesContext)_localctx).FAL.getLine():0), (((PrimitivesContext)_localctx).FAL!=null?((PrimitivesContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
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

	public static class ListParamsContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			((ListParamsContext)_localctx).expr = expr(0);

			    _localctx.l = []interface{}{}
			    _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)

			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(311);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(312);
					match(COMA);
					setState(313);
					((ListParamsContext)_localctx).expr = expr(0);

					              var arr []interface{}
					              arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					              _localctx.l = arr
					          
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ListArrayContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(322);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listArray);
					setState(325);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(326);
					match(CORIZQ);
					setState(327);
					((ListArrayContext)_localctx).expr = expr(0);
					setState(328);
					match(CORDER);
					 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		case 7:
			return elifs_sempred((ElifsContext)_localctx, predIndex);
		case 9:
			return cases_sempred((CasesContext)_localctx, predIndex);
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 14:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean elifs_sempred(ElifsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cases_sempred(CasesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\6\3&\n\3\r\3\16\3\'\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7w\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u009f\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c9\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00d9\n\13\f\13\16\13\u00dc\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fe\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0123\n\r\f\r\16\r\u0126\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0134"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u013f\n\17\f\17"+
		"\16\17\u0142\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u014e\n\20\f\20\16\20\u0151\13\20\3\20\2\7\20\24\30\34\36\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\61\63\3\2\64\65\4\2--//\4\2"+
		"..\60\60\3\2\'(\2\u016a\2 \3\2\2\2\4%\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n"+
		"j\3\2\2\2\fv\3\2\2\2\16\u009e\3\2\2\2\20\u00a0\3\2\2\2\22\u00c8\3\2\2"+
		"\2\24\u00ca\3\2\2\2\26\u00dd\3\2\2\2\30\u00fd\3\2\2\2\32\u0133\3\2\2\2"+
		"\34\u0135\3\2\2\2\36\u0143\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"#\b\2\1\2#\3"+
		"\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2"+
		"\2)*\b\3\1\2*\5\3\2\2\2+,\5\b\5\2,-\b\4\1\2-;\3\2\2\2./\5\n\6\2/\60\b"+
		"\4\1\2\60;\3\2\2\2\61\62\5\16\b\2\62\63\b\4\1\2\63;\3\2\2\2\64\65\5\22"+
		"\n\2\65\66\b\4\1\2\66;\3\2\2\2\678\5\26\f\289\b\4\1\29;\3\2\2\2:+\3\2"+
		"\2\2:.\3\2\2\2:\61\3\2\2\2:\64\3\2\2\2:\67\3\2\2\2;\7\3\2\2\2<=\7\f\2"+
		"\2=>\7\66\2\2>?\5\30\r\2?@\7\67\2\2@A\b\5\1\2A\t\3\2\2\2BC\7\b\2\2CD\7"+
		"&\2\2DE\7<\2\2EF\5\f\7\2FG\7,\2\2GH\5\30\r\2HI\b\6\1\2Ik\3\2\2\2JK\7\b"+
		"\2\2KL\7&\2\2LM\7,\2\2MN\5\30\r\2NO\b\6\1\2Ok\3\2\2\2PQ\7\b\2\2QR\7&\2"+
		"\2RS\7<\2\2ST\5\f\7\2TU\7>\2\2UV\b\6\1\2Vk\3\2\2\2WX\7&\2\2XY\7,\2\2Y"+
		"Z\5\30\r\2Z[\b\6\1\2[k\3\2\2\2\\]\7\t\2\2]^\7&\2\2^_\7,\2\2_`\5\32\16"+
		"\2`a\b\6\1\2ak\3\2\2\2bc\7\t\2\2cd\7&\2\2de\7<\2\2ef\5\f\7\2fg\7,\2\2"+
		"gh\5\32\16\2hi\b\6\1\2ik\3\2\2\2jB\3\2\2\2jJ\3\2\2\2jP\3\2\2\2jW\3\2\2"+
		"\2j\\\3\2\2\2jb\3\2\2\2k\13\3\2\2\2lm\7\3\2\2mw\b\7\1\2no\7\4\2\2ow\b"+
		"\7\1\2pq\7\5\2\2qw\b\7\1\2rs\7\6\2\2sw\b\7\1\2tu\7\7\2\2uw\b\7\1\2vl\3"+
		"\2\2\2vn\3\2\2\2vp\3\2\2\2vr\3\2\2\2vt\3\2\2\2w\r\3\2\2\2xy\7\r\2\2yz"+
		"\5\30\r\2z{\78\2\2{|\5\4\3\2|}\79\2\2}~\b\b\1\2~\u009f\3\2\2\2\177\u0080"+
		"\7\r\2\2\u0080\u0081\5\30\r\2\u0081\u0082\78\2\2\u0082\u0083\5\4\3\2\u0083"+
		"\u0084\79\2\2\u0084\u0085\7\16\2\2\u0085\u0086\78\2\2\u0086\u0087\5\4"+
		"\3\2\u0087\u0088\79\2\2\u0088\u0089\b\b\1\2\u0089\u009f\3\2\2\2\u008a"+
		"\u008b\7\r\2\2\u008b\u008c\5\30\r\2\u008c\u008d\78\2\2\u008d\u008e\5\4"+
		"\3\2\u008e\u008f\79\2\2\u008f\u0090\5\20\t\2\u0090\u0091\b\b\1\2\u0091"+
		"\u009f\3\2\2\2\u0092\u0093\7\r\2\2\u0093\u0094\5\30\r\2\u0094\u0095\7"+
		"8\2\2\u0095\u0096\5\4\3\2\u0096\u0097\79\2\2\u0097\u0098\5\20\t\2\u0098"+
		"\u0099\7\16\2\2\u0099\u009a\78\2\2\u009a\u009b\5\4\3\2\u009b\u009c\79"+
		"\2\2\u009c\u009d\b\b\1\2\u009d\u009f\3\2\2\2\u009ex\3\2\2\2\u009e\177"+
		"\3\2\2\2\u009e\u008a\3\2\2\2\u009e\u0092\3\2\2\2\u009f\17\3\2\2\2\u00a0"+
		"\u00a1\b\t\1\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\5"+
		"\30\r\2\u00a4\u00a5\78\2\2\u00a5\u00a6\5\4\3\2\u00a6\u00a7\79\2\2\u00a7"+
		"\u00a8\b\t\1\2\u00a8\u00b4\3\2\2\2\u00a9\u00aa\f\4\2\2\u00aa\u00ab\7\16"+
		"\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\78\2\2\u00ae"+
		"\u00af\5\4\3\2\u00af\u00b0\79\2\2\u00b0\u00b1\b\t\1\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00a9\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\21\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\17\2"+
		"\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\78\2\2\u00ba\u00bb\5\24\13\2\u00bb"+
		"\u00bc\7\21\2\2\u00bc\u00bd\7<\2\2\u00bd\u00be\5\4\3\2\u00be\u00bf\79"+
		"\2\2\u00bf\u00c0\b\n\1\2\u00c0\u00c9\3\2\2\2\u00c1\u00c2\7\17\2\2\u00c2"+
		"\u00c3\5\30\r\2\u00c3\u00c4\78\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\7"+
		"9\2\2\u00c6\u00c7\b\n\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00b7\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c9\23\3\2\2\2\u00ca\u00cb\b\13\1\2\u00cb\u00cc\7\20"+
		"\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7<\2\2\u00ce\u00cf\5\4\3\2\u00cf"+
		"\u00d0\b\13\1\2\u00d0\u00da\3\2\2\2\u00d1\u00d2\f\4\2\2\u00d2\u00d3\7"+
		"\20\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00d5\7<\2\2\u00d5\u00d6\5\4\3\2\u00d6"+
		"\u00d7\b\13\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d9\u00dc\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\25\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\25\2\2\u00de\u00df\5\30\r\2\u00df\u00e0\7"+
		"8\2\2\u00e0\u00e1\5\4\3\2\u00e1\u00e2\79\2\2\u00e2\u00e3\b\f\1\2\u00e3"+
		"\27\3\2\2\2\u00e4\u00e5\b\r\1\2\u00e5\u00e6\7)\2\2\u00e6\u00e7\5\30\r"+
		"\b\u00e7\u00e8\b\r\1\2\u00e8\u00fe\3\2\2\2\u00e9\u00ea\7\65\2\2\u00ea"+
		"\u00eb\5\30\r\7\u00eb\u00ec\b\r\1\2\u00ec\u00fe\3\2\2\2\u00ed\u00ee\7"+
		"\66\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f0\7\67\2\2\u00f0\u00f1\b\r\1\2"+
		"\u00f1\u00fe\3\2\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4\b\r\1\2\u00f4\u00fe"+
		"\3\2\2\2\u00f5\u00f6\5\36\20\2\u00f6\u00f7\b\r\1\2\u00f7\u00fe\3\2\2\2"+
		"\u00f8\u00f9\7:\2\2\u00f9\u00fa\5\34\17\2\u00fa\u00fb\7;\2\2\u00fb\u00fc"+
		"\b\r\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00e4\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fd"+
		"\u00ed\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fe\u0124\3\2\2\2\u00ff\u0100\f\17\2\2\u0100\u0101\t\2\2\2\u0101"+
		"\u0102\5\30\r\20\u0102\u0103\b\r\1\2\u0103\u0123\3\2\2\2\u0104\u0105\f"+
		"\16\2\2\u0105\u0106\t\3\2\2\u0106\u0107\5\30\r\17\u0107\u0108\b\r\1\2"+
		"\u0108\u0123\3\2\2\2\u0109\u010a\f\r\2\2\u010a\u010b\t\4\2\2\u010b\u010c"+
		"\5\30\r\16\u010c\u010d\b\r\1\2\u010d\u0123\3\2\2\2\u010e\u010f\f\f\2\2"+
		"\u010f\u0110\t\5\2\2\u0110\u0111\5\30\r\r\u0111\u0112\b\r\1\2\u0112\u0123"+
		"\3\2\2\2\u0113\u0114\f\13\2\2\u0114\u0115\t\6\2\2\u0115\u0116\5\30\r\f"+
		"\u0116\u0117\b\r\1\2\u0117\u0123\3\2\2\2\u0118\u0119\f\n\2\2\u0119\u011a"+
		"\7+\2\2\u011a\u011b\5\30\r\13\u011b\u011c\b\r\1\2\u011c\u0123\3\2\2\2"+
		"\u011d\u011e\f\t\2\2\u011e\u011f\7*\2\2\u011f\u0120\5\30\r\n\u0120\u0121"+
		"\b\r\1\2\u0121\u0123\3\2\2\2\u0122\u00ff\3\2\2\2\u0122\u0104\3\2\2\2\u0122"+
		"\u0109\3\2\2\2\u0122\u010e\3\2\2\2\u0122\u0113\3\2\2\2\u0122\u0118\3\2"+
		"\2\2\u0122\u011d\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\31\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7#\2\2"+
		"\u0128\u0134\b\16\1\2\u0129\u012a\7$\2\2\u012a\u0134\b\16\1\2\u012b\u012c"+
		"\7%\2\2\u012c\u0134\b\16\1\2\u012d\u012e\7&\2\2\u012e\u0134\b\16\1\2\u012f"+
		"\u0130\7\n\2\2\u0130\u0134\b\16\1\2\u0131\u0132\7\13\2\2\u0132\u0134\b"+
		"\16\1\2\u0133\u0127\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u012b\3\2\2\2\u0133"+
		"\u012d\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0131\3\2\2\2\u0134\33\3\2\2"+
		"\2\u0135\u0136\b\17\1\2\u0136\u0137\5\30\r\2\u0137\u0138\b\17\1\2\u0138"+
		"\u0140\3\2\2\2\u0139\u013a\f\4\2\2\u013a\u013b\7=\2\2\u013b\u013c\5\30"+
		"\r\2\u013c\u013d\b\17\1\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\35\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0143\u0144\b\20\1\2\u0144\u0145\7&\2\2\u0145\u0146"+
		"\b\20\1\2\u0146\u014f\3\2\2\2\u0147\u0148\f\4\2\2\u0148\u0149\7:\2\2\u0149"+
		"\u014a\5\30\r\2\u014a\u014b\7;\2\2\u014b\u014c\b\20\1\2\u014c\u014e\3"+
		"\2\2\2\u014d\u0147\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\37\3\2\2\2\u0151\u014f\3\2\2\2\20\':jv\u009e\u00b4"+
		"\u00c8\u00da\u00fd\u0122\u0124\u0133\u0140\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}