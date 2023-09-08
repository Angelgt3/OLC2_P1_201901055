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
		FUNC=32, AT=33, INOUT=34, NUMBER=35, CHARACTER=36, STRING=37, ID=38, DIF=39, 
		IG_IG=40, NOT=41, OR=42, AND=43, IG=44, MAY_IG=45, MEN_IG=46, MAYOR=47, 
		MENOR=48, MOD=49, MUL=50, DIV=51, ADD=52, SUB=53, PARIZQ=54, PARDER=55, 
		LLAVEIZQ=56, LLAVEDER=57, CORIZQ=58, CORDER=59, DOSP=60, PUNTO=61, COMA=62, 
		INTCE=63, FLECHA=64, AMP=65, PCOMA=66, GBAJO=67, TRESP=68, WHITESPACE=69, 
		COMMENT=70, LINE_COMMENT=71;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_structCreation = 3, 
		RULE_listStructDec = 4, RULE_funcstmt = 5, RULE_listParamsFunc = 6, RULE_funcallstmt = 7, 
		RULE_funcallestmt = 8, RULE_printstmt = 9, RULE_variablestmt = 10, RULE_typestmt = 11, 
		RULE_type2stmt = 12, RULE_funvecstmt = 13, RULE_ifstmt = 14, RULE_elifs = 15, 
		RULE_switchstmt = 16, RULE_cases = 17, RULE_whilestmt = 18, RULE_forstmt = 19, 
		RULE_expr = 20, RULE_primitives = 21, RULE_listParams = 22, RULE_listArray = 23, 
		RULE_listAceso = 24, RULE_listStructExp = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "structCreation", "listStructDec", "funcstmt", 
			"listParamsFunc", "funcallstmt", "funcallestmt", "printstmt", "variablestmt", 
			"typestmt", "type2stmt", "funvecstmt", "ifstmt", "elifs", "switchstmt", 
			"cases", "whilestmt", "forstmt", "expr", "primitives", "listParams", 
			"listArray", "listAceso", "listStructExp"
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
			setState(52);
			((SContext)_localctx).block = block();
			setState(53);
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
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					((BlockContext)_localctx).instruction = instruction();
					((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
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
		public ForstmtContext forstmt;
		public FunvecstmtContext funvecstmt;
		public Token BREAK;
		public Token CONTINUE;
		public Token RETURN;
		public ExprContext expr;
		public FuncallstmtContext funcallstmt;
		public FuncstmtContext funcstmt;
		public StructCreationContext structCreation;
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
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
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
		public FuncallstmtContext funcallstmt() {
			return getRuleContext(FuncallstmtContext.class,0);
		}
		public FuncstmtContext funcstmt() {
			return getRuleContext(FuncstmtContext.class,0);
		}
		public StructCreationContext structCreation() {
			return getRuleContext(StructCreationContext.class,0);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(64);
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
				setState(69);
				((InstructionContext)_localctx).variablestmt = variablestmt();
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(70);
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
				setState(75);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				((InstructionContext)_localctx).switchstmt = switchstmt();
				 _localctx.inst = ((InstructionContext)_localctx).switchstmt.swinst 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whileinst 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				((InstructionContext)_localctx).forstmt = forstmt();
				 _localctx.inst = ((InstructionContext)_localctx).forstmt.forinst 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				((InstructionContext)_localctx).funvecstmt = funvecstmt();
				 _localctx.inst = ((InstructionContext)_localctx).funvecstmt.fvecisnt 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				((InstructionContext)_localctx).BREAK = match(BREAK);
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(91);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = instructions.NewBreak((((InstructionContext)_localctx).BREAK!=null?((InstructionContext)_localctx).BREAK.getLine():0), (((InstructionContext)_localctx).BREAK!=null?((InstructionContext)_localctx).BREAK.getCharPositionInLine():0)) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				((InstructionContext)_localctx).CONTINUE = match(CONTINUE);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(96);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = instructions.NewContinue((((InstructionContext)_localctx).CONTINUE!=null?((InstructionContext)_localctx).CONTINUE.getLine():0), (((InstructionContext)_localctx).CONTINUE!=null?((InstructionContext)_localctx).CONTINUE.getCharPositionInLine():0)) 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				((InstructionContext)_localctx).RETURN = match(RETURN);
				setState(101);
				((InstructionContext)_localctx).expr = expr(0);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(102);
					match(PCOMA);
					}
					break;
				}
				 _localctx.inst = instructions.NewReturn((((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getLine():0), (((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getCharPositionInLine():0), ((InstructionContext)_localctx).expr.e) 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				((InstructionContext)_localctx).funcallstmt = funcallstmt();
				 _localctx.inst = ((InstructionContext)_localctx).funcallstmt.cfun 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(110);
				((InstructionContext)_localctx).funcstmt = funcstmt();
				 _localctx.inst = ((InstructionContext)_localctx).funcstmt.fun 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(113);
				((InstructionContext)_localctx).structCreation = structCreation();
				 _localctx.inst = ((InstructionContext)_localctx).structCreation.dec 
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

	public static class StructCreationContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token STRUCT;
		public Token ID;
		public ListStructDecContext listStructDec;
		public TerminalNode STRUCT() { return getToken(SwiftGrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public StructCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structCreation; }
	}

	public final StructCreationContext structCreation() throws RecognitionException {
		StructCreationContext _localctx = new StructCreationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((StructCreationContext)_localctx).STRUCT = match(STRUCT);
			setState(119);
			((StructCreationContext)_localctx).ID = match(ID);
			setState(120);
			match(LLAVEIZQ);
			setState(121);
			((StructCreationContext)_localctx).listStructDec = listStructDec(0);
			setState(122);
			match(LLAVEDER);
			 _localctx.dec = instructions.NewStruct((((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getLine():0), (((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getCharPositionInLine():0), (((StructCreationContext)_localctx).ID!=null?((StructCreationContext)_localctx).ID.getText():null), ((StructCreationContext)_localctx).listStructDec.l) 
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

	public static class ListStructDecContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructDecContext list;
		public Token ID;
		public TypestmtContext typestmt;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public TypestmtContext typestmt() {
			return getRuleContext(TypestmtContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public ListStructDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructDec; }
	}

	public final ListStructDecContext listStructDec() throws RecognitionException {
		return listStructDec(0);
	}

	private ListStructDecContext listStructDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructDecContext _localctx = new ListStructDecContext(_ctx, _parentState);
		ListStructDecContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_listStructDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(126);
				match(VAR);
				setState(127);
				((ListStructDecContext)_localctx).ID = match(ID);
				setState(128);
				match(DOSP);
				setState(129);
				((ListStructDecContext)_localctx).typestmt = typestmt();

				        var arr []interface{}
				        newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).typestmt.type)
				        arr = append(arr, newParams)
				        _localctx.l = arr
				    
				}
				break;
			case 2:
				{
				 _localctx.l = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructDecContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructDec);
					setState(135);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(136);
					match(COMA);
					setState(137);
					match(VAR);
					setState(138);
					((ListStructDecContext)_localctx).ID = match(ID);
					setState(139);
					match(DOSP);
					setState(140);
					((ListStructDecContext)_localctx).typestmt = typestmt();

					                  var arr []interface{}
					                  newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).typestmt.type)
					                  arr = append(((ListStructDecContext)_localctx).list.l, newParams)
					                  _localctx.l = arr
					              
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FuncstmtContext extends ParserRuleContext {
		public interfaces.Instruction fun;
		public Token FUNC;
		public Token ID;
		public BlockContext block;
		public ListParamsFuncContext listParamsFunc;
		public TypestmtContext typestmt;
		public TerminalNode FUNC() { return getToken(SwiftGrammarParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public TerminalNode FLECHA() { return getToken(SwiftGrammarParser.FLECHA, 0); }
		public TypestmtContext typestmt() {
			return getRuleContext(TypestmtContext.class,0);
		}
		public FuncstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcstmt; }
	}

	public final FuncstmtContext funcstmt() throws RecognitionException {
		FuncstmtContext _localctx = new FuncstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcstmt);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((FuncstmtContext)_localctx).FUNC = match(FUNC);
				setState(149);
				((FuncstmtContext)_localctx).ID = match(ID);
				setState(150);
				match(PARIZQ);
				setState(151);
				match(PARDER);
				setState(152);
				match(LLAVEIZQ);
				setState(153);
				((FuncstmtContext)_localctx).block = block();
				setState(154);
				match(LLAVEDER);
				 _localctx.fun = instructions.NewDeclarationFunc((((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getLine():0), (((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getCharPositionInLine():0), (((FuncstmtContext)_localctx).ID!=null?((FuncstmtContext)_localctx).ID.getText():null), environment.NULL,  nil ,((FuncstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((FuncstmtContext)_localctx).FUNC = match(FUNC);
				setState(158);
				((FuncstmtContext)_localctx).ID = match(ID);
				setState(159);
				match(PARIZQ);
				setState(160);
				((FuncstmtContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(161);
				match(PARDER);
				setState(162);
				match(LLAVEIZQ);
				setState(163);
				((FuncstmtContext)_localctx).block = block();
				setState(164);
				match(LLAVEDER);
				 _localctx.fun = instructions.NewDeclarationFunc((((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getLine():0), (((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getCharPositionInLine():0), (((FuncstmtContext)_localctx).ID!=null?((FuncstmtContext)_localctx).ID.getText():null), environment.NULL, ((FuncstmtContext)_localctx).listParamsFunc.lpf, ((FuncstmtContext)_localctx).block.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				((FuncstmtContext)_localctx).FUNC = match(FUNC);
				setState(168);
				((FuncstmtContext)_localctx).ID = match(ID);
				setState(169);
				match(PARIZQ);
				setState(170);
				match(PARDER);
				setState(171);
				match(FLECHA);
				setState(172);
				((FuncstmtContext)_localctx).typestmt = typestmt();
				setState(173);
				match(LLAVEIZQ);
				setState(174);
				((FuncstmtContext)_localctx).block = block();
				setState(175);
				match(LLAVEDER);
				 _localctx.fun = instructions.NewDeclarationFunc((((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getLine():0), (((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getCharPositionInLine():0), (((FuncstmtContext)_localctx).ID!=null?((FuncstmtContext)_localctx).ID.getText():null), ((FuncstmtContext)_localctx).typestmt.type,  nil ,((FuncstmtContext)_localctx).block.blk) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				((FuncstmtContext)_localctx).FUNC = match(FUNC);
				setState(179);
				((FuncstmtContext)_localctx).ID = match(ID);
				setState(180);
				match(PARIZQ);
				setState(181);
				((FuncstmtContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(182);
				match(PARDER);
				setState(183);
				match(FLECHA);
				setState(184);
				((FuncstmtContext)_localctx).typestmt = typestmt();
				setState(185);
				match(LLAVEIZQ);
				setState(186);
				((FuncstmtContext)_localctx).block = block();
				setState(187);
				match(LLAVEDER);
				 _localctx.fun = instructions.NewDeclarationFunc((((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getLine():0), (((FuncstmtContext)_localctx).FUNC!=null?((FuncstmtContext)_localctx).FUNC.getCharPositionInLine():0), (((FuncstmtContext)_localctx).ID!=null?((FuncstmtContext)_localctx).ID.getText():null), ((FuncstmtContext)_localctx).typestmt.type, ((FuncstmtContext)_localctx).listParamsFunc.lpf, ((FuncstmtContext)_localctx).block.blk) 
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

	public static class ListParamsFuncContext extends ParserRuleContext {
		public []interface{} lpf;
		public ListParamsFuncContext list;
		public Token id1;
		public Token id2;
		public Token INOUT;
		public TypestmtContext typestmt;
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public TypestmtContext typestmt() {
			return getRuleContext(TypestmtContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SwiftGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftGrammarParser.ID, i);
		}
		public TerminalNode INOUT() { return getToken(SwiftGrammarParser.INOUT, 0); }
		public TerminalNode GBAJO() { return getToken(SwiftGrammarParser.GBAJO, 0); }
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public ListParamsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsFunc; }
	}

	public final ListParamsFuncContext listParamsFunc() throws RecognitionException {
		return listParamsFunc(0);
	}

	private ListParamsFuncContext listParamsFunc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsFuncContext _localctx = new ListParamsFuncContext(_ctx, _parentState);
		ListParamsFuncContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_listParamsFunc, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(193);
					((ListParamsFuncContext)_localctx).id1 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==GBAJO) ) {
						((ListParamsFuncContext)_localctx).id1 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(196);
				((ListParamsFuncContext)_localctx).id2 = match(ID);
				setState(197);
				match(DOSP);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(198);
					((ListParamsFuncContext)_localctx).INOUT = match(INOUT);
					}
				}

				setState(201);
				((ListParamsFuncContext)_localctx).typestmt = typestmt();

				    _localctx.lpf = []interface{}{}
				    
				    newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).id2!=null?((ListParamsFuncContext)_localctx).id2.getLine():0), (((ListParamsFuncContext)_localctx).id2!=null?((ListParamsFuncContext)_localctx).id2.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).id1!=null?((ListParamsFuncContext)_localctx).id1.getText():null),(((ListParamsFuncContext)_localctx).id2!=null?((ListParamsFuncContext)_localctx).id2.getText():null),(((ListParamsFuncContext)_localctx).INOUT!=null?((ListParamsFuncContext)_localctx).INOUT.getText():null), ((ListParamsFuncContext)_localctx).typestmt.type)
				    _localctx.lpf = append(_localctx.lpf, newParam)
				    
				}
				break;
			case 2:
				{
				 _localctx.lpf = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsFuncContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
					setState(207);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(208);
					match(COMA);
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(209);
						((ListParamsFuncContext)_localctx).id1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==GBAJO) ) {
							((ListParamsFuncContext)_localctx).id1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					setState(212);
					((ListParamsFuncContext)_localctx).id2 = match(ID);
					setState(213);
					match(DOSP);
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INOUT) {
						{
						setState(214);
						((ListParamsFuncContext)_localctx).INOUT = match(INOUT);
						}
					}

					setState(217);
					((ListParamsFuncContext)_localctx).typestmt = typestmt();

					              var arr []interface{}
					              newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).id2!=null?((ListParamsFuncContext)_localctx).id2.getLine():0), (((ListParamsFuncContext)_localctx).id2!=null?((ListParamsFuncContext)_localctx).id2.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).id1!=null?((ListParamsFuncContext)_localctx).id1.getText():null),(((ListParamsFuncContext)_localctx).id2!=null?((ListParamsFuncContext)_localctx).id2.getText():null),(((ListParamsFuncContext)_localctx).INOUT!=null?((ListParamsFuncContext)_localctx).INOUT.getText():null), ((ListParamsFuncContext)_localctx).typestmt.type)
					              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
					              _localctx.lpf = arr
					              
					}
					} 
				}
				setState(224);
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

	public static class FuncallstmtContext extends ParserRuleContext {
		public interfaces.Instruction cfun;
		public Token ID;
		public ListParamsContext listParams;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public FuncallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcallstmt; }
	}

	public final FuncallstmtContext funcallstmt() throws RecognitionException {
		FuncallstmtContext _localctx = new FuncallstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcallstmt);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((FuncallstmtContext)_localctx).ID = match(ID);
				setState(226);
				match(PARIZQ);
				setState(227);
				match(PARDER);
				 _localctx.cfun = instructions.NewFunCall((((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getLine():0), (((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getCharPositionInLine():0), (((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getText():null), nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((FuncallstmtContext)_localctx).ID = match(ID);
				setState(230);
				match(PARIZQ);
				setState(231);
				((FuncallstmtContext)_localctx).listParams = listParams(0);
				setState(232);
				match(PARDER);
				 _localctx.cfun = instructions.NewFunCall((((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getLine():0), (((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getCharPositionInLine():0), (((FuncallstmtContext)_localctx).ID!=null?((FuncallstmtContext)_localctx).ID.getText():null), ((FuncallstmtContext)_localctx).listParams.l) 
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

	public static class FuncallestmtContext extends ParserRuleContext {
		public interfaces.Expression cefun;
		public Token ID;
		public ListParamsContext listParams;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public FuncallestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcallestmt; }
	}

	public final FuncallestmtContext funcallestmt() throws RecognitionException {
		FuncallestmtContext _localctx = new FuncallestmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcallestmt);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((FuncallestmtContext)_localctx).ID = match(ID);
				setState(238);
				match(PARIZQ);
				setState(239);
				match(PARDER);
				 _localctx.cefun = expressions.NewFunCallE((((FuncallestmtContext)_localctx).ID!=null?((FuncallestmtContext)_localctx).ID.getLine():0), (((FuncallestmtContext)_localctx).ID!=null?((FuncallestmtContext)_localctx).ID.getCharPositionInLine():0), (((FuncallestmtContext)_localctx).ID!=null?((FuncallestmtContext)_localctx).ID.getText():null), nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((FuncallestmtContext)_localctx).ID = match(ID);
				setState(242);
				match(PARIZQ);
				setState(243);
				((FuncallestmtContext)_localctx).listParams = listParams(0);
				setState(244);
				match(PARDER);
				 _localctx.cefun = expressions.NewFunCallE((((FuncallestmtContext)_localctx).ID!=null?((FuncallestmtContext)_localctx).ID.getLine():0), (((FuncallestmtContext)_localctx).ID!=null?((FuncallestmtContext)_localctx).ID.getCharPositionInLine():0), (((FuncallestmtContext)_localctx).ID!=null?((FuncallestmtContext)_localctx).ID.getText():null), ((FuncallestmtContext)_localctx).listParams.l) 
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
		public Token PARIZQ;
		public ListParamsContext listParams;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printstmt);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((PrintstmtContext)_localctx).PRINT = match(PRINT);
				setState(250);
				match(PARIZQ);
				setState(251);
				((PrintstmtContext)_localctx).expr = expr(0);
				setState(252);
				match(PARDER);
				 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((PrintstmtContext)_localctx).PRINT = match(PRINT);
				setState(256);
				((PrintstmtContext)_localctx).PARIZQ = match(PARIZQ);
				setState(257);
				((PrintstmtContext)_localctx).listParams = listParams(0);
				setState(258);
				match(PARDER);
				 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),expressions.NewArray((((PrintstmtContext)_localctx).PARIZQ!=null?((PrintstmtContext)_localctx).PARIZQ.getLine():0), (((PrintstmtContext)_localctx).PARIZQ!=null?((PrintstmtContext)_localctx).PARIZQ.getCharPositionInLine():0), ((PrintstmtContext)_localctx).listParams.l))
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

	public static class VariablestmtContext extends ParserRuleContext {
		public interfaces.Instruction vari;
		public Token VAR;
		public Token ID;
		public TypestmtContext typestmt;
		public ExprContext expr;
		public Token LET;
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
		enterRule(_localctx, 20, RULE_variablestmt);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(264);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(265);
				match(DOSP);
				setState(266);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(267);
				match(IG);
				setState(268);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(272);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(273);
				match(IG);
				setState(274);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(278);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(279);
				match(DOSP);
				setState(280);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(281);
				match(INTCE);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, expressions.NewPrimitive((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), nil, environment.NULL), true) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(285);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(286);
				match(IG);
				setState(287);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).expr.e, false) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(291);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(292);
				match(DOSP);
				setState(293);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(294);
				match(IG);
				setState(295);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, false) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				((VariablestmtContext)_localctx).LET = match(LET);
				setState(299);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(300);
				match(IG);
				setState(301);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getLine():0), (((VariablestmtContext)_localctx).LET!=null?((VariablestmtContext)_localctx).LET.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.NULL, ((VariablestmtContext)_localctx).expr.e, false) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(305);
				match(IG);
				setState(306);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(309);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(310);
				match(CORIZQ);
				setState(311);
				((VariablestmtContext)_localctx).e1 = expr(0);
				setState(312);
				match(CORDER);
				setState(313);
				match(IG);
				setState(314);
				((VariablestmtContext)_localctx).e2 = expr(0);
				 _localctx.vari = instructions.NewAssigmentVec((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).e1.e, ((VariablestmtContext)_localctx).e2.e) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(317);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(318);
				((VariablestmtContext)_localctx).e1 = expr(0);
				setState(319);
				match(IG);
				setState(320);
				((VariablestmtContext)_localctx).e2 = expr(0);
				 _localctx.vari = instructions.NewAssigmentMa((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).e1.e, ((VariablestmtContext)_localctx).e2.e) 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(324);
				match(ADD);
				setState(325);
				match(IG);
				setState(326);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewSumAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(329);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(330);
				match(SUB);
				setState(331);
				match(IG);
				setState(332);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewResAssigment((((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).expr.e) 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(335);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(336);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(337);
				match(DOSP);
				setState(338);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(339);
				match(IG);
				setState(340);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, ((VariablestmtContext)_localctx).expr.e, true) 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(343);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(344);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(345);
				match(DOSP);
				setState(346);
				((VariablestmtContext)_localctx).typestmt = typestmt();
				setState(347);
				match(IG);
				setState(348);
				((VariablestmtContext)_localctx).CORIZQ = match(CORIZQ);
				setState(349);
				match(CORDER);

				    _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), ((VariablestmtContext)_localctx).typestmt.type, 
				    expressions.NewArray((((VariablestmtContext)_localctx).CORIZQ!=null?((VariablestmtContext)_localctx).CORIZQ.getLine():0), (((VariablestmtContext)_localctx).CORIZQ!=null?((VariablestmtContext)_localctx).CORIZQ.getCharPositionInLine():0), nil),
				    true)

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(352);
				((VariablestmtContext)_localctx).VAR = match(VAR);
				setState(353);
				((VariablestmtContext)_localctx).ID = match(ID);
				setState(354);
				match(IG);
				setState(355);
				((VariablestmtContext)_localctx).expr = expr(0);
				 _localctx.vari = instructions.NewDeclaration((((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getLine():0), (((VariablestmtContext)_localctx).VAR!=null?((VariablestmtContext)_localctx).VAR.getCharPositionInLine():0), (((VariablestmtContext)_localctx).ID!=null?((VariablestmtContext)_localctx).ID.getText():null), environment.STRUCT , ((VariablestmtContext)_localctx).expr.e,true) 
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
		enterRule(_localctx, 22, RULE_typestmt);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(INT);
				 _localctx.type = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(FLOAT);
				 _localctx.type = environment.FLOAT 
				}
				break;
			case TSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(TSTRING);
				 _localctx.type = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(BOOL);
				 _localctx.type = environment.BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(CHAR);
				 _localctx.type = environment.CHAR 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(370);
				match(CORIZQ);
				setState(371);
				((TypestmtContext)_localctx).type2stmt = type2stmt();
				setState(372);
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
		enterRule(_localctx, 24, RULE_type2stmt);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(INT);
				 _localctx.type2 = environment.A_INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(FLOAT);
				 _localctx.type2 = environment.A_FLOAT 
				}
				break;
			case TSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(TSTRING);
				 _localctx.type2 = environment.A_STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(BOOL);
				 _localctx.type2 = environment.A_BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				match(CHAR);
				 _localctx.type2 = environment.A_CHAR 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				match(CORIZQ);
				setState(388);
				((Type2stmtContext)_localctx).type2stmt = type2stmt();
				setState(389);
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
		enterRule(_localctx, 26, RULE_funvecstmt);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(395);
				match(PUNTO);
				setState(396);
				match(APPEND);
				setState(397);
				match(PARIZQ);
				setState(398);
				((FunvecstmtContext)_localctx).expr = expr(0);
				setState(399);
				match(PARDER);
				 _localctx.fvecisnt = instructions.NewAppend((((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getText():null) , ((FunvecstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(403);
				match(PUNTO);
				setState(404);
				match(REMOVELAST);
				setState(405);
				match(PARIZQ);
				setState(406);
				match(PARDER);
				 _localctx.fvecisnt = instructions.NewRemoveLast((((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((FunvecstmtContext)_localctx).ID!=null?((FunvecstmtContext)_localctx).ID.getText():null)) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				((FunvecstmtContext)_localctx).ID = match(ID);
				setState(409);
				match(PUNTO);
				setState(410);
				match(REMOVE);
				setState(411);
				match(PARIZQ);
				setState(412);
				match(AT);
				setState(413);
				match(DOSP);
				setState(414);
				((FunvecstmtContext)_localctx).expr = expr(0);
				setState(415);
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
		enterRule(_localctx, 28, RULE_ifstmt);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(421);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(422);
				match(LLAVEIZQ);
				setState(423);
				((IfstmtContext)_localctx).block = block();
				setState(424);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil,nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(428);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(429);
				match(LLAVEIZQ);
				setState(430);
				((IfstmtContext)_localctx).bif = block();
				setState(431);
				match(LLAVEDER);
				setState(432);
				match(ELSE);
				setState(433);
				match(LLAVEIZQ);
				setState(434);
				((IfstmtContext)_localctx).belse = block();
				setState(435);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).bif.blk, ((IfstmtContext)_localctx).belse.blk,nil) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(439);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(440);
				match(LLAVEIZQ);
				setState(441);
				((IfstmtContext)_localctx).bif = block();
				setState(442);
				match(LLAVEDER);
				setState(443);
				((IfstmtContext)_localctx).elifs = elifs(0);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).bif.blk, nil, ((IfstmtContext)_localctx).elifs.elifinst) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(447);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(448);
				match(LLAVEIZQ);
				setState(449);
				((IfstmtContext)_localctx).bif = block();
				setState(450);
				match(LLAVEDER);
				setState(451);
				((IfstmtContext)_localctx).elifs = elifs(0);
				setState(452);
				match(ELSE);
				setState(453);
				match(LLAVEIZQ);
				setState(454);
				((IfstmtContext)_localctx).belse = block();
				setState(455);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_elifs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(461);
			((ElifsContext)_localctx).ELSE = match(ELSE);
			setState(462);
			match(IF);
			setState(463);
			((ElifsContext)_localctx).expr = expr(0);
			setState(464);
			match(LLAVEIZQ);
			setState(465);
			((ElifsContext)_localctx).block = block();
			setState(466);
			match(LLAVEDER);

			    _localctx.elifinst = []interface{}{}
			    _localctx.elifinst = append(_localctx.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
					setState(469);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(470);
					((ElifsContext)_localctx).ELSE = match(ELSE);
					setState(471);
					match(IF);
					setState(472);
					((ElifsContext)_localctx).expr = expr(0);
					setState(473);
					match(LLAVEIZQ);
					setState(474);
					((ElifsContext)_localctx).block = block();
					setState(475);
					match(LLAVEDER);

					              var arrif []interface{}
					              arrif = append(((ElifsContext)_localctx).celif.elifinst, instructions.NewElif((((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getLine():0), (((ElifsContext)_localctx).ELSE!=null?((ElifsContext)_localctx).ELSE.getCharPositionInLine():0), ((ElifsContext)_localctx).expr.e, ((ElifsContext)_localctx).block.blk))
					              _localctx.elifinst = arrif
					          
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 32, RULE_switchstmt);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(484);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(485);
				match(LLAVEIZQ);
				setState(486);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(487);
				match(DEFAULT);
				setState(488);
				match(DOSP);
				setState(489);
				((SwitchstmtContext)_localctx).block = block();
				setState(490);
				match(LLAVEDER);
				 _localctx.swinst = instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, ((SwitchstmtContext)_localctx).cases.casesinst, ((SwitchstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(494);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(495);
				match(LLAVEIZQ);
				setState(496);
				((SwitchstmtContext)_localctx).cases = cases(0);
				setState(497);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_cases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(503);
			((CasesContext)_localctx).CASE = match(CASE);
			setState(504);
			((CasesContext)_localctx).expr = expr(0);
			setState(505);
			match(DOSP);
			setState(506);
			((CasesContext)_localctx).block = block();

			    _localctx.casesinst = []interface{}{}
			    _localctx.casesinst = append(_localctx.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
			    

			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
					setState(509);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(510);
					((CasesContext)_localctx).CASE = match(CASE);
					setState(511);
					((CasesContext)_localctx).expr = expr(0);
					setState(512);
					match(DOSP);
					setState(513);
					((CasesContext)_localctx).block = block();

					              var arrcase []interface{}
					              arrcase = append(((CasesContext)_localctx).ccases.casesinst, instructions.NewCase((((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getLine():0), (((CasesContext)_localctx).CASE!=null?((CasesContext)_localctx).CASE.getCharPositionInLine():0), ((CasesContext)_localctx).expr.e, ((CasesContext)_localctx).block.blk))
					              _localctx.casesinst = arrcase
					          
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 36, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(522);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(523);
			match(LLAVEIZQ);
			setState(524);
			((WhilestmtContext)_localctx).block = block();
			setState(525);
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

	public static class ForstmtContext extends ParserRuleContext {
		public interfaces.Instruction forinst;
		public Token FOR;
		public Token ID;
		public ExprContext e1;
		public ExprContext e2;
		public BlockContext block;
		public ExprContext expr;
		public TerminalNode FOR() { return getToken(SwiftGrammarParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IN() { return getToken(SwiftGrammarParser.IN, 0); }
		public TerminalNode TRESP() { return getToken(SwiftGrammarParser.TRESP, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forstmt);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(529);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(530);
				match(IN);
				setState(531);
				((ForstmtContext)_localctx).e1 = expr(0);
				setState(532);
				match(TRESP);
				setState(533);
				((ForstmtContext)_localctx).e2 = expr(0);
				setState(534);
				match(LLAVEIZQ);
				setState(535);
				((ForstmtContext)_localctx).block = block();
				setState(536);
				match(LLAVEDER);
				 _localctx.forinst = instructions.NewForRange((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0),(((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null) ,((ForstmtContext)_localctx).e1.e,((ForstmtContext)_localctx).e2.e ,((ForstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(540);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(541);
				match(IN);
				setState(542);
				((ForstmtContext)_localctx).expr = expr(0);
				setState(543);
				match(LLAVEIZQ);
				setState(544);
				((ForstmtContext)_localctx).block = block();
				setState(545);
				match(LLAVEDER);
				 _localctx.forinst = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0),(((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null) ,((ForstmtContext)_localctx).expr.e ,((ForstmtContext)_localctx).block.blk) 
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
		public ListStructExpContext listStructExp;
		public FuncallestmtContext funcallestmt;
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
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public FuncallestmtContext funcallestmt() {
			return getRuleContext(FuncallestmtContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(551);
				((ExprContext)_localctx).op = match(NOT);
				setState(552);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(15);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 2:
				{
				setState(555);
				((ExprContext)_localctx).op = match(SUB);
				setState(556);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(14);
				 _localctx.e = expressions.NewOperationUnary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null)) 
				}
				break;
			case 3:
				{
				setState(559);
				match(PARIZQ);
				setState(560);
				((ExprContext)_localctx).expr = expr(0);
				setState(561);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(564);
				((ExprContext)_localctx).ID = match(ID);
				 _localctx.e = expressions.NewCallVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))
				}
				break;
			case 5:
				{
				setState(566);
				((ExprContext)_localctx).primitives = primitives();
				 _localctx.e = ((ExprContext)_localctx).primitives.p
				}
				break;
			case 6:
				{
				setState(569);
				((ExprContext)_localctx).INT = match(INT);
				setState(570);
				match(PARIZQ);
				setState(571);
				((ExprContext)_localctx).expr = expr(0);
				setState(572);
				match(PARDER);
				 _localctx.e = expressions.NewCastingInt((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getLine():0), (((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getCharPositionInLine():0), ((ExprContext)_localctx).expr.e ) 
				}
				break;
			case 7:
				{
				setState(575);
				((ExprContext)_localctx).FLOAT = match(FLOAT);
				setState(576);
				match(PARIZQ);
				setState(577);
				((ExprContext)_localctx).expr = expr(0);
				setState(578);
				match(PARDER);
				 _localctx.e = expressions.NewCastingFloat((((ExprContext)_localctx).FLOAT!=null?((ExprContext)_localctx).FLOAT.getLine():0), (((ExprContext)_localctx).FLOAT!=null?((ExprContext)_localctx).FLOAT.getCharPositionInLine():0), ((ExprContext)_localctx).expr.e ) 
				}
				break;
			case 8:
				{
				setState(581);
				((ExprContext)_localctx).TSTRING = match(TSTRING);
				setState(582);
				match(PARIZQ);
				setState(583);
				((ExprContext)_localctx).expr = expr(0);
				setState(584);
				match(PARDER);
				 _localctx.e = expressions.NewCastingString((((ExprContext)_localctx).TSTRING!=null?((ExprContext)_localctx).TSTRING.getLine():0), (((ExprContext)_localctx).TSTRING!=null?((ExprContext)_localctx).TSTRING.getCharPositionInLine():0), ((ExprContext)_localctx).expr.e ) 
				}
				break;
			case 9:
				{
				setState(587);
				((ExprContext)_localctx).listArray = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).listArray.p
				}
				break;
			case 10:
				{
				setState(590);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(591);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(592);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 11:
				{
				setState(595);
				((ExprContext)_localctx).ID = match(ID);
				setState(596);
				match(PUNTO);
				setState(597);
				match(COUNT);
				 _localctx.e = expressions.NewCount((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 12:
				{
				setState(599);
				((ExprContext)_localctx).ID = match(ID);
				setState(600);
				match(PUNTO);
				setState(601);
				match(ISEMPTY);
				 _localctx.e = expressions.NewIsEmpty((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 13:
				{
				setState(603);
				((ExprContext)_localctx).listAceso = listAceso(0);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listAceso.l) 
				}
				break;
			case 14:
				{
				setState(606);
				((ExprContext)_localctx).ID = match(ID);
				setState(607);
				match(PARIZQ);
				setState(608);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(609);
				match(PARDER);
				 _localctx.e = expressions.NewStructExp((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).listStructExp.l ) 
				}
				break;
			case 15:
				{
				setState(612);
				((ExprContext)_localctx).funcallestmt = funcallestmt();
				 _localctx.e = ((ExprContext)_localctx).funcallestmt.cefun 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(652);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(617);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(618);
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
						setState(619);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(23);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(622);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(623);
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
						setState(624);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(22);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(627);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(628);
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
						setState(629);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(21);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(632);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(633);
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
						setState(634);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(637);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(638);
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
						setState(639);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(19);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(642);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(643);
						((ExprContext)_localctx).op = match(AND);
						setState(644);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(647);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(648);
						((ExprContext)_localctx).op = match(OR);
						setState(649);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperationBinary((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 42, RULE_primitives);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
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
				setState(659);
				((PrimitivesContext)_localctx).CHARACTER = match(CHARACTER);

				        str := (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getLine():0), (((PrimitivesContext)_localctx).CHARACTER!=null?((PrimitivesContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1],environment.CHAR)
				    
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				((PrimitivesContext)_localctx).STRING = match(STRING);

				        str := (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getText():null)
				        _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getLine():0), (((PrimitivesContext)_localctx).STRING!=null?((PrimitivesContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case TRU:
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
				((PrimitivesContext)_localctx).TRU = match(TRU);
				 _localctx.p = expressions.NewPrimitive((((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getLine():0), (((PrimitivesContext)_localctx).TRU!=null?((PrimitivesContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(665);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(670);
			((ListParamsContext)_localctx).expr = expr(0);

			    _localctx.l = []interface{}{}
			    _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)

			}
			_ctx.stop = _input.LT(-1);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
					setState(673);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(674);
					match(COMA);
					setState(675);
					((ListParamsContext)_localctx).expr = expr(0);

					              var arr []interface{}
					              arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					              _localctx.l = arr
					          
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(684);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(687);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(688);
						match(CORIZQ);
						setState(689);
						((ListArrayContext)_localctx).expr = expr(0);
						setState(690);
						match(CORDER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(693);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(694);
						match(PUNTO);
						setState(695);
						((ListArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expressions.NewStructAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))  
						}
						break;
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_listAceso, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(703);
			match(CORIZQ);
			setState(704);
			((ListAcesoContext)_localctx).expr = expr(0);
			setState(705);
			match(CORDER);

			    _localctx.l = []interface{}{}
			    _localctx.l = append(_localctx.l, ((ListAcesoContext)_localctx).expr.e)

			}
			_ctx.stop = _input.LT(-1);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
					setState(708);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(709);
					match(CORIZQ);
					setState(710);
					((ListAcesoContext)_localctx).expr = expr(0);
					setState(711);
					match(CORDER);

					              var arr []interface{}
					              arr = append(((ListAcesoContext)_localctx).list.l, ((ListAcesoContext)_localctx).expr.e)
					              _localctx.l = arr
					          
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class ListStructExpContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructExpContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode DOSP() { return getToken(SwiftGrammarParser.DOSP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public ListStructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructExp; }
	}

	public final ListStructExpContext listStructExp() throws RecognitionException {
		return listStructExp(0);
	}

	private ListStructExpContext listStructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructExpContext _localctx = new ListStructExpContext(_ctx, _parentState);
		ListStructExpContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_listStructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(720);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(721);
				match(DOSP);
				setState(722);
				((ListStructExpContext)_localctx).expr = expr(0);

				    var arr []interface{}
				    StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
				    arr = append(arr, StrExp)
				    _localctx.l = arr

				}
				break;
			case 2:
				{

				    _localctx.l = []interface{}{}

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(728);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(729);
					match(COMA);
					setState(730);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(731);
					match(DOSP);
					setState(732);
					((ListStructExpContext)_localctx).expr = expr(0);

					              var arr []interface{}
					              StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					              arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					              _localctx.l = arr
					          
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		case 4:
			return listStructDec_sempred((ListStructDecContext)_localctx, predIndex);
		case 6:
			return listParamsFunc_sempred((ListParamsFuncContext)_localctx, predIndex);
		case 15:
			return elifs_sempred((ElifsContext)_localctx, predIndex);
		case 17:
			return cases_sempred((CasesContext)_localctx, predIndex);
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 22:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 23:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 24:
			return listAceso_sempred((ListAcesoContext)_localctx, predIndex);
		case 25:
			return listStructExp_sempred((ListStructExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listStructDec_sempred(ListStructDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listParamsFunc_sempred(ListParamsFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean elifs_sempred(ElifsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cases_sempred(CasesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listAceso_sempred(ListAcesoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u02e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\6\3<\n\3\r\3\16\3=\3\3\3\3\3"+
		"\4\3\4\5\4D\n\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\3\4\3\4\5"+
		"\4d\n\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4w\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0092\n\6\f\6"+
		"\16\6\u0095\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c1\n\7\3\b\3\b\5\b"+
		"\u00c5\n\b\3\b\3\b\3\b\5\b\u00ca\n\b\3\b\3\b\3\b\3\b\5\b\u00d0\n\b\3\b"+
		"\3\b\3\b\5\b\u00d5\n\b\3\b\3\b\3\b\5\b\u00da\n\b\3\b\3\b\3\b\7\b\u00df"+
		"\n\b\f\b\16\b\u00e2\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ee"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fa\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0108\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0169\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u017a\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u018b\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01a5\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01cd\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u01e1\n\21\f\21\16\21\u01e4\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01f7"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0207\n\23\f\23\16\23\u020a\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0227\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u026a\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u028f\n\26\f\26\16\26\u0292\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u029e\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u02a9\n\30\f\30\16\30\u02ac\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02bc"+
		"\n\31\f\31\16\31\u02bf\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\7\32\u02cd\n\32\f\32\16\32\u02d0\13\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u02d9\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u02e2\n\33\f\33\16\33\u02e5\13\33\3\33\2\13\n\16 $*.\60\62"+
		"\64\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\4"+
		"\2((EE\3\2\63\65\3\2\66\67\4\2//\61\61\4\2\60\60\62\62\3\2)*\2\u032b\2"+
		"\66\3\2\2\2\4;\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\n\u0087\3\2\2\2\f\u00c0\3"+
		"\2\2\2\16\u00cf\3\2\2\2\20\u00ed\3\2\2\2\22\u00f9\3\2\2\2\24\u0107\3\2"+
		"\2\2\26\u0168\3\2\2\2\30\u0179\3\2\2\2\32\u018a\3\2\2\2\34\u01a4\3\2\2"+
		"\2\36\u01cc\3\2\2\2 \u01ce\3\2\2\2\"\u01f6\3\2\2\2$\u01f8\3\2\2\2&\u020b"+
		"\3\2\2\2(\u0226\3\2\2\2*\u0269\3\2\2\2,\u029d\3\2\2\2.\u029f\3\2\2\2\60"+
		"\u02ad\3\2\2\2\62\u02c0\3\2\2\2\64\u02d8\3\2\2\2\66\67\5\4\3\2\678\7\2"+
		"\2\389\b\2\1\29\3\3\2\2\2:<\5\6\4\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>?\3\2\2\2?@\b\3\1\2@\5\3\2\2\2AC\5\24\13\2BD\7D\2\2CB\3\2\2\2C"+
		"D\3\2\2\2DE\3\2\2\2EF\b\4\1\2Fw\3\2\2\2GI\5\26\f\2HJ\7D\2\2IH\3\2\2\2"+
		"IJ\3\2\2\2JK\3\2\2\2KL\b\4\1\2Lw\3\2\2\2MN\5\36\20\2NO\b\4\1\2Ow\3\2\2"+
		"\2PQ\5\"\22\2QR\b\4\1\2Rw\3\2\2\2ST\5&\24\2TU\b\4\1\2Uw\3\2\2\2VW\5(\25"+
		"\2WX\b\4\1\2Xw\3\2\2\2YZ\5\34\17\2Z[\b\4\1\2[w\3\2\2\2\\^\7\22\2\2]_\7"+
		"D\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`w\b\4\1\2ac\7\23\2\2bd\7D\2\2cb\3"+
		"\2\2\2cd\3\2\2\2de\3\2\2\2ew\b\4\1\2fg\7\24\2\2gi\5*\26\2hj\7D\2\2ih\3"+
		"\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\4\1\2lw\3\2\2\2mn\5\20\t\2no\b\4\1\2ow"+
		"\3\2\2\2pq\5\f\7\2qr\b\4\1\2rw\3\2\2\2st\5\b\5\2tu\b\4\1\2uw\3\2\2\2v"+
		"A\3\2\2\2vG\3\2\2\2vM\3\2\2\2vP\3\2\2\2vS\3\2\2\2vV\3\2\2\2vY\3\2\2\2"+
		"v\\\3\2\2\2va\3\2\2\2vf\3\2\2\2vm\3\2\2\2vp\3\2\2\2vs\3\2\2\2w\7\3\2\2"+
		"\2xy\7\37\2\2yz\7(\2\2z{\7:\2\2{|\5\n\6\2|}\7;\2\2}~\b\5\1\2~\t\3\2\2"+
		"\2\177\u0080\b\6\1\2\u0080\u0081\7\b\2\2\u0081\u0082\7(\2\2\u0082\u0083"+
		"\7>\2\2\u0083\u0084\5\30\r\2\u0084\u0085\b\6\1\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0088\b\6\1\2\u0087\177\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0093\3\2\2"+
		"\2\u0089\u008a\f\5\2\2\u008a\u008b\7@\2\2\u008b\u008c\7\b\2\2\u008c\u008d"+
		"\7(\2\2\u008d\u008e\7>\2\2\u008e\u008f\5\30\r\2\u008f\u0090\b\6\1\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0089\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\13\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\7\"\2\2\u0097\u0098\7(\2\2\u0098\u0099\78\2\2\u0099\u009a\79\2\2\u009a"+
		"\u009b\7:\2\2\u009b\u009c\5\4\3\2\u009c\u009d\7;\2\2\u009d\u009e\b\7\1"+
		"\2\u009e\u00c1\3\2\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a2"+
		"\78\2\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4\79\2\2\u00a4\u00a5\7:\2\2\u00a5"+
		"\u00a6\5\4\3\2\u00a6\u00a7\7;\2\2\u00a7\u00a8\b\7\1\2\u00a8\u00c1\3\2"+
		"\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7(\2\2\u00ab\u00ac\78\2\2\u00ac\u00ad"+
		"\79\2\2\u00ad\u00ae\7B\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7:\2\2\u00b0"+
		"\u00b1\5\4\3\2\u00b1\u00b2\7;\2\2\u00b2\u00b3\b\7\1\2\u00b3\u00c1\3\2"+
		"\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\78\2\2\u00b7\u00b8"+
		"\5\16\b\2\u00b8\u00b9\79\2\2\u00b9\u00ba\7B\2\2\u00ba\u00bb\5\30\r\2\u00bb"+
		"\u00bc\7:\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7;\2\2\u00be\u00bf\b\7\1"+
		"\2\u00bf\u00c1\3\2\2\2\u00c0\u0096\3\2\2\2\u00c0\u009f\3\2\2\2\u00c0\u00a9"+
		"\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c4\b\b\1\2\u00c3"+
		"\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c9\7>\2\2\u00c8\u00ca\7$\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5\30\r\2"+
		"\u00cc\u00cd\b\b\1\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\b\b\1\2\u00cf\u00c2"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00e0\3\2\2\2\u00d1\u00d2\f\5\2\2\u00d2"+
		"\u00d4\7@\2\2\u00d3\u00d5\t\2\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d9\7>\2\2\u00d8\u00da"+
		"\7$\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\5\30\r\2\u00dc\u00dd\b\b\1\2\u00dd\u00df\3\2\2\2\u00de\u00d1\3"+
		"\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\17\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7(\2\2\u00e4\u00e5\78\2\2"+
		"\u00e5\u00e6\79\2\2\u00e6\u00ee\b\t\1\2\u00e7\u00e8\7(\2\2\u00e8\u00e9"+
		"\78\2\2\u00e9\u00ea\5.\30\2\u00ea\u00eb\79\2\2\u00eb\u00ec\b\t\1\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ee\21\3\2\2"+
		"\2\u00ef\u00f0\7(\2\2\u00f0\u00f1\78\2\2\u00f1\u00f2\79\2\2\u00f2\u00fa"+
		"\b\n\1\2\u00f3\u00f4\7(\2\2\u00f4\u00f5\78\2\2\u00f5\u00f6\5.\30\2\u00f6"+
		"\u00f7\79\2\2\u00f7\u00f8\b\n\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00ef\3\2"+
		"\2\2\u00f9\u00f3\3\2\2\2\u00fa\23\3\2\2\2\u00fb\u00fc\7\f\2\2\u00fc\u00fd"+
		"\78\2\2\u00fd\u00fe\5*\26\2\u00fe\u00ff\79\2\2\u00ff\u0100\b\13\1\2\u0100"+
		"\u0108\3\2\2\2\u0101\u0102\7\f\2\2\u0102\u0103\78\2\2\u0103\u0104\5.\30"+
		"\2\u0104\u0105\79\2\2\u0105\u0106\b\13\1\2\u0106\u0108\3\2\2\2\u0107\u00fb"+
		"\3\2\2\2\u0107\u0101\3\2\2\2\u0108\25\3\2\2\2\u0109\u010a\7\b\2\2\u010a"+
		"\u010b\7(\2\2\u010b\u010c\7>\2\2\u010c\u010d\5\30\r\2\u010d\u010e\7.\2"+
		"\2\u010e\u010f\5*\26\2\u010f\u0110\b\f\1\2\u0110\u0169\3\2\2\2\u0111\u0112"+
		"\7\b\2\2\u0112\u0113\7(\2\2\u0113\u0114\7.\2\2\u0114\u0115\5*\26\2\u0115"+
		"\u0116\b\f\1\2\u0116\u0169\3\2\2\2\u0117\u0118\7\b\2\2\u0118\u0119\7("+
		"\2\2\u0119\u011a\7>\2\2\u011a\u011b\5\30\r\2\u011b\u011c\7A\2\2\u011c"+
		"\u011d\b\f\1\2\u011d\u0169\3\2\2\2\u011e\u011f\7\t\2\2\u011f\u0120\7("+
		"\2\2\u0120\u0121\7.\2\2\u0121\u0122\5*\26\2\u0122\u0123\b\f\1\2\u0123"+
		"\u0169\3\2\2\2\u0124\u0125\7\t\2\2\u0125\u0126\7(\2\2\u0126\u0127\7>\2"+
		"\2\u0127\u0128\5\30\r\2\u0128\u0129\7.\2\2\u0129\u012a\5*\26\2\u012a\u012b"+
		"\b\f\1\2\u012b\u0169\3\2\2\2\u012c\u012d\7\t\2\2\u012d\u012e\7(\2\2\u012e"+
		"\u012f\7.\2\2\u012f\u0130\5*\26\2\u0130\u0131\b\f\1\2\u0131\u0169\3\2"+
		"\2\2\u0132\u0133\7(\2\2\u0133\u0134\7.\2\2\u0134\u0135\5*\26\2\u0135\u0136"+
		"\b\f\1\2\u0136\u0169\3\2\2\2\u0137\u0138\7(\2\2\u0138\u0139\7<\2\2\u0139"+
		"\u013a\5*\26\2\u013a\u013b\7=\2\2\u013b\u013c\7.\2\2\u013c\u013d\5*\26"+
		"\2\u013d\u013e\b\f\1\2\u013e\u0169\3\2\2\2\u013f\u0140\7(\2\2\u0140\u0141"+
		"\5*\26\2\u0141\u0142\7.\2\2\u0142\u0143\5*\26\2\u0143\u0144\b\f\1\2\u0144"+
		"\u0169\3\2\2\2\u0145\u0146\7(\2\2\u0146\u0147\7\66\2\2\u0147\u0148\7."+
		"\2\2\u0148\u0149\5*\26\2\u0149\u014a\b\f\1\2\u014a\u0169\3\2\2\2\u014b"+
		"\u014c\7(\2\2\u014c\u014d\7\67\2\2\u014d\u014e\7.\2\2\u014e\u014f\5*\26"+
		"\2\u014f\u0150\b\f\1\2\u0150\u0169\3\2\2\2\u0151\u0152\7\b\2\2\u0152\u0153"+
		"\7(\2\2\u0153\u0154\7>\2\2\u0154\u0155\5\30\r\2\u0155\u0156\7.\2\2\u0156"+
		"\u0157\5*\26\2\u0157\u0158\b\f\1\2\u0158\u0169\3\2\2\2\u0159\u015a\7\b"+
		"\2\2\u015a\u015b\7(\2\2\u015b\u015c\7>\2\2\u015c\u015d\5\30\r\2\u015d"+
		"\u015e\7.\2\2\u015e\u015f\7<\2\2\u015f\u0160\7=\2\2\u0160\u0161\b\f\1"+
		"\2\u0161\u0169\3\2\2\2\u0162\u0163\7\b\2\2\u0163\u0164\7(\2\2\u0164\u0165"+
		"\7.\2\2\u0165\u0166\5*\26\2\u0166\u0167\b\f\1\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0109\3\2\2\2\u0168\u0111\3\2\2\2\u0168\u0117\3\2\2\2\u0168\u011e\3\2"+
		"\2\2\u0168\u0124\3\2\2\2\u0168\u012c\3\2\2\2\u0168\u0132\3\2\2\2\u0168"+
		"\u0137\3\2\2\2\u0168\u013f\3\2\2\2\u0168\u0145\3\2\2\2\u0168\u014b\3\2"+
		"\2\2\u0168\u0151\3\2\2\2\u0168\u0159\3\2\2\2\u0168\u0162\3\2\2\2\u0169"+
		"\27\3\2\2\2\u016a\u016b\7\3\2\2\u016b\u017a\b\r\1\2\u016c\u016d\7\4\2"+
		"\2\u016d\u017a\b\r\1\2\u016e\u016f\7\5\2\2\u016f\u017a\b\r\1\2\u0170\u0171"+
		"\7\6\2\2\u0171\u017a\b\r\1\2\u0172\u0173\7\7\2\2\u0173\u017a\b\r\1\2\u0174"+
		"\u0175\7<\2\2\u0175\u0176\5\32\16\2\u0176\u0177\7=\2\2\u0177\u0178\b\r"+
		"\1\2\u0178\u017a\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u016c\3\2\2\2\u0179"+
		"\u016e\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0172\3\2\2\2\u0179\u0174\3\2"+
		"\2\2\u017a\31\3\2\2\2\u017b\u017c\7\3\2\2\u017c\u018b\b\16\1\2\u017d\u017e"+
		"\7\4\2\2\u017e\u018b\b\16\1\2\u017f\u0180\7\5\2\2\u0180\u018b\b\16\1\2"+
		"\u0181\u0182\7\6\2\2\u0182\u018b\b\16\1\2\u0183\u0184\7\7\2\2\u0184\u018b"+
		"\b\16\1\2\u0185\u0186\7<\2\2\u0186\u0187\5\32\16\2\u0187\u0188\7=\2\2"+
		"\u0188\u0189\b\16\1\2\u0189\u018b\3\2\2\2\u018a\u017b\3\2\2\2\u018a\u017d"+
		"\3\2\2\2\u018a\u017f\3\2\2\2\u018a\u0181\3\2\2\2\u018a\u0183\3\2\2\2\u018a"+
		"\u0185\3\2\2\2\u018b\33\3\2\2\2\u018c\u018d\7(\2\2\u018d\u018e\7?\2\2"+
		"\u018e\u018f\7\31\2\2\u018f\u0190\78\2\2\u0190\u0191\5*\26\2\u0191\u0192"+
		"\79\2\2\u0192\u0193\b\17\1\2\u0193\u01a5\3\2\2\2\u0194\u0195\7(\2\2\u0195"+
		"\u0196\7?\2\2\u0196\u0197\7\32\2\2\u0197\u0198\78\2\2\u0198\u0199\79\2"+
		"\2\u0199\u01a5\b\17\1\2\u019a\u019b\7(\2\2\u019b\u019c\7?\2\2\u019c\u019d"+
		"\7\33\2\2\u019d\u019e\78\2\2\u019e\u019f\7#\2\2\u019f\u01a0\7>\2\2\u01a0"+
		"\u01a1\5*\26\2\u01a1\u01a2\79\2\2\u01a2\u01a3\b\17\1\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u018c\3\2\2\2\u01a4\u0194\3\2\2\2\u01a4\u019a\3\2\2\2\u01a5"+
		"\35\3\2\2\2\u01a6\u01a7\7\r\2\2\u01a7\u01a8\5*\26\2\u01a8\u01a9\7:\2\2"+
		"\u01a9\u01aa\5\4\3\2\u01aa\u01ab\7;\2\2\u01ab\u01ac\b\20\1\2\u01ac\u01cd"+
		"\3\2\2\2\u01ad\u01ae\7\r\2\2\u01ae\u01af\5*\26\2\u01af\u01b0\7:\2\2\u01b0"+
		"\u01b1\5\4\3\2\u01b1\u01b2\7;\2\2\u01b2\u01b3\7\16\2\2\u01b3\u01b4\7:"+
		"\2\2\u01b4\u01b5\5\4\3\2\u01b5\u01b6\7;\2\2\u01b6\u01b7\b\20\1\2\u01b7"+
		"\u01cd\3\2\2\2\u01b8\u01b9\7\r\2\2\u01b9\u01ba\5*\26\2\u01ba\u01bb\7:"+
		"\2\2\u01bb\u01bc\5\4\3\2\u01bc\u01bd\7;\2\2\u01bd\u01be\5 \21\2\u01be"+
		"\u01bf\b\20\1\2\u01bf\u01cd\3\2\2\2\u01c0\u01c1\7\r\2\2\u01c1\u01c2\5"+
		"*\26\2\u01c2\u01c3\7:\2\2\u01c3\u01c4\5\4\3\2\u01c4\u01c5\7;\2\2\u01c5"+
		"\u01c6\5 \21\2\u01c6\u01c7\7\16\2\2\u01c7\u01c8\7:\2\2\u01c8\u01c9\5\4"+
		"\3\2\u01c9\u01ca\7;\2\2\u01ca\u01cb\b\20\1\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01a6\3\2\2\2\u01cc\u01ad\3\2\2\2\u01cc\u01b8\3\2\2\2\u01cc\u01c0\3\2"+
		"\2\2\u01cd\37\3\2\2\2\u01ce\u01cf\b\21\1\2\u01cf\u01d0\7\16\2\2\u01d0"+
		"\u01d1\7\r\2\2\u01d1\u01d2\5*\26\2\u01d2\u01d3\7:\2\2\u01d3\u01d4\5\4"+
		"\3\2\u01d4\u01d5\7;\2\2\u01d5\u01d6\b\21\1\2\u01d6\u01e2\3\2\2\2\u01d7"+
		"\u01d8\f\4\2\2\u01d8\u01d9\7\16\2\2\u01d9\u01da\7\r\2\2\u01da\u01db\5"+
		"*\26\2\u01db\u01dc\7:\2\2\u01dc\u01dd\5\4\3\2\u01dd\u01de\7;\2\2\u01de"+
		"\u01df\b\21\1\2\u01df\u01e1\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e1\u01e4\3"+
		"\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3!\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e5\u01e6\7\17\2\2\u01e6\u01e7\5*\26\2\u01e7\u01e8\7:\2\2\u01e8"+
		"\u01e9\5$\23\2\u01e9\u01ea\7\21\2\2\u01ea\u01eb\7>\2\2\u01eb\u01ec\5\4"+
		"\3\2\u01ec\u01ed\7;\2\2\u01ed\u01ee\b\22\1\2\u01ee\u01f7\3\2\2\2\u01ef"+
		"\u01f0\7\17\2\2\u01f0\u01f1\5*\26\2\u01f1\u01f2\7:\2\2\u01f2\u01f3\5$"+
		"\23\2\u01f3\u01f4\7;\2\2\u01f4\u01f5\b\22\1\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01e5\3\2\2\2\u01f6\u01ef\3\2\2\2\u01f7#\3\2\2\2\u01f8\u01f9\b\23\1\2"+
		"\u01f9\u01fa\7\20\2\2\u01fa\u01fb\5*\26\2\u01fb\u01fc\7>\2\2\u01fc\u01fd"+
		"\5\4\3\2\u01fd\u01fe\b\23\1\2\u01fe\u0208\3\2\2\2\u01ff\u0200\f\4\2\2"+
		"\u0200\u0201\7\20\2\2\u0201\u0202\5*\26\2\u0202\u0203\7>\2\2\u0203\u0204"+
		"\5\4\3\2\u0204\u0205\b\23\1\2\u0205\u0207\3\2\2\2\u0206\u01ff\3\2\2\2"+
		"\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209%\3"+
		"\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7\25\2\2\u020c\u020d\5*\26\2\u020d"+
		"\u020e\7:\2\2\u020e\u020f\5\4\3\2\u020f\u0210\7;\2\2\u0210\u0211\b\24"+
		"\1\2\u0211\'\3\2\2\2\u0212\u0213\7\26\2\2\u0213\u0214\7(\2\2\u0214\u0215"+
		"\7\27\2\2\u0215\u0216\5*\26\2\u0216\u0217\7F\2\2\u0217\u0218\5*\26\2\u0218"+
		"\u0219\7:\2\2\u0219\u021a\5\4\3\2\u021a\u021b\7;\2\2\u021b\u021c\b\25"+
		"\1\2\u021c\u0227\3\2\2\2\u021d\u021e\7\26\2\2\u021e\u021f\7(\2\2\u021f"+
		"\u0220\7\27\2\2\u0220\u0221\5*\26\2\u0221\u0222\7:\2\2\u0222\u0223\5\4"+
		"\3\2\u0223\u0224\7;\2\2\u0224\u0225\b\25\1\2\u0225\u0227\3\2\2\2\u0226"+
		"\u0212\3\2\2\2\u0226\u021d\3\2\2\2\u0227)\3\2\2\2\u0228\u0229\b\26\1\2"+
		"\u0229\u022a\7+\2\2\u022a\u022b\5*\26\21\u022b\u022c\b\26\1\2\u022c\u026a"+
		"\3\2\2\2\u022d\u022e\7\67\2\2\u022e\u022f\5*\26\20\u022f\u0230\b\26\1"+
		"\2\u0230\u026a\3\2\2\2\u0231\u0232\78\2\2\u0232\u0233\5*\26\2\u0233\u0234"+
		"\79\2\2\u0234\u0235\b\26\1\2\u0235\u026a\3\2\2\2\u0236\u0237\7(\2\2\u0237"+
		"\u026a\b\26\1\2\u0238\u0239\5,\27\2\u0239\u023a\b\26\1\2\u023a\u026a\3"+
		"\2\2\2\u023b\u023c\7\3\2\2\u023c\u023d\78\2\2\u023d\u023e\5*\26\2\u023e"+
		"\u023f\79\2\2\u023f\u0240\b\26\1\2\u0240\u026a\3\2\2\2\u0241\u0242\7\4"+
		"\2\2\u0242\u0243\78\2\2\u0243\u0244\5*\26\2\u0244\u0245\79\2\2\u0245\u0246"+
		"\b\26\1\2\u0246\u026a\3\2\2\2\u0247\u0248\7\5\2\2\u0248\u0249\78\2\2\u0249"+
		"\u024a\5*\26\2\u024a\u024b\79\2\2\u024b\u024c\b\26\1\2\u024c\u026a\3\2"+
		"\2\2\u024d\u024e\5\60\31\2\u024e\u024f\b\26\1\2\u024f\u026a\3\2\2\2\u0250"+
		"\u0251\7<\2\2\u0251\u0252\5.\30\2\u0252\u0253\7=\2\2\u0253\u0254\b\26"+
		"\1\2\u0254\u026a\3\2\2\2\u0255\u0256\7(\2\2\u0256\u0257\7?\2\2\u0257\u0258"+
		"\7\35\2\2\u0258\u026a\b\26\1\2\u0259\u025a\7(\2\2\u025a\u025b\7?\2\2\u025b"+
		"\u025c\7\34\2\2\u025c\u026a\b\26\1\2\u025d\u025e\5\62\32\2\u025e\u025f"+
		"\b\26\1\2\u025f\u026a\3\2\2\2\u0260\u0261\7(\2\2\u0261\u0262\78\2\2\u0262"+
		"\u0263\5\64\33\2\u0263\u0264\79\2\2\u0264\u0265\b\26\1\2\u0265\u026a\3"+
		"\2\2\2\u0266\u0267\5\22\n\2\u0267\u0268\b\26\1\2\u0268\u026a\3\2\2\2\u0269"+
		"\u0228\3\2\2\2\u0269\u022d\3\2\2\2\u0269\u0231\3\2\2\2\u0269\u0236\3\2"+
		"\2\2\u0269\u0238\3\2\2\2\u0269\u023b\3\2\2\2\u0269\u0241\3\2\2\2\u0269"+
		"\u0247\3\2\2\2\u0269\u024d\3\2\2\2\u0269\u0250\3\2\2\2\u0269\u0255\3\2"+
		"\2\2\u0269\u0259\3\2\2\2\u0269\u025d\3\2\2\2\u0269\u0260\3\2\2\2\u0269"+
		"\u0266\3\2\2\2\u026a\u0290\3\2\2\2\u026b\u026c\f\30\2\2\u026c\u026d\t"+
		"\3\2\2\u026d\u026e\5*\26\31\u026e\u026f\b\26\1\2\u026f\u028f\3\2\2\2\u0270"+
		"\u0271\f\27\2\2\u0271\u0272\t\4\2\2\u0272\u0273\5*\26\30\u0273\u0274\b"+
		"\26\1\2\u0274\u028f\3\2\2\2\u0275\u0276\f\26\2\2\u0276\u0277\t\5\2\2\u0277"+
		"\u0278\5*\26\27\u0278\u0279\b\26\1\2\u0279\u028f\3\2\2\2\u027a\u027b\f"+
		"\25\2\2\u027b\u027c\t\6\2\2\u027c\u027d\5*\26\26\u027d\u027e\b\26\1\2"+
		"\u027e\u028f\3\2\2\2\u027f\u0280\f\24\2\2\u0280\u0281\t\7\2\2\u0281\u0282"+
		"\5*\26\25\u0282\u0283\b\26\1\2\u0283\u028f\3\2\2\2\u0284\u0285\f\23\2"+
		"\2\u0285\u0286\7-\2\2\u0286\u0287\5*\26\24\u0287\u0288\b\26\1\2\u0288"+
		"\u028f\3\2\2\2\u0289\u028a\f\22\2\2\u028a\u028b\7,\2\2\u028b\u028c\5*"+
		"\26\23\u028c\u028d\b\26\1\2\u028d\u028f\3\2\2\2\u028e\u026b\3\2\2\2\u028e"+
		"\u0270\3\2\2\2\u028e\u0275\3\2\2\2\u028e\u027a\3\2\2\2\u028e\u027f\3\2"+
		"\2\2\u028e\u0284\3\2\2\2\u028e\u0289\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291+\3\2\2\2\u0292\u0290\3\2\2\2"+
		"\u0293\u0294\7%\2\2\u0294\u029e\b\27\1\2\u0295\u0296\7&\2\2\u0296\u029e"+
		"\b\27\1\2\u0297\u0298\7\'\2\2\u0298\u029e\b\27\1\2\u0299\u029a\7\n\2\2"+
		"\u029a\u029e\b\27\1\2\u029b\u029c\7\13\2\2\u029c\u029e\b\27\1\2\u029d"+
		"\u0293\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u0297\3\2\2\2\u029d\u0299\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029e-\3\2\2\2\u029f\u02a0\b\30\1\2\u02a0\u02a1"+
		"\5*\26\2\u02a1\u02a2\b\30\1\2\u02a2\u02aa\3\2\2\2\u02a3\u02a4\f\4\2\2"+
		"\u02a4\u02a5\7@\2\2\u02a5\u02a6\5*\26\2\u02a6\u02a7\b\30\1\2\u02a7\u02a9"+
		"\3\2\2\2\u02a8\u02a3\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab/\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\b\31\1\2"+
		"\u02ae\u02af\7(\2\2\u02af\u02b0\b\31\1\2\u02b0\u02bd\3\2\2\2\u02b1\u02b2"+
		"\f\5\2\2\u02b2\u02b3\7<\2\2\u02b3\u02b4\5*\26\2\u02b4\u02b5\7=\2\2\u02b5"+
		"\u02b6\b\31\1\2\u02b6\u02bc\3\2\2\2\u02b7\u02b8\f\3\2\2\u02b8\u02b9\7"+
		"?\2\2\u02b9\u02ba\7(\2\2\u02ba\u02bc\b\31\1\2\u02bb\u02b1\3\2\2\2\u02bb"+
		"\u02b7\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02be\61\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\b\32\1\2\u02c1\u02c2"+
		"\7<\2\2\u02c2\u02c3\5*\26\2\u02c3\u02c4\7=\2\2\u02c4\u02c5\b\32\1\2\u02c5"+
		"\u02ce\3\2\2\2\u02c6\u02c7\f\4\2\2\u02c7\u02c8\7<\2\2\u02c8\u02c9\5*\26"+
		"\2\u02c9\u02ca\7=\2\2\u02ca\u02cb\b\32\1\2\u02cb\u02cd\3\2\2\2\u02cc\u02c6"+
		"\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\63\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\b\33\1\2\u02d2\u02d3\7(\2"+
		"\2\u02d3\u02d4\7>\2\2\u02d4\u02d5\5*\26\2\u02d5\u02d6\b\33\1\2\u02d6\u02d9"+
		"\3\2\2\2\u02d7\u02d9\b\33\1\2\u02d8\u02d1\3\2\2\2\u02d8\u02d7\3\2\2\2"+
		"\u02d9\u02e3\3\2\2\2\u02da\u02db\f\5\2\2\u02db\u02dc\7@\2\2\u02dc\u02dd"+
		"\7(\2\2\u02dd\u02de\7>\2\2\u02de\u02df\5*\26\2\u02df\u02e0\b\33\1\2\u02e0"+
		"\u02e2\3\2\2\2\u02e1\u02da\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e3\u02e4\3\2\2\2\u02e4\65\3\2\2\2\u02e5\u02e3\3\2\2\2(=CI^civ"+
		"\u0087\u0093\u00c0\u00c4\u00c9\u00cf\u00d4\u00d9\u00e0\u00ed\u00f9\u0107"+
		"\u0168\u0179\u018a\u01a4\u01cc\u01e2\u01f6\u0208\u0226\u0269\u028e\u0290"+
		"\u029d\u02aa\u02bb\u02bd\u02ce\u02d8\u02e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}