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
		FLECHA=63, AMP=64, PCOMA=65, WHITESPACE=66, COMMENT=67, LINE_COMMENT=68;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_funcstmt = 3, RULE_funcallstmt = 4, 
		RULE_printstmt = 5, RULE_variablestmt = 6, RULE_typestmt = 7, RULE_type2stmt = 8, 
		RULE_funvecstmt = 9, RULE_ifstmt = 10, RULE_elifs = 11, RULE_switchstmt = 12, 
		RULE_cases = 13, RULE_whilestmt = 14, RULE_expr = 15, RULE_primitives = 16, 
		RULE_listParams = 17, RULE_listArray = 18, RULE_listAceso = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "funcstmt", "funcallstmt", "printstmt", 
			"variablestmt", "typestmt", "type2stmt", "funvecstmt", "ifstmt", "elifs", 
			"switchstmt", "cases", "whilestmt", "expr", "primitives", "listParams", 
			"listArray", "listAceso"
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
			"'->'", "'&'", "';'"
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
			"DOSP", "PUNTO", "COMA", "INTCE", "FLECHA", "AMP", "PCOMA", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
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
			setState(40);
			((SContext)_localctx).block = block();
			setState(41);
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
			setState(45); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(44);
					((BlockContext)_localctx).instruction = instruction();
					((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(47); 
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
		public Token BREAK;
		public Token CONTINUE;
		public Token RETURN;
		public ExprContext expr;
		public FuncstmtContext funcstmt;
		public FuncallstmtContext funcallstmt;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(SwiftGrammarParser.PCOMA, 0); }
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
		public TerminalNode BREAK() { return getToken(SwiftGrammarParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SwiftGrammarParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(SwiftGrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncstmtContext funcstmt() {
			return getRuleContext(FuncstmtContext.class,0);
		}
		public FuncallstmtContext funcallstmt() {
			return getRuleContext(FuncallstmtContext.class,0);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(52);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((InstructionContext)_localctx).variablestmt = variablestmt();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(58);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = ((InstructionContext)_localctx).variablestmt.vari
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				((InstructionContext)_localctx).switchstmt = switchstmt();
				 _localctx.inst = ((InstructionContext)_localctx).switchstmt.swinst 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whileinst 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				((InstructionContext)_localctx).funvecstmt = funvecstmt();
				 _localctx.inst = ((InstructionContext)_localctx).funvecstmt.fvecisnt 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				((InstructionContext)_localctx).BREAK = match(BREAK);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(76);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = instructions.NewBreak((((InstructionContext)_localctx).BREAK!=null?((InstructionContext)_localctx).BREAK.getLine():0), (((InstructionContext)_localctx).BREAK!=null?((InstructionContext)_localctx).BREAK.getCharPositionInLine():0)) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				((InstructionContext)_localctx).CONTINUE = match(CONTINUE);
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(81);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = instructions.NewContinue((((InstructionContext)_localctx).CONTINUE!=null?((InstructionContext)_localctx).CONTINUE.getLine():0), (((InstructionContext)_localctx).CONTINUE!=null?((InstructionContext)_localctx).CONTINUE.getCharPositionInLine():0)) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				((InstructionContext)_localctx).RETURN = match(RETURN);
				setState(86);
				((InstructionContext)_localctx).expr = expr(0);
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(87);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = instructions.NewContinue((((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getLine():0), (((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getCharPositionInLine():0), ((InstructionContext)_localctx).expr.e) 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				((InstructionContext)_localctx).funcstmt = funcstmt();
				 _localctx.inst = ((InstructionContext)_localctx).funcstmt.fun 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				((InstructionContext)_localctx).funcallstmt = funcallstmt();
				 _localctx.inst = ((InstructionContext)_localctx).funcallstmt.cfun 
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

	public static class FuncstmtContext extends ParserRuleContext {
		public interfaces.Instruction fun;
		public Token FUNC;
		public Token ID;
		public BlockContext block;
		public TerminalNode FUNC() { return getToken(SwiftGrammarParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public FuncstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcstmt; }
	}

	public final FuncstmtContext funcstmt() throws RecognitionException {
		FuncstmtContext _localctx = new FuncstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((FuncstmtContext)_localctx).FUNC = match(FUNC);
			setState(101);
			((FuncstmtContext)_localctx).ID = match(ID);
			setState(102);
			match(PARIZQ);
			setState(103);
			match(PARDER);
			setState(104);
			match(LLAVEIZQ);
			setState(105);
			((FuncstmtContext)_localctx).block = block();
			setState(106);
			match(LLAVEDER);
			 _localctx.fun = instructions.NweDeclarationFunc((((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getLine():0), (((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getCharPositionInLine():0), (((FuncstmtContext)_localctx).ID!=null?((FuncstmtContext)_localctx).ID.getText():null), environment.NULL, ((FuncstmtContext)_localctx).block.blk) 
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

	public static class FuncallstmtContext extends ParserRuleContext {
		public interfaces.Instruction cfun;
		public Token ID;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public FuncallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcallstmt; }
	}

	public final FuncallstmtContext funcallstmt() throws RecognitionException {
		FuncallstmtContext _localctx = new FuncallstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcallstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((FuncallstmtContext)_localctx).ID = match(ID);
			setState(110);
			match(PARIZQ);
			setState(111);
			match(PARDER);
			 _localctx.cfun = instructions.NewFunCall((((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getLine():0), (((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getCharPositionInLine():0), (((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getText():null)) 
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
		enterRule(_localctx, 10, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(115);
			match(PARIZQ);
			setState(116);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(117);
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
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public VariablestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablestmt; }
	}

	public final VariablestmtContext variablestmt() throws RecognitionException {
		VariablestmtContext _localctx = new VariablestmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variablestmt);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(121);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(122);
				match(DOSP);
				setState(123);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(124);
				match(IG);
				setState(125);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(129);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(130);
				match(IG);
				setState(131);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(135);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(136);
				match(DOSP);
				setState(137);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(138);
				match(INTCE);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, expressions.NewPrimitive((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), nil, environment.NULL), true) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(142);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(143);
				match(IG);
				setState(144);
				((VariablestmtContext)_localctx).primitives = primitives();
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).primitives.p, false) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(148);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(149);
				match(DOSP);
				setState(150);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(151);
				match(IG);
				setState(152);
				((VariablestmtContext)_localctx).primitives = primitives();
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).primitives.p, false) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(156);
				match(IG);
				setState(157);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(161);
				match(CORIZQ);
				setState(162);
				((VariablestmtContext)_localctx).e1 = expr(0);
				setState(163);
				match(CORDER);
				setState(164);
				match(IG);
				setState(165);
				((VariablestmtContext)_localctx).e2 = expr(0);
				 _localctx.vari = instructions.NewAssigmentVec((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).e1.e, ((VariablestmtContext)_localctx).e2.e) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(169);
				((VariablestmtContext)_localctx).e1 = expr(0);
				setState(170);
				match(IG);
				setState(171);
				((VariablestmtContext)_localctx).e2 = expr(0);
				 _localctx.vari = instructions.NewAssigmentMa((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).e1.e, ((VariablestmtContext)_localctx).e2.e) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(175);
				match(ADD);
				setState(176);
				match(IG);
				setState(177);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewSumAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(181);
				match(SUB);
				setState(182);
				match(IG);
				setState(183);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewResAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(186);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(187);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(188);
				match(DOSP);
				setState(189);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(190);
				match(IG);
				setState(191);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(194);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(195);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(196);
				match(DOSP);
				setState(197);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(198);
				match(IG);
				setState(199);
				((VariablestmtContext)_localctx).CORIZQ = match(CORIZQ);
				setState(200);
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
		enterRule(_localctx, 14, RULE_typestmt);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(INT);
				 _localctx.type = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FLOAT);
				 _localctx.type = environment.FLOAT 
				}
				break;
			case TSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(TSTRING);
				 _localctx.type = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(BOOL);
				 _localctx.type = environment.BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(CHAR);
				 _localctx.type = environment.CHAR 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(CORIZQ);
				setState(216);
				((TypestmtContext)_localctx).type2stmt = type2stmt();
				setState(217);
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
		enterRule(_localctx, 16, RULE_type2stmt);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(INT);
				 _localctx.type2 = environment.A_INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(FLOAT);
				 _localctx.type2 = environment.A_FLOAT 
				}
				break;
			case TSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(TSTRING);
				 _localctx.type2 = environment.A_STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(BOOL);
				 _localctx.type2 = environment.A_BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(CHAR);
				 _localctx.type2 = environment.A_CHAR 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(CORIZQ);
				setState(233);
				((Type2stmtContext)_localctx).type2stmt = type2stmt();
				setState(234);
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
		enterRule(_localctx, 18, RULE_funvecstmt);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(240);
				match(PUNTO);
				setState(241);
				match(APPEND);
				setState(242);
				match(PARIZQ);
				setState(243);
				((FunvecstmtContext)_localctx).expr = expr(0);
				setState(244);
				match(PARDER);
				 _localctx.fvecisnt = instructions.NewAppend((((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getText():null) , ((FunvecstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(248);
				match(PUNTO);
				setState(249);
				match(REMOVELAST);
				setState(250);
				match(PARIZQ);
				setState(251);
				match(PARDER);
				 _localctx.fvecisnt = instructions.NewRemoveLast((((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getText():null)) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(254);
				match(PUNTO);
				setState(255);
				match(REMOVE);
				setState(256);
				match(PARIZQ);
				setState(257);
				match(AT);
				setState(258);
				match(DOSP);
				setState(259);
				((FunvecstmtContext)_localctx).expr = expr(0);
				setState(260);
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
		enterRule(_localctx, 20, RULE_ifstmt);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(266);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(267);
				match(LLAVEIZQ);
				setState(268);
				((IfstmtContext)_localctx).block = block();
				setState(269);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil,nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(273);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(274);
				match(LLAVEIZQ);
				setState(275);
				((IfstmtContext)_localctx).bif = block();
				setState(276);
				match(LLAVEDER);
				setState(277);
				match(ELSE);
				setState(278);
				match(LLAVEIZQ);
				setState(279);
				((IfstmtContext)_localctx).belse = block();
				setState(280);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).bif.blk, ((IfstmtContext)_localctx).belse.blk,nil) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(284);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(285);
				match(LLAVEIZQ);
				setState(286);
				((IfstmtContext)_localctx).bif = block();
				setState(287);
				match(LLAVEDER);
				setState(288);
				((IfstmtContext)_localctx).elifs = elifs(0);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).bif.blk, nil, ((IfstmtContext)_localctx).elifs.elifinst) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(292);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(293);
				match(LLAVEIZQ);
				setState(294);
				((IfstmtContext)_localctx).bif = block();
				setState(295);
				match(LLAVEDER);
				setState(296);
				((IfstmtContext)_localctx).elifs = elifs(0);
				setState(297);
				match(ELSE);
				setState(298);
				match(LLAVEIZQ);
				setState(299);
				((IfstmtContext)_localctx).belse = block();
				setState(300);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).bif.blk, ((IfstmtContext)_localctx).belse.blk, ((IfstmtContext)_localctx).elifs.elifinst) 
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_elifs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(306);
			((ElifsContext)_localctx).ELSE = match(ELSE);
			setState(307);
			match(IF);
			setState(308);
			((ElifsContext)_localctx).expr = expr(0);
			setState(309);
			match(LLAVEIZQ);
			setState(310);
			((ElifsContext)_localctx).block = block();
			setState(311);
			match(LLAVEDER);

			    _localctx.elifinst = []interface{}{}
			    _localctx.elifinst = append(_localctx.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
					setState(314);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(315);
					((ElifsContext)_localctx).ELSE = match(ELSE);
					setState(316);
					match(IF);
					setState(317);
					((ElifsContext)_localctx).expr = expr(0);
					setState(318);
					match(LLAVEIZQ);
					setState(319);
					((ElifsContext)_localctx).block = block();
					setState(320);
					match(LLAVEDER);

					              var arrif []interface{}
					              arrif = append(((ElifsContext)_localctx).celif.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
					              _localctx.elifinst = arrif
					          
					}
					} 
				}
				setState(327);
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
		enterRule(_localctx, 24, RULE_switchstmt);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(329);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(330);
				match(LLAVEIZQ);
				setState(331);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(332);
				match(DEFAULT);
				setState(333);
				match(DOSP);
				setState(334);
				((SwitchstmtContext)_localctx).block = block();
				setState(335);
				match(LLAVEDER);
				 _localctx.swinst = instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, ((SwitchstmtContext)_localctx).cases.casesinst, ((SwitchstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(339);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(340);
				match(LLAVEIZQ);
				setState(341);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(342);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_cases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			((CasesContext)_localctx).CASE = match(CASE);
			setState(349);
			((CasesContext)_localctx).expr = expr(0);
			setState(350);
			match(DOSP);
			setState(351);
			((CasesContext)_localctx).block = block();

			    _localctx.casesinst = []interface{}{}
			    _localctx.casesinst = append(_localctx.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					setState(354);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(355);
					((CasesContext)_localctx).CASE = match(CASE);
					setState(356);
					((CasesContext)_localctx).expr = expr(0);
					setState(357);
					match(DOSP);
					setState(358);
					((CasesContext)_localctx).block = block();

					              var arrcase []interface{}
					              arrcase = append(((CasesContext)_localctx).ccases.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
					              _localctx.casesinst = arrcase
					          
					}
					} 
				}
				setState(365);
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
		enterRule(_localctx, 28, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(367);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(368);
			match(LLAVEIZQ);
			setState(369);
			((WhilestmtContext)_localctx).block = block();
			setState(370);
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
		public Token ID;
		public PrimitivesContext primitives;
		public Token INT;
		public Token FLOAT;
		public Token TSTRING;
		public ListArrayContext listArray;
		public Token CORIZQ;
		public ListParamsContext listParams;
		public ListAcesoContext listAceso;
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
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode TSTRING() { return getToken(SwiftGrammarParser.TSTRING, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode COUNT() { return getToken(SwiftGrammarParser.COUNT, 0); }
		public TerminalNode ISEMPTY() { return getToken(SwiftGrammarParser.ISEMPTY, 0); }
		public ListAcesoContext listAceso() {
			return getRuleContext(ListAcesoContext.class,0);
		}
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(374);
				((ExprContext)_localctx).op = match(NOT);
				setState(375);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(13);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 2:
				{
				setState(378);
				((ExprContext)_localctx).op = match(SUB);
				setState(379);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(12);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 3:
				{
				setState(382);
				match(PARIZQ);
				setState(383);
				((ExprContext)_localctx).expr = expr(0);
				setState(384);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(387);
				((ExprContext)_localctx).ID = match(ID);
				 _localctx.e = expressions.NewCallVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))
				}
				break;
			case 5:
				{
				setState(389);
				((ExprContext)_localctx).primitives = primitives();
				 _localctx.e = ((ExprContext)_localctx).primitives.p
				}
				break;
			case 6:
				{
				setState(392);
				((ExprContext)_localctx).INT = match(INT);
				setState(393);
				match(PARIZQ);
				setState(394);
				((ExprContext)_localctx).primitives = primitives();
				setState(395);
				match(PARDER);
				 _localctx.e = expressions.NewCastingInt((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getLine():0), (((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getCharPositionInLine():0), ((ExprContext)_localctx).primitives.p ) 
				}
				break;
			case 7:
				{
				setState(398);
				((ExprContext)_localctx).FLOAT = match(FLOAT);
				setState(399);
				match(PARIZQ);
				setState(400);
				((ExprContext)_localctx).primitives = primitives();
				setState(401);
				match(PARDER);
				 _localctx.e = expressions.NewCastingFloat((((ExprContext)_localctx).FLOAT!=null?((ExprContext)_localctx).FLOAT.getLine():0), (((ExprContext)_localctx).FLOAT!=null?((ExprContext)_localctx).FLOAT.getCharPositionInLine():0), ((ExprContext)_localctx).primitives.p ) 
				}
				break;
			case 8:
				{
				setState(404);
				((ExprContext)_localctx).TSTRING = match(TSTRING);
				setState(405);
				match(PARIZQ);
				setState(406);
				((ExprContext)_localctx).primitives = primitives();
				setState(407);
				match(PARDER);
				 _localctx.e = expressions.NewCastingString((((ExprContext)_localctx).TSTRING!=null?((ExprContext)_localctx).TSTRING.getLine():0), (((ExprContext)_localctx).TSTRING!=null?((ExprContext)_localctx).TSTRING.getCharPositionInLine():0), ((ExprContext)_localctx).primitives.p ) 
				}
				break;
			case 9:
				{
				setState(410);
				((ExprContext)_localctx).listArray = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).listArray.p
				}
				break;
			case 10:
				{
				setState(413);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(414);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(415);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 11:
				{
				setState(418);
				((ExprContext)_localctx).ID = match(ID);
				setState(419);
				match(PUNTO);
				setState(420);
				match(COUNT);
				 _localctx.e = expressions.NewCount((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 12:
				{
				setState(422);
				((ExprContext)_localctx).ID = match(ID);
				setState(423);
				match(PUNTO);
				setState(424);
				match(ISEMPTY);
				 _localctx.e = expressions.NewIsEmpty((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 13:
				{
				setState(426);
				((ExprContext)_localctx).listAceso = listAceso(0);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listAceso.l) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(431);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(432);
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
						setState(433);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(21);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(436);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(437);
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
						setState(438);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(441);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(442);
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
						setState(443);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(19);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(446);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(447);
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
						setState(448);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(451);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(452);
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
						setState(453);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(456);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(457);
						((ExprContext)_localctx).op = match(AND);
						setState(458);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(461);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(462);
						((ExprContext)_localctx).op = match(OR);
						setState(463);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public Token TRU;
		public Token FAL;
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode CHARACTER() { return getToken(SwiftGrammarParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public PrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitives; }
	}

	public final PrimitivesContext primitives() throws RecognitionException {
		PrimitivesContext _localctx = new PrimitivesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primitives);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
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
				setState(473);
				((PrimitivesContext)_localctx).CHARACTER = match(CHARACTER);

				        str := (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getLine():0), (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1],environment.CHAR)
				    
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				((PrimitivesContext)_localctx).STRING = match(STRING);

				        str := (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getLine():0), (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case TRU:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				((PrimitivesContext)_localctx).TRU = match(TRU);
				 _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getLine():0), (((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(484);
			((ListParamsContext)_localctx).expr = expr(0);

			    _localctx.l = []interface{}{}
			    _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)

			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
					setState(487);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(488);
					match(COMA);
					setState(489);
					((ListParamsContext)_localctx).expr = expr(0);

					              var arr []interface{}
					              arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					              _localctx.l = arr
					          
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(498);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
					setState(501);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(502);
					match(CORIZQ);
					setState(503);
					((ListArrayContext)_localctx).expr = expr(0);
					setState(504);
					match(CORDER);
					 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ListAcesoContext extends ParserRuleContext {
		public []interface{} l;
		public ListAcesoContext list;
		public ExprContext expr;
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListAcesoContext listAceso() {
			return getRuleContext(ListAcesoContext.class,0);
		}
		public ListAcesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAceso; }
	}

	public final ListAcesoContext listAceso() throws RecognitionException {
		return listAceso(0);
	}

	private ListAcesoContext listAceso(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListAcesoContext _localctx = new ListAcesoContext(_ctx, _parentState);
		ListAcesoContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_listAceso, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(513);
			match(CORIZQ);
			setState(514);
			((ListAcesoContext)_localctx).expr = expr(0);
			setState(515);
			match(CORDER);

			    _localctx.l = []interface{}{}
			    _localctx.l = append(_localctx.l, ((ListAcesoContext)_localctx).expr.e)

			}
			_ctx.stop = _input.LT(-1);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListAcesoContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listAceso);
					setState(518);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(519);
					match(CORIZQ);
					setState(520);
					((ListAcesoContext)_localctx).expr = expr(0);
					setState(521);
					match(CORDER);

					              var arr []interface{}
					              arr = append(((ListAcesoContext)_localctx).list.l, ((ListAcesoContext)_localctx).expr.e)
					              _localctx.l = arr
					          
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		case 11:
			return elifs_sempred((ElifsContext)_localctx, predIndex);
		case 13:
			return cases_sempred((CasesContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 17:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 18:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 19:
			return listAceso_sempred((ListAcesoContext)_localctx, predIndex);
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
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
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
	private boolean listAceso_sempred(ListAcesoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0214\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\6\3\60\n\3\r\3\16\3"+
		"\61\3\3\3\3\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\3\4\3\4"+
		"\5\4U\n\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00ce\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00df\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00f0\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u010a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0132\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0146\n\r\f\r\16\r\u0149"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u015c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u016c\n\17\f\17\16\17\u016f\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01b0\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u01d5\n\21\f\21\16\21\u01d8\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01e4\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01ef\n\23\f\23\16\23\u01f2\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01fe\n\24\f\24"+
		"\16\24\u0201\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u020f\n\25\f\25\16\25\u0212\13\25\3\25\2\b\30\34 $&(\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\2\62\64\3\2\65\66"+
		"\4\2..\60\60\4\2//\61\61\3\2()\2\u0246\2*\3\2\2\2\4/\3\2\2\2\6d\3\2\2"+
		"\2\bf\3\2\2\2\no\3\2\2\2\ft\3\2\2\2\16\u00cd\3\2\2\2\20\u00de\3\2\2\2"+
		"\22\u00ef\3\2\2\2\24\u0109\3\2\2\2\26\u0131\3\2\2\2\30\u0133\3\2\2\2\32"+
		"\u015b\3\2\2\2\34\u015d\3\2\2\2\36\u0170\3\2\2\2 \u01af\3\2\2\2\"\u01e3"+
		"\3\2\2\2$\u01e5\3\2\2\2&\u01f3\3\2\2\2(\u0202\3\2\2\2*+\5\4\3\2+,\7\2"+
		"\2\3,-\b\2\1\2-\3\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2"+
		"\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\b\3\1\2\64\5\3\2\2\2\65\67\5\f"+
		"\7\2\668\7C\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\4\1\2:e\3\2\2"+
		"\2;=\5\16\b\2<>\7C\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\4\1\2@e\3\2\2"+
		"\2AB\5\26\f\2BC\b\4\1\2Ce\3\2\2\2DE\5\32\16\2EF\b\4\1\2Fe\3\2\2\2GH\5"+
		"\36\20\2HI\b\4\1\2Ie\3\2\2\2JK\5\24\13\2KL\b\4\1\2Le\3\2\2\2MO\7\22\2"+
		"\2NP\7C\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2Qe\b\4\1\2RT\7\23\2\2SU\7C\2"+
		"\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2Ve\b\4\1\2WX\7\24\2\2XZ\5 \21\2Y[\7C\2"+
		"\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\4\1\2]e\3\2\2\2^_\5\b\5\2_`\b\4"+
		"\1\2`e\3\2\2\2ab\5\n\6\2bc\b\4\1\2ce\3\2\2\2d\65\3\2\2\2d;\3\2\2\2dA\3"+
		"\2\2\2dD\3\2\2\2dG\3\2\2\2dJ\3\2\2\2dM\3\2\2\2dR\3\2\2\2dW\3\2\2\2d^\3"+
		"\2\2\2da\3\2\2\2e\7\3\2\2\2fg\7\"\2\2gh\7\'\2\2hi\7\67\2\2ij\78\2\2jk"+
		"\79\2\2kl\5\4\3\2lm\7:\2\2mn\b\5\1\2n\t\3\2\2\2op\7\'\2\2pq\7\67\2\2q"+
		"r\78\2\2rs\b\6\1\2s\13\3\2\2\2tu\7\f\2\2uv\7\67\2\2vw\5 \21\2wx\78\2\2"+
		"xy\b\7\1\2y\r\3\2\2\2z{\7\b\2\2{|\7\'\2\2|}\7=\2\2}~\5\20\t\2~\177\7-"+
		"\2\2\177\u0080\5 \21\2\u0080\u0081\b\b\1\2\u0081\u00ce\3\2\2\2\u0082\u0083"+
		"\7\b\2\2\u0083\u0084\7\'\2\2\u0084\u0085\7-\2\2\u0085\u0086\5 \21\2\u0086"+
		"\u0087\b\b\1\2\u0087\u00ce\3\2\2\2\u0088\u0089\7\b\2\2\u0089\u008a\7\'"+
		"\2\2\u008a\u008b\7=\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7@\2\2\u008d"+
		"\u008e\b\b\1\2\u008e\u00ce\3\2\2\2\u008f\u0090\7\t\2\2\u0090\u0091\7\'"+
		"\2\2\u0091\u0092\7-\2\2\u0092\u0093\5\"\22\2\u0093\u0094\b\b\1\2\u0094"+
		"\u00ce\3\2\2\2\u0095\u0096\7\t\2\2\u0096\u0097\7\'\2\2\u0097\u0098\7="+
		"\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7-\2\2\u009a\u009b\5\"\22\2\u009b"+
		"\u009c\b\b\1\2\u009c\u00ce\3\2\2\2\u009d\u009e\7\'\2\2\u009e\u009f\7-"+
		"\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\b\b\1\2\u00a1\u00ce\3\2\2\2\u00a2"+
		"\u00a3\7\'\2\2\u00a3\u00a4\7;\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\7<\2"+
		"\2\u00a6\u00a7\7-\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\b\b\1\2\u00a9\u00ce"+
		"\3\2\2\2\u00aa\u00ab\7\'\2\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\7-\2\2\u00ad"+
		"\u00ae\5 \21\2\u00ae\u00af\b\b\1\2\u00af\u00ce\3\2\2\2\u00b0\u00b1\7\'"+
		"\2\2\u00b1\u00b2\7\65\2\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\5 \21\2\u00b4"+
		"\u00b5\b\b\1\2\u00b5\u00ce\3\2\2\2\u00b6\u00b7\7\'\2\2\u00b7\u00b8\7\66"+
		"\2\2\u00b8\u00b9\7-\2\2\u00b9\u00ba\5 \21\2\u00ba\u00bb\b\b\1\2\u00bb"+
		"\u00ce\3\2\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\7\'\2\2\u00be\u00bf\7="+
		"\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\7-\2\2\u00c1\u00c2\5 \21\2\u00c2"+
		"\u00c3\b\b\1\2\u00c3\u00ce\3\2\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6\7\'"+
		"\2\2\u00c6\u00c7\7=\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00c9\7-\2\2\u00c9"+
		"\u00ca\7;\2\2\u00ca\u00cb\7<\2\2\u00cb\u00cc\b\b\1\2\u00cc\u00ce\3\2\2"+
		"\2\u00cdz\3\2\2\2\u00cd\u0082\3\2\2\2\u00cd\u0088\3\2\2\2\u00cd\u008f"+
		"\3\2\2\2\u00cd\u0095\3\2\2\2\u00cd\u009d\3\2\2\2\u00cd\u00a2\3\2\2\2\u00cd"+
		"\u00aa\3\2\2\2\u00cd\u00b0\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd\u00bc\3\2"+
		"\2\2\u00cd\u00c4\3\2\2\2\u00ce\17\3\2\2\2\u00cf\u00d0\7\3\2\2\u00d0\u00df"+
		"\b\t\1\2\u00d1\u00d2\7\4\2\2\u00d2\u00df\b\t\1\2\u00d3\u00d4\7\5\2\2\u00d4"+
		"\u00df\b\t\1\2\u00d5\u00d6\7\6\2\2\u00d6\u00df\b\t\1\2\u00d7\u00d8\7\7"+
		"\2\2\u00d8\u00df\b\t\1\2\u00d9\u00da\7;\2\2\u00da\u00db\5\22\n\2\u00db"+
		"\u00dc\7<\2\2\u00dc\u00dd\b\t\1\2\u00dd\u00df\3\2\2\2\u00de\u00cf\3\2"+
		"\2\2\u00de\u00d1\3\2\2\2\u00de\u00d3\3\2\2\2\u00de\u00d5\3\2\2\2\u00de"+
		"\u00d7\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\21\3\2\2\2\u00e0\u00e1\7\3\2"+
		"\2\u00e1\u00f0\b\n\1\2\u00e2\u00e3\7\4\2\2\u00e3\u00f0\b\n\1\2\u00e4\u00e5"+
		"\7\5\2\2\u00e5\u00f0\b\n\1\2\u00e6\u00e7\7\6\2\2\u00e7\u00f0\b\n\1\2\u00e8"+
		"\u00e9\7\7\2\2\u00e9\u00f0\b\n\1\2\u00ea\u00eb\7;\2\2\u00eb\u00ec\5\22"+
		"\n\2\u00ec\u00ed\7<\2\2\u00ed\u00ee\b\n\1\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e0\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e6\3\2"+
		"\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\23\3\2\2\2\u00f1\u00f2"+
		"\7\'\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f4\7\31\2\2\u00f4\u00f5\7\67\2\2"+
		"\u00f5\u00f6\5 \21\2\u00f6\u00f7\78\2\2\u00f7\u00f8\b\13\1\2\u00f8\u010a"+
		"\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7\32\2\2\u00fc"+
		"\u00fd\7\67\2\2\u00fd\u00fe\78\2\2\u00fe\u010a\b\13\1\2\u00ff\u0100\7"+
		"\'\2\2\u0100\u0101\7>\2\2\u0101\u0102\7\33\2\2\u0102\u0103\7\67\2\2\u0103"+
		"\u0104\7#\2\2\u0104\u0105\7=\2\2\u0105\u0106\5 \21\2\u0106\u0107\78\2"+
		"\2\u0107\u0108\b\13\1\2\u0108\u010a\3\2\2\2\u0109\u00f1\3\2\2\2\u0109"+
		"\u00f9\3\2\2\2\u0109\u00ff\3\2\2\2\u010a\25\3\2\2\2\u010b\u010c\7\r\2"+
		"\2\u010c\u010d\5 \21\2\u010d\u010e\79\2\2\u010e\u010f\5\4\3\2\u010f\u0110"+
		"\7:\2\2\u0110\u0111\b\f\1\2\u0111\u0132\3\2\2\2\u0112\u0113\7\r\2\2\u0113"+
		"\u0114\5 \21\2\u0114\u0115\79\2\2\u0115\u0116\5\4\3\2\u0116\u0117\7:\2"+
		"\2\u0117\u0118\7\16\2\2\u0118\u0119\79\2\2\u0119\u011a\5\4\3\2\u011a\u011b"+
		"\7:\2\2\u011b\u011c\b\f\1\2\u011c\u0132\3\2\2\2\u011d\u011e\7\r\2\2\u011e"+
		"\u011f\5 \21\2\u011f\u0120\79\2\2\u0120\u0121\5\4\3\2\u0121\u0122\7:\2"+
		"\2\u0122\u0123\5\30\r\2\u0123\u0124\b\f\1\2\u0124\u0132\3\2\2\2\u0125"+
		"\u0126\7\r\2\2\u0126\u0127\5 \21\2\u0127\u0128\79\2\2\u0128\u0129\5\4"+
		"\3\2\u0129\u012a\7:\2\2\u012a\u012b\5\30\r\2\u012b\u012c\7\16\2\2\u012c"+
		"\u012d\79\2\2\u012d\u012e\5\4\3\2\u012e\u012f\7:\2\2\u012f\u0130\b\f\1"+
		"\2\u0130\u0132\3\2\2\2\u0131\u010b\3\2\2\2\u0131\u0112\3\2\2\2\u0131\u011d"+
		"\3\2\2\2\u0131\u0125\3\2\2\2\u0132\27\3\2\2\2\u0133\u0134\b\r\1\2\u0134"+
		"\u0135\7\16\2\2\u0135\u0136\7\r\2\2\u0136\u0137\5 \21\2\u0137\u0138\7"+
		"9\2\2\u0138\u0139\5\4\3\2\u0139\u013a\7:\2\2\u013a\u013b\b\r\1\2\u013b"+
		"\u0147\3\2\2\2\u013c\u013d\f\4\2\2\u013d\u013e\7\16\2\2\u013e\u013f\7"+
		"\r\2\2\u013f\u0140\5 \21\2\u0140\u0141\79\2\2\u0141\u0142\5\4\3\2\u0142"+
		"\u0143\7:\2\2\u0143\u0144\b\r\1\2\u0144\u0146\3\2\2\2\u0145\u013c\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\31\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\17\2\2\u014b\u014c\5 \21"+
		"\2\u014c\u014d\79\2\2\u014d\u014e\5\34\17\2\u014e\u014f\7\21\2\2\u014f"+
		"\u0150\7=\2\2\u0150\u0151\5\4\3\2\u0151\u0152\7:\2\2\u0152\u0153\b\16"+
		"\1\2\u0153\u015c\3\2\2\2\u0154\u0155\7\17\2\2\u0155\u0156\5 \21\2\u0156"+
		"\u0157\79\2\2\u0157\u0158\5\34\17\2\u0158\u0159\7:\2\2\u0159\u015a\b\16"+
		"\1\2\u015a\u015c\3\2\2\2\u015b\u014a\3\2\2\2\u015b\u0154\3\2\2\2\u015c"+
		"\33\3\2\2\2\u015d\u015e\b\17\1\2\u015e\u015f\7\20\2\2\u015f\u0160\5 \21"+
		"\2\u0160\u0161\7=\2\2\u0161\u0162\5\4\3\2\u0162\u0163\b\17\1\2\u0163\u016d"+
		"\3\2\2\2\u0164\u0165\f\4\2\2\u0165\u0166\7\20\2\2\u0166\u0167\5 \21\2"+
		"\u0167\u0168\7=\2\2\u0168\u0169\5\4\3\2\u0169\u016a\b\17\1\2\u016a\u016c"+
		"\3\2\2\2\u016b\u0164\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\35\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\25\2"+
		"\2\u0171\u0172\5 \21\2\u0172\u0173\79\2\2\u0173\u0174\5\4\3\2\u0174\u0175"+
		"\7:\2\2\u0175\u0176\b\20\1\2\u0176\37\3\2\2\2\u0177\u0178\b\21\1\2\u0178"+
		"\u0179\7*\2\2\u0179\u017a\5 \21\17\u017a\u017b\b\21\1\2\u017b\u01b0\3"+
		"\2\2\2\u017c\u017d\7\66\2\2\u017d\u017e\5 \21\16\u017e\u017f\b\21\1\2"+
		"\u017f\u01b0\3\2\2\2\u0180\u0181\7\67\2\2\u0181\u0182\5 \21\2\u0182\u0183"+
		"\78\2\2\u0183\u0184\b\21\1\2\u0184\u01b0\3\2\2\2\u0185\u0186\7\'\2\2\u0186"+
		"\u01b0\b\21\1\2\u0187\u0188\5\"\22\2\u0188\u0189\b\21\1\2\u0189\u01b0"+
		"\3\2\2\2\u018a\u018b\7\3\2\2\u018b\u018c\7\67\2\2\u018c\u018d\5\"\22\2"+
		"\u018d\u018e\78\2\2\u018e\u018f\b\21\1\2\u018f\u01b0\3\2\2\2\u0190\u0191"+
		"\7\4\2\2\u0191\u0192\7\67\2\2\u0192\u0193\5\"\22\2\u0193\u0194\78\2\2"+
		"\u0194\u0195\b\21\1\2\u0195\u01b0\3\2\2\2\u0196\u0197\7\5\2\2\u0197\u0198"+
		"\7\67\2\2\u0198\u0199\5\"\22\2\u0199\u019a\78\2\2\u019a\u019b\b\21\1\2"+
		"\u019b\u01b0\3\2\2\2\u019c\u019d\5&\24\2\u019d\u019e\b\21\1\2\u019e\u01b0"+
		"\3\2\2\2\u019f\u01a0\7;\2\2\u01a0\u01a1\5$\23\2\u01a1\u01a2\7<\2\2\u01a2"+
		"\u01a3\b\21\1\2\u01a3\u01b0\3\2\2\2\u01a4\u01a5\7\'\2\2\u01a5\u01a6\7"+
		">\2\2\u01a6\u01a7\7\35\2\2\u01a7\u01b0\b\21\1\2\u01a8\u01a9\7\'\2\2\u01a9"+
		"\u01aa\7>\2\2\u01aa\u01ab\7\34\2\2\u01ab\u01b0\b\21\1\2\u01ac\u01ad\5"+
		"(\25\2\u01ad\u01ae\b\21\1\2\u01ae\u01b0\3\2\2\2\u01af\u0177\3\2\2\2\u01af"+
		"\u017c\3\2\2\2\u01af\u0180\3\2\2\2\u01af\u0185\3\2\2\2\u01af\u0187\3\2"+
		"\2\2\u01af\u018a\3\2\2\2\u01af\u0190\3\2\2\2\u01af\u0196\3\2\2\2\u01af"+
		"\u019c\3\2\2\2\u01af\u019f\3\2\2\2\u01af\u01a4\3\2\2\2\u01af\u01a8\3\2"+
		"\2\2\u01af\u01ac\3\2\2\2\u01b0\u01d6\3\2\2\2\u01b1\u01b2\f\26\2\2\u01b2"+
		"\u01b3\t\2\2\2\u01b3\u01b4\5 \21\27\u01b4\u01b5\b\21\1\2\u01b5\u01d5\3"+
		"\2\2\2\u01b6\u01b7\f\25\2\2\u01b7\u01b8\t\3\2\2\u01b8\u01b9\5 \21\26\u01b9"+
		"\u01ba\b\21\1\2\u01ba\u01d5\3\2\2\2\u01bb\u01bc\f\24\2\2\u01bc\u01bd\t"+
		"\4\2\2\u01bd\u01be\5 \21\25\u01be\u01bf\b\21\1\2\u01bf\u01d5\3\2\2\2\u01c0"+
		"\u01c1\f\23\2\2\u01c1\u01c2\t\5\2\2\u01c2\u01c3\5 \21\24\u01c3\u01c4\b"+
		"\21\1\2\u01c4\u01d5\3\2\2\2\u01c5\u01c6\f\22\2\2\u01c6\u01c7\t\6\2\2\u01c7"+
		"\u01c8\5 \21\23\u01c8\u01c9\b\21\1\2\u01c9\u01d5\3\2\2\2\u01ca\u01cb\f"+
		"\21\2\2\u01cb\u01cc\7,\2\2\u01cc\u01cd\5 \21\22\u01cd\u01ce\b\21\1\2\u01ce"+
		"\u01d5\3\2\2\2\u01cf\u01d0\f\20\2\2\u01d0\u01d1\7+\2\2\u01d1\u01d2\5 "+
		"\21\21\u01d2\u01d3\b\21\1\2\u01d3\u01d5\3\2\2\2\u01d4\u01b1\3\2\2\2\u01d4"+
		"\u01b6\3\2\2\2\u01d4\u01bb\3\2\2\2\u01d4\u01c0\3\2\2\2\u01d4\u01c5\3\2"+
		"\2\2\u01d4\u01ca\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7!\3\2\2\2\u01d8\u01d6\3\2\2\2"+
		"\u01d9\u01da\7$\2\2\u01da\u01e4\b\22\1\2\u01db\u01dc\7%\2\2\u01dc\u01e4"+
		"\b\22\1\2\u01dd\u01de\7&\2\2\u01de\u01e4\b\22\1\2\u01df\u01e0\7\n\2\2"+
		"\u01e0\u01e4\b\22\1\2\u01e1\u01e2\7\13\2\2\u01e2\u01e4\b\22\1\2\u01e3"+
		"\u01d9\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01df\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4#\3\2\2\2\u01e5\u01e6\b\23\1\2\u01e6\u01e7"+
		"\5 \21\2\u01e7\u01e8\b\23\1\2\u01e8\u01f0\3\2\2\2\u01e9\u01ea\f\4\2\2"+
		"\u01ea\u01eb\7?\2\2\u01eb\u01ec\5 \21\2\u01ec\u01ed\b\23\1\2\u01ed\u01ef"+
		"\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1%\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\b\24\1\2"+
		"\u01f4\u01f5\7\'\2\2\u01f5\u01f6\b\24\1\2\u01f6\u01ff\3\2\2\2\u01f7\u01f8"+
		"\f\4\2\2\u01f8\u01f9\7;\2\2\u01f9\u01fa\5 \21\2\u01fa\u01fb\7<\2\2\u01fb"+
		"\u01fc\b\24\1\2\u01fc\u01fe\3\2\2\2\u01fd\u01f7\3\2\2\2\u01fe\u0201\3"+
		"\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\'\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0202\u0203\b\25\1\2\u0203\u0204\7;\2\2\u0204\u0205\5 \21\2\u0205"+
		"\u0206\7<\2\2\u0206\u0207\b\25\1\2\u0207\u0210\3\2\2\2\u0208\u0209\f\4"+
		"\2\2\u0209\u020a\7;\2\2\u020a\u020b\5 \21\2\u020b\u020c\7<\2\2\u020c\u020d"+
		"\b\25\1\2\u020d\u020f\3\2\2\2\u020e\u0208\3\2\2\2\u020f\u0212\3\2\2\2"+
		"\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211)\3\2\2\2\u0212\u0210\3"+
		"\2\2\2\30\61\67=OTZd\u00cd\u00de\u00ef\u0109\u0131\u0147\u015b\u016d\u01af"+
		"\u01d4\u01d6\u01e3\u01f0\u01ff\u0210";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}