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
		FUNC=32, AT=33, NUMBER=34, CHARACTER=35, STRING=36, ID=37, DIF=38, IG_IG=39, 
		NOT=40, OR=41, AND=42, IG=43, MAY_IG=44, MEN_IG=45, MAYOR=46, MENOR=47, 
		MOD=48, MUL=49, DIV=50, ADD=51, SUB=52, PARIZQ=53, PARDER=54, LLAVEIZQ=55, 
		LLAVEDER=56, CORIZQ=57, CORDER=58, DOSP=59, PUNTO=60, COMA=61, INTCE=62, 
		FLECHA=63, AMP=64, WHITESPACE=65, COMMENT=66, LINE_COMMENT=67;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_printstmt = 3, 
		RULE_variablestmt = 4, RULE_typestmt = 5, RULE_type2stmt = 6, RULE_funvecstmt = 7, 
		RULE_ifstmt = 8, RULE_elifs = 9, RULE_switchstmt = 10, RULE_cases = 11, 
		RULE_whilestmt = 12, RULE_expr = 13, RULE_primitives = 14, RULE_listParams = 15, 
		RULE_listArray = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "printstmt", "variablestmt", "typestmt", 
			"type2stmt", "funvecstmt", "ifstmt", "elifs", "switchstmt", "cases", 
			"whilestmt", "expr", "primitives", "listParams", "listArray"
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
			setState(34);
			((SContext)_localctx).block = block();
			setState(35);
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
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					((BlockContext)_localctx).instruction = instruction();
					((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
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
		public FunvecstmtContext funvecstmt;
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
		public FunvecstmtContext funvecstmt() {
			return getRuleContext(FunvecstmtContext.class,0);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				((InstructionContext)_localctx).variablestmt = variablestmt();
				 _localctx.inst = ((InstructionContext)_localctx).variablestmt.vari
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				((InstructionContext)_localctx).switchstmt = switchstmt();
				 _localctx.inst = ((InstructionContext)_localctx).switchstmt.swinst 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whileinst 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				((InstructionContext)_localctx).funvecstmt = funvecstmt();
				 _localctx.inst = ((InstructionContext)_localctx).funvecstmt.fvecisnt 
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
			setState(65);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(66);
			match(PARIZQ);
			setState(67);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(68);
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
		public ExprContext e1;
		public ExprContext e2;
		public Token CORIZQ;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public TypestmtContext typestmt() {
			return getRuleContext(TypestmtContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INTCE() { return getToken(SwiftGrammarParser.INTCE, 0); }
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public VariablestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablestmt; }
	}

	public final VariablestmtContext variablestmt() throws RecognitionException {
		VariablestmtContext _localctx = new VariablestmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variablestmt);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(72);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(73);
				match(DOSP);
				setState(74);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(75);
				match(IG);
				setState(76);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(80);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(81);
				match(IG);
				setState(82);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(86);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(87);
				match(DOSP);
				setState(88);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(89);
				match(INTCE);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, expressions.NewPrimitive((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), nil, environment.NULL), true) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(93);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(94);
				match(IG);
				setState(95);
				((VariablestmtContext)_localctx).primitives = primitives();
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).primitives.p, false) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(99);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(100);
				match(DOSP);
				setState(101);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(102);
				match(IG);
				setState(103);
				((VariablestmtContext)_localctx).primitives = primitives();
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).primitives.p, false) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(107);
				match(IG);
				setState(108);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(112);
				match(CORIZQ);
				setState(113);
				((VariablestmtContext)_localctx).e1 = expr(0);
				setState(114);
				match(CORDER);
				setState(115);
				match(IG);
				setState(116);
				((VariablestmtContext)_localctx).e2 = expr(0);
				 _localctx.vari = instructions.NewAssigmentVec((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).e1.e, ((VariablestmtContext)_localctx).e2.e) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(120);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(121);
				match(DOSP);
				setState(122);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(123);
				match(IG);
				setState(124);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(128);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(129);
				match(DOSP);
				setState(130);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(131);
				match(IG);
				setState(132);
				((VariablestmtContext)_localctx).CORIZQ = match(CORIZQ);
				setState(133);
				match(CORDER);

				    _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, 
				    expressions.NewArray((((VariablestmtContext)_localctx).CORIZQ!=null?((VariablestmtContext)_localctx).CORIZQ.getLine():0), (((VariablestmtContext)_localctx).CORIZQ!=null?((VariablestmtContext)_localctx).CORIZQ.getCharPositionInLine():0), nil),
				    true)

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
		public Type2stmtContext type2stmt;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode TSTRING() { return getToken(SwiftGrammarParser.TSTRING, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(SwiftGrammarParser.CHAR, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public Type2stmtContext type2stmt() {
			return getRuleContext(Type2stmtContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public TypestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typestmt; }
	}

	public final TypestmtContext typestmt() throws RecognitionException {
		TypestmtContext _localctx = new TypestmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typestmt);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(INT);
				 _localctx.type = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(FLOAT);
				 _localctx.type = environment.FLOAT 
				}
				break;
			case TSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(TSTRING);
				 _localctx.type = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(BOOL);
				 _localctx.type = environment.BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(CHAR);
				 _localctx.type = environment.CHAR 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(CORIZQ);
				setState(149);
				((TypestmtContext)_localctx).type2stmt = type2stmt();
				setState(150);
				match(CORDER);
				 _localctx.type = ((TypestmtContext)_localctx).type2stmt.type2 
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

	public static class Type2stmtContext extends ParserRuleContext {
		public environment.TipoExpresion type2;
		public Type2stmtContext type2stmt;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode TSTRING() { return getToken(SwiftGrammarParser.TSTRING, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(SwiftGrammarParser.CHAR, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public Type2stmtContext type2stmt() {
			return getRuleContext(Type2stmtContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public Type2stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type2stmt; }
	}

	public final Type2stmtContext type2stmt() throws RecognitionException {
		Type2stmtContext _localctx = new Type2stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type2stmt);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(INT);
				 _localctx.type2 = environment.A_INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(FLOAT);
				 _localctx.type2 = environment.A_FLOAT 
				}
				break;
			case TSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(TSTRING);
				 _localctx.type2 = environment.A_STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(BOOL);
				 _localctx.type2 = environment.A_BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(CHAR);
				 _localctx.type2 = environment.A_CHAR 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(CORIZQ);
				setState(166);
				((Type2stmtContext)_localctx).type2stmt = type2stmt();
				setState(167);
				match(CORDER);
				 _localctx.type2 = ((Type2stmtContext)_localctx).type2stmt.type2 
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

	public static class FunvecstmtContext extends ParserRuleContext {
		public interfaces.Instruction fvecisnt;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode APPEND() { return getToken(SwiftGrammarParser.APPEND, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode REMOVELAST() { return getToken(SwiftGrammarParser.REMOVELAST, 0); }
		public TerminalNode REMOVE() { return getToken(SwiftGrammarParser.REMOVE, 0); }
		public TerminalNode AT() { return getToken(SwiftGrammarParser.AT, 0); }
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public FunvecstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funvecstmt; }
	}

	public final FunvecstmtContext funvecstmt() throws RecognitionException {
		FunvecstmtContext _localctx = new FunvecstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funvecstmt);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(173);
				match(PUNTO);
				setState(174);
				match(APPEND);
				setState(175);
				match(PARIZQ);
				setState(176);
				((FunvecstmtContext)_localctx).expr = expr(0);
				setState(177);
				match(PARDER);
				 _localctx.fvecisnt = instructions.NewAppend((((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getText():null) , ((FunvecstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(181);
				match(PUNTO);
				setState(182);
				match(REMOVELAST);
				setState(183);
				match(PARIZQ);
				setState(184);
				match(PARDER);
				 _localctx.fvecisnt = instructions.NewRemoveLast((((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getText():null)) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(187);
				match(PUNTO);
				setState(188);
				match(REMOVE);
				setState(189);
				match(PARIZQ);
				setState(190);
				match(AT);
				setState(191);
				match(DOSP);
				setState(192);
				((FunvecstmtContext)_localctx).expr = expr(0);
				setState(193);
				match(PARDER);
				 _localctx.fvecisnt = instructions.NewRemove((((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getText():null) , ((FunvecstmtContext)_localctx).expr.e) 
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
		enterRule(_localctx, 16, RULE_ifstmt);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(199);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(200);
				match(LLAVEIZQ);
				setState(201);
				((IfstmtContext)_localctx).block = block();
				setState(202);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil,nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(206);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(207);
				match(LLAVEIZQ);
				setState(208);
				((IfstmtContext)_localctx).bif = block();
				setState(209);
				match(LLAVEDER);
				setState(210);
				match(ELSE);
				setState(211);
				match(LLAVEIZQ);
				setState(212);
				((IfstmtContext)_localctx).belse = block();
				setState(213);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).bif.blk, ((IfstmtContext)_localctx).belse.blk,nil) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(217);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(218);
				match(LLAVEIZQ);
				setState(219);
				((IfstmtContext)_localctx).bif = ((IfstmtContext)_localctx).block = block();
				setState(220);
				match(LLAVEDER);
				setState(221);
				((IfstmtContext)_localctx).elifs = elifs(0);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil, ((IfstmtContext)_localctx).elifs.elifinst) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(225);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(226);
				match(LLAVEIZQ);
				setState(227);
				((IfstmtContext)_localctx).bif = ((IfstmtContext)_localctx).block = block();
				setState(228);
				match(LLAVEDER);
				setState(229);
				((IfstmtContext)_localctx).elifs = elifs(0);
				setState(230);
				match(ELSE);
				setState(231);
				match(LLAVEIZQ);
				setState(232);
				((IfstmtContext)_localctx).belse = ((IfstmtContext)_localctx).block = block();
				setState(233);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_elifs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(239);
			((ElifsContext)_localctx).ELSE = match(ELSE);
			setState(240);
			match(IF);
			setState(241);
			((ElifsContext)_localctx).expr = expr(0);
			setState(242);
			match(LLAVEIZQ);
			setState(243);
			((ElifsContext)_localctx).block = block();
			setState(244);
			match(LLAVEDER);

			    _localctx.elifinst = []interface{}{}
			    _localctx.elifinst = append(_localctx.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
					setState(247);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(248);
					((ElifsContext)_localctx).ELSE = match(ELSE);
					setState(249);
					match(IF);
					setState(250);
					((ElifsContext)_localctx).expr = expr(0);
					setState(251);
					match(LLAVEIZQ);
					setState(252);
					((ElifsContext)_localctx).block = block();
					setState(253);
					match(LLAVEDER);

					              var arrif []interface{}
					              arrif = append(((ElifsContext)_localctx).celif.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
					              _localctx.elifinst = arrif
					          
					}
					} 
				}
				setState(260);
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
		enterRule(_localctx, 20, RULE_switchstmt);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(262);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(263);
				match(LLAVEIZQ);
				setState(264);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(265);
				match(DEFAULT);
				setState(266);
				match(DOSP);
				setState(267);
				((SwitchstmtContext)_localctx).block = block();
				setState(268);
				match(LLAVEDER);
				 _localctx.swinst = instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, ((SwitchstmtContext)_localctx).cases.casesinst, ((SwitchstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(272);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(273);
				match(LLAVEIZQ);
				setState(274);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(275);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_cases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(281);
			((CasesContext)_localctx).CASE = match(CASE);
			setState(282);
			((CasesContext)_localctx).expr = expr(0);
			setState(283);
			match(DOSP);
			setState(284);
			((CasesContext)_localctx).block = block();

			    _localctx.casesinst = []interface{}{}
			    _localctx.casesinst = append(_localctx.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
					setState(287);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(288);
					((CasesContext)_localctx).CASE = match(CASE);
					setState(289);
					((CasesContext)_localctx).expr = expr(0);
					setState(290);
					match(DOSP);
					setState(291);
					((CasesContext)_localctx).block = block();

					              var arrcase []interface{}
					              arrcase = append(((CasesContext)_localctx).ccases.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
					              _localctx.casesinst = arrcase
					          
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 24, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(300);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(301);
			match(LLAVEIZQ);
			setState(302);
			((WhilestmtContext)_localctx).block = block();
			setState(303);
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
		public ListArrayContext listArray;
		public Token CORIZQ;
		public ListParamsContext listParams;
		public Token ID;
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
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode COUNT() { return getToken(SwiftGrammarParser.COUNT, 0); }
		public TerminalNode ISEMPTY() { return getToken(SwiftGrammarParser.ISEMPTY, 0); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(307);
				((ExprContext)_localctx).op = match(NOT);
				setState(308);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(8);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 2:
				{
				setState(311);
				((ExprContext)_localctx).op = match(SUB);
				setState(312);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(7);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 3:
				{
				setState(315);
				match(PARIZQ);
				setState(316);
				((ExprContext)_localctx).expr = expr(0);
				setState(317);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(320);
				((ExprContext)_localctx).primitives = primitives();
				 _localctx.e = ((ExprContext)_localctx).primitives.p
				}
				break;
			case 5:
				{
				setState(323);
				((ExprContext)_localctx).listArray = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).listArray.p
				}
				break;
			case 6:
				{
				setState(326);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(327);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(328);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 7:
				{
				setState(331);
				((ExprContext)_localctx).ID = match(ID);
				setState(332);
				match(PUNTO);
				setState(333);
				match(COUNT);
				 _localctx.e = expressions.NewCount((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 8:
				{
				setState(335);
				((ExprContext)_localctx).ID = match(ID);
				setState(336);
				match(PUNTO);
				setState(337);
				match(ISEMPTY);
				 _localctx.e = expressions.NewIsEmpty((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(342);
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
						setState(343);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(347);
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
						setState(348);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(352);
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
						setState(353);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(356);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(357);
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
						setState(358);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(361);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(362);
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
						setState(363);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(366);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(367);
						((ExprContext)_localctx).op = match(AND);
						setState(368);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(371);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(372);
						((ExprContext)_localctx).op = match(OR);
						setState(373);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(10);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(380);
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
		enterRule(_localctx, 28, RULE_primitives);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
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
				setState(383);
				((PrimitivesContext)_localctx).CHARACTER = match(CHARACTER);

				        str := (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getLine():0), (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1],environment.CHAR)
				    
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				((PrimitivesContext)_localctx).STRING = match(STRING);

				        str := (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getLine():0), (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				((PrimitivesContext)_localctx).ID = match(ID);

				        _localctx.p = expressions.NewCallVariable((((PrimitivesContext)_localctx).ID!=null?((PrimitivesContext)_localctx).ID.getLine():0), (((PrimitivesContext)_localctx).ID!=null?((PrimitivesContext)_localctx).ID.getCharPositionInLine():0), (((PrimitivesContext)_localctx).ID!=null?((PrimitivesContext)_localctx).ID.getText():null))
				    
				}
				break;
			case TRU:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				((PrimitivesContext)_localctx).TRU = match(TRU);
				 _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getLine():0), (((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(396);
			((ListParamsContext)_localctx).expr = expr(0);

			    _localctx.l = []interface{}{}
			    _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)

			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					setState(399);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(400);
					match(COMA);
					setState(401);
					((ListParamsContext)_localctx).expr = expr(0);

					              var arr []interface{}
					              arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					              _localctx.l = arr
					          
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(410);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
					setState(413);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(414);
					match(CORIZQ);
					setState(415);
					((ListArrayContext)_localctx).expr = expr(0);
					setState(416);
					match(CORDER);
					 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
					}
					} 
				}
				setState(423);
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
		case 9:
			return elifs_sempred((ElifsContext)_localctx, predIndex);
		case 11:
			return cases_sempred((CasesContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 16:
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
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u01ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008b"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009c"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ad"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ef\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0103\n\13\f\13\16\13\u0106\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0119\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0129\n"+
		"\r\f\r\16\r\u012c\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0156\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u017b\n\17\f\17\16\17\u017e\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u018c\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0197\n\21\f\21\16\21\u019a\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01a6\n\22\f\22\16\22\u01a9\13"+
		"\22\3\22\2\7\24\30\34 \"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"\2\7\3\2\62\64\3\2\65\66\4\2..\60\60\4\2//\61\61\3\2()\2\u01ce\2$\3\2"+
		"\2\2\4)\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\n\u008a\3\2\2\2\f\u009b\3\2\2\2"+
		"\16\u00ac\3\2\2\2\20\u00c6\3\2\2\2\22\u00ee\3\2\2\2\24\u00f0\3\2\2\2\26"+
		"\u0118\3\2\2\2\30\u011a\3\2\2\2\32\u012d\3\2\2\2\34\u0155\3\2\2\2\36\u018b"+
		"\3\2\2\2 \u018d\3\2\2\2\"\u019b\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\'\b\2\1\2"+
		"\'\3\3\2\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2"+
		"\2-.\b\3\1\2.\5\3\2\2\2/\60\5\b\5\2\60\61\b\4\1\2\61B\3\2\2\2\62\63\5"+
		"\n\6\2\63\64\b\4\1\2\64B\3\2\2\2\65\66\5\22\n\2\66\67\b\4\1\2\67B\3\2"+
		"\2\289\5\26\f\29:\b\4\1\2:B\3\2\2\2;<\5\32\16\2<=\b\4\1\2=B\3\2\2\2>?"+
		"\5\20\t\2?@\b\4\1\2@B\3\2\2\2A/\3\2\2\2A\62\3\2\2\2A\65\3\2\2\2A8\3\2"+
		"\2\2A;\3\2\2\2A>\3\2\2\2B\7\3\2\2\2CD\7\f\2\2DE\7\67\2\2EF\5\34\17\2F"+
		"G\78\2\2GH\b\5\1\2H\t\3\2\2\2IJ\7\b\2\2JK\7\'\2\2KL\7=\2\2LM\5\f\7\2M"+
		"N\7-\2\2NO\5\34\17\2OP\b\6\1\2P\u008b\3\2\2\2QR\7\b\2\2RS\7\'\2\2ST\7"+
		"-\2\2TU\5\34\17\2UV\b\6\1\2V\u008b\3\2\2\2WX\7\b\2\2XY\7\'\2\2YZ\7=\2"+
		"\2Z[\5\f\7\2[\\\7@\2\2\\]\b\6\1\2]\u008b\3\2\2\2^_\7\t\2\2_`\7\'\2\2`"+
		"a\7-\2\2ab\5\36\20\2bc\b\6\1\2c\u008b\3\2\2\2de\7\t\2\2ef\7\'\2\2fg\7"+
		"=\2\2gh\5\f\7\2hi\7-\2\2ij\5\36\20\2jk\b\6\1\2k\u008b\3\2\2\2lm\7\'\2"+
		"\2mn\7-\2\2no\5\34\17\2op\b\6\1\2p\u008b\3\2\2\2qr\7\'\2\2rs\7;\2\2st"+
		"\5\34\17\2tu\7<\2\2uv\7-\2\2vw\5\34\17\2wx\b\6\1\2x\u008b\3\2\2\2yz\7"+
		"\b\2\2z{\7\'\2\2{|\7=\2\2|}\5\f\7\2}~\7-\2\2~\177\5\34\17\2\177\u0080"+
		"\b\6\1\2\u0080\u008b\3\2\2\2\u0081\u0082\7\b\2\2\u0082\u0083\7\'\2\2\u0083"+
		"\u0084\7=\2\2\u0084\u0085\5\f\7\2\u0085\u0086\7-\2\2\u0086\u0087\7;\2"+
		"\2\u0087\u0088\7<\2\2\u0088\u0089\b\6\1\2\u0089\u008b\3\2\2\2\u008aI\3"+
		"\2\2\2\u008aQ\3\2\2\2\u008aW\3\2\2\2\u008a^\3\2\2\2\u008ad\3\2\2\2\u008a"+
		"l\3\2\2\2\u008aq\3\2\2\2\u008ay\3\2\2\2\u008a\u0081\3\2\2\2\u008b\13\3"+
		"\2\2\2\u008c\u008d\7\3\2\2\u008d\u009c\b\7\1\2\u008e\u008f\7\4\2\2\u008f"+
		"\u009c\b\7\1\2\u0090\u0091\7\5\2\2\u0091\u009c\b\7\1\2\u0092\u0093\7\6"+
		"\2\2\u0093\u009c\b\7\1\2\u0094\u0095\7\7\2\2\u0095\u009c\b\7\1\2\u0096"+
		"\u0097\7;\2\2\u0097\u0098\5\16\b\2\u0098\u0099\7<\2\2\u0099\u009a\b\7"+
		"\1\2\u009a\u009c\3\2\2\2\u009b\u008c\3\2\2\2\u009b\u008e\3\2\2\2\u009b"+
		"\u0090\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u0096\3\2"+
		"\2\2\u009c\r\3\2\2\2\u009d\u009e\7\3\2\2\u009e\u00ad\b\b\1\2\u009f\u00a0"+
		"\7\4\2\2\u00a0\u00ad\b\b\1\2\u00a1\u00a2\7\5\2\2\u00a2\u00ad\b\b\1\2\u00a3"+
		"\u00a4\7\6\2\2\u00a4\u00ad\b\b\1\2\u00a5\u00a6\7\7\2\2\u00a6\u00ad\b\b"+
		"\1\2\u00a7\u00a8\7;\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7<\2\2\u00aa"+
		"\u00ab\b\b\1\2\u00ab\u00ad\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac\u009f\3\2"+
		"\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac"+
		"\u00a7\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00af\7\'\2\2\u00af\u00b0\7>\2\2"+
		"\u00b0\u00b1\7\31\2\2\u00b1\u00b2\7\67\2\2\u00b2\u00b3\5\34\17\2\u00b3"+
		"\u00b4\78\2\2\u00b4\u00b5\b\t\1\2\u00b5\u00c7\3\2\2\2\u00b6\u00b7\7\'"+
		"\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9\7\32\2\2\u00b9\u00ba\7\67\2\2\u00ba"+
		"\u00bb\78\2\2\u00bb\u00c7\b\t\1\2\u00bc\u00bd\7\'\2\2\u00bd\u00be\7>\2"+
		"\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\7\67\2\2\u00c0\u00c1\7#\2\2\u00c1"+
		"\u00c2\7=\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c4\78\2\2\u00c4\u00c5\b\t"+
		"\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00ae\3\2\2\2\u00c6\u00b6\3\2\2\2\u00c6"+
		"\u00bc\3\2\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\5\34\17"+
		"\2\u00ca\u00cb\79\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd\7:\2\2\u00cd\u00ce"+
		"\b\n\1\2\u00ce\u00ef\3\2\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00d1\5\34\17\2"+
		"\u00d1\u00d2\79\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\7:\2\2\u00d4\u00d5"+
		"\7\16\2\2\u00d5\u00d6\79\2\2\u00d6\u00d7\5\4\3\2\u00d7\u00d8\7:\2\2\u00d8"+
		"\u00d9\b\n\1\2\u00d9\u00ef\3\2\2\2\u00da\u00db\7\r\2\2\u00db\u00dc\5\34"+
		"\17\2\u00dc\u00dd\79\2\2\u00dd\u00de\5\4\3\2\u00de\u00df\7:\2\2\u00df"+
		"\u00e0\5\24\13\2\u00e0\u00e1\b\n\1\2\u00e1\u00ef\3\2\2\2\u00e2\u00e3\7"+
		"\r\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5\79\2\2\u00e5\u00e6\5\4\3\2\u00e6"+
		"\u00e7\7:\2\2\u00e7\u00e8\5\24\13\2\u00e8\u00e9\7\16\2\2\u00e9\u00ea\7"+
		"9\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ec\7:\2\2\u00ec\u00ed\b\n\1\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00c8\3\2\2\2\u00ee\u00cf\3\2\2\2\u00ee\u00da\3\2"+
		"\2\2\u00ee\u00e2\3\2\2\2\u00ef\23\3\2\2\2\u00f0\u00f1\b\13\1\2\u00f1\u00f2"+
		"\7\16\2\2\u00f2\u00f3\7\r\2\2\u00f3\u00f4\5\34\17\2\u00f4\u00f5\79\2\2"+
		"\u00f5\u00f6\5\4\3\2\u00f6\u00f7\7:\2\2\u00f7\u00f8\b\13\1\2\u00f8\u0104"+
		"\3\2\2\2\u00f9\u00fa\f\4\2\2\u00fa\u00fb\7\16\2\2\u00fb\u00fc\7\r\2\2"+
		"\u00fc\u00fd\5\34\17\2\u00fd\u00fe\79\2\2\u00fe\u00ff\5\4\3\2\u00ff\u0100"+
		"\7:\2\2\u0100\u0101\b\13\1\2\u0101\u0103\3\2\2\2\u0102\u00f9\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\25\3\2\2"+
		"\2\u0106\u0104\3\2\2\2\u0107\u0108\7\17\2\2\u0108\u0109\5\34\17\2\u0109"+
		"\u010a\79\2\2\u010a\u010b\5\30\r\2\u010b\u010c\7\21\2\2\u010c\u010d\7"+
		"=\2\2\u010d\u010e\5\4\3\2\u010e\u010f\7:\2\2\u010f\u0110\b\f\1\2\u0110"+
		"\u0119\3\2\2\2\u0111\u0112\7\17\2\2\u0112\u0113\5\34\17\2\u0113\u0114"+
		"\79\2\2\u0114\u0115\5\30\r\2\u0115\u0116\7:\2\2\u0116\u0117\b\f\1\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0107\3\2\2\2\u0118\u0111\3\2\2\2\u0119\27\3\2\2"+
		"\2\u011a\u011b\b\r\1\2\u011b\u011c\7\20\2\2\u011c\u011d\5\34\17\2\u011d"+
		"\u011e\7=\2\2\u011e\u011f\5\4\3\2\u011f\u0120\b\r\1\2\u0120\u012a\3\2"+
		"\2\2\u0121\u0122\f\4\2\2\u0122\u0123\7\20\2\2\u0123\u0124\5\34\17\2\u0124"+
		"\u0125\7=\2\2\u0125\u0126\5\4\3\2\u0126\u0127\b\r\1\2\u0127\u0129\3\2"+
		"\2\2\u0128\u0121\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\31\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\25\2"+
		"\2\u012e\u012f\5\34\17\2\u012f\u0130\79\2\2\u0130\u0131\5\4\3\2\u0131"+
		"\u0132\7:\2\2\u0132\u0133\b\16\1\2\u0133\33\3\2\2\2\u0134\u0135\b\17\1"+
		"\2\u0135\u0136\7*\2\2\u0136\u0137\5\34\17\n\u0137\u0138\b\17\1\2\u0138"+
		"\u0156\3\2\2\2\u0139\u013a\7\66\2\2\u013a\u013b\5\34\17\t\u013b\u013c"+
		"\b\17\1\2\u013c\u0156\3\2\2\2\u013d\u013e\7\67\2\2\u013e\u013f\5\34\17"+
		"\2\u013f\u0140\78\2\2\u0140\u0141\b\17\1\2\u0141\u0156\3\2\2\2\u0142\u0143"+
		"\5\36\20\2\u0143\u0144\b\17\1\2\u0144\u0156\3\2\2\2\u0145\u0146\5\"\22"+
		"\2\u0146\u0147\b\17\1\2\u0147\u0156\3\2\2\2\u0148\u0149\7;\2\2\u0149\u014a"+
		"\5 \21\2\u014a\u014b\7<\2\2\u014b\u014c\b\17\1\2\u014c\u0156\3\2\2\2\u014d"+
		"\u014e\7\'\2\2\u014e\u014f\7>\2\2\u014f\u0150\7\35\2\2\u0150\u0156\b\17"+
		"\1\2\u0151\u0152\7\'\2\2\u0152\u0153\7>\2\2\u0153\u0154\7\34\2\2\u0154"+
		"\u0156\b\17\1\2\u0155\u0134\3\2\2\2\u0155\u0139\3\2\2\2\u0155\u013d\3"+
		"\2\2\2\u0155\u0142\3\2\2\2\u0155\u0145\3\2\2\2\u0155\u0148\3\2\2\2\u0155"+
		"\u014d\3\2\2\2\u0155\u0151\3\2\2\2\u0156\u017c\3\2\2\2\u0157\u0158\f\21"+
		"\2\2\u0158\u0159\t\2\2\2\u0159\u015a\5\34\17\22\u015a\u015b\b\17\1\2\u015b"+
		"\u017b\3\2\2\2\u015c\u015d\f\20\2\2\u015d\u015e\t\3\2\2\u015e\u015f\5"+
		"\34\17\21\u015f\u0160\b\17\1\2\u0160\u017b\3\2\2\2\u0161\u0162\f\17\2"+
		"\2\u0162\u0163\t\4\2\2\u0163\u0164\5\34\17\20\u0164\u0165\b\17\1\2\u0165"+
		"\u017b\3\2\2\2\u0166\u0167\f\16\2\2\u0167\u0168\t\5\2\2\u0168\u0169\5"+
		"\34\17\17\u0169\u016a\b\17\1\2\u016a\u017b\3\2\2\2\u016b\u016c\f\r\2\2"+
		"\u016c\u016d\t\6\2\2\u016d\u016e\5\34\17\16\u016e\u016f\b\17\1\2\u016f"+
		"\u017b\3\2\2\2\u0170\u0171\f\f\2\2\u0171\u0172\7,\2\2\u0172\u0173\5\34"+
		"\17\r\u0173\u0174\b\17\1\2\u0174\u017b\3\2\2\2\u0175\u0176\f\13\2\2\u0176"+
		"\u0177\7+\2\2\u0177\u0178\5\34\17\f\u0178\u0179\b\17\1\2\u0179\u017b\3"+
		"\2\2\2\u017a\u0157\3\2\2\2\u017a\u015c\3\2\2\2\u017a\u0161\3\2\2\2\u017a"+
		"\u0166\3\2\2\2\u017a\u016b\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0175\3\2"+
		"\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\35\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7$\2\2\u0180\u018c\b\20\1"+
		"\2\u0181\u0182\7%\2\2\u0182\u018c\b\20\1\2\u0183\u0184\7&\2\2\u0184\u018c"+
		"\b\20\1\2\u0185\u0186\7\'\2\2\u0186\u018c\b\20\1\2\u0187\u0188\7\n\2\2"+
		"\u0188\u018c\b\20\1\2\u0189\u018a\7\13\2\2\u018a\u018c\b\20\1\2\u018b"+
		"\u017f\3\2\2\2\u018b\u0181\3\2\2\2\u018b\u0183\3\2\2\2\u018b\u0185\3\2"+
		"\2\2\u018b\u0187\3\2\2\2\u018b\u0189\3\2\2\2\u018c\37\3\2\2\2\u018d\u018e"+
		"\b\21\1\2\u018e\u018f\5\34\17\2\u018f\u0190\b\21\1\2\u0190\u0198\3\2\2"+
		"\2\u0191\u0192\f\4\2\2\u0192\u0193\7?\2\2\u0193\u0194\5\34\17\2\u0194"+
		"\u0195\b\21\1\2\u0195\u0197\3\2\2\2\u0196\u0191\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199!\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019b\u019c\b\22\1\2\u019c\u019d\7\'\2\2\u019d\u019e\b\22\1\2"+
		"\u019e\u01a7\3\2\2\2\u019f\u01a0\f\4\2\2\u01a0\u01a1\7;\2\2\u01a1\u01a2"+
		"\5\34\17\2\u01a2\u01a3\7<\2\2\u01a3\u01a4\b\22\1\2\u01a4\u01a6\3\2\2\2"+
		"\u01a5\u019f\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8#\3\2\2\2\u01a9\u01a7\3\2\2\2\22+A\u008a\u009b\u00ac\u00c6"+
		"\u00ee\u0104\u0118\u012a\u0155\u017a\u017c\u018b\u0198\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}