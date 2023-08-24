// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import (
	"fmt"
	"strconv"
	"sync"

	"github.com/antlr4-go/antlr/v4"
)

import "Backend/interfaces"
import "Backend/environment"
import "Backend/expressions"
import "Backend/instructions"
import "strings"

// Suppress unused import errors
var _ = fmt.Printf
var _ = strconv.Itoa
var _ = sync.Once{}

type SwiftGrammarParser struct {
	*antlr.BaseParser
}

var SwiftGrammarParserStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	LiteralNames           []string
	SymbolicNames          []string
	RuleNames              []string
	PredictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func swiftgrammarParserInit() {
	staticData := &SwiftGrammarParserStaticData
	staticData.LiteralNames = []string{
		"", "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", "'var'",
		"'let'", "'true'", "'false'", "'print'", "'if'", "'else'", "'switch'",
		"'case'", "'default'", "'break'", "'continue'", "'return'", "'while'",
		"'for'", "'in'", "'guard'", "'append'", "'removeLast'", "'remove'",
		"'IsEmpty'", "'count'", "'repeating'", "'struct'", "'self'", "'mutating'",
		"'func'", "", "", "", "", "'!='", "'=='", "'!'", "'||'", "'&&'", "'='",
		"'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", "'('",
		"')'", "'{'", "'}'", "'['", "']'", "':'", "','", "'?'", "'->'", "'&'",
	}
	staticData.SymbolicNames = []string{
		"", "INT", "FLOAT", "TSTRING", "BOOL", "CHAR", "VAR", "LET", "TRU",
		"FAL", "PRINT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK",
		"CONTINUE", "RETURN", "WHILE", "FOR", "IN", "GUARD", "APPEND", "REMOVELAST",
		"REMOVE", "ISEMPTY", "COUNT", "REPEATING", "STRUCT", "SELF", "MUTATING",
		"FUNC", "NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG", "NOT",
		"OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD", "MUL",
		"DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ",
		"CORDER", "DOSP", "COMA", "INTCE", "FLECHA", "AMP", "WHITESPACE", "COMMENT",
		"LINE_COMMENT",
	}
	staticData.RuleNames = []string{
		"s", "block", "instruction", "printstmt", "variablestmt", "typestmt",
		"ifstmt", "expr", "primitives",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 65, 178, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7,
		4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 1, 0, 1, 0, 1, 0, 1,
		0, 1, 1, 4, 1, 24, 8, 1, 11, 1, 12, 1, 25, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2,
		1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 39, 8, 2, 1, 3, 1, 3, 1, 3, 1,
		3, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1,
		4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1,
		4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1,
		4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 87, 8, 4, 1, 5, 1, 5, 1, 5,
		1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 3, 5, 99, 8, 5, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 3, 7, 122, 8, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 5, 7, 159, 8, 7, 10,
		7, 12, 7, 162, 9, 7, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1,
		8, 1, 8, 1, 8, 1, 8, 3, 8, 176, 8, 8, 1, 8, 0, 1, 14, 9, 0, 2, 4, 6, 8,
		10, 12, 14, 16, 0, 5, 1, 0, 47, 49, 1, 0, 50, 51, 2, 0, 43, 43, 45, 45,
		2, 0, 44, 44, 46, 46, 1, 0, 37, 38, 194, 0, 18, 1, 0, 0, 0, 2, 23, 1, 0,
		0, 0, 4, 38, 1, 0, 0, 0, 6, 40, 1, 0, 0, 0, 8, 86, 1, 0, 0, 0, 10, 98,
		1, 0, 0, 0, 12, 100, 1, 0, 0, 0, 14, 121, 1, 0, 0, 0, 16, 175, 1, 0, 0,
		0, 18, 19, 3, 2, 1, 0, 19, 20, 5, 0, 0, 1, 20, 21, 6, 0, -1, 0, 21, 1,
		1, 0, 0, 0, 22, 24, 3, 4, 2, 0, 23, 22, 1, 0, 0, 0, 24, 25, 1, 0, 0, 0,
		25, 23, 1, 0, 0, 0, 25, 26, 1, 0, 0, 0, 26, 27, 1, 0, 0, 0, 27, 28, 6,
		1, -1, 0, 28, 3, 1, 0, 0, 0, 29, 30, 3, 6, 3, 0, 30, 31, 6, 2, -1, 0, 31,
		39, 1, 0, 0, 0, 32, 33, 3, 8, 4, 0, 33, 34, 6, 2, -1, 0, 34, 39, 1, 0,
		0, 0, 35, 36, 3, 12, 6, 0, 36, 37, 6, 2, -1, 0, 37, 39, 1, 0, 0, 0, 38,
		29, 1, 0, 0, 0, 38, 32, 1, 0, 0, 0, 38, 35, 1, 0, 0, 0, 39, 5, 1, 0, 0,
		0, 40, 41, 5, 10, 0, 0, 41, 42, 5, 52, 0, 0, 42, 43, 3, 14, 7, 0, 43, 44,
		5, 53, 0, 0, 44, 45, 6, 3, -1, 0, 45, 7, 1, 0, 0, 0, 46, 47, 5, 6, 0, 0,
		47, 48, 5, 36, 0, 0, 48, 49, 5, 58, 0, 0, 49, 50, 3, 10, 5, 0, 50, 51,
		5, 42, 0, 0, 51, 52, 3, 14, 7, 0, 52, 53, 6, 4, -1, 0, 53, 87, 1, 0, 0,
		0, 54, 55, 5, 6, 0, 0, 55, 56, 5, 36, 0, 0, 56, 57, 5, 42, 0, 0, 57, 58,
		3, 14, 7, 0, 58, 59, 6, 4, -1, 0, 59, 87, 1, 0, 0, 0, 60, 61, 5, 6, 0,
		0, 61, 62, 5, 36, 0, 0, 62, 63, 5, 58, 0, 0, 63, 64, 3, 10, 5, 0, 64, 65,
		5, 60, 0, 0, 65, 66, 6, 4, -1, 0, 66, 87, 1, 0, 0, 0, 67, 68, 5, 36, 0,
		0, 68, 69, 5, 42, 0, 0, 69, 70, 3, 14, 7, 0, 70, 71, 6, 4, -1, 0, 71, 87,
		1, 0, 0, 0, 72, 73, 5, 7, 0, 0, 73, 74, 5, 36, 0, 0, 74, 75, 5, 42, 0,
		0, 75, 76, 3, 16, 8, 0, 76, 77, 6, 4, -1, 0, 77, 87, 1, 0, 0, 0, 78, 79,
		5, 7, 0, 0, 79, 80, 5, 36, 0, 0, 80, 81, 5, 58, 0, 0, 81, 82, 3, 10, 5,
		0, 82, 83, 5, 42, 0, 0, 83, 84, 3, 16, 8, 0, 84, 85, 6, 4, -1, 0, 85, 87,
		1, 0, 0, 0, 86, 46, 1, 0, 0, 0, 86, 54, 1, 0, 0, 0, 86, 60, 1, 0, 0, 0,
		86, 67, 1, 0, 0, 0, 86, 72, 1, 0, 0, 0, 86, 78, 1, 0, 0, 0, 87, 9, 1, 0,
		0, 0, 88, 89, 5, 1, 0, 0, 89, 99, 6, 5, -1, 0, 90, 91, 5, 2, 0, 0, 91,
		99, 6, 5, -1, 0, 92, 93, 5, 3, 0, 0, 93, 99, 6, 5, -1, 0, 94, 95, 5, 4,
		0, 0, 95, 99, 6, 5, -1, 0, 96, 97, 5, 5, 0, 0, 97, 99, 6, 5, -1, 0, 98,
		88, 1, 0, 0, 0, 98, 90, 1, 0, 0, 0, 98, 92, 1, 0, 0, 0, 98, 94, 1, 0, 0,
		0, 98, 96, 1, 0, 0, 0, 99, 11, 1, 0, 0, 0, 100, 101, 5, 11, 0, 0, 101,
		102, 5, 52, 0, 0, 102, 103, 3, 14, 7, 0, 103, 104, 5, 53, 0, 0, 104, 105,
		5, 54, 0, 0, 105, 106, 3, 2, 1, 0, 106, 107, 5, 55, 0, 0, 107, 13, 1, 0,
		0, 0, 108, 109, 6, 7, -1, 0, 109, 110, 5, 39, 0, 0, 110, 111, 3, 14, 7,
		3, 111, 112, 6, 7, -1, 0, 112, 122, 1, 0, 0, 0, 113, 114, 5, 52, 0, 0,
		114, 115, 3, 14, 7, 0, 115, 116, 5, 53, 0, 0, 116, 117, 6, 7, -1, 0, 117,
		122, 1, 0, 0, 0, 118, 119, 3, 16, 8, 0, 119, 120, 6, 7, -1, 0, 120, 122,
		1, 0, 0, 0, 121, 108, 1, 0, 0, 0, 121, 113, 1, 0, 0, 0, 121, 118, 1, 0,
		0, 0, 122, 160, 1, 0, 0, 0, 123, 124, 10, 10, 0, 0, 124, 125, 7, 0, 0,
		0, 125, 126, 3, 14, 7, 11, 126, 127, 6, 7, -1, 0, 127, 159, 1, 0, 0, 0,
		128, 129, 10, 9, 0, 0, 129, 130, 7, 1, 0, 0, 130, 131, 3, 14, 7, 10, 131,
		132, 6, 7, -1, 0, 132, 159, 1, 0, 0, 0, 133, 134, 10, 8, 0, 0, 134, 135,
		7, 2, 0, 0, 135, 136, 3, 14, 7, 9, 136, 137, 6, 7, -1, 0, 137, 159, 1,
		0, 0, 0, 138, 139, 10, 7, 0, 0, 139, 140, 7, 3, 0, 0, 140, 141, 3, 14,
		7, 8, 141, 142, 6, 7, -1, 0, 142, 159, 1, 0, 0, 0, 143, 144, 10, 6, 0,
		0, 144, 145, 7, 4, 0, 0, 145, 146, 3, 14, 7, 7, 146, 147, 6, 7, -1, 0,
		147, 159, 1, 0, 0, 0, 148, 149, 10, 5, 0, 0, 149, 150, 5, 41, 0, 0, 150,
		151, 3, 14, 7, 6, 151, 152, 6, 7, -1, 0, 152, 159, 1, 0, 0, 0, 153, 154,
		10, 4, 0, 0, 154, 155, 5, 40, 0, 0, 155, 156, 3, 14, 7, 5, 156, 157, 6,
		7, -1, 0, 157, 159, 1, 0, 0, 0, 158, 123, 1, 0, 0, 0, 158, 128, 1, 0, 0,
		0, 158, 133, 1, 0, 0, 0, 158, 138, 1, 0, 0, 0, 158, 143, 1, 0, 0, 0, 158,
		148, 1, 0, 0, 0, 158, 153, 1, 0, 0, 0, 159, 162, 1, 0, 0, 0, 160, 158,
		1, 0, 0, 0, 160, 161, 1, 0, 0, 0, 161, 15, 1, 0, 0, 0, 162, 160, 1, 0,
		0, 0, 163, 164, 5, 33, 0, 0, 164, 176, 6, 8, -1, 0, 165, 166, 5, 34, 0,
		0, 166, 176, 6, 8, -1, 0, 167, 168, 5, 35, 0, 0, 168, 176, 6, 8, -1, 0,
		169, 170, 5, 36, 0, 0, 170, 176, 6, 8, -1, 0, 171, 172, 5, 8, 0, 0, 172,
		176, 6, 8, -1, 0, 173, 174, 5, 9, 0, 0, 174, 176, 6, 8, -1, 0, 175, 163,
		1, 0, 0, 0, 175, 165, 1, 0, 0, 0, 175, 167, 1, 0, 0, 0, 175, 169, 1, 0,
		0, 0, 175, 171, 1, 0, 0, 0, 175, 173, 1, 0, 0, 0, 176, 17, 1, 0, 0, 0,
		8, 25, 38, 86, 98, 121, 158, 160, 175,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// SwiftGrammarParserInit initializes any static state used to implement SwiftGrammarParser. By default the
// static state used to implement the parser is lazily initialized during the first call to
// NewSwiftGrammarParser(). You can call this function if you wish to initialize the static state ahead
// of time.
func SwiftGrammarParserInit() {
	staticData := &SwiftGrammarParserStaticData
	staticData.once.Do(swiftgrammarParserInit)
}

// NewSwiftGrammarParser produces a new parser instance for the optional input antlr.TokenStream.
func NewSwiftGrammarParser(input antlr.TokenStream) *SwiftGrammarParser {
	SwiftGrammarParserInit()
	this := new(SwiftGrammarParser)
	this.BaseParser = antlr.NewBaseParser(input)
	staticData := &SwiftGrammarParserStaticData
	this.Interpreter = antlr.NewParserATNSimulator(this, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	this.RuleNames = staticData.RuleNames
	this.LiteralNames = staticData.LiteralNames
	this.SymbolicNames = staticData.SymbolicNames
	this.GrammarFileName = "SwiftGrammar.g4"

	return this
}

// SwiftGrammarParser tokens.
const (
	SwiftGrammarParserEOF          = antlr.TokenEOF
	SwiftGrammarParserINT          = 1
	SwiftGrammarParserFLOAT        = 2
	SwiftGrammarParserTSTRING      = 3
	SwiftGrammarParserBOOL         = 4
	SwiftGrammarParserCHAR         = 5
	SwiftGrammarParserVAR          = 6
	SwiftGrammarParserLET          = 7
	SwiftGrammarParserTRU          = 8
	SwiftGrammarParserFAL          = 9
	SwiftGrammarParserPRINT        = 10
	SwiftGrammarParserIF           = 11
	SwiftGrammarParserELSE         = 12
	SwiftGrammarParserSWITCH       = 13
	SwiftGrammarParserCASE         = 14
	SwiftGrammarParserDEFAULT      = 15
	SwiftGrammarParserBREAK        = 16
	SwiftGrammarParserCONTINUE     = 17
	SwiftGrammarParserRETURN       = 18
	SwiftGrammarParserWHILE        = 19
	SwiftGrammarParserFOR          = 20
	SwiftGrammarParserIN           = 21
	SwiftGrammarParserGUARD        = 22
	SwiftGrammarParserAPPEND       = 23
	SwiftGrammarParserREMOVELAST   = 24
	SwiftGrammarParserREMOVE       = 25
	SwiftGrammarParserISEMPTY      = 26
	SwiftGrammarParserCOUNT        = 27
	SwiftGrammarParserREPEATING    = 28
	SwiftGrammarParserSTRUCT       = 29
	SwiftGrammarParserSELF         = 30
	SwiftGrammarParserMUTATING     = 31
	SwiftGrammarParserFUNC         = 32
	SwiftGrammarParserNUMBER       = 33
	SwiftGrammarParserCHARACTER    = 34
	SwiftGrammarParserSTRING       = 35
	SwiftGrammarParserID           = 36
	SwiftGrammarParserDIF          = 37
	SwiftGrammarParserIG_IG        = 38
	SwiftGrammarParserNOT          = 39
	SwiftGrammarParserOR           = 40
	SwiftGrammarParserAND          = 41
	SwiftGrammarParserIG           = 42
	SwiftGrammarParserMAY_IG       = 43
	SwiftGrammarParserMEN_IG       = 44
	SwiftGrammarParserMAYOR        = 45
	SwiftGrammarParserMENOR        = 46
	SwiftGrammarParserMOD          = 47
	SwiftGrammarParserMUL          = 48
	SwiftGrammarParserDIV          = 49
	SwiftGrammarParserADD          = 50
	SwiftGrammarParserSUB          = 51
	SwiftGrammarParserPARIZQ       = 52
	SwiftGrammarParserPARDER       = 53
	SwiftGrammarParserLLAVEIZQ     = 54
	SwiftGrammarParserLLAVEDER     = 55
	SwiftGrammarParserCORIZQ       = 56
	SwiftGrammarParserCORDER       = 57
	SwiftGrammarParserDOSP         = 58
	SwiftGrammarParserCOMA         = 59
	SwiftGrammarParserINTCE        = 60
	SwiftGrammarParserFLECHA       = 61
	SwiftGrammarParserAMP          = 62
	SwiftGrammarParserWHITESPACE   = 63
	SwiftGrammarParserCOMMENT      = 64
	SwiftGrammarParserLINE_COMMENT = 65
)

// SwiftGrammarParser rules.
const (
	SwiftGrammarParserRULE_s            = 0
	SwiftGrammarParserRULE_block        = 1
	SwiftGrammarParserRULE_instruction  = 2
	SwiftGrammarParserRULE_printstmt    = 3
	SwiftGrammarParserRULE_variablestmt = 4
	SwiftGrammarParserRULE_typestmt     = 5
	SwiftGrammarParserRULE_ifstmt       = 6
	SwiftGrammarParserRULE_expr         = 7
	SwiftGrammarParserRULE_primitives   = 8
)

// ISContext is an interface to support dynamic dispatch.
type ISContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// GetCode returns the code attribute.
	GetCode() []interface{}

	// SetCode sets the code attribute.
	SetCode([]interface{})

	// Getter signatures
	Block() IBlockContext
	EOF() antlr.TerminalNode

	// IsSContext differentiates from other interfaces.
	IsSContext()
}

type SContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	code   []interface{}
	_block IBlockContext
}

func NewEmptySContext() *SContext {
	var p = new(SContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_s
	return p
}

func InitEmptySContext(p *SContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_s
}

func (*SContext) IsSContext() {}

func NewSContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SContext {
	var p = new(SContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_s

	return p
}

func (s *SContext) GetParser() antlr.Parser { return s.parser }

func (s *SContext) Get_block() IBlockContext { return s._block }

func (s *SContext) Set_block(v IBlockContext) { s._block = v }

func (s *SContext) GetCode() []interface{} { return s.code }

func (s *SContext) SetCode(v []interface{}) { s.code = v }

func (s *SContext) Block() IBlockContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockContext)
}

func (s *SContext) EOF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserEOF, 0)
}

func (s *SContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterS(s)
	}
}

func (s *SContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitS(s)
	}
}

func (p *SwiftGrammarParser) S() (localctx ISContext) {
	localctx = NewSContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, SwiftGrammarParserRULE_s)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(18)

		var _x = p.Block()

		localctx.(*SContext)._block = _x
	}
	{
		p.SetState(19)
		p.Match(SwiftGrammarParserEOF)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

	localctx.(*SContext).code = localctx.(*SContext).Get_block().GetBlk()

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IBlockContext is an interface to support dynamic dispatch.
type IBlockContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruction returns the _instruction rule contexts.
	Get_instruction() IInstructionContext

	// Set_instruction sets the _instruction rule contexts.
	Set_instruction(IInstructionContext)

	// GetIns returns the ins rule context list.
	GetIns() []IInstructionContext

	// SetIns sets the ins rule context list.
	SetIns([]IInstructionContext)

	// GetBlk returns the blk attribute.
	GetBlk() []interface{}

	// SetBlk sets the blk attribute.
	SetBlk([]interface{})

	// Getter signatures
	AllInstruction() []IInstructionContext
	Instruction(i int) IInstructionContext

	// IsBlockContext differentiates from other interfaces.
	IsBlockContext()
}

type BlockContext struct {
	antlr.BaseParserRuleContext
	parser       antlr.Parser
	blk          []interface{}
	_instruction IInstructionContext
	ins          []IInstructionContext
}

func NewEmptyBlockContext() *BlockContext {
	var p = new(BlockContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_block
	return p
}

func InitEmptyBlockContext(p *BlockContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_block
}

func (*BlockContext) IsBlockContext() {}

func NewBlockContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BlockContext {
	var p = new(BlockContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_block

	return p
}

func (s *BlockContext) GetParser() antlr.Parser { return s.parser }

func (s *BlockContext) Get_instruction() IInstructionContext { return s._instruction }

func (s *BlockContext) Set_instruction(v IInstructionContext) { s._instruction = v }

func (s *BlockContext) GetIns() []IInstructionContext { return s.ins }

func (s *BlockContext) SetIns(v []IInstructionContext) { s.ins = v }

func (s *BlockContext) GetBlk() []interface{} { return s.blk }

func (s *BlockContext) SetBlk(v []interface{}) { s.blk = v }

func (s *BlockContext) AllInstruction() []IInstructionContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IInstructionContext); ok {
			len++
		}
	}

	tst := make([]IInstructionContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IInstructionContext); ok {
			tst[i] = t.(IInstructionContext)
			i++
		}
	}

	return tst
}

func (s *BlockContext) Instruction(i int) IInstructionContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IInstructionContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(IInstructionContext)
}

func (s *BlockContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BlockContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BlockContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBlock(s)
	}
}

func (s *BlockContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBlock(s)
	}
}

func (p *SwiftGrammarParser) Block() (localctx IBlockContext) {
	localctx = NewBlockContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, SwiftGrammarParserRULE_block)

	localctx.(*BlockContext).blk = []interface{}{}
	var listInt []IInstructionContext

	var _la int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(23)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&68719480000) != 0) {
		{
			p.SetState(22)

			var _x = p.Instruction()

			localctx.(*BlockContext)._instruction = _x
		}
		localctx.(*BlockContext).ins = append(localctx.(*BlockContext).ins, localctx.(*BlockContext)._instruction)

		p.SetState(25)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}

	listInt = localctx.(*BlockContext).GetIns()
	for _, e := range listInt {
		localctx.(*BlockContext).blk = append(localctx.(*BlockContext).blk, e.GetInst())
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IInstructionContext is an interface to support dynamic dispatch.
type IInstructionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printstmt returns the _printstmt rule contexts.
	Get_printstmt() IPrintstmtContext

	// Get_variablestmt returns the _variablestmt rule contexts.
	Get_variablestmt() IVariablestmtContext

	// Set_printstmt sets the _printstmt rule contexts.
	Set_printstmt(IPrintstmtContext)

	// Set_variablestmt sets the _variablestmt rule contexts.
	Set_variablestmt(IVariablestmtContext)

	// GetInst returns the inst attribute.
	GetInst() interfaces.Instruction

	// SetInst sets the inst attribute.
	SetInst(interfaces.Instruction)

	// Getter signatures
	Printstmt() IPrintstmtContext
	Variablestmt() IVariablestmtContext
	Ifstmt() IIfstmtContext

	// IsInstructionContext differentiates from other interfaces.
	IsInstructionContext()
}

type InstructionContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	inst          interfaces.Instruction
	_printstmt    IPrintstmtContext
	_variablestmt IVariablestmtContext
}

func NewEmptyInstructionContext() *InstructionContext {
	var p = new(InstructionContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_instruction
	return p
}

func InitEmptyInstructionContext(p *InstructionContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_instruction
}

func (*InstructionContext) IsInstructionContext() {}

func NewInstructionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionContext {
	var p = new(InstructionContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_instruction

	return p
}

func (s *InstructionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionContext) Get_printstmt() IPrintstmtContext { return s._printstmt }

func (s *InstructionContext) Get_variablestmt() IVariablestmtContext { return s._variablestmt }

func (s *InstructionContext) Set_printstmt(v IPrintstmtContext) { s._printstmt = v }

func (s *InstructionContext) Set_variablestmt(v IVariablestmtContext) { s._variablestmt = v }

func (s *InstructionContext) GetInst() interfaces.Instruction { return s.inst }

func (s *InstructionContext) SetInst(v interfaces.Instruction) { s.inst = v }

func (s *InstructionContext) Printstmt() IPrintstmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IPrintstmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IPrintstmtContext)
}

func (s *InstructionContext) Variablestmt() IVariablestmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVariablestmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVariablestmtContext)
}

func (s *InstructionContext) Ifstmt() IIfstmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IIfstmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IIfstmtContext)
}

func (s *InstructionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterInstruction(s)
	}
}

func (s *InstructionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitInstruction(s)
	}
}

func (p *SwiftGrammarParser) Instruction() (localctx IInstructionContext) {
	localctx = NewInstructionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, SwiftGrammarParserRULE_instruction)
	p.SetState(38)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserPRINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(29)

			var _x = p.Printstmt()

			localctx.(*InstructionContext)._printstmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_printstmt().GetPrnt()

	case SwiftGrammarParserVAR, SwiftGrammarParserLET, SwiftGrammarParserID:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(32)

			var _x = p.Variablestmt()

			localctx.(*InstructionContext)._variablestmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_variablestmt().GetVari()

	case SwiftGrammarParserIF:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(35)
			p.Ifstmt()
		}

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IPrintstmtContext is an interface to support dynamic dispatch.
type IPrintstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_PRINT returns the _PRINT token.
	Get_PRINT() antlr.Token

	// Set_PRINT sets the _PRINT token.
	Set_PRINT(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetPrnt returns the prnt attribute.
	GetPrnt() interfaces.Instruction

	// SetPrnt sets the prnt attribute.
	SetPrnt(interfaces.Instruction)

	// Getter signatures
	PRINT() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode

	// IsPrintstmtContext differentiates from other interfaces.
	IsPrintstmtContext()
}

type PrintstmtContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	prnt   interfaces.Instruction
	_PRINT antlr.Token
	_expr  IExprContext
}

func NewEmptyPrintstmtContext() *PrintstmtContext {
	var p = new(PrintstmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_printstmt
	return p
}

func InitEmptyPrintstmtContext(p *PrintstmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_printstmt
}

func (*PrintstmtContext) IsPrintstmtContext() {}

func NewPrintstmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrintstmtContext {
	var p = new(PrintstmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_printstmt

	return p
}

func (s *PrintstmtContext) GetParser() antlr.Parser { return s.parser }

func (s *PrintstmtContext) Get_PRINT() antlr.Token { return s._PRINT }

func (s *PrintstmtContext) Set_PRINT(v antlr.Token) { s._PRINT = v }

func (s *PrintstmtContext) Get_expr() IExprContext { return s._expr }

func (s *PrintstmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *PrintstmtContext) GetPrnt() interfaces.Instruction { return s.prnt }

func (s *PrintstmtContext) SetPrnt(v interfaces.Instruction) { s.prnt = v }

func (s *PrintstmtContext) PRINT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPRINT, 0)
}

func (s *PrintstmtContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *PrintstmtContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *PrintstmtContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *PrintstmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrintstmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrintstmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterPrintstmt(s)
	}
}

func (s *PrintstmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitPrintstmt(s)
	}
}

func (p *SwiftGrammarParser) Printstmt() (localctx IPrintstmtContext) {
	localctx = NewPrintstmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, SwiftGrammarParserRULE_printstmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(40)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(41)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(42)

		var _x = p.expr(0)

		localctx.(*PrintstmtContext)._expr = _x
	}
	{
		p.SetState(43)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*PrintstmtContext).prnt = instructions.NewPrint((func() int {
		if localctx.(*PrintstmtContext).Get_PRINT() == nil {
			return 0
		} else {
			return localctx.(*PrintstmtContext).Get_PRINT().GetLine()
		}
	}()), (func() int {
		if localctx.(*PrintstmtContext).Get_PRINT() == nil {
			return 0
		} else {
			return localctx.(*PrintstmtContext).Get_PRINT().GetColumn()
		}
	}()), localctx.(*PrintstmtContext).Get_expr().GetE())

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IVariablestmtContext is an interface to support dynamic dispatch.
type IVariablestmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_VAR returns the _VAR token.
	Get_VAR() antlr.Token

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Get_LET returns the _LET token.
	Get_LET() antlr.Token

	// Set_VAR sets the _VAR token.
	Set_VAR(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Set_LET sets the _LET token.
	Set_LET(antlr.Token)

	// Get_typestmt returns the _typestmt rule contexts.
	Get_typestmt() ITypestmtContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_primitives returns the _primitives rule contexts.
	Get_primitives() IPrimitivesContext

	// Set_typestmt sets the _typestmt rule contexts.
	Set_typestmt(ITypestmtContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_primitives sets the _primitives rule contexts.
	Set_primitives(IPrimitivesContext)

	// GetVari returns the vari attribute.
	GetVari() interfaces.Instruction

	// SetVari sets the vari attribute.
	SetVari(interfaces.Instruction)

	// Getter signatures
	VAR() antlr.TerminalNode
	ID() antlr.TerminalNode
	DOSP() antlr.TerminalNode
	Typestmt() ITypestmtContext
	IG() antlr.TerminalNode
	Expr() IExprContext
	INTCE() antlr.TerminalNode
	LET() antlr.TerminalNode
	Primitives() IPrimitivesContext

	// IsVariablestmtContext differentiates from other interfaces.
	IsVariablestmtContext()
}

type VariablestmtContext struct {
	antlr.BaseParserRuleContext
	parser      antlr.Parser
	vari        interfaces.Instruction
	_VAR        antlr.Token
	_ID         antlr.Token
	_typestmt   ITypestmtContext
	_expr       IExprContext
	_LET        antlr.Token
	_primitives IPrimitivesContext
}

func NewEmptyVariablestmtContext() *VariablestmtContext {
	var p = new(VariablestmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_variablestmt
	return p
}

func InitEmptyVariablestmtContext(p *VariablestmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_variablestmt
}

func (*VariablestmtContext) IsVariablestmtContext() {}

func NewVariablestmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VariablestmtContext {
	var p = new(VariablestmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_variablestmt

	return p
}

func (s *VariablestmtContext) GetParser() antlr.Parser { return s.parser }

func (s *VariablestmtContext) Get_VAR() antlr.Token { return s._VAR }

func (s *VariablestmtContext) Get_ID() antlr.Token { return s._ID }

func (s *VariablestmtContext) Get_LET() antlr.Token { return s._LET }

func (s *VariablestmtContext) Set_VAR(v antlr.Token) { s._VAR = v }

func (s *VariablestmtContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *VariablestmtContext) Set_LET(v antlr.Token) { s._LET = v }

func (s *VariablestmtContext) Get_typestmt() ITypestmtContext { return s._typestmt }

func (s *VariablestmtContext) Get_expr() IExprContext { return s._expr }

func (s *VariablestmtContext) Get_primitives() IPrimitivesContext { return s._primitives }

func (s *VariablestmtContext) Set_typestmt(v ITypestmtContext) { s._typestmt = v }

func (s *VariablestmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *VariablestmtContext) Set_primitives(v IPrimitivesContext) { s._primitives = v }

func (s *VariablestmtContext) GetVari() interfaces.Instruction { return s.vari }

func (s *VariablestmtContext) SetVari(v interfaces.Instruction) { s.vari = v }

func (s *VariablestmtContext) VAR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserVAR, 0)
}

func (s *VariablestmtContext) ID() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID, 0)
}

func (s *VariablestmtContext) DOSP() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOSP, 0)
}

func (s *VariablestmtContext) Typestmt() ITypestmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ITypestmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ITypestmtContext)
}

func (s *VariablestmtContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *VariablestmtContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *VariablestmtContext) INTCE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserINTCE, 0)
}

func (s *VariablestmtContext) LET() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLET, 0)
}

func (s *VariablestmtContext) Primitives() IPrimitivesContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IPrimitivesContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IPrimitivesContext)
}

func (s *VariablestmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VariablestmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VariablestmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterVariablestmt(s)
	}
}

func (s *VariablestmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitVariablestmt(s)
	}
}

func (p *SwiftGrammarParser) Variablestmt() (localctx IVariablestmtContext) {
	localctx = NewVariablestmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, SwiftGrammarParserRULE_variablestmt)
	p.SetState(86)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 2, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(46)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(47)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(48)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(49)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(50)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(51)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext)._expr = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewDeclaration((func() int {
			if localctx.(*VariablestmtContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*VariablestmtContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetText()
			}
		}()), localctx.(*VariablestmtContext).Get_typestmt().GetType_(), localctx.(*VariablestmtContext).Get_expr().GetE(), true)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(54)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(55)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(56)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(57)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext)._expr = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewDeclaration((func() int {
			if localctx.(*VariablestmtContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*VariablestmtContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetText()
			}
		}()), environment.NULL, localctx.(*VariablestmtContext).Get_expr().GetE(), true)

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(60)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(61)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(62)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(63)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(64)
			p.Match(SwiftGrammarParserINTCE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VariablestmtContext).vari = instructions.NewDeclaration((func() int {
			if localctx.(*VariablestmtContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*VariablestmtContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetText()
			}
		}()), localctx.(*VariablestmtContext).Get_typestmt().GetType_(), expressions.NewPrimitive((func() int {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetColumn()
			}
		}()), nil, environment.NULL), true)

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(67)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(68)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(69)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext)._expr = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewAssigment((func() int {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetText()
			}
		}()), localctx.(*VariablestmtContext).Get_expr().GetE())

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(72)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*VariablestmtContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(73)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(74)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(75)

			var _x = p.Primitives()

			localctx.(*VariablestmtContext)._primitives = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewDeclaration((func() int {
			if localctx.(*VariablestmtContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_LET().GetLine()
			}
		}()), (func() int {
			if localctx.(*VariablestmtContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_LET().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetText()
			}
		}()), environment.NULL, localctx.(*VariablestmtContext).Get_primitives().GetP(), false)

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(78)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*VariablestmtContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(79)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(80)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(81)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(82)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(83)

			var _x = p.Primitives()

			localctx.(*VariablestmtContext)._primitives = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewDeclaration((func() int {
			if localctx.(*VariablestmtContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_LET().GetLine()
			}
		}()), (func() int {
			if localctx.(*VariablestmtContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*VariablestmtContext).Get_LET().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VariablestmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*VariablestmtContext).Get_ID().GetText()
			}
		}()), localctx.(*VariablestmtContext).Get_typestmt().GetType_(), localctx.(*VariablestmtContext).Get_primitives().GetP(), false)

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ITypestmtContext is an interface to support dynamic dispatch.
type ITypestmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetType_ returns the type_ attribute.
	GetType_() environment.TipoExpresion

	// SetType_ sets the type_ attribute.
	SetType_(environment.TipoExpresion)

	// Getter signatures
	INT() antlr.TerminalNode
	FLOAT() antlr.TerminalNode
	TSTRING() antlr.TerminalNode
	BOOL() antlr.TerminalNode
	CHAR() antlr.TerminalNode

	// IsTypestmtContext differentiates from other interfaces.
	IsTypestmtContext()
}

type TypestmtContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	type_  environment.TipoExpresion
}

func NewEmptyTypestmtContext() *TypestmtContext {
	var p = new(TypestmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_typestmt
	return p
}

func InitEmptyTypestmtContext(p *TypestmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_typestmt
}

func (*TypestmtContext) IsTypestmtContext() {}

func NewTypestmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TypestmtContext {
	var p = new(TypestmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_typestmt

	return p
}

func (s *TypestmtContext) GetParser() antlr.Parser { return s.parser }

func (s *TypestmtContext) GetType_() environment.TipoExpresion { return s.type_ }

func (s *TypestmtContext) SetType_(v environment.TipoExpresion) { s.type_ = v }

func (s *TypestmtContext) INT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserINT, 0)
}

func (s *TypestmtContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFLOAT, 0)
}

func (s *TypestmtContext) TSTRING() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserTSTRING, 0)
}

func (s *TypestmtContext) BOOL() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserBOOL, 0)
}

func (s *TypestmtContext) CHAR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCHAR, 0)
}

func (s *TypestmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TypestmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TypestmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterTypestmt(s)
	}
}

func (s *TypestmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitTypestmt(s)
	}
}

func (p *SwiftGrammarParser) Typestmt() (localctx ITypestmtContext) {
	localctx = NewTypestmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, SwiftGrammarParserRULE_typestmt)
	p.SetState(98)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(88)
			p.Match(SwiftGrammarParserINT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TypestmtContext).type_ = environment.INTEGER

	case SwiftGrammarParserFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(90)
			p.Match(SwiftGrammarParserFLOAT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TypestmtContext).type_ = environment.FLOAT

	case SwiftGrammarParserTSTRING:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(92)
			p.Match(SwiftGrammarParserTSTRING)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TypestmtContext).type_ = environment.STRING

	case SwiftGrammarParserBOOL:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(94)
			p.Match(SwiftGrammarParserBOOL)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TypestmtContext).type_ = environment.BOOLEAN

	case SwiftGrammarParserCHAR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(96)
			p.Match(SwiftGrammarParserCHAR)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TypestmtContext).type_ = environment.CHAR

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IIfstmtContext is an interface to support dynamic dispatch.
type IIfstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	IF() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode
	LLAVEIZQ() antlr.TerminalNode
	Block() IBlockContext
	LLAVEDER() antlr.TerminalNode

	// IsIfstmtContext differentiates from other interfaces.
	IsIfstmtContext()
}

type IfstmtContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyIfstmtContext() *IfstmtContext {
	var p = new(IfstmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_ifstmt
	return p
}

func InitEmptyIfstmtContext(p *IfstmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_ifstmt
}

func (*IfstmtContext) IsIfstmtContext() {}

func NewIfstmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *IfstmtContext {
	var p = new(IfstmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_ifstmt

	return p
}

func (s *IfstmtContext) GetParser() antlr.Parser { return s.parser }

func (s *IfstmtContext) IF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIF, 0)
}

func (s *IfstmtContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *IfstmtContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *IfstmtContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *IfstmtContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *IfstmtContext) Block() IBlockContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockContext)
}

func (s *IfstmtContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *IfstmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *IfstmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *IfstmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterIfstmt(s)
	}
}

func (s *IfstmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitIfstmt(s)
	}
}

func (p *SwiftGrammarParser) Ifstmt() (localctx IIfstmtContext) {
	localctx = NewIfstmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, SwiftGrammarParserRULE_ifstmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(100)
		p.Match(SwiftGrammarParserIF)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(101)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(102)
		p.expr(0)
	}
	{
		p.SetState(103)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(104)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(105)
		p.Block()
	}
	{
		p.SetState(106)
		p.Match(SwiftGrammarParserLLAVEDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IExprContext is an interface to support dynamic dispatch.
type IExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetOp returns the op token.
	GetOp() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// GetLeft returns the left rule contexts.
	GetLeft() IExprContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_primitives returns the _primitives rule contexts.
	Get_primitives() IPrimitivesContext

	// GetRight returns the right rule contexts.
	GetRight() IExprContext

	// SetLeft sets the left rule contexts.
	SetLeft(IExprContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_primitives sets the _primitives rule contexts.
	Set_primitives(IPrimitivesContext)

	// SetRight sets the right rule contexts.
	SetRight(IExprContext)

	// GetE returns the e attribute.
	GetE() interfaces.Expression

	// SetE sets the e attribute.
	SetE(interfaces.Expression)

	// Getter signatures
	NOT() antlr.TerminalNode
	AllExpr() []IExprContext
	Expr(i int) IExprContext
	PARIZQ() antlr.TerminalNode
	PARDER() antlr.TerminalNode
	Primitives() IPrimitivesContext
	MUL() antlr.TerminalNode
	DIV() antlr.TerminalNode
	MOD() antlr.TerminalNode
	ADD() antlr.TerminalNode
	SUB() antlr.TerminalNode
	MAY_IG() antlr.TerminalNode
	MAYOR() antlr.TerminalNode
	MEN_IG() antlr.TerminalNode
	MENOR() antlr.TerminalNode
	IG_IG() antlr.TerminalNode
	DIF() antlr.TerminalNode
	AND() antlr.TerminalNode
	OR() antlr.TerminalNode

	// IsExprContext differentiates from other interfaces.
	IsExprContext()
}

type ExprContext struct {
	antlr.BaseParserRuleContext
	parser      antlr.Parser
	e           interfaces.Expression
	left        IExprContext
	op          antlr.Token
	_expr       IExprContext
	_primitives IPrimitivesContext
	right       IExprContext
}

func NewEmptyExprContext() *ExprContext {
	var p = new(ExprContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_expr
	return p
}

func InitEmptyExprContext(p *ExprContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_expr
}

func (*ExprContext) IsExprContext() {}

func NewExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExprContext {
	var p = new(ExprContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_expr

	return p
}

func (s *ExprContext) GetParser() antlr.Parser { return s.parser }

func (s *ExprContext) GetOp() antlr.Token { return s.op }

func (s *ExprContext) SetOp(v antlr.Token) { s.op = v }

func (s *ExprContext) GetLeft() IExprContext { return s.left }

func (s *ExprContext) Get_expr() IExprContext { return s._expr }

func (s *ExprContext) Get_primitives() IPrimitivesContext { return s._primitives }

func (s *ExprContext) GetRight() IExprContext { return s.right }

func (s *ExprContext) SetLeft(v IExprContext) { s.left = v }

func (s *ExprContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ExprContext) Set_primitives(v IPrimitivesContext) { s._primitives = v }

func (s *ExprContext) SetRight(v IExprContext) { s.right = v }

func (s *ExprContext) GetE() interfaces.Expression { return s.e }

func (s *ExprContext) SetE(v interfaces.Expression) { s.e = v }

func (s *ExprContext) NOT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserNOT, 0)
}

func (s *ExprContext) AllExpr() []IExprContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IExprContext); ok {
			len++
		}
	}

	tst := make([]IExprContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IExprContext); ok {
			tst[i] = t.(IExprContext)
			i++
		}
	}

	return tst
}

func (s *ExprContext) Expr(i int) IExprContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *ExprContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *ExprContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *ExprContext) Primitives() IPrimitivesContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IPrimitivesContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IPrimitivesContext)
}

func (s *ExprContext) MUL() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMUL, 0)
}

func (s *ExprContext) DIV() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDIV, 0)
}

func (s *ExprContext) MOD() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMOD, 0)
}

func (s *ExprContext) ADD() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserADD, 0)
}

func (s *ExprContext) SUB() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSUB, 0)
}

func (s *ExprContext) MAY_IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMAY_IG, 0)
}

func (s *ExprContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMAYOR, 0)
}

func (s *ExprContext) MEN_IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMEN_IG, 0)
}

func (s *ExprContext) MENOR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMENOR, 0)
}

func (s *ExprContext) IG_IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG_IG, 0)
}

func (s *ExprContext) DIF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDIF, 0)
}

func (s *ExprContext) AND() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserAND, 0)
}

func (s *ExprContext) OR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserOR, 0)
}

func (s *ExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterExpr(s)
	}
}

func (s *ExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitExpr(s)
	}
}

func (p *SwiftGrammarParser) Expr() (localctx IExprContext) {
	return p.expr(0)
}

func (p *SwiftGrammarParser) expr(_p int) (localctx IExprContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewExprContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExprContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 14
	p.EnterRecursionRule(localctx, 14, SwiftGrammarParserRULE_expr, _p)
	var _la int

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(121)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserNOT:
		{
			p.SetState(109)

			var _m = p.Match(SwiftGrammarParserNOT)

			localctx.(*ExprContext).op = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(110)

			var _x = p.expr(3)

			localctx.(*ExprContext).left = _x
			localctx.(*ExprContext)._expr = _x
		}
		localctx.(*ExprContext).e = expressions.NewOperationUnary((func() antlr.Token {
			if localctx.(*ExprContext).GetLeft() == nil {
				return nil
			} else {
				return localctx.(*ExprContext).GetLeft().GetStart()
			}
		}()).GetLine(), (func() antlr.Token {
			if localctx.(*ExprContext).GetLeft() == nil {
				return nil
			} else {
				return localctx.(*ExprContext).GetLeft().GetStart()
			}
		}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
			if localctx.(*ExprContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).GetOp().GetText()
			}
		}()))

	case SwiftGrammarParserPARIZQ:
		{
			p.SetState(113)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(114)

			var _x = p.expr(0)

			localctx.(*ExprContext)._expr = _x
		}
		{
			p.SetState(115)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_expr().GetE()

	case SwiftGrammarParserTRU, SwiftGrammarParserFAL, SwiftGrammarParserNUMBER, SwiftGrammarParserCHARACTER, SwiftGrammarParserSTRING, SwiftGrammarParserID:
		{
			p.SetState(118)

			var _x = p.Primitives()

			localctx.(*ExprContext)._primitives = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_primitives().GetP()

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(160)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 6, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(158)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}

			switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 5, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(123)

				if !(p.Precpred(p.GetParserRuleContext(), 10)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 10)", ""))
					goto errorExit
				}
				{
					p.SetState(124)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&985162418487296) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(125)

					var _x = p.expr(11)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperationBinary((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 2:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(128)

				if !(p.Precpred(p.GetParserRuleContext(), 9)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 9)", ""))
					goto errorExit
				}
				{
					p.SetState(129)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserADD || _la == SwiftGrammarParserSUB) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(130)

					var _x = p.expr(10)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperationBinary((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 3:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(133)

				if !(p.Precpred(p.GetParserRuleContext(), 8)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 8)", ""))
					goto errorExit
				}
				{
					p.SetState(134)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserMAY_IG || _la == SwiftGrammarParserMAYOR) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(135)

					var _x = p.expr(9)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperationBinary((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 4:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(138)

				if !(p.Precpred(p.GetParserRuleContext(), 7)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 7)", ""))
					goto errorExit
				}
				{
					p.SetState(139)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserMEN_IG || _la == SwiftGrammarParserMENOR) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(140)

					var _x = p.expr(8)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperationBinary((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 5:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(143)

				if !(p.Precpred(p.GetParserRuleContext(), 6)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 6)", ""))
					goto errorExit
				}
				{
					p.SetState(144)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserDIF || _la == SwiftGrammarParserIG_IG) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(145)

					var _x = p.expr(7)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperationBinary((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 6:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(148)

				if !(p.Precpred(p.GetParserRuleContext(), 5)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 5)", ""))
					goto errorExit
				}
				{
					p.SetState(149)

					var _m = p.Match(SwiftGrammarParserAND)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(150)

					var _x = p.expr(6)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperationBinary((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 7:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(153)

				if !(p.Precpred(p.GetParserRuleContext(), 4)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 4)", ""))
					goto errorExit
				}
				{
					p.SetState(154)

					var _m = p.Match(SwiftGrammarParserOR)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(155)

					var _x = p.expr(5)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperationBinary((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case antlr.ATNInvalidAltNumber:
				goto errorExit
			}

		}
		p.SetState(162)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 6, p.GetParserRuleContext())
		if p.HasError() {
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.UnrollRecursionContexts(_parentctx)
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IPrimitivesContext is an interface to support dynamic dispatch.
type IPrimitivesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_CHARACTER returns the _CHARACTER token.
	Get_CHARACTER() antlr.Token

	// Get_STRING returns the _STRING token.
	Get_STRING() antlr.Token

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Get_TRU returns the _TRU token.
	Get_TRU() antlr.Token

	// Get_FAL returns the _FAL token.
	Get_FAL() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_CHARACTER sets the _CHARACTER token.
	Set_CHARACTER(antlr.Token)

	// Set_STRING sets the _STRING token.
	Set_STRING(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Set_TRU sets the _TRU token.
	Set_TRU(antlr.Token)

	// Set_FAL sets the _FAL token.
	Set_FAL(antlr.Token)

	// GetP returns the p attribute.
	GetP() interfaces.Expression

	// SetP sets the p attribute.
	SetP(interfaces.Expression)

	// Getter signatures
	NUMBER() antlr.TerminalNode
	CHARACTER() antlr.TerminalNode
	STRING() antlr.TerminalNode
	ID() antlr.TerminalNode
	TRU() antlr.TerminalNode
	FAL() antlr.TerminalNode

	// IsPrimitivesContext differentiates from other interfaces.
	IsPrimitivesContext()
}

type PrimitivesContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	p          interfaces.Expression
	_NUMBER    antlr.Token
	_CHARACTER antlr.Token
	_STRING    antlr.Token
	_ID        antlr.Token
	_TRU       antlr.Token
	_FAL       antlr.Token
}

func NewEmptyPrimitivesContext() *PrimitivesContext {
	var p = new(PrimitivesContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_primitives
	return p
}

func InitEmptyPrimitivesContext(p *PrimitivesContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_primitives
}

func (*PrimitivesContext) IsPrimitivesContext() {}

func NewPrimitivesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrimitivesContext {
	var p = new(PrimitivesContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_primitives

	return p
}

func (s *PrimitivesContext) GetParser() antlr.Parser { return s.parser }

func (s *PrimitivesContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *PrimitivesContext) Get_CHARACTER() antlr.Token { return s._CHARACTER }

func (s *PrimitivesContext) Get_STRING() antlr.Token { return s._STRING }

func (s *PrimitivesContext) Get_ID() antlr.Token { return s._ID }

func (s *PrimitivesContext) Get_TRU() antlr.Token { return s._TRU }

func (s *PrimitivesContext) Get_FAL() antlr.Token { return s._FAL }

func (s *PrimitivesContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *PrimitivesContext) Set_CHARACTER(v antlr.Token) { s._CHARACTER = v }

func (s *PrimitivesContext) Set_STRING(v antlr.Token) { s._STRING = v }

func (s *PrimitivesContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *PrimitivesContext) Set_TRU(v antlr.Token) { s._TRU = v }

func (s *PrimitivesContext) Set_FAL(v antlr.Token) { s._FAL = v }

func (s *PrimitivesContext) GetP() interfaces.Expression { return s.p }

func (s *PrimitivesContext) SetP(v interfaces.Expression) { s.p = v }

func (s *PrimitivesContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserNUMBER, 0)
}

func (s *PrimitivesContext) CHARACTER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCHARACTER, 0)
}

func (s *PrimitivesContext) STRING() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSTRING, 0)
}

func (s *PrimitivesContext) ID() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID, 0)
}

func (s *PrimitivesContext) TRU() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserTRU, 0)
}

func (s *PrimitivesContext) FAL() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFAL, 0)
}

func (s *PrimitivesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrimitivesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrimitivesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterPrimitives(s)
	}
}

func (s *PrimitivesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitPrimitives(s)
	}
}

func (p *SwiftGrammarParser) Primitives() (localctx IPrimitivesContext) {
	localctx = NewPrimitivesContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, SwiftGrammarParserRULE_primitives)
	p.SetState(175)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserNUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(163)

			var _m = p.Match(SwiftGrammarParserNUMBER)

			localctx.(*PrimitivesContext)._NUMBER = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		if strings.Contains((func() string {
			if localctx.(*PrimitivesContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivesContext).Get_NUMBER().GetText()
			}
		}()), ".") {
			num, err := strconv.ParseFloat((func() string {
				if localctx.(*PrimitivesContext).Get_NUMBER() == nil {
					return ""
				} else {
					return localctx.(*PrimitivesContext).Get_NUMBER().GetText()
				}
			}()), 64)
			if err != nil {
				fmt.Println(err)
			}
			localctx.(*PrimitivesContext).p = expressions.NewPrimitive((func() int {
				if localctx.(*PrimitivesContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*PrimitivesContext).Get_NUMBER().GetLine()
				}
			}()), (func() int {
				if localctx.(*PrimitivesContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*PrimitivesContext).Get_NUMBER().GetColumn()
				}
			}()), num, environment.FLOAT)
		} else {
			num, err := strconv.Atoi((func() string {
				if localctx.(*PrimitivesContext).Get_NUMBER() == nil {
					return ""
				} else {
					return localctx.(*PrimitivesContext).Get_NUMBER().GetText()
				}
			}()))
			if err != nil {
				fmt.Println(err)
			}
			localctx.(*PrimitivesContext).p = expressions.NewPrimitive((func() int {
				if localctx.(*PrimitivesContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*PrimitivesContext).Get_NUMBER().GetLine()
				}
			}()), (func() int {
				if localctx.(*PrimitivesContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*PrimitivesContext).Get_NUMBER().GetColumn()
				}
			}()), num, environment.INTEGER)
		}

	case SwiftGrammarParserCHARACTER:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(165)

			var _m = p.Match(SwiftGrammarParserCHARACTER)

			localctx.(*PrimitivesContext)._CHARACTER = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		str := (func() string {
			if localctx.(*PrimitivesContext).Get_CHARACTER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivesContext).Get_CHARACTER().GetText()
			}
		}())
		localctx.(*PrimitivesContext).p = expressions.NewPrimitive((func() int {
			if localctx.(*PrimitivesContext).Get_CHARACTER() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_CHARACTER().GetLine()
			}
		}()), (func() int {
			if localctx.(*PrimitivesContext).Get_CHARACTER() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_CHARACTER().GetColumn()
			}
		}()), str[1:len(str)-1], environment.CHAR)

	case SwiftGrammarParserSTRING:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(167)

			var _m = p.Match(SwiftGrammarParserSTRING)

			localctx.(*PrimitivesContext)._STRING = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		str := (func() string {
			if localctx.(*PrimitivesContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*PrimitivesContext).Get_STRING().GetText()
			}
		}())
		localctx.(*PrimitivesContext).p = expressions.NewPrimitive((func() int {
			if localctx.(*PrimitivesContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_STRING().GetLine()
			}
		}()), (func() int {
			if localctx.(*PrimitivesContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_STRING().GetColumn()
			}
		}()), str[1:len(str)-1], environment.STRING)

	case SwiftGrammarParserID:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(169)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*PrimitivesContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		localctx.(*PrimitivesContext).p = expressions.NewCallVariable((func() int {
			if localctx.(*PrimitivesContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*PrimitivesContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*PrimitivesContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*PrimitivesContext).Get_ID().GetText()
			}
		}()))

	case SwiftGrammarParserTRU:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(171)

			var _m = p.Match(SwiftGrammarParserTRU)

			localctx.(*PrimitivesContext)._TRU = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*PrimitivesContext).p = expressions.NewPrimitive((func() int {
			if localctx.(*PrimitivesContext).Get_TRU() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_TRU().GetLine()
			}
		}()), (func() int {
			if localctx.(*PrimitivesContext).Get_TRU() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_TRU().GetColumn()
			}
		}()), true, environment.BOOLEAN)

	case SwiftGrammarParserFAL:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(173)

			var _m = p.Match(SwiftGrammarParserFAL)

			localctx.(*PrimitivesContext)._FAL = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*PrimitivesContext).p = expressions.NewPrimitive((func() int {
			if localctx.(*PrimitivesContext).Get_FAL() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_FAL().GetLine()
			}
		}()), (func() int {
			if localctx.(*PrimitivesContext).Get_FAL() == nil {
				return 0
			} else {
				return localctx.(*PrimitivesContext).Get_FAL().GetColumn()
			}
		}()), false, environment.BOOLEAN)

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

func (p *SwiftGrammarParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 7:
		var t *ExprContext = nil
		if localctx != nil {
			t = localctx.(*ExprContext)
		}
		return p.Expr_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *SwiftGrammarParser) Expr_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 10)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 9)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 8)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 7)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 6)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 5)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 4)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
