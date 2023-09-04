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
		"'func'", "'at'", "", "", "", "", "'!='", "'=='", "'!'", "'||'", "'&&'",
		"'='", "'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'",
		"'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "'.'", "','", "'?'",
		"'->'", "'&'", "';'",
	}
	staticData.SymbolicNames = []string{
		"", "INT", "FLOAT", "TSTRING", "BOOL", "CHAR", "VAR", "LET", "TRU",
		"FAL", "PRINT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK",
		"CONTINUE", "RETURN", "WHILE", "FOR", "IN", "GUARD", "APPEND", "REMOVELAST",
		"REMOVE", "ISEMPTY", "COUNT", "REPEATING", "STRUCT", "SELF", "MUTATING",
		"FUNC", "AT", "NUMBER", "CHARACTER", "STRING", "ID", "DIF", "IG_IG",
		"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MOD",
		"MUL", "DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER",
		"CORIZQ", "CORDER", "DOSP", "PUNTO", "COMA", "INTCE", "FLECHA", "AMP",
		"PCOMA", "WHITESPACE", "COMMENT", "LINE_COMMENT",
	}
	staticData.RuleNames = []string{
		"s", "block", "instruction", "funcstmt", "funcallstmt", "printstmt",
		"variablestmt", "typestmt", "type2stmt", "funvecstmt", "ifstmt", "elifs",
		"switchstmt", "cases", "whilestmt", "expr", "primitives", "listParams",
		"listArray", "listAceso",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 68, 523, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7,
		4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2, 10, 7,
		10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15, 7, 15,
		2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7, 19, 1, 0, 1, 0, 1,
		0, 1, 0, 1, 1, 4, 1, 46, 8, 1, 11, 1, 12, 1, 47, 1, 1, 1, 1, 1, 2, 1, 2,
		3, 2, 54, 8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 60, 8, 2, 1, 2, 1, 2, 1,
		2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
		2, 1, 2, 3, 2, 78, 8, 2, 1, 2, 1, 2, 1, 2, 3, 2, 83, 8, 2, 1, 2, 1, 2,
		1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 92, 8, 2, 1, 3, 1, 3, 1, 3, 1, 3, 1,
		3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 5, 1, 5, 1,
		5, 1, 5, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 3, 6, 197, 8, 6, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 3, 7, 214, 8, 7, 1,
		8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1,
		8, 1, 8, 1, 8, 3, 8, 231, 8, 8, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1,
		9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1,
		9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 3, 9, 257, 8, 9, 1, 10, 1, 10, 1, 10,
		1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1,
		10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10,
		1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1,
		10, 1, 10, 1, 10, 1, 10, 3, 10, 297, 8, 10, 1, 11, 1, 11, 1, 11, 1, 11,
		1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1,
		11, 1, 11, 1, 11, 1, 11, 5, 11, 317, 8, 11, 10, 11, 12, 11, 320, 9, 11,
		1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1,
		12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 3, 12, 339, 8, 12, 1, 13,
		1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1,
		13, 1, 13, 1, 13, 5, 13, 355, 8, 13, 10, 13, 12, 13, 358, 9, 13, 1, 14,
		1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 15, 1, 15, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15,
		1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15,
		1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 3, 15,
		423, 8, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15,
		1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 5, 15, 460, 8, 15, 10, 15, 12, 15,
		463, 9, 15, 1, 16, 1, 16, 1, 16, 1, 16, 1, 16, 1, 16, 1, 16, 1, 16, 1,
		16, 1, 16, 3, 16, 475, 8, 16, 1, 17, 1, 17, 1, 17, 1, 17, 1, 17, 1, 17,
		1, 17, 1, 17, 1, 17, 5, 17, 486, 8, 17, 10, 17, 12, 17, 489, 9, 17, 1,
		18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 5, 18,
		501, 8, 18, 10, 18, 12, 18, 504, 9, 18, 1, 19, 1, 19, 1, 19, 1, 19, 1,
		19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 5, 19, 518, 8, 19,
		10, 19, 12, 19, 521, 9, 19, 1, 19, 0, 6, 22, 26, 30, 34, 36, 38, 20, 0,
		2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38,
		0, 5, 1, 0, 48, 50, 1, 0, 51, 52, 2, 0, 44, 44, 46, 46, 2, 0, 45, 45, 47,
		47, 1, 0, 38, 39, 571, 0, 40, 1, 0, 0, 0, 2, 45, 1, 0, 0, 0, 4, 91, 1,
		0, 0, 0, 6, 93, 1, 0, 0, 0, 8, 102, 1, 0, 0, 0, 10, 107, 1, 0, 0, 0, 12,
		196, 1, 0, 0, 0, 14, 213, 1, 0, 0, 0, 16, 230, 1, 0, 0, 0, 18, 256, 1,
		0, 0, 0, 20, 296, 1, 0, 0, 0, 22, 298, 1, 0, 0, 0, 24, 338, 1, 0, 0, 0,
		26, 340, 1, 0, 0, 0, 28, 359, 1, 0, 0, 0, 30, 422, 1, 0, 0, 0, 32, 474,
		1, 0, 0, 0, 34, 476, 1, 0, 0, 0, 36, 490, 1, 0, 0, 0, 38, 505, 1, 0, 0,
		0, 40, 41, 3, 2, 1, 0, 41, 42, 5, 0, 0, 1, 42, 43, 6, 0, -1, 0, 43, 1,
		1, 0, 0, 0, 44, 46, 3, 4, 2, 0, 45, 44, 1, 0, 0, 0, 46, 47, 1, 0, 0, 0,
		47, 45, 1, 0, 0, 0, 47, 48, 1, 0, 0, 0, 48, 49, 1, 0, 0, 0, 49, 50, 6,
		1, -1, 0, 50, 3, 1, 0, 0, 0, 51, 53, 3, 10, 5, 0, 52, 54, 5, 65, 0, 0,
		53, 52, 1, 0, 0, 0, 53, 54, 1, 0, 0, 0, 54, 55, 1, 0, 0, 0, 55, 56, 6,
		2, -1, 0, 56, 92, 1, 0, 0, 0, 57, 59, 3, 12, 6, 0, 58, 60, 5, 65, 0, 0,
		59, 58, 1, 0, 0, 0, 59, 60, 1, 0, 0, 0, 60, 61, 1, 0, 0, 0, 61, 62, 6,
		2, -1, 0, 62, 92, 1, 0, 0, 0, 63, 64, 3, 20, 10, 0, 64, 65, 6, 2, -1, 0,
		65, 92, 1, 0, 0, 0, 66, 67, 3, 24, 12, 0, 67, 68, 6, 2, -1, 0, 68, 92,
		1, 0, 0, 0, 69, 70, 3, 28, 14, 0, 70, 71, 6, 2, -1, 0, 71, 92, 1, 0, 0,
		0, 72, 73, 3, 18, 9, 0, 73, 74, 6, 2, -1, 0, 74, 92, 1, 0, 0, 0, 75, 77,
		5, 16, 0, 0, 76, 78, 5, 65, 0, 0, 77, 76, 1, 0, 0, 0, 77, 78, 1, 0, 0,
		0, 78, 79, 1, 0, 0, 0, 79, 92, 6, 2, -1, 0, 80, 82, 5, 17, 0, 0, 81, 83,
		5, 65, 0, 0, 82, 81, 1, 0, 0, 0, 82, 83, 1, 0, 0, 0, 83, 84, 1, 0, 0, 0,
		84, 92, 6, 2, -1, 0, 85, 86, 3, 6, 3, 0, 86, 87, 6, 2, -1, 0, 87, 92, 1,
		0, 0, 0, 88, 89, 3, 8, 4, 0, 89, 90, 6, 2, -1, 0, 90, 92, 1, 0, 0, 0, 91,
		51, 1, 0, 0, 0, 91, 57, 1, 0, 0, 0, 91, 63, 1, 0, 0, 0, 91, 66, 1, 0, 0,
		0, 91, 69, 1, 0, 0, 0, 91, 72, 1, 0, 0, 0, 91, 75, 1, 0, 0, 0, 91, 80,
		1, 0, 0, 0, 91, 85, 1, 0, 0, 0, 91, 88, 1, 0, 0, 0, 92, 5, 1, 0, 0, 0,
		93, 94, 5, 32, 0, 0, 94, 95, 5, 37, 0, 0, 95, 96, 5, 53, 0, 0, 96, 97,
		5, 54, 0, 0, 97, 98, 5, 55, 0, 0, 98, 99, 3, 2, 1, 0, 99, 100, 5, 56, 0,
		0, 100, 101, 6, 3, -1, 0, 101, 7, 1, 0, 0, 0, 102, 103, 5, 37, 0, 0, 103,
		104, 5, 53, 0, 0, 104, 105, 5, 54, 0, 0, 105, 106, 6, 4, -1, 0, 106, 9,
		1, 0, 0, 0, 107, 108, 5, 10, 0, 0, 108, 109, 5, 53, 0, 0, 109, 110, 3,
		30, 15, 0, 110, 111, 5, 54, 0, 0, 111, 112, 6, 5, -1, 0, 112, 11, 1, 0,
		0, 0, 113, 114, 5, 6, 0, 0, 114, 115, 5, 37, 0, 0, 115, 116, 5, 59, 0,
		0, 116, 117, 3, 14, 7, 0, 117, 118, 5, 43, 0, 0, 118, 119, 3, 30, 15, 0,
		119, 120, 6, 6, -1, 0, 120, 197, 1, 0, 0, 0, 121, 122, 5, 6, 0, 0, 122,
		123, 5, 37, 0, 0, 123, 124, 5, 43, 0, 0, 124, 125, 3, 30, 15, 0, 125, 126,
		6, 6, -1, 0, 126, 197, 1, 0, 0, 0, 127, 128, 5, 6, 0, 0, 128, 129, 5, 37,
		0, 0, 129, 130, 5, 59, 0, 0, 130, 131, 3, 14, 7, 0, 131, 132, 5, 62, 0,
		0, 132, 133, 6, 6, -1, 0, 133, 197, 1, 0, 0, 0, 134, 135, 5, 7, 0, 0, 135,
		136, 5, 37, 0, 0, 136, 137, 5, 43, 0, 0, 137, 138, 3, 32, 16, 0, 138, 139,
		6, 6, -1, 0, 139, 197, 1, 0, 0, 0, 140, 141, 5, 7, 0, 0, 141, 142, 5, 37,
		0, 0, 142, 143, 5, 59, 0, 0, 143, 144, 3, 14, 7, 0, 144, 145, 5, 43, 0,
		0, 145, 146, 3, 32, 16, 0, 146, 147, 6, 6, -1, 0, 147, 197, 1, 0, 0, 0,
		148, 149, 5, 37, 0, 0, 149, 150, 5, 43, 0, 0, 150, 151, 3, 30, 15, 0, 151,
		152, 6, 6, -1, 0, 152, 197, 1, 0, 0, 0, 153, 154, 5, 37, 0, 0, 154, 155,
		5, 57, 0, 0, 155, 156, 3, 30, 15, 0, 156, 157, 5, 58, 0, 0, 157, 158, 5,
		43, 0, 0, 158, 159, 3, 30, 15, 0, 159, 160, 6, 6, -1, 0, 160, 197, 1, 0,
		0, 0, 161, 162, 5, 37, 0, 0, 162, 163, 3, 30, 15, 0, 163, 164, 5, 43, 0,
		0, 164, 165, 3, 30, 15, 0, 165, 166, 6, 6, -1, 0, 166, 197, 1, 0, 0, 0,
		167, 168, 5, 37, 0, 0, 168, 169, 5, 51, 0, 0, 169, 170, 5, 43, 0, 0, 170,
		171, 3, 30, 15, 0, 171, 172, 6, 6, -1, 0, 172, 197, 1, 0, 0, 0, 173, 174,
		5, 37, 0, 0, 174, 175, 5, 52, 0, 0, 175, 176, 5, 43, 0, 0, 176, 177, 3,
		30, 15, 0, 177, 178, 6, 6, -1, 0, 178, 197, 1, 0, 0, 0, 179, 180, 5, 6,
		0, 0, 180, 181, 5, 37, 0, 0, 181, 182, 5, 59, 0, 0, 182, 183, 3, 14, 7,
		0, 183, 184, 5, 43, 0, 0, 184, 185, 3, 30, 15, 0, 185, 186, 6, 6, -1, 0,
		186, 197, 1, 0, 0, 0, 187, 188, 5, 6, 0, 0, 188, 189, 5, 37, 0, 0, 189,
		190, 5, 59, 0, 0, 190, 191, 3, 14, 7, 0, 191, 192, 5, 43, 0, 0, 192, 193,
		5, 57, 0, 0, 193, 194, 5, 58, 0, 0, 194, 195, 6, 6, -1, 0, 195, 197, 1,
		0, 0, 0, 196, 113, 1, 0, 0, 0, 196, 121, 1, 0, 0, 0, 196, 127, 1, 0, 0,
		0, 196, 134, 1, 0, 0, 0, 196, 140, 1, 0, 0, 0, 196, 148, 1, 0, 0, 0, 196,
		153, 1, 0, 0, 0, 196, 161, 1, 0, 0, 0, 196, 167, 1, 0, 0, 0, 196, 173,
		1, 0, 0, 0, 196, 179, 1, 0, 0, 0, 196, 187, 1, 0, 0, 0, 197, 13, 1, 0,
		0, 0, 198, 199, 5, 1, 0, 0, 199, 214, 6, 7, -1, 0, 200, 201, 5, 2, 0, 0,
		201, 214, 6, 7, -1, 0, 202, 203, 5, 3, 0, 0, 203, 214, 6, 7, -1, 0, 204,
		205, 5, 4, 0, 0, 205, 214, 6, 7, -1, 0, 206, 207, 5, 5, 0, 0, 207, 214,
		6, 7, -1, 0, 208, 209, 5, 57, 0, 0, 209, 210, 3, 16, 8, 0, 210, 211, 5,
		58, 0, 0, 211, 212, 6, 7, -1, 0, 212, 214, 1, 0, 0, 0, 213, 198, 1, 0,
		0, 0, 213, 200, 1, 0, 0, 0, 213, 202, 1, 0, 0, 0, 213, 204, 1, 0, 0, 0,
		213, 206, 1, 0, 0, 0, 213, 208, 1, 0, 0, 0, 214, 15, 1, 0, 0, 0, 215, 216,
		5, 1, 0, 0, 216, 231, 6, 8, -1, 0, 217, 218, 5, 2, 0, 0, 218, 231, 6, 8,
		-1, 0, 219, 220, 5, 3, 0, 0, 220, 231, 6, 8, -1, 0, 221, 222, 5, 4, 0,
		0, 222, 231, 6, 8, -1, 0, 223, 224, 5, 5, 0, 0, 224, 231, 6, 8, -1, 0,
		225, 226, 5, 57, 0, 0, 226, 227, 3, 16, 8, 0, 227, 228, 5, 58, 0, 0, 228,
		229, 6, 8, -1, 0, 229, 231, 1, 0, 0, 0, 230, 215, 1, 0, 0, 0, 230, 217,
		1, 0, 0, 0, 230, 219, 1, 0, 0, 0, 230, 221, 1, 0, 0, 0, 230, 223, 1, 0,
		0, 0, 230, 225, 1, 0, 0, 0, 231, 17, 1, 0, 0, 0, 232, 233, 5, 37, 0, 0,
		233, 234, 5, 60, 0, 0, 234, 235, 5, 23, 0, 0, 235, 236, 5, 53, 0, 0, 236,
		237, 3, 30, 15, 0, 237, 238, 5, 54, 0, 0, 238, 239, 6, 9, -1, 0, 239, 257,
		1, 0, 0, 0, 240, 241, 5, 37, 0, 0, 241, 242, 5, 60, 0, 0, 242, 243, 5,
		24, 0, 0, 243, 244, 5, 53, 0, 0, 244, 245, 5, 54, 0, 0, 245, 257, 6, 9,
		-1, 0, 246, 247, 5, 37, 0, 0, 247, 248, 5, 60, 0, 0, 248, 249, 5, 25, 0,
		0, 249, 250, 5, 53, 0, 0, 250, 251, 5, 33, 0, 0, 251, 252, 5, 59, 0, 0,
		252, 253, 3, 30, 15, 0, 253, 254, 5, 54, 0, 0, 254, 255, 6, 9, -1, 0, 255,
		257, 1, 0, 0, 0, 256, 232, 1, 0, 0, 0, 256, 240, 1, 0, 0, 0, 256, 246,
		1, 0, 0, 0, 257, 19, 1, 0, 0, 0, 258, 259, 5, 11, 0, 0, 259, 260, 3, 30,
		15, 0, 260, 261, 5, 55, 0, 0, 261, 262, 3, 2, 1, 0, 262, 263, 5, 56, 0,
		0, 263, 264, 6, 10, -1, 0, 264, 297, 1, 0, 0, 0, 265, 266, 5, 11, 0, 0,
		266, 267, 3, 30, 15, 0, 267, 268, 5, 55, 0, 0, 268, 269, 3, 2, 1, 0, 269,
		270, 5, 56, 0, 0, 270, 271, 5, 12, 0, 0, 271, 272, 5, 55, 0, 0, 272, 273,
		3, 2, 1, 0, 273, 274, 5, 56, 0, 0, 274, 275, 6, 10, -1, 0, 275, 297, 1,
		0, 0, 0, 276, 277, 5, 11, 0, 0, 277, 278, 3, 30, 15, 0, 278, 279, 5, 55,
		0, 0, 279, 280, 3, 2, 1, 0, 280, 281, 5, 56, 0, 0, 281, 282, 3, 22, 11,
		0, 282, 283, 6, 10, -1, 0, 283, 297, 1, 0, 0, 0, 284, 285, 5, 11, 0, 0,
		285, 286, 3, 30, 15, 0, 286, 287, 5, 55, 0, 0, 287, 288, 3, 2, 1, 0, 288,
		289, 5, 56, 0, 0, 289, 290, 3, 22, 11, 0, 290, 291, 5, 12, 0, 0, 291, 292,
		5, 55, 0, 0, 292, 293, 3, 2, 1, 0, 293, 294, 5, 56, 0, 0, 294, 295, 6,
		10, -1, 0, 295, 297, 1, 0, 0, 0, 296, 258, 1, 0, 0, 0, 296, 265, 1, 0,
		0, 0, 296, 276, 1, 0, 0, 0, 296, 284, 1, 0, 0, 0, 297, 21, 1, 0, 0, 0,
		298, 299, 6, 11, -1, 0, 299, 300, 5, 12, 0, 0, 300, 301, 5, 11, 0, 0, 301,
		302, 3, 30, 15, 0, 302, 303, 5, 55, 0, 0, 303, 304, 3, 2, 1, 0, 304, 305,
		5, 56, 0, 0, 305, 306, 6, 11, -1, 0, 306, 318, 1, 0, 0, 0, 307, 308, 10,
		2, 0, 0, 308, 309, 5, 12, 0, 0, 309, 310, 5, 11, 0, 0, 310, 311, 3, 30,
		15, 0, 311, 312, 5, 55, 0, 0, 312, 313, 3, 2, 1, 0, 313, 314, 5, 56, 0,
		0, 314, 315, 6, 11, -1, 0, 315, 317, 1, 0, 0, 0, 316, 307, 1, 0, 0, 0,
		317, 320, 1, 0, 0, 0, 318, 316, 1, 0, 0, 0, 318, 319, 1, 0, 0, 0, 319,
		23, 1, 0, 0, 0, 320, 318, 1, 0, 0, 0, 321, 322, 5, 13, 0, 0, 322, 323,
		3, 30, 15, 0, 323, 324, 5, 55, 0, 0, 324, 325, 3, 26, 13, 0, 325, 326,
		5, 15, 0, 0, 326, 327, 5, 59, 0, 0, 327, 328, 3, 2, 1, 0, 328, 329, 5,
		56, 0, 0, 329, 330, 6, 12, -1, 0, 330, 339, 1, 0, 0, 0, 331, 332, 5, 13,
		0, 0, 332, 333, 3, 30, 15, 0, 333, 334, 5, 55, 0, 0, 334, 335, 3, 26, 13,
		0, 335, 336, 5, 56, 0, 0, 336, 337, 6, 12, -1, 0, 337, 339, 1, 0, 0, 0,
		338, 321, 1, 0, 0, 0, 338, 331, 1, 0, 0, 0, 339, 25, 1, 0, 0, 0, 340, 341,
		6, 13, -1, 0, 341, 342, 5, 14, 0, 0, 342, 343, 3, 30, 15, 0, 343, 344,
		5, 59, 0, 0, 344, 345, 3, 2, 1, 0, 345, 346, 6, 13, -1, 0, 346, 356, 1,
		0, 0, 0, 347, 348, 10, 2, 0, 0, 348, 349, 5, 14, 0, 0, 349, 350, 3, 30,
		15, 0, 350, 351, 5, 59, 0, 0, 351, 352, 3, 2, 1, 0, 352, 353, 6, 13, -1,
		0, 353, 355, 1, 0, 0, 0, 354, 347, 1, 0, 0, 0, 355, 358, 1, 0, 0, 0, 356,
		354, 1, 0, 0, 0, 356, 357, 1, 0, 0, 0, 357, 27, 1, 0, 0, 0, 358, 356, 1,
		0, 0, 0, 359, 360, 5, 19, 0, 0, 360, 361, 3, 30, 15, 0, 361, 362, 5, 55,
		0, 0, 362, 363, 3, 2, 1, 0, 363, 364, 5, 56, 0, 0, 364, 365, 6, 14, -1,
		0, 365, 29, 1, 0, 0, 0, 366, 367, 6, 15, -1, 0, 367, 368, 5, 40, 0, 0,
		368, 369, 3, 30, 15, 13, 369, 370, 6, 15, -1, 0, 370, 423, 1, 0, 0, 0,
		371, 372, 5, 52, 0, 0, 372, 373, 3, 30, 15, 12, 373, 374, 6, 15, -1, 0,
		374, 423, 1, 0, 0, 0, 375, 376, 5, 53, 0, 0, 376, 377, 3, 30, 15, 0, 377,
		378, 5, 54, 0, 0, 378, 379, 6, 15, -1, 0, 379, 423, 1, 0, 0, 0, 380, 381,
		5, 37, 0, 0, 381, 423, 6, 15, -1, 0, 382, 383, 3, 32, 16, 0, 383, 384,
		6, 15, -1, 0, 384, 423, 1, 0, 0, 0, 385, 386, 5, 1, 0, 0, 386, 387, 5,
		53, 0, 0, 387, 388, 3, 32, 16, 0, 388, 389, 5, 54, 0, 0, 389, 390, 6, 15,
		-1, 0, 390, 423, 1, 0, 0, 0, 391, 392, 5, 2, 0, 0, 392, 393, 5, 53, 0,
		0, 393, 394, 3, 32, 16, 0, 394, 395, 5, 54, 0, 0, 395, 396, 6, 15, -1,
		0, 396, 423, 1, 0, 0, 0, 397, 398, 5, 3, 0, 0, 398, 399, 5, 53, 0, 0, 399,
		400, 3, 32, 16, 0, 400, 401, 5, 54, 0, 0, 401, 402, 6, 15, -1, 0, 402,
		423, 1, 0, 0, 0, 403, 404, 3, 36, 18, 0, 404, 405, 6, 15, -1, 0, 405, 423,
		1, 0, 0, 0, 406, 407, 5, 57, 0, 0, 407, 408, 3, 34, 17, 0, 408, 409, 5,
		58, 0, 0, 409, 410, 6, 15, -1, 0, 410, 423, 1, 0, 0, 0, 411, 412, 5, 37,
		0, 0, 412, 413, 5, 60, 0, 0, 413, 414, 5, 27, 0, 0, 414, 423, 6, 15, -1,
		0, 415, 416, 5, 37, 0, 0, 416, 417, 5, 60, 0, 0, 417, 418, 5, 26, 0, 0,
		418, 423, 6, 15, -1, 0, 419, 420, 3, 38, 19, 0, 420, 421, 6, 15, -1, 0,
		421, 423, 1, 0, 0, 0, 422, 366, 1, 0, 0, 0, 422, 371, 1, 0, 0, 0, 422,
		375, 1, 0, 0, 0, 422, 380, 1, 0, 0, 0, 422, 382, 1, 0, 0, 0, 422, 385,
		1, 0, 0, 0, 422, 391, 1, 0, 0, 0, 422, 397, 1, 0, 0, 0, 422, 403, 1, 0,
		0, 0, 422, 406, 1, 0, 0, 0, 422, 411, 1, 0, 0, 0, 422, 415, 1, 0, 0, 0,
		422, 419, 1, 0, 0, 0, 423, 461, 1, 0, 0, 0, 424, 425, 10, 20, 0, 0, 425,
		426, 7, 0, 0, 0, 426, 427, 3, 30, 15, 21, 427, 428, 6, 15, -1, 0, 428,
		460, 1, 0, 0, 0, 429, 430, 10, 19, 0, 0, 430, 431, 7, 1, 0, 0, 431, 432,
		3, 30, 15, 20, 432, 433, 6, 15, -1, 0, 433, 460, 1, 0, 0, 0, 434, 435,
		10, 18, 0, 0, 435, 436, 7, 2, 0, 0, 436, 437, 3, 30, 15, 19, 437, 438,
		6, 15, -1, 0, 438, 460, 1, 0, 0, 0, 439, 440, 10, 17, 0, 0, 440, 441, 7,
		3, 0, 0, 441, 442, 3, 30, 15, 18, 442, 443, 6, 15, -1, 0, 443, 460, 1,
		0, 0, 0, 444, 445, 10, 16, 0, 0, 445, 446, 7, 4, 0, 0, 446, 447, 3, 30,
		15, 17, 447, 448, 6, 15, -1, 0, 448, 460, 1, 0, 0, 0, 449, 450, 10, 15,
		0, 0, 450, 451, 5, 42, 0, 0, 451, 452, 3, 30, 15, 16, 452, 453, 6, 15,
		-1, 0, 453, 460, 1, 0, 0, 0, 454, 455, 10, 14, 0, 0, 455, 456, 5, 41, 0,
		0, 456, 457, 3, 30, 15, 15, 457, 458, 6, 15, -1, 0, 458, 460, 1, 0, 0,
		0, 459, 424, 1, 0, 0, 0, 459, 429, 1, 0, 0, 0, 459, 434, 1, 0, 0, 0, 459,
		439, 1, 0, 0, 0, 459, 444, 1, 0, 0, 0, 459, 449, 1, 0, 0, 0, 459, 454,
		1, 0, 0, 0, 460, 463, 1, 0, 0, 0, 461, 459, 1, 0, 0, 0, 461, 462, 1, 0,
		0, 0, 462, 31, 1, 0, 0, 0, 463, 461, 1, 0, 0, 0, 464, 465, 5, 34, 0, 0,
		465, 475, 6, 16, -1, 0, 466, 467, 5, 35, 0, 0, 467, 475, 6, 16, -1, 0,
		468, 469, 5, 36, 0, 0, 469, 475, 6, 16, -1, 0, 470, 471, 5, 8, 0, 0, 471,
		475, 6, 16, -1, 0, 472, 473, 5, 9, 0, 0, 473, 475, 6, 16, -1, 0, 474, 464,
		1, 0, 0, 0, 474, 466, 1, 0, 0, 0, 474, 468, 1, 0, 0, 0, 474, 470, 1, 0,
		0, 0, 474, 472, 1, 0, 0, 0, 475, 33, 1, 0, 0, 0, 476, 477, 6, 17, -1, 0,
		477, 478, 3, 30, 15, 0, 478, 479, 6, 17, -1, 0, 479, 487, 1, 0, 0, 0, 480,
		481, 10, 2, 0, 0, 481, 482, 5, 61, 0, 0, 482, 483, 3, 30, 15, 0, 483, 484,
		6, 17, -1, 0, 484, 486, 1, 0, 0, 0, 485, 480, 1, 0, 0, 0, 486, 489, 1,
		0, 0, 0, 487, 485, 1, 0, 0, 0, 487, 488, 1, 0, 0, 0, 488, 35, 1, 0, 0,
		0, 489, 487, 1, 0, 0, 0, 490, 491, 6, 18, -1, 0, 491, 492, 5, 37, 0, 0,
		492, 493, 6, 18, -1, 0, 493, 502, 1, 0, 0, 0, 494, 495, 10, 2, 0, 0, 495,
		496, 5, 57, 0, 0, 496, 497, 3, 30, 15, 0, 497, 498, 5, 58, 0, 0, 498, 499,
		6, 18, -1, 0, 499, 501, 1, 0, 0, 0, 500, 494, 1, 0, 0, 0, 501, 504, 1,
		0, 0, 0, 502, 500, 1, 0, 0, 0, 502, 503, 1, 0, 0, 0, 503, 37, 1, 0, 0,
		0, 504, 502, 1, 0, 0, 0, 505, 506, 6, 19, -1, 0, 506, 507, 5, 57, 0, 0,
		507, 508, 3, 30, 15, 0, 508, 509, 5, 58, 0, 0, 509, 510, 6, 19, -1, 0,
		510, 519, 1, 0, 0, 0, 511, 512, 10, 2, 0, 0, 512, 513, 5, 57, 0, 0, 513,
		514, 3, 30, 15, 0, 514, 515, 5, 58, 0, 0, 515, 516, 6, 19, -1, 0, 516,
		518, 1, 0, 0, 0, 517, 511, 1, 0, 0, 0, 518, 521, 1, 0, 0, 0, 519, 517,
		1, 0, 0, 0, 519, 520, 1, 0, 0, 0, 520, 39, 1, 0, 0, 0, 521, 519, 1, 0,
		0, 0, 21, 47, 53, 59, 77, 82, 91, 196, 213, 230, 256, 296, 318, 338, 356,
		422, 459, 461, 474, 487, 502, 519,
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
	SwiftGrammarParserAT           = 33
	SwiftGrammarParserNUMBER       = 34
	SwiftGrammarParserCHARACTER    = 35
	SwiftGrammarParserSTRING       = 36
	SwiftGrammarParserID           = 37
	SwiftGrammarParserDIF          = 38
	SwiftGrammarParserIG_IG        = 39
	SwiftGrammarParserNOT          = 40
	SwiftGrammarParserOR           = 41
	SwiftGrammarParserAND          = 42
	SwiftGrammarParserIG           = 43
	SwiftGrammarParserMAY_IG       = 44
	SwiftGrammarParserMEN_IG       = 45
	SwiftGrammarParserMAYOR        = 46
	SwiftGrammarParserMENOR        = 47
	SwiftGrammarParserMOD          = 48
	SwiftGrammarParserMUL          = 49
	SwiftGrammarParserDIV          = 50
	SwiftGrammarParserADD          = 51
	SwiftGrammarParserSUB          = 52
	SwiftGrammarParserPARIZQ       = 53
	SwiftGrammarParserPARDER       = 54
	SwiftGrammarParserLLAVEIZQ     = 55
	SwiftGrammarParserLLAVEDER     = 56
	SwiftGrammarParserCORIZQ       = 57
	SwiftGrammarParserCORDER       = 58
	SwiftGrammarParserDOSP         = 59
	SwiftGrammarParserPUNTO        = 60
	SwiftGrammarParserCOMA         = 61
	SwiftGrammarParserINTCE        = 62
	SwiftGrammarParserFLECHA       = 63
	SwiftGrammarParserAMP          = 64
	SwiftGrammarParserPCOMA        = 65
	SwiftGrammarParserWHITESPACE   = 66
	SwiftGrammarParserCOMMENT      = 67
	SwiftGrammarParserLINE_COMMENT = 68
)

// SwiftGrammarParser rules.
const (
	SwiftGrammarParserRULE_s            = 0
	SwiftGrammarParserRULE_block        = 1
	SwiftGrammarParserRULE_instruction  = 2
	SwiftGrammarParserRULE_funcstmt     = 3
	SwiftGrammarParserRULE_funcallstmt  = 4
	SwiftGrammarParserRULE_printstmt    = 5
	SwiftGrammarParserRULE_variablestmt = 6
	SwiftGrammarParserRULE_typestmt     = 7
	SwiftGrammarParserRULE_type2stmt    = 8
	SwiftGrammarParserRULE_funvecstmt   = 9
	SwiftGrammarParserRULE_ifstmt       = 10
	SwiftGrammarParserRULE_elifs        = 11
	SwiftGrammarParserRULE_switchstmt   = 12
	SwiftGrammarParserRULE_cases        = 13
	SwiftGrammarParserRULE_whilestmt    = 14
	SwiftGrammarParserRULE_expr         = 15
	SwiftGrammarParserRULE_primitives   = 16
	SwiftGrammarParserRULE_listParams   = 17
	SwiftGrammarParserRULE_listArray    = 18
	SwiftGrammarParserRULE_listAceso    = 19
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
		p.SetState(40)

		var _x = p.Block()

		localctx.(*SContext)._block = _x
	}
	{
		p.SetState(41)
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

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(45)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = 1
	for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		switch _alt {
		case 1:
			{
				p.SetState(44)

				var _x = p.Instruction()

				localctx.(*BlockContext)._instruction = _x
			}
			localctx.(*BlockContext).ins = append(localctx.(*BlockContext).ins, localctx.(*BlockContext)._instruction)

		default:
			p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
			goto errorExit
		}

		p.SetState(47)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 0, p.GetParserRuleContext())
		if p.HasError() {
			goto errorExit
		}
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

	// Get_BREAK returns the _BREAK token.
	Get_BREAK() antlr.Token

	// Get_CONTINUE returns the _CONTINUE token.
	Get_CONTINUE() antlr.Token

	// Set_BREAK sets the _BREAK token.
	Set_BREAK(antlr.Token)

	// Set_CONTINUE sets the _CONTINUE token.
	Set_CONTINUE(antlr.Token)

	// Get_printstmt returns the _printstmt rule contexts.
	Get_printstmt() IPrintstmtContext

	// Get_variablestmt returns the _variablestmt rule contexts.
	Get_variablestmt() IVariablestmtContext

	// Get_ifstmt returns the _ifstmt rule contexts.
	Get_ifstmt() IIfstmtContext

	// Get_switchstmt returns the _switchstmt rule contexts.
	Get_switchstmt() ISwitchstmtContext

	// Get_whilestmt returns the _whilestmt rule contexts.
	Get_whilestmt() IWhilestmtContext

	// Get_funvecstmt returns the _funvecstmt rule contexts.
	Get_funvecstmt() IFunvecstmtContext

	// Get_funcstmt returns the _funcstmt rule contexts.
	Get_funcstmt() IFuncstmtContext

	// Get_funcallstmt returns the _funcallstmt rule contexts.
	Get_funcallstmt() IFuncallstmtContext

	// Set_printstmt sets the _printstmt rule contexts.
	Set_printstmt(IPrintstmtContext)

	// Set_variablestmt sets the _variablestmt rule contexts.
	Set_variablestmt(IVariablestmtContext)

	// Set_ifstmt sets the _ifstmt rule contexts.
	Set_ifstmt(IIfstmtContext)

	// Set_switchstmt sets the _switchstmt rule contexts.
	Set_switchstmt(ISwitchstmtContext)

	// Set_whilestmt sets the _whilestmt rule contexts.
	Set_whilestmt(IWhilestmtContext)

	// Set_funvecstmt sets the _funvecstmt rule contexts.
	Set_funvecstmt(IFunvecstmtContext)

	// Set_funcstmt sets the _funcstmt rule contexts.
	Set_funcstmt(IFuncstmtContext)

	// Set_funcallstmt sets the _funcallstmt rule contexts.
	Set_funcallstmt(IFuncallstmtContext)

	// GetInst returns the inst attribute.
	GetInst() interfaces.Instruction

	// SetInst sets the inst attribute.
	SetInst(interfaces.Instruction)

	// Getter signatures
	Printstmt() IPrintstmtContext
	PCOMA() antlr.TerminalNode
	Variablestmt() IVariablestmtContext
	Ifstmt() IIfstmtContext
	Switchstmt() ISwitchstmtContext
	Whilestmt() IWhilestmtContext
	Funvecstmt() IFunvecstmtContext
	BREAK() antlr.TerminalNode
	CONTINUE() antlr.TerminalNode
	Funcstmt() IFuncstmtContext
	Funcallstmt() IFuncallstmtContext

	// IsInstructionContext differentiates from other interfaces.
	IsInstructionContext()
}

type InstructionContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	inst          interfaces.Instruction
	_printstmt    IPrintstmtContext
	_variablestmt IVariablestmtContext
	_ifstmt       IIfstmtContext
	_switchstmt   ISwitchstmtContext
	_whilestmt    IWhilestmtContext
	_funvecstmt   IFunvecstmtContext
	_BREAK        antlr.Token
	_CONTINUE     antlr.Token
	_funcstmt     IFuncstmtContext
	_funcallstmt  IFuncallstmtContext
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

func (s *InstructionContext) Get_BREAK() antlr.Token { return s._BREAK }

func (s *InstructionContext) Get_CONTINUE() antlr.Token { return s._CONTINUE }

func (s *InstructionContext) Set_BREAK(v antlr.Token) { s._BREAK = v }

func (s *InstructionContext) Set_CONTINUE(v antlr.Token) { s._CONTINUE = v }

func (s *InstructionContext) Get_printstmt() IPrintstmtContext { return s._printstmt }

func (s *InstructionContext) Get_variablestmt() IVariablestmtContext { return s._variablestmt }

func (s *InstructionContext) Get_ifstmt() IIfstmtContext { return s._ifstmt }

func (s *InstructionContext) Get_switchstmt() ISwitchstmtContext { return s._switchstmt }

func (s *InstructionContext) Get_whilestmt() IWhilestmtContext { return s._whilestmt }

func (s *InstructionContext) Get_funvecstmt() IFunvecstmtContext { return s._funvecstmt }

func (s *InstructionContext) Get_funcstmt() IFuncstmtContext { return s._funcstmt }

func (s *InstructionContext) Get_funcallstmt() IFuncallstmtContext { return s._funcallstmt }

func (s *InstructionContext) Set_printstmt(v IPrintstmtContext) { s._printstmt = v }

func (s *InstructionContext) Set_variablestmt(v IVariablestmtContext) { s._variablestmt = v }

func (s *InstructionContext) Set_ifstmt(v IIfstmtContext) { s._ifstmt = v }

func (s *InstructionContext) Set_switchstmt(v ISwitchstmtContext) { s._switchstmt = v }

func (s *InstructionContext) Set_whilestmt(v IWhilestmtContext) { s._whilestmt = v }

func (s *InstructionContext) Set_funvecstmt(v IFunvecstmtContext) { s._funvecstmt = v }

func (s *InstructionContext) Set_funcstmt(v IFuncstmtContext) { s._funcstmt = v }

func (s *InstructionContext) Set_funcallstmt(v IFuncallstmtContext) { s._funcallstmt = v }

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

func (s *InstructionContext) PCOMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPCOMA, 0)
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

func (s *InstructionContext) Switchstmt() ISwitchstmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISwitchstmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISwitchstmtContext)
}

func (s *InstructionContext) Whilestmt() IWhilestmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IWhilestmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IWhilestmtContext)
}

func (s *InstructionContext) Funvecstmt() IFunvecstmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IFunvecstmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IFunvecstmtContext)
}

func (s *InstructionContext) BREAK() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserBREAK, 0)
}

func (s *InstructionContext) CONTINUE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCONTINUE, 0)
}

func (s *InstructionContext) Funcstmt() IFuncstmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IFuncstmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IFuncstmtContext)
}

func (s *InstructionContext) Funcallstmt() IFuncallstmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IFuncallstmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IFuncallstmtContext)
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
	p.SetState(91)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 5, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(51)

			var _x = p.Printstmt()

			localctx.(*InstructionContext)._printstmt = _x
		}
		p.SetState(53)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 1, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(52)
				p.Match(SwiftGrammarParserPCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_printstmt().GetPrnt()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(57)

			var _x = p.Variablestmt()

			localctx.(*InstructionContext)._variablestmt = _x
		}
		p.SetState(59)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 2, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(58)
				p.Match(SwiftGrammarParserPCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_variablestmt().GetVari()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(63)

			var _x = p.Ifstmt()

			localctx.(*InstructionContext)._ifstmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_ifstmt().GetIfinst()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(66)

			var _x = p.Switchstmt()

			localctx.(*InstructionContext)._switchstmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_switchstmt().GetSwinst()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(69)

			var _x = p.Whilestmt()

			localctx.(*InstructionContext)._whilestmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_whilestmt().GetWhileinst()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(72)

			var _x = p.Funvecstmt()

			localctx.(*InstructionContext)._funvecstmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_funvecstmt().GetFvecisnt()

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(75)

			var _m = p.Match(SwiftGrammarParserBREAK)

			localctx.(*InstructionContext)._BREAK = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(77)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 3, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(76)
				p.Match(SwiftGrammarParserPCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		localctx.(*InstructionContext).inst = instructions.NewBreak((func() int {
			if localctx.(*InstructionContext).Get_BREAK() == nil {
				return 0
			} else {
				return localctx.(*InstructionContext).Get_BREAK().GetLine()
			}
		}()), (func() int {
			if localctx.(*InstructionContext).Get_BREAK() == nil {
				return 0
			} else {
				return localctx.(*InstructionContext).Get_BREAK().GetColumn()
			}
		}()))

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(80)

			var _m = p.Match(SwiftGrammarParserCONTINUE)

			localctx.(*InstructionContext)._CONTINUE = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(82)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 4, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(81)
				p.Match(SwiftGrammarParserPCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		localctx.(*InstructionContext).inst = instructions.NewContinue((func() int {
			if localctx.(*InstructionContext).Get_CONTINUE() == nil {
				return 0
			} else {
				return localctx.(*InstructionContext).Get_CONTINUE().GetLine()
			}
		}()), (func() int {
			if localctx.(*InstructionContext).Get_CONTINUE() == nil {
				return 0
			} else {
				return localctx.(*InstructionContext).Get_CONTINUE().GetColumn()
			}
		}()))

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(85)

			var _x = p.Funcstmt()

			localctx.(*InstructionContext)._funcstmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_funcstmt().GetFun()

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(88)

			var _x = p.Funcallstmt()

			localctx.(*InstructionContext)._funcallstmt = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_funcallstmt().GetCfun()

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

// IFuncstmtContext is an interface to support dynamic dispatch.
type IFuncstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_FUNC returns the _FUNC token.
	Get_FUNC() antlr.Token

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_FUNC sets the _FUNC token.
	Set_FUNC(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// GetFun returns the fun attribute.
	GetFun() interfaces.Instruction

	// SetFun sets the fun attribute.
	SetFun(interfaces.Instruction)

	// Getter signatures
	FUNC() antlr.TerminalNode
	ID() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	PARDER() antlr.TerminalNode
	LLAVEIZQ() antlr.TerminalNode
	Block() IBlockContext
	LLAVEDER() antlr.TerminalNode

	// IsFuncstmtContext differentiates from other interfaces.
	IsFuncstmtContext()
}

type FuncstmtContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	fun    interfaces.Instruction
	_FUNC  antlr.Token
	_ID    antlr.Token
	_block IBlockContext
}

func NewEmptyFuncstmtContext() *FuncstmtContext {
	var p = new(FuncstmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funcstmt
	return p
}

func InitEmptyFuncstmtContext(p *FuncstmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funcstmt
}

func (*FuncstmtContext) IsFuncstmtContext() {}

func NewFuncstmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FuncstmtContext {
	var p = new(FuncstmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_funcstmt

	return p
}

func (s *FuncstmtContext) GetParser() antlr.Parser { return s.parser }

func (s *FuncstmtContext) Get_FUNC() antlr.Token { return s._FUNC }

func (s *FuncstmtContext) Get_ID() antlr.Token { return s._ID }

func (s *FuncstmtContext) Set_FUNC(v antlr.Token) { s._FUNC = v }

func (s *FuncstmtContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *FuncstmtContext) Get_block() IBlockContext { return s._block }

func (s *FuncstmtContext) Set_block(v IBlockContext) { s._block = v }

func (s *FuncstmtContext) GetFun() interfaces.Instruction { return s.fun }

func (s *FuncstmtContext) SetFun(v interfaces.Instruction) { s.fun = v }

func (s *FuncstmtContext) FUNC() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFUNC, 0)
}

func (s *FuncstmtContext) ID() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID, 0)
}

func (s *FuncstmtContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *FuncstmtContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *FuncstmtContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *FuncstmtContext) Block() IBlockContext {
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

func (s *FuncstmtContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *FuncstmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FuncstmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FuncstmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterFuncstmt(s)
	}
}

func (s *FuncstmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitFuncstmt(s)
	}
}

func (p *SwiftGrammarParser) Funcstmt() (localctx IFuncstmtContext) {
	localctx = NewFuncstmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, SwiftGrammarParserRULE_funcstmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(93)

		var _m = p.Match(SwiftGrammarParserFUNC)

		localctx.(*FuncstmtContext)._FUNC = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(94)

		var _m = p.Match(SwiftGrammarParserID)

		localctx.(*FuncstmtContext)._ID = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(95)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(96)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(97)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(98)

		var _x = p.Block()

		localctx.(*FuncstmtContext)._block = _x
	}
	{
		p.SetState(99)
		p.Match(SwiftGrammarParserLLAVEDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*FuncstmtContext).fun = instructions.NweDeclarationFunc((func() int {
		if localctx.(*FuncstmtContext).Get_FUNC() == nil {
			return 0
		} else {
			return localctx.(*FuncstmtContext).Get_FUNC().GetLine()
		}
	}()), (func() int {
		if localctx.(*FuncstmtContext).Get_FUNC() == nil {
			return 0
		} else {
			return localctx.(*FuncstmtContext).Get_FUNC().GetColumn()
		}
	}()), (func() string {
		if localctx.(*FuncstmtContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*FuncstmtContext).Get_ID().GetText()
		}
	}()), environment.NULL, localctx.(*FuncstmtContext).Get_block().GetBlk())

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

// IFuncallstmtContext is an interface to support dynamic dispatch.
type IFuncallstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetCfun returns the cfun attribute.
	GetCfun() interfaces.Instruction

	// SetCfun sets the cfun attribute.
	SetCfun(interfaces.Instruction)

	// Getter signatures
	ID() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	PARDER() antlr.TerminalNode

	// IsFuncallstmtContext differentiates from other interfaces.
	IsFuncallstmtContext()
}

type FuncallstmtContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	cfun   interfaces.Instruction
	_ID    antlr.Token
}

func NewEmptyFuncallstmtContext() *FuncallstmtContext {
	var p = new(FuncallstmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funcallstmt
	return p
}

func InitEmptyFuncallstmtContext(p *FuncallstmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funcallstmt
}

func (*FuncallstmtContext) IsFuncallstmtContext() {}

func NewFuncallstmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FuncallstmtContext {
	var p = new(FuncallstmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_funcallstmt

	return p
}

func (s *FuncallstmtContext) GetParser() antlr.Parser { return s.parser }

func (s *FuncallstmtContext) Get_ID() antlr.Token { return s._ID }

func (s *FuncallstmtContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *FuncallstmtContext) GetCfun() interfaces.Instruction { return s.cfun }

func (s *FuncallstmtContext) SetCfun(v interfaces.Instruction) { s.cfun = v }

func (s *FuncallstmtContext) ID() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID, 0)
}

func (s *FuncallstmtContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *FuncallstmtContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *FuncallstmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FuncallstmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FuncallstmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterFuncallstmt(s)
	}
}

func (s *FuncallstmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitFuncallstmt(s)
	}
}

func (p *SwiftGrammarParser) Funcallstmt() (localctx IFuncallstmtContext) {
	localctx = NewFuncallstmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, SwiftGrammarParserRULE_funcallstmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(102)

		var _m = p.Match(SwiftGrammarParserID)

		localctx.(*FuncallstmtContext)._ID = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(103)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(104)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*FuncallstmtContext).cfun = instructions.NewFunCall((func() int {
		if localctx.(*FuncallstmtContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*FuncallstmtContext).Get_ID().GetLine()
		}
	}()), (func() int {
		if localctx.(*FuncallstmtContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*FuncallstmtContext).Get_ID().GetColumn()
		}
	}()), (func() string {
		if localctx.(*FuncallstmtContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*FuncallstmtContext).Get_ID().GetText()
		}
	}()))

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
	p.EnterRule(localctx, 10, SwiftGrammarParserRULE_printstmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(107)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(108)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(109)

		var _x = p.expr(0)

		localctx.(*PrintstmtContext)._expr = _x
	}
	{
		p.SetState(110)
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

	// Get_CORIZQ returns the _CORIZQ token.
	Get_CORIZQ() antlr.Token

	// Set_VAR sets the _VAR token.
	Set_VAR(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Set_LET sets the _LET token.
	Set_LET(antlr.Token)

	// Set_CORIZQ sets the _CORIZQ token.
	Set_CORIZQ(antlr.Token)

	// Get_typestmt returns the _typestmt rule contexts.
	Get_typestmt() ITypestmtContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_primitives returns the _primitives rule contexts.
	Get_primitives() IPrimitivesContext

	// GetE1 returns the e1 rule contexts.
	GetE1() IExprContext

	// GetE2 returns the e2 rule contexts.
	GetE2() IExprContext

	// Set_typestmt sets the _typestmt rule contexts.
	Set_typestmt(ITypestmtContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_primitives sets the _primitives rule contexts.
	Set_primitives(IPrimitivesContext)

	// SetE1 sets the e1 rule contexts.
	SetE1(IExprContext)

	// SetE2 sets the e2 rule contexts.
	SetE2(IExprContext)

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
	AllExpr() []IExprContext
	Expr(i int) IExprContext
	INTCE() antlr.TerminalNode
	LET() antlr.TerminalNode
	Primitives() IPrimitivesContext
	CORIZQ() antlr.TerminalNode
	CORDER() antlr.TerminalNode
	ADD() antlr.TerminalNode
	SUB() antlr.TerminalNode

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
	e1          IExprContext
	e2          IExprContext
	_CORIZQ     antlr.Token
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

func (s *VariablestmtContext) Get_CORIZQ() antlr.Token { return s._CORIZQ }

func (s *VariablestmtContext) Set_VAR(v antlr.Token) { s._VAR = v }

func (s *VariablestmtContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *VariablestmtContext) Set_LET(v antlr.Token) { s._LET = v }

func (s *VariablestmtContext) Set_CORIZQ(v antlr.Token) { s._CORIZQ = v }

func (s *VariablestmtContext) Get_typestmt() ITypestmtContext { return s._typestmt }

func (s *VariablestmtContext) Get_expr() IExprContext { return s._expr }

func (s *VariablestmtContext) Get_primitives() IPrimitivesContext { return s._primitives }

func (s *VariablestmtContext) GetE1() IExprContext { return s.e1 }

func (s *VariablestmtContext) GetE2() IExprContext { return s.e2 }

func (s *VariablestmtContext) Set_typestmt(v ITypestmtContext) { s._typestmt = v }

func (s *VariablestmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *VariablestmtContext) Set_primitives(v IPrimitivesContext) { s._primitives = v }

func (s *VariablestmtContext) SetE1(v IExprContext) { s.e1 = v }

func (s *VariablestmtContext) SetE2(v IExprContext) { s.e2 = v }

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

func (s *VariablestmtContext) AllExpr() []IExprContext {
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

func (s *VariablestmtContext) Expr(i int) IExprContext {
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

func (s *VariablestmtContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORIZQ, 0)
}

func (s *VariablestmtContext) CORDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORDER, 0)
}

func (s *VariablestmtContext) ADD() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserADD, 0)
}

func (s *VariablestmtContext) SUB() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSUB, 0)
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
	p.EnterRule(localctx, 12, SwiftGrammarParserRULE_variablestmt)
	p.SetState(196)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 6, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(113)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(114)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(115)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(116)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(117)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(118)

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
			p.SetState(121)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(122)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(123)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(124)

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
			p.SetState(127)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(128)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(129)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(130)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(131)
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
			p.SetState(134)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*VariablestmtContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(135)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(136)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(137)

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

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(140)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*VariablestmtContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(141)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(142)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(143)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(144)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(145)

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

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(148)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(149)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(150)

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

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(153)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(154)
			p.Match(SwiftGrammarParserCORIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(155)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext).e1 = _x
		}
		{
			p.SetState(156)
			p.Match(SwiftGrammarParserCORDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(157)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(158)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext).e2 = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewAssigmentVec((func() int {
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
		}()), localctx.(*VariablestmtContext).GetE1().GetE(), localctx.(*VariablestmtContext).GetE2().GetE())

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(161)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(162)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext).e1 = _x
		}
		{
			p.SetState(163)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(164)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext).e2 = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewAssigmentMa((func() int {
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
		}()), localctx.(*VariablestmtContext).GetE1().GetE(), localctx.(*VariablestmtContext).GetE2().GetE())

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(167)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(168)
			p.Match(SwiftGrammarParserADD)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(169)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(170)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext)._expr = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewSumAssigment((func() int {
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

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(173)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(174)
			p.Match(SwiftGrammarParserSUB)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(175)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(176)

			var _x = p.expr(0)

			localctx.(*VariablestmtContext)._expr = _x
		}
		localctx.(*VariablestmtContext).vari = instructions.NewResAssigment((func() int {
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

	case 11:
		p.EnterOuterAlt(localctx, 11)
		{
			p.SetState(179)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(180)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(181)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(182)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(183)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(184)

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

	case 12:
		p.EnterOuterAlt(localctx, 12)
		{
			p.SetState(187)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VariablestmtContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(188)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*VariablestmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(189)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(190)

			var _x = p.Typestmt()

			localctx.(*VariablestmtContext)._typestmt = _x
		}
		{
			p.SetState(191)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(192)

			var _m = p.Match(SwiftGrammarParserCORIZQ)

			localctx.(*VariablestmtContext)._CORIZQ = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(193)
			p.Match(SwiftGrammarParserCORDER)
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
		}()), localctx.(*VariablestmtContext).Get_typestmt().GetType_(),
			expressions.NewArray((func() int {
				if localctx.(*VariablestmtContext).Get_CORIZQ() == nil {
					return 0
				} else {
					return localctx.(*VariablestmtContext).Get_CORIZQ().GetLine()
				}
			}()), (func() int {
				if localctx.(*VariablestmtContext).Get_CORIZQ() == nil {
					return 0
				} else {
					return localctx.(*VariablestmtContext).Get_CORIZQ().GetColumn()
				}
			}()), nil),
			true)

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

	// Get_type2stmt returns the _type2stmt rule contexts.
	Get_type2stmt() IType2stmtContext

	// Set_type2stmt sets the _type2stmt rule contexts.
	Set_type2stmt(IType2stmtContext)

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
	CORIZQ() antlr.TerminalNode
	Type2stmt() IType2stmtContext
	CORDER() antlr.TerminalNode

	// IsTypestmtContext differentiates from other interfaces.
	IsTypestmtContext()
}

type TypestmtContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	type_      environment.TipoExpresion
	_type2stmt IType2stmtContext
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

func (s *TypestmtContext) Get_type2stmt() IType2stmtContext { return s._type2stmt }

func (s *TypestmtContext) Set_type2stmt(v IType2stmtContext) { s._type2stmt = v }

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

func (s *TypestmtContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORIZQ, 0)
}

func (s *TypestmtContext) Type2stmt() IType2stmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IType2stmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IType2stmtContext)
}

func (s *TypestmtContext) CORDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORDER, 0)
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
	p.EnterRule(localctx, 14, SwiftGrammarParserRULE_typestmt)
	p.SetState(213)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(198)
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
			p.SetState(200)
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
			p.SetState(202)
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
			p.SetState(204)
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
			p.SetState(206)
			p.Match(SwiftGrammarParserCHAR)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TypestmtContext).type_ = environment.CHAR

	case SwiftGrammarParserCORIZQ:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(208)
			p.Match(SwiftGrammarParserCORIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(209)

			var _x = p.Type2stmt()

			localctx.(*TypestmtContext)._type2stmt = _x
		}
		{
			p.SetState(210)
			p.Match(SwiftGrammarParserCORDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TypestmtContext).type_ = localctx.(*TypestmtContext).Get_type2stmt().GetType2()

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

// IType2stmtContext is an interface to support dynamic dispatch.
type IType2stmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_type2stmt returns the _type2stmt rule contexts.
	Get_type2stmt() IType2stmtContext

	// Set_type2stmt sets the _type2stmt rule contexts.
	Set_type2stmt(IType2stmtContext)

	// GetType2 returns the type2 attribute.
	GetType2() environment.TipoExpresion

	// SetType2 sets the type2 attribute.
	SetType2(environment.TipoExpresion)

	// Getter signatures
	INT() antlr.TerminalNode
	FLOAT() antlr.TerminalNode
	TSTRING() antlr.TerminalNode
	BOOL() antlr.TerminalNode
	CHAR() antlr.TerminalNode
	CORIZQ() antlr.TerminalNode
	Type2stmt() IType2stmtContext
	CORDER() antlr.TerminalNode

	// IsType2stmtContext differentiates from other interfaces.
	IsType2stmtContext()
}

type Type2stmtContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	type2      environment.TipoExpresion
	_type2stmt IType2stmtContext
}

func NewEmptyType2stmtContext() *Type2stmtContext {
	var p = new(Type2stmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_type2stmt
	return p
}

func InitEmptyType2stmtContext(p *Type2stmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_type2stmt
}

func (*Type2stmtContext) IsType2stmtContext() {}

func NewType2stmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Type2stmtContext {
	var p = new(Type2stmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_type2stmt

	return p
}

func (s *Type2stmtContext) GetParser() antlr.Parser { return s.parser }

func (s *Type2stmtContext) Get_type2stmt() IType2stmtContext { return s._type2stmt }

func (s *Type2stmtContext) Set_type2stmt(v IType2stmtContext) { s._type2stmt = v }

func (s *Type2stmtContext) GetType2() environment.TipoExpresion { return s.type2 }

func (s *Type2stmtContext) SetType2(v environment.TipoExpresion) { s.type2 = v }

func (s *Type2stmtContext) INT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserINT, 0)
}

func (s *Type2stmtContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFLOAT, 0)
}

func (s *Type2stmtContext) TSTRING() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserTSTRING, 0)
}

func (s *Type2stmtContext) BOOL() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserBOOL, 0)
}

func (s *Type2stmtContext) CHAR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCHAR, 0)
}

func (s *Type2stmtContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORIZQ, 0)
}

func (s *Type2stmtContext) Type2stmt() IType2stmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IType2stmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IType2stmtContext)
}

func (s *Type2stmtContext) CORDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORDER, 0)
}

func (s *Type2stmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Type2stmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Type2stmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterType2stmt(s)
	}
}

func (s *Type2stmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitType2stmt(s)
	}
}

func (p *SwiftGrammarParser) Type2stmt() (localctx IType2stmtContext) {
	localctx = NewType2stmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, SwiftGrammarParserRULE_type2stmt)
	p.SetState(230)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(215)
			p.Match(SwiftGrammarParserINT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*Type2stmtContext).type2 = environment.A_INTEGER

	case SwiftGrammarParserFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(217)
			p.Match(SwiftGrammarParserFLOAT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*Type2stmtContext).type2 = environment.A_FLOAT

	case SwiftGrammarParserTSTRING:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(219)
			p.Match(SwiftGrammarParserTSTRING)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*Type2stmtContext).type2 = environment.A_STRING

	case SwiftGrammarParserBOOL:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(221)
			p.Match(SwiftGrammarParserBOOL)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*Type2stmtContext).type2 = environment.A_BOOLEAN

	case SwiftGrammarParserCHAR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(223)
			p.Match(SwiftGrammarParserCHAR)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*Type2stmtContext).type2 = environment.A_CHAR

	case SwiftGrammarParserCORIZQ:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(225)
			p.Match(SwiftGrammarParserCORIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(226)

			var _x = p.Type2stmt()

			localctx.(*Type2stmtContext)._type2stmt = _x
		}
		{
			p.SetState(227)
			p.Match(SwiftGrammarParserCORDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*Type2stmtContext).type2 = localctx.(*Type2stmtContext).Get_type2stmt().GetType2()

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

// IFunvecstmtContext is an interface to support dynamic dispatch.
type IFunvecstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetFvecisnt returns the fvecisnt attribute.
	GetFvecisnt() interfaces.Instruction

	// SetFvecisnt sets the fvecisnt attribute.
	SetFvecisnt(interfaces.Instruction)

	// Getter signatures
	ID() antlr.TerminalNode
	PUNTO() antlr.TerminalNode
	APPEND() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode
	REMOVELAST() antlr.TerminalNode
	REMOVE() antlr.TerminalNode
	AT() antlr.TerminalNode
	DOSP() antlr.TerminalNode

	// IsFunvecstmtContext differentiates from other interfaces.
	IsFunvecstmtContext()
}

type FunvecstmtContext struct {
	antlr.BaseParserRuleContext
	parser   antlr.Parser
	fvecisnt interfaces.Instruction
	_ID      antlr.Token
	_expr    IExprContext
}

func NewEmptyFunvecstmtContext() *FunvecstmtContext {
	var p = new(FunvecstmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funvecstmt
	return p
}

func InitEmptyFunvecstmtContext(p *FunvecstmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funvecstmt
}

func (*FunvecstmtContext) IsFunvecstmtContext() {}

func NewFunvecstmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunvecstmtContext {
	var p = new(FunvecstmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_funvecstmt

	return p
}

func (s *FunvecstmtContext) GetParser() antlr.Parser { return s.parser }

func (s *FunvecstmtContext) Get_ID() antlr.Token { return s._ID }

func (s *FunvecstmtContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *FunvecstmtContext) Get_expr() IExprContext { return s._expr }

func (s *FunvecstmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *FunvecstmtContext) GetFvecisnt() interfaces.Instruction { return s.fvecisnt }

func (s *FunvecstmtContext) SetFvecisnt(v interfaces.Instruction) { s.fvecisnt = v }

func (s *FunvecstmtContext) ID() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID, 0)
}

func (s *FunvecstmtContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTO, 0)
}

func (s *FunvecstmtContext) APPEND() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserAPPEND, 0)
}

func (s *FunvecstmtContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *FunvecstmtContext) Expr() IExprContext {
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

func (s *FunvecstmtContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *FunvecstmtContext) REMOVELAST() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserREMOVELAST, 0)
}

func (s *FunvecstmtContext) REMOVE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserREMOVE, 0)
}

func (s *FunvecstmtContext) AT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserAT, 0)
}

func (s *FunvecstmtContext) DOSP() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOSP, 0)
}

func (s *FunvecstmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunvecstmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunvecstmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterFunvecstmt(s)
	}
}

func (s *FunvecstmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitFunvecstmt(s)
	}
}

func (p *SwiftGrammarParser) Funvecstmt() (localctx IFunvecstmtContext) {
	localctx = NewFunvecstmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, SwiftGrammarParserRULE_funvecstmt)
	p.SetState(256)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 9, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(232)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*FunvecstmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(233)
			p.Match(SwiftGrammarParserPUNTO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(234)
			p.Match(SwiftGrammarParserAPPEND)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(235)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(236)

			var _x = p.expr(0)

			localctx.(*FunvecstmtContext)._expr = _x
		}
		{
			p.SetState(237)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*FunvecstmtContext).fvecisnt = instructions.NewAppend((func() int {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetText()
			}
		}()), localctx.(*FunvecstmtContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(240)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*FunvecstmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(241)
			p.Match(SwiftGrammarParserPUNTO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(242)
			p.Match(SwiftGrammarParserREMOVELAST)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(243)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(244)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*FunvecstmtContext).fvecisnt = instructions.NewRemoveLast((func() int {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetText()
			}
		}()))

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(246)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*FunvecstmtContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(247)
			p.Match(SwiftGrammarParserPUNTO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(248)
			p.Match(SwiftGrammarParserREMOVE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(249)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(250)
			p.Match(SwiftGrammarParserAT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(251)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(252)

			var _x = p.expr(0)

			localctx.(*FunvecstmtContext)._expr = _x
		}
		{
			p.SetState(253)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*FunvecstmtContext).fvecisnt = instructions.NewRemove((func() int {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*FunvecstmtContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunvecstmtContext).Get_ID().GetText()
			}
		}()), localctx.(*FunvecstmtContext).Get_expr().GetE())

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

// IIfstmtContext is an interface to support dynamic dispatch.
type IIfstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// GetBif returns the bif rule contexts.
	GetBif() IBlockContext

	// GetBelse returns the belse rule contexts.
	GetBelse() IBlockContext

	// Get_elifs returns the _elifs rule contexts.
	Get_elifs() IElifsContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// SetBif sets the bif rule contexts.
	SetBif(IBlockContext)

	// SetBelse sets the belse rule contexts.
	SetBelse(IBlockContext)

	// Set_elifs sets the _elifs rule contexts.
	Set_elifs(IElifsContext)

	// GetIfinst returns the ifinst attribute.
	GetIfinst() interfaces.Instruction

	// SetIfinst sets the ifinst attribute.
	SetIfinst(interfaces.Instruction)

	// Getter signatures
	IF() antlr.TerminalNode
	Expr() IExprContext
	AllLLAVEIZQ() []antlr.TerminalNode
	LLAVEIZQ(i int) antlr.TerminalNode
	AllBlock() []IBlockContext
	Block(i int) IBlockContext
	AllLLAVEDER() []antlr.TerminalNode
	LLAVEDER(i int) antlr.TerminalNode
	ELSE() antlr.TerminalNode
	Elifs() IElifsContext

	// IsIfstmtContext differentiates from other interfaces.
	IsIfstmtContext()
}

type IfstmtContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	ifinst interfaces.Instruction
	_IF    antlr.Token
	_expr  IExprContext
	_block IBlockContext
	bif    IBlockContext
	belse  IBlockContext
	_elifs IElifsContext
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

func (s *IfstmtContext) Get_IF() antlr.Token { return s._IF }

func (s *IfstmtContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *IfstmtContext) Get_expr() IExprContext { return s._expr }

func (s *IfstmtContext) Get_block() IBlockContext { return s._block }

func (s *IfstmtContext) GetBif() IBlockContext { return s.bif }

func (s *IfstmtContext) GetBelse() IBlockContext { return s.belse }

func (s *IfstmtContext) Get_elifs() IElifsContext { return s._elifs }

func (s *IfstmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *IfstmtContext) Set_block(v IBlockContext) { s._block = v }

func (s *IfstmtContext) SetBif(v IBlockContext) { s.bif = v }

func (s *IfstmtContext) SetBelse(v IBlockContext) { s.belse = v }

func (s *IfstmtContext) Set_elifs(v IElifsContext) { s._elifs = v }

func (s *IfstmtContext) GetIfinst() interfaces.Instruction { return s.ifinst }

func (s *IfstmtContext) SetIfinst(v interfaces.Instruction) { s.ifinst = v }

func (s *IfstmtContext) IF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIF, 0)
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

func (s *IfstmtContext) AllLLAVEIZQ() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserLLAVEIZQ)
}

func (s *IfstmtContext) LLAVEIZQ(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, i)
}

func (s *IfstmtContext) AllBlock() []IBlockContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IBlockContext); ok {
			len++
		}
	}

	tst := make([]IBlockContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IBlockContext); ok {
			tst[i] = t.(IBlockContext)
			i++
		}
	}

	return tst
}

func (s *IfstmtContext) Block(i int) IBlockContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockContext); ok {
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

	return t.(IBlockContext)
}

func (s *IfstmtContext) AllLLAVEDER() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserLLAVEDER)
}

func (s *IfstmtContext) LLAVEDER(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, i)
}

func (s *IfstmtContext) ELSE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserELSE, 0)
}

func (s *IfstmtContext) Elifs() IElifsContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IElifsContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IElifsContext)
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
	p.EnterRule(localctx, 20, SwiftGrammarParserRULE_ifstmt)
	p.SetState(296)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 10, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(258)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*IfstmtContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(259)

			var _x = p.expr(0)

			localctx.(*IfstmtContext)._expr = _x
		}
		{
			p.SetState(260)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(261)

			var _x = p.Block()

			localctx.(*IfstmtContext)._block = _x
		}
		{
			p.SetState(262)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*IfstmtContext).ifinst = instructions.NewIf((func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetLine()
			}
		}()), (func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetColumn()
			}
		}()), localctx.(*IfstmtContext).Get_expr().GetE(), localctx.(*IfstmtContext).Get_block().GetBlk(), nil, nil)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(265)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*IfstmtContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(266)

			var _x = p.expr(0)

			localctx.(*IfstmtContext)._expr = _x
		}
		{
			p.SetState(267)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(268)

			var _x = p.Block()

			localctx.(*IfstmtContext).bif = _x
		}
		{
			p.SetState(269)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(270)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(271)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(272)

			var _x = p.Block()

			localctx.(*IfstmtContext).belse = _x
		}
		{
			p.SetState(273)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*IfstmtContext).ifinst = instructions.NewIf((func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetLine()
			}
		}()), (func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetColumn()
			}
		}()), localctx.(*IfstmtContext).Get_expr().GetE(), localctx.(*IfstmtContext).GetBif().GetBlk(), localctx.(*IfstmtContext).GetBelse().GetBlk(), nil)

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(276)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*IfstmtContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(277)

			var _x = p.expr(0)

			localctx.(*IfstmtContext)._expr = _x
		}
		{
			p.SetState(278)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(279)

			var _x = p.Block()

			localctx.(*IfstmtContext).bif = _x
		}
		{
			p.SetState(280)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(281)

			var _x = p.elifs(0)

			localctx.(*IfstmtContext)._elifs = _x
		}
		localctx.(*IfstmtContext).ifinst = instructions.NewIf((func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetLine()
			}
		}()), (func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetColumn()
			}
		}()), localctx.(*IfstmtContext).Get_expr().GetE(), localctx.(*IfstmtContext).GetBif().GetBlk(), nil, localctx.(*IfstmtContext).Get_elifs().GetElifinst())

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(284)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*IfstmtContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(285)

			var _x = p.expr(0)

			localctx.(*IfstmtContext)._expr = _x
		}
		{
			p.SetState(286)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(287)

			var _x = p.Block()

			localctx.(*IfstmtContext).bif = _x
		}
		{
			p.SetState(288)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(289)

			var _x = p.elifs(0)

			localctx.(*IfstmtContext)._elifs = _x
		}
		{
			p.SetState(290)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(291)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(292)

			var _x = p.Block()

			localctx.(*IfstmtContext).belse = _x
		}
		{
			p.SetState(293)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*IfstmtContext).ifinst = instructions.NewIf((func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetLine()
			}
		}()), (func() int {
			if localctx.(*IfstmtContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*IfstmtContext).Get_IF().GetColumn()
			}
		}()), localctx.(*IfstmtContext).Get_expr().GetE(), localctx.(*IfstmtContext).GetBif().GetBlk(), localctx.(*IfstmtContext).GetBelse().GetBlk(), localctx.(*IfstmtContext).Get_elifs().GetElifinst())

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

// IElifsContext is an interface to support dynamic dispatch.
type IElifsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ELSE returns the _ELSE token.
	Get_ELSE() antlr.Token

	// Set_ELSE sets the _ELSE token.
	Set_ELSE(antlr.Token)

	// GetCelif returns the celif rule contexts.
	GetCelif() IElifsContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// SetCelif sets the celif rule contexts.
	SetCelif(IElifsContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// GetElifinst returns the elifinst attribute.
	GetElifinst() []interface{}

	// SetElifinst sets the elifinst attribute.
	SetElifinst([]interface{})

	// Getter signatures
	ELSE() antlr.TerminalNode
	IF() antlr.TerminalNode
	Expr() IExprContext
	LLAVEIZQ() antlr.TerminalNode
	Block() IBlockContext
	LLAVEDER() antlr.TerminalNode
	Elifs() IElifsContext

	// IsElifsContext differentiates from other interfaces.
	IsElifsContext()
}

type ElifsContext struct {
	antlr.BaseParserRuleContext
	parser   antlr.Parser
	elifinst []interface{}
	celif    IElifsContext
	_ELSE    antlr.Token
	_expr    IExprContext
	_block   IBlockContext
}

func NewEmptyElifsContext() *ElifsContext {
	var p = new(ElifsContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_elifs
	return p
}

func InitEmptyElifsContext(p *ElifsContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_elifs
}

func (*ElifsContext) IsElifsContext() {}

func NewElifsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ElifsContext {
	var p = new(ElifsContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_elifs

	return p
}

func (s *ElifsContext) GetParser() antlr.Parser { return s.parser }

func (s *ElifsContext) Get_ELSE() antlr.Token { return s._ELSE }

func (s *ElifsContext) Set_ELSE(v antlr.Token) { s._ELSE = v }

func (s *ElifsContext) GetCelif() IElifsContext { return s.celif }

func (s *ElifsContext) Get_expr() IExprContext { return s._expr }

func (s *ElifsContext) Get_block() IBlockContext { return s._block }

func (s *ElifsContext) SetCelif(v IElifsContext) { s.celif = v }

func (s *ElifsContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ElifsContext) Set_block(v IBlockContext) { s._block = v }

func (s *ElifsContext) GetElifinst() []interface{} { return s.elifinst }

func (s *ElifsContext) SetElifinst(v []interface{}) { s.elifinst = v }

func (s *ElifsContext) ELSE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserELSE, 0)
}

func (s *ElifsContext) IF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIF, 0)
}

func (s *ElifsContext) Expr() IExprContext {
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

func (s *ElifsContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *ElifsContext) Block() IBlockContext {
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

func (s *ElifsContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *ElifsContext) Elifs() IElifsContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IElifsContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IElifsContext)
}

func (s *ElifsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ElifsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ElifsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterElifs(s)
	}
}

func (s *ElifsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitElifs(s)
	}
}

func (p *SwiftGrammarParser) Elifs() (localctx IElifsContext) {
	return p.elifs(0)
}

func (p *SwiftGrammarParser) elifs(_p int) (localctx IElifsContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewElifsContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IElifsContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 22
	p.EnterRecursionRule(localctx, 22, SwiftGrammarParserRULE_elifs, _p)
	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(299)

		var _m = p.Match(SwiftGrammarParserELSE)

		localctx.(*ElifsContext)._ELSE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(300)
		p.Match(SwiftGrammarParserIF)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(301)

		var _x = p.expr(0)

		localctx.(*ElifsContext)._expr = _x
	}
	{
		p.SetState(302)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(303)

		var _x = p.Block()

		localctx.(*ElifsContext)._block = _x
	}
	{
		p.SetState(304)
		p.Match(SwiftGrammarParserLLAVEDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

	localctx.(*ElifsContext).elifinst = []interface{}{}
	localctx.(*ElifsContext).elifinst = append(localctx.(*ElifsContext).elifinst, instructions.NewElif((func() int {
		if localctx.(*ElifsContext).Get_ELSE() == nil {
			return 0
		} else {
			return localctx.(*ElifsContext).Get_ELSE().GetLine()
		}
	}()), (func() int {
		if localctx.(*ElifsContext).Get_ELSE() == nil {
			return 0
		} else {
			return localctx.(*ElifsContext).Get_ELSE().GetColumn()
		}
	}()), localctx.(*ElifsContext).Get_expr().GetE(), localctx.(*ElifsContext).Get_block().GetBlk()))

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(318)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 11, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewElifsContext(p, _parentctx, _parentState)
			localctx.(*ElifsContext).celif = _prevctx
			p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_elifs)
			p.SetState(307)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
				goto errorExit
			}
			{
				p.SetState(308)

				var _m = p.Match(SwiftGrammarParserELSE)

				localctx.(*ElifsContext)._ELSE = _m
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(309)
				p.Match(SwiftGrammarParserIF)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(310)

				var _x = p.expr(0)

				localctx.(*ElifsContext)._expr = _x
			}
			{
				p.SetState(311)
				p.Match(SwiftGrammarParserLLAVEIZQ)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(312)

				var _x = p.Block()

				localctx.(*ElifsContext)._block = _x
			}
			{
				p.SetState(313)
				p.Match(SwiftGrammarParserLLAVEDER)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

			var arrif []interface{}
			arrif = append(localctx.(*ElifsContext).GetCelif().GetElifinst(), instructions.NewElif((func() int {
				if localctx.(*ElifsContext).Get_ELSE() == nil {
					return 0
				} else {
					return localctx.(*ElifsContext).Get_ELSE().GetLine()
				}
			}()), (func() int {
				if localctx.(*ElifsContext).Get_ELSE() == nil {
					return 0
				} else {
					return localctx.(*ElifsContext).Get_ELSE().GetColumn()
				}
			}()), localctx.(*ElifsContext).Get_expr().GetE(), localctx.(*ElifsContext).Get_block().GetBlk()))
			localctx.(*ElifsContext).elifinst = arrif

		}
		p.SetState(320)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 11, p.GetParserRuleContext())
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

// ISwitchstmtContext is an interface to support dynamic dispatch.
type ISwitchstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_SWITCH returns the _SWITCH token.
	Get_SWITCH() antlr.Token

	// Set_SWITCH sets the _SWITCH token.
	Set_SWITCH(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_cases returns the _cases rule contexts.
	Get_cases() ICasesContext

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_cases sets the _cases rule contexts.
	Set_cases(ICasesContext)

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// GetSwinst returns the swinst attribute.
	GetSwinst() interfaces.Instruction

	// SetSwinst sets the swinst attribute.
	SetSwinst(interfaces.Instruction)

	// Getter signatures
	SWITCH() antlr.TerminalNode
	Expr() IExprContext
	LLAVEIZQ() antlr.TerminalNode
	Cases() ICasesContext
	DEFAULT() antlr.TerminalNode
	DOSP() antlr.TerminalNode
	Block() IBlockContext
	LLAVEDER() antlr.TerminalNode

	// IsSwitchstmtContext differentiates from other interfaces.
	IsSwitchstmtContext()
}

type SwitchstmtContext struct {
	antlr.BaseParserRuleContext
	parser  antlr.Parser
	swinst  interfaces.Instruction
	_SWITCH antlr.Token
	_expr   IExprContext
	_cases  ICasesContext
	_block  IBlockContext
}

func NewEmptySwitchstmtContext() *SwitchstmtContext {
	var p = new(SwitchstmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_switchstmt
	return p
}

func InitEmptySwitchstmtContext(p *SwitchstmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_switchstmt
}

func (*SwitchstmtContext) IsSwitchstmtContext() {}

func NewSwitchstmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SwitchstmtContext {
	var p = new(SwitchstmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_switchstmt

	return p
}

func (s *SwitchstmtContext) GetParser() antlr.Parser { return s.parser }

func (s *SwitchstmtContext) Get_SWITCH() antlr.Token { return s._SWITCH }

func (s *SwitchstmtContext) Set_SWITCH(v antlr.Token) { s._SWITCH = v }

func (s *SwitchstmtContext) Get_expr() IExprContext { return s._expr }

func (s *SwitchstmtContext) Get_cases() ICasesContext { return s._cases }

func (s *SwitchstmtContext) Get_block() IBlockContext { return s._block }

func (s *SwitchstmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *SwitchstmtContext) Set_cases(v ICasesContext) { s._cases = v }

func (s *SwitchstmtContext) Set_block(v IBlockContext) { s._block = v }

func (s *SwitchstmtContext) GetSwinst() interfaces.Instruction { return s.swinst }

func (s *SwitchstmtContext) SetSwinst(v interfaces.Instruction) { s.swinst = v }

func (s *SwitchstmtContext) SWITCH() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSWITCH, 0)
}

func (s *SwitchstmtContext) Expr() IExprContext {
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

func (s *SwitchstmtContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *SwitchstmtContext) Cases() ICasesContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ICasesContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ICasesContext)
}

func (s *SwitchstmtContext) DEFAULT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDEFAULT, 0)
}

func (s *SwitchstmtContext) DOSP() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOSP, 0)
}

func (s *SwitchstmtContext) Block() IBlockContext {
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

func (s *SwitchstmtContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *SwitchstmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SwitchstmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SwitchstmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterSwitchstmt(s)
	}
}

func (s *SwitchstmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitSwitchstmt(s)
	}
}

func (p *SwiftGrammarParser) Switchstmt() (localctx ISwitchstmtContext) {
	localctx = NewSwitchstmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 24, SwiftGrammarParserRULE_switchstmt)
	p.SetState(338)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 12, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(321)

			var _m = p.Match(SwiftGrammarParserSWITCH)

			localctx.(*SwitchstmtContext)._SWITCH = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(322)

			var _x = p.expr(0)

			localctx.(*SwitchstmtContext)._expr = _x
		}
		{
			p.SetState(323)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(324)

			var _x = p.cases(0)

			localctx.(*SwitchstmtContext)._cases = _x
		}
		{
			p.SetState(325)
			p.Match(SwiftGrammarParserDEFAULT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(326)
			p.Match(SwiftGrammarParserDOSP)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(327)

			var _x = p.Block()

			localctx.(*SwitchstmtContext)._block = _x
		}
		{
			p.SetState(328)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*SwitchstmtContext).swinst = instructions.NewSwitch((func() int {
			if localctx.(*SwitchstmtContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchstmtContext).Get_SWITCH().GetLine()
			}
		}()), (func() int {
			if localctx.(*SwitchstmtContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchstmtContext).Get_SWITCH().GetColumn()
			}
		}()), localctx.(*SwitchstmtContext).Get_expr().GetE(), localctx.(*SwitchstmtContext).Get_cases().GetCasesinst(), localctx.(*SwitchstmtContext).Get_block().GetBlk())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(331)

			var _m = p.Match(SwiftGrammarParserSWITCH)

			localctx.(*SwitchstmtContext)._SWITCH = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(332)

			var _x = p.expr(0)

			localctx.(*SwitchstmtContext)._expr = _x
		}
		{
			p.SetState(333)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(334)

			var _x = p.cases(0)

			localctx.(*SwitchstmtContext)._cases = _x
		}
		{
			p.SetState(335)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*SwitchstmtContext).swinst = instructions.NewSwitch((func() int {
			if localctx.(*SwitchstmtContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchstmtContext).Get_SWITCH().GetLine()
			}
		}()), (func() int {
			if localctx.(*SwitchstmtContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchstmtContext).Get_SWITCH().GetColumn()
			}
		}()), localctx.(*SwitchstmtContext).Get_expr().GetE(), localctx.(*SwitchstmtContext).Get_cases().GetCasesinst(), nil)

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

// ICasesContext is an interface to support dynamic dispatch.
type ICasesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_CASE returns the _CASE token.
	Get_CASE() antlr.Token

	// Set_CASE sets the _CASE token.
	Set_CASE(antlr.Token)

	// GetCcases returns the ccases rule contexts.
	GetCcases() ICasesContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// SetCcases sets the ccases rule contexts.
	SetCcases(ICasesContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// GetCasesinst returns the casesinst attribute.
	GetCasesinst() []interface{}

	// SetCasesinst sets the casesinst attribute.
	SetCasesinst([]interface{})

	// Getter signatures
	CASE() antlr.TerminalNode
	Expr() IExprContext
	DOSP() antlr.TerminalNode
	Block() IBlockContext
	Cases() ICasesContext

	// IsCasesContext differentiates from other interfaces.
	IsCasesContext()
}

type CasesContext struct {
	antlr.BaseParserRuleContext
	parser    antlr.Parser
	casesinst []interface{}
	ccases    ICasesContext
	_CASE     antlr.Token
	_expr     IExprContext
	_block    IBlockContext
}

func NewEmptyCasesContext() *CasesContext {
	var p = new(CasesContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_cases
	return p
}

func InitEmptyCasesContext(p *CasesContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_cases
}

func (*CasesContext) IsCasesContext() {}

func NewCasesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CasesContext {
	var p = new(CasesContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_cases

	return p
}

func (s *CasesContext) GetParser() antlr.Parser { return s.parser }

func (s *CasesContext) Get_CASE() antlr.Token { return s._CASE }

func (s *CasesContext) Set_CASE(v antlr.Token) { s._CASE = v }

func (s *CasesContext) GetCcases() ICasesContext { return s.ccases }

func (s *CasesContext) Get_expr() IExprContext { return s._expr }

func (s *CasesContext) Get_block() IBlockContext { return s._block }

func (s *CasesContext) SetCcases(v ICasesContext) { s.ccases = v }

func (s *CasesContext) Set_expr(v IExprContext) { s._expr = v }

func (s *CasesContext) Set_block(v IBlockContext) { s._block = v }

func (s *CasesContext) GetCasesinst() []interface{} { return s.casesinst }

func (s *CasesContext) SetCasesinst(v []interface{}) { s.casesinst = v }

func (s *CasesContext) CASE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCASE, 0)
}

func (s *CasesContext) Expr() IExprContext {
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

func (s *CasesContext) DOSP() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOSP, 0)
}

func (s *CasesContext) Block() IBlockContext {
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

func (s *CasesContext) Cases() ICasesContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ICasesContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ICasesContext)
}

func (s *CasesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CasesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CasesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterCases(s)
	}
}

func (s *CasesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitCases(s)
	}
}

func (p *SwiftGrammarParser) Cases() (localctx ICasesContext) {
	return p.cases(0)
}

func (p *SwiftGrammarParser) cases(_p int) (localctx ICasesContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewCasesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx ICasesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 26
	p.EnterRecursionRule(localctx, 26, SwiftGrammarParserRULE_cases, _p)
	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(341)

		var _m = p.Match(SwiftGrammarParserCASE)

		localctx.(*CasesContext)._CASE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(342)

		var _x = p.expr(0)

		localctx.(*CasesContext)._expr = _x
	}
	{
		p.SetState(343)
		p.Match(SwiftGrammarParserDOSP)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(344)

		var _x = p.Block()

		localctx.(*CasesContext)._block = _x
	}

	localctx.(*CasesContext).casesinst = []interface{}{}
	localctx.(*CasesContext).casesinst = append(localctx.(*CasesContext).casesinst, instructions.NewCase((func() int {
		if localctx.(*CasesContext).Get_CASE() == nil {
			return 0
		} else {
			return localctx.(*CasesContext).Get_CASE().GetLine()
		}
	}()), (func() int {
		if localctx.(*CasesContext).Get_CASE() == nil {
			return 0
		} else {
			return localctx.(*CasesContext).Get_CASE().GetColumn()
		}
	}()), localctx.(*CasesContext).Get_expr().GetE(), localctx.(*CasesContext).Get_block().GetBlk()))

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(356)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 13, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewCasesContext(p, _parentctx, _parentState)
			localctx.(*CasesContext).ccases = _prevctx
			p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_cases)
			p.SetState(347)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
				goto errorExit
			}
			{
				p.SetState(348)

				var _m = p.Match(SwiftGrammarParserCASE)

				localctx.(*CasesContext)._CASE = _m
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(349)

				var _x = p.expr(0)

				localctx.(*CasesContext)._expr = _x
			}
			{
				p.SetState(350)
				p.Match(SwiftGrammarParserDOSP)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(351)

				var _x = p.Block()

				localctx.(*CasesContext)._block = _x
			}

			var arrcase []interface{}
			arrcase = append(localctx.(*CasesContext).GetCcases().GetCasesinst(), instructions.NewCase((func() int {
				if localctx.(*CasesContext).Get_CASE() == nil {
					return 0
				} else {
					return localctx.(*CasesContext).Get_CASE().GetLine()
				}
			}()), (func() int {
				if localctx.(*CasesContext).Get_CASE() == nil {
					return 0
				} else {
					return localctx.(*CasesContext).Get_CASE().GetColumn()
				}
			}()), localctx.(*CasesContext).Get_expr().GetE(), localctx.(*CasesContext).Get_block().GetBlk()))
			localctx.(*CasesContext).casesinst = arrcase

		}
		p.SetState(358)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 13, p.GetParserRuleContext())
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

// IWhilestmtContext is an interface to support dynamic dispatch.
type IWhilestmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_WHILE returns the _WHILE token.
	Get_WHILE() antlr.Token

	// Set_WHILE sets the _WHILE token.
	Set_WHILE(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// GetWhileinst returns the whileinst attribute.
	GetWhileinst() interfaces.Instruction

	// SetWhileinst sets the whileinst attribute.
	SetWhileinst(interfaces.Instruction)

	// Getter signatures
	WHILE() antlr.TerminalNode
	Expr() IExprContext
	LLAVEIZQ() antlr.TerminalNode
	Block() IBlockContext
	LLAVEDER() antlr.TerminalNode

	// IsWhilestmtContext differentiates from other interfaces.
	IsWhilestmtContext()
}

type WhilestmtContext struct {
	antlr.BaseParserRuleContext
	parser    antlr.Parser
	whileinst interfaces.Instruction
	_WHILE    antlr.Token
	_expr     IExprContext
	_block    IBlockContext
}

func NewEmptyWhilestmtContext() *WhilestmtContext {
	var p = new(WhilestmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_whilestmt
	return p
}

func InitEmptyWhilestmtContext(p *WhilestmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_whilestmt
}

func (*WhilestmtContext) IsWhilestmtContext() {}

func NewWhilestmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *WhilestmtContext {
	var p = new(WhilestmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_whilestmt

	return p
}

func (s *WhilestmtContext) GetParser() antlr.Parser { return s.parser }

func (s *WhilestmtContext) Get_WHILE() antlr.Token { return s._WHILE }

func (s *WhilestmtContext) Set_WHILE(v antlr.Token) { s._WHILE = v }

func (s *WhilestmtContext) Get_expr() IExprContext { return s._expr }

func (s *WhilestmtContext) Get_block() IBlockContext { return s._block }

func (s *WhilestmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *WhilestmtContext) Set_block(v IBlockContext) { s._block = v }

func (s *WhilestmtContext) GetWhileinst() interfaces.Instruction { return s.whileinst }

func (s *WhilestmtContext) SetWhileinst(v interfaces.Instruction) { s.whileinst = v }

func (s *WhilestmtContext) WHILE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserWHILE, 0)
}

func (s *WhilestmtContext) Expr() IExprContext {
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

func (s *WhilestmtContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *WhilestmtContext) Block() IBlockContext {
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

func (s *WhilestmtContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *WhilestmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *WhilestmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *WhilestmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterWhilestmt(s)
	}
}

func (s *WhilestmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitWhilestmt(s)
	}
}

func (p *SwiftGrammarParser) Whilestmt() (localctx IWhilestmtContext) {
	localctx = NewWhilestmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 28, SwiftGrammarParserRULE_whilestmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(359)

		var _m = p.Match(SwiftGrammarParserWHILE)

		localctx.(*WhilestmtContext)._WHILE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(360)

		var _x = p.expr(0)

		localctx.(*WhilestmtContext)._expr = _x
	}
	{
		p.SetState(361)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(362)

		var _x = p.Block()

		localctx.(*WhilestmtContext)._block = _x
	}
	{
		p.SetState(363)
		p.Match(SwiftGrammarParserLLAVEDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*WhilestmtContext).whileinst = instructions.NewWhile((func() int {
		if localctx.(*WhilestmtContext).Get_WHILE() == nil {
			return 0
		} else {
			return localctx.(*WhilestmtContext).Get_WHILE().GetLine()
		}
	}()), (func() int {
		if localctx.(*WhilestmtContext).Get_WHILE() == nil {
			return 0
		} else {
			return localctx.(*WhilestmtContext).Get_WHILE().GetColumn()
		}
	}()), localctx.(*WhilestmtContext).Get_expr().GetE(), localctx.(*WhilestmtContext).Get_block().GetBlk())

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

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Get_INT returns the _INT token.
	Get_INT() antlr.Token

	// Get_FLOAT returns the _FLOAT token.
	Get_FLOAT() antlr.Token

	// Get_TSTRING returns the _TSTRING token.
	Get_TSTRING() antlr.Token

	// Get_CORIZQ returns the _CORIZQ token.
	Get_CORIZQ() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Set_INT sets the _INT token.
	Set_INT(antlr.Token)

	// Set_FLOAT sets the _FLOAT token.
	Set_FLOAT(antlr.Token)

	// Set_TSTRING sets the _TSTRING token.
	Set_TSTRING(antlr.Token)

	// Set_CORIZQ sets the _CORIZQ token.
	Set_CORIZQ(antlr.Token)

	// GetLeft returns the left rule contexts.
	GetLeft() IExprContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_primitives returns the _primitives rule contexts.
	Get_primitives() IPrimitivesContext

	// Get_listArray returns the _listArray rule contexts.
	Get_listArray() IListArrayContext

	// Get_listParams returns the _listParams rule contexts.
	Get_listParams() IListParamsContext

	// Get_listAceso returns the _listAceso rule contexts.
	Get_listAceso() IListAcesoContext

	// GetRight returns the right rule contexts.
	GetRight() IExprContext

	// SetLeft sets the left rule contexts.
	SetLeft(IExprContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_primitives sets the _primitives rule contexts.
	Set_primitives(IPrimitivesContext)

	// Set_listArray sets the _listArray rule contexts.
	Set_listArray(IListArrayContext)

	// Set_listParams sets the _listParams rule contexts.
	Set_listParams(IListParamsContext)

	// Set_listAceso sets the _listAceso rule contexts.
	Set_listAceso(IListAcesoContext)

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
	SUB() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	PARDER() antlr.TerminalNode
	ID() antlr.TerminalNode
	Primitives() IPrimitivesContext
	INT() antlr.TerminalNode
	FLOAT() antlr.TerminalNode
	TSTRING() antlr.TerminalNode
	ListArray() IListArrayContext
	CORIZQ() antlr.TerminalNode
	ListParams() IListParamsContext
	CORDER() antlr.TerminalNode
	PUNTO() antlr.TerminalNode
	COUNT() antlr.TerminalNode
	ISEMPTY() antlr.TerminalNode
	ListAceso() IListAcesoContext
	MUL() antlr.TerminalNode
	DIV() antlr.TerminalNode
	MOD() antlr.TerminalNode
	ADD() antlr.TerminalNode
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
	_ID         antlr.Token
	_primitives IPrimitivesContext
	_INT        antlr.Token
	_FLOAT      antlr.Token
	_TSTRING    antlr.Token
	_listArray  IListArrayContext
	_CORIZQ     antlr.Token
	_listParams IListParamsContext
	_listAceso  IListAcesoContext
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

func (s *ExprContext) Get_ID() antlr.Token { return s._ID }

func (s *ExprContext) Get_INT() antlr.Token { return s._INT }

func (s *ExprContext) Get_FLOAT() antlr.Token { return s._FLOAT }

func (s *ExprContext) Get_TSTRING() antlr.Token { return s._TSTRING }

func (s *ExprContext) Get_CORIZQ() antlr.Token { return s._CORIZQ }

func (s *ExprContext) SetOp(v antlr.Token) { s.op = v }

func (s *ExprContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ExprContext) Set_INT(v antlr.Token) { s._INT = v }

func (s *ExprContext) Set_FLOAT(v antlr.Token) { s._FLOAT = v }

func (s *ExprContext) Set_TSTRING(v antlr.Token) { s._TSTRING = v }

func (s *ExprContext) Set_CORIZQ(v antlr.Token) { s._CORIZQ = v }

func (s *ExprContext) GetLeft() IExprContext { return s.left }

func (s *ExprContext) Get_expr() IExprContext { return s._expr }

func (s *ExprContext) Get_primitives() IPrimitivesContext { return s._primitives }

func (s *ExprContext) Get_listArray() IListArrayContext { return s._listArray }

func (s *ExprContext) Get_listParams() IListParamsContext { return s._listParams }

func (s *ExprContext) Get_listAceso() IListAcesoContext { return s._listAceso }

func (s *ExprContext) GetRight() IExprContext { return s.right }

func (s *ExprContext) SetLeft(v IExprContext) { s.left = v }

func (s *ExprContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ExprContext) Set_primitives(v IPrimitivesContext) { s._primitives = v }

func (s *ExprContext) Set_listArray(v IListArrayContext) { s._listArray = v }

func (s *ExprContext) Set_listParams(v IListParamsContext) { s._listParams = v }

func (s *ExprContext) Set_listAceso(v IListAcesoContext) { s._listAceso = v }

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

func (s *ExprContext) SUB() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSUB, 0)
}

func (s *ExprContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *ExprContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *ExprContext) ID() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID, 0)
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

func (s *ExprContext) INT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserINT, 0)
}

func (s *ExprContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFLOAT, 0)
}

func (s *ExprContext) TSTRING() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserTSTRING, 0)
}

func (s *ExprContext) ListArray() IListArrayContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListArrayContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListArrayContext)
}

func (s *ExprContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORIZQ, 0)
}

func (s *ExprContext) ListParams() IListParamsContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListParamsContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListParamsContext)
}

func (s *ExprContext) CORDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORDER, 0)
}

func (s *ExprContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTO, 0)
}

func (s *ExprContext) COUNT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCOUNT, 0)
}

func (s *ExprContext) ISEMPTY() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserISEMPTY, 0)
}

func (s *ExprContext) ListAceso() IListAcesoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListAcesoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListAcesoContext)
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
	_startState := 30
	p.EnterRecursionRule(localctx, 30, SwiftGrammarParserRULE_expr, _p)
	var _la int

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(422)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 14, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(367)

			var _m = p.Match(SwiftGrammarParserNOT)

			localctx.(*ExprContext).op = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(368)

			var _x = p.expr(13)

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

	case 2:
		{
			p.SetState(371)

			var _m = p.Match(SwiftGrammarParserSUB)

			localctx.(*ExprContext).op = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(372)

			var _x = p.expr(12)

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

	case 3:
		{
			p.SetState(375)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(376)

			var _x = p.expr(0)

			localctx.(*ExprContext)._expr = _x
		}
		{
			p.SetState(377)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_expr().GetE()

	case 4:
		{
			p.SetState(380)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*ExprContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewCallVariable((func() int {
			if localctx.(*ExprContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*ExprContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_ID().GetText()
			}
		}()))

	case 5:
		{
			p.SetState(382)

			var _x = p.Primitives()

			localctx.(*ExprContext)._primitives = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_primitives().GetP()

	case 6:
		{
			p.SetState(385)

			var _m = p.Match(SwiftGrammarParserINT)

			localctx.(*ExprContext)._INT = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(386)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(387)

			var _x = p.Primitives()

			localctx.(*ExprContext)._primitives = _x
		}
		{
			p.SetState(388)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewCastingInt((func() int {
			if localctx.(*ExprContext).Get_INT() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_INT().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_INT() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_INT().GetColumn()
			}
		}()), localctx.(*ExprContext).Get_primitives().GetP())

	case 7:
		{
			p.SetState(391)

			var _m = p.Match(SwiftGrammarParserFLOAT)

			localctx.(*ExprContext)._FLOAT = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(392)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(393)

			var _x = p.Primitives()

			localctx.(*ExprContext)._primitives = _x
		}
		{
			p.SetState(394)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewCastingFloat((func() int {
			if localctx.(*ExprContext).Get_FLOAT() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_FLOAT().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_FLOAT() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_FLOAT().GetColumn()
			}
		}()), localctx.(*ExprContext).Get_primitives().GetP())

	case 8:
		{
			p.SetState(397)

			var _m = p.Match(SwiftGrammarParserTSTRING)

			localctx.(*ExprContext)._TSTRING = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(398)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(399)

			var _x = p.Primitives()

			localctx.(*ExprContext)._primitives = _x
		}
		{
			p.SetState(400)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewCastingString((func() int {
			if localctx.(*ExprContext).Get_TSTRING() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_TSTRING().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_TSTRING() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_TSTRING().GetColumn()
			}
		}()), localctx.(*ExprContext).Get_primitives().GetP())

	case 9:
		{
			p.SetState(403)

			var _x = p.listArray(0)

			localctx.(*ExprContext)._listArray = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_listArray().GetP()

	case 10:
		{
			p.SetState(406)

			var _m = p.Match(SwiftGrammarParserCORIZQ)

			localctx.(*ExprContext)._CORIZQ = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(407)

			var _x = p.listParams(0)

			localctx.(*ExprContext)._listParams = _x
		}
		{
			p.SetState(408)
			p.Match(SwiftGrammarParserCORDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewArray((func() int {
			if localctx.(*ExprContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CORIZQ().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CORIZQ().GetColumn()
			}
		}()), localctx.(*ExprContext).Get_listParams().GetL())

	case 11:
		{
			p.SetState(411)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*ExprContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(412)
			p.Match(SwiftGrammarParserPUNTO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(413)
			p.Match(SwiftGrammarParserCOUNT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewCount((func() int {
			if localctx.(*ExprContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*ExprContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_ID().GetText()
			}
		}()))

	case 12:
		{
			p.SetState(415)

			var _m = p.Match(SwiftGrammarParserID)

			localctx.(*ExprContext)._ID = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(416)
			p.Match(SwiftGrammarParserPUNTO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(417)
			p.Match(SwiftGrammarParserISEMPTY)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewIsEmpty((func() int {
			if localctx.(*ExprContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID().GetColumn()
			}
		}()), (func() string {
			if localctx.(*ExprContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_ID().GetText()
			}
		}()))

	case 13:
		{
			p.SetState(419)

			var _x = p.listAceso(0)

			localctx.(*ExprContext)._listAceso = _x
		}
		localctx.(*ExprContext).e = expressions.NewArray((func() int {
			if localctx.(*ExprContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CORIZQ().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CORIZQ().GetColumn()
			}
		}()), localctx.(*ExprContext).Get_listAceso().GetL())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(461)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 16, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(459)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}

			switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 15, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(424)

				if !(p.Precpred(p.GetParserRuleContext(), 20)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 20)", ""))
					goto errorExit
				}
				{
					p.SetState(425)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&1970324836974592) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(426)

					var _x = p.expr(21)

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
				p.SetState(429)

				if !(p.Precpred(p.GetParserRuleContext(), 19)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 19)", ""))
					goto errorExit
				}
				{
					p.SetState(430)

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
					p.SetState(431)

					var _x = p.expr(20)

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
				p.SetState(434)

				if !(p.Precpred(p.GetParserRuleContext(), 18)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 18)", ""))
					goto errorExit
				}
				{
					p.SetState(435)

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
					p.SetState(436)

					var _x = p.expr(19)

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
				p.SetState(439)

				if !(p.Precpred(p.GetParserRuleContext(), 17)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 17)", ""))
					goto errorExit
				}
				{
					p.SetState(440)

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
					p.SetState(441)

					var _x = p.expr(18)

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
				p.SetState(444)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
					goto errorExit
				}
				{
					p.SetState(445)

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
					p.SetState(446)

					var _x = p.expr(17)

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
				p.SetState(449)

				if !(p.Precpred(p.GetParserRuleContext(), 15)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 15)", ""))
					goto errorExit
				}
				{
					p.SetState(450)

					var _m = p.Match(SwiftGrammarParserAND)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(451)

					var _x = p.expr(16)

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
				p.SetState(454)

				if !(p.Precpred(p.GetParserRuleContext(), 14)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 14)", ""))
					goto errorExit
				}
				{
					p.SetState(455)

					var _m = p.Match(SwiftGrammarParserOR)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(456)

					var _x = p.expr(15)

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
		p.SetState(463)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 16, p.GetParserRuleContext())
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

func (s *PrimitivesContext) Get_TRU() antlr.Token { return s._TRU }

func (s *PrimitivesContext) Get_FAL() antlr.Token { return s._FAL }

func (s *PrimitivesContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *PrimitivesContext) Set_CHARACTER(v antlr.Token) { s._CHARACTER = v }

func (s *PrimitivesContext) Set_STRING(v antlr.Token) { s._STRING = v }

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
	p.EnterRule(localctx, 32, SwiftGrammarParserRULE_primitives)
	p.SetState(474)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserNUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(464)

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
			p.SetState(466)

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
			p.SetState(468)

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

	case SwiftGrammarParserTRU:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(470)

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
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(472)

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

// IListParamsContext is an interface to support dynamic dispatch.
type IListParamsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IListParamsContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// SetList sets the list rule contexts.
	SetList(IListParamsContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetL returns the l attribute.
	GetL() []interface{}

	// SetL sets the l attribute.
	SetL([]interface{})

	// Getter signatures
	Expr() IExprContext
	COMA() antlr.TerminalNode
	ListParams() IListParamsContext

	// IsListParamsContext differentiates from other interfaces.
	IsListParamsContext()
}

type ListParamsContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	l      []interface{}
	list   IListParamsContext
	_expr  IExprContext
}

func NewEmptyListParamsContext() *ListParamsContext {
	var p = new(ListParamsContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listParams
	return p
}

func InitEmptyListParamsContext(p *ListParamsContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listParams
}

func (*ListParamsContext) IsListParamsContext() {}

func NewListParamsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListParamsContext {
	var p = new(ListParamsContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_listParams

	return p
}

func (s *ListParamsContext) GetParser() antlr.Parser { return s.parser }

func (s *ListParamsContext) GetList() IListParamsContext { return s.list }

func (s *ListParamsContext) Get_expr() IExprContext { return s._expr }

func (s *ListParamsContext) SetList(v IListParamsContext) { s.list = v }

func (s *ListParamsContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ListParamsContext) GetL() []interface{} { return s.l }

func (s *ListParamsContext) SetL(v []interface{}) { s.l = v }

func (s *ListParamsContext) Expr() IExprContext {
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

func (s *ListParamsContext) COMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCOMA, 0)
}

func (s *ListParamsContext) ListParams() IListParamsContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListParamsContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListParamsContext)
}

func (s *ListParamsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListParamsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListParamsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterListParams(s)
	}
}

func (s *ListParamsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitListParams(s)
	}
}

func (p *SwiftGrammarParser) ListParams() (localctx IListParamsContext) {
	return p.listParams(0)
}

func (p *SwiftGrammarParser) listParams(_p int) (localctx IListParamsContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewListParamsContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListParamsContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 34
	p.EnterRecursionRule(localctx, 34, SwiftGrammarParserRULE_listParams, _p)
	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(477)

		var _x = p.expr(0)

		localctx.(*ListParamsContext)._expr = _x
	}

	localctx.(*ListParamsContext).l = []interface{}{}
	localctx.(*ListParamsContext).l = append(localctx.(*ListParamsContext).l, localctx.(*ListParamsContext).Get_expr().GetE())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(487)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 18, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListParamsContext(p, _parentctx, _parentState)
			localctx.(*ListParamsContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_listParams)
			p.SetState(480)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
				goto errorExit
			}
			{
				p.SetState(481)
				p.Match(SwiftGrammarParserCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(482)

				var _x = p.expr(0)

				localctx.(*ListParamsContext)._expr = _x
			}

			var arr []interface{}
			arr = append(localctx.(*ListParamsContext).GetList().GetL(), localctx.(*ListParamsContext).Get_expr().GetE())
			localctx.(*ListParamsContext).l = arr

		}
		p.SetState(489)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 18, p.GetParserRuleContext())
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

// IListArrayContext is an interface to support dynamic dispatch.
type IListArrayContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetList returns the list rule contexts.
	GetList() IListArrayContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// SetList sets the list rule contexts.
	SetList(IListArrayContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expression

	// SetP sets the p attribute.
	SetP(interfaces.Expression)

	// Getter signatures
	ID() antlr.TerminalNode
	CORIZQ() antlr.TerminalNode
	Expr() IExprContext
	CORDER() antlr.TerminalNode
	ListArray() IListArrayContext

	// IsListArrayContext differentiates from other interfaces.
	IsListArrayContext()
}

type ListArrayContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	p      interfaces.Expression
	list   IListArrayContext
	_ID    antlr.Token
	_expr  IExprContext
}

func NewEmptyListArrayContext() *ListArrayContext {
	var p = new(ListArrayContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listArray
	return p
}

func InitEmptyListArrayContext(p *ListArrayContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listArray
}

func (*ListArrayContext) IsListArrayContext() {}

func NewListArrayContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListArrayContext {
	var p = new(ListArrayContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_listArray

	return p
}

func (s *ListArrayContext) GetParser() antlr.Parser { return s.parser }

func (s *ListArrayContext) Get_ID() antlr.Token { return s._ID }

func (s *ListArrayContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ListArrayContext) GetList() IListArrayContext { return s.list }

func (s *ListArrayContext) Get_expr() IExprContext { return s._expr }

func (s *ListArrayContext) SetList(v IListArrayContext) { s.list = v }

func (s *ListArrayContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ListArrayContext) GetP() interfaces.Expression { return s.p }

func (s *ListArrayContext) SetP(v interfaces.Expression) { s.p = v }

func (s *ListArrayContext) ID() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID, 0)
}

func (s *ListArrayContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORIZQ, 0)
}

func (s *ListArrayContext) Expr() IExprContext {
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

func (s *ListArrayContext) CORDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORDER, 0)
}

func (s *ListArrayContext) ListArray() IListArrayContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListArrayContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListArrayContext)
}

func (s *ListArrayContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListArrayContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListArrayContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterListArray(s)
	}
}

func (s *ListArrayContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitListArray(s)
	}
}

func (p *SwiftGrammarParser) ListArray() (localctx IListArrayContext) {
	return p.listArray(0)
}

func (p *SwiftGrammarParser) listArray(_p int) (localctx IListArrayContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewListArrayContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListArrayContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 36
	p.EnterRecursionRule(localctx, 36, SwiftGrammarParserRULE_listArray, _p)
	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(491)

		var _m = p.Match(SwiftGrammarParserID)

		localctx.(*ListArrayContext)._ID = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*ListArrayContext).p = expressions.NewCallVariable((func() int {
		if localctx.(*ListArrayContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*ListArrayContext).Get_ID().GetLine()
		}
	}()), (func() int {
		if localctx.(*ListArrayContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*ListArrayContext).Get_ID().GetColumn()
		}
	}()), (func() string {
		if localctx.(*ListArrayContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*ListArrayContext).Get_ID().GetText()
		}
	}()))

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(502)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 19, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListArrayContext(p, _parentctx, _parentState)
			localctx.(*ListArrayContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_listArray)
			p.SetState(494)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
				goto errorExit
			}
			{
				p.SetState(495)
				p.Match(SwiftGrammarParserCORIZQ)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(496)

				var _x = p.expr(0)

				localctx.(*ListArrayContext)._expr = _x
			}
			{
				p.SetState(497)
				p.Match(SwiftGrammarParserCORDER)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			localctx.(*ListArrayContext).p = expressions.NewArrayAccess((func() antlr.Token {
				if localctx.(*ListArrayContext).GetList() == nil {
					return nil
				} else {
					return localctx.(*ListArrayContext).GetList().GetStart()
				}
			}()).GetLine(), (func() antlr.Token {
				if localctx.(*ListArrayContext).GetList() == nil {
					return nil
				} else {
					return localctx.(*ListArrayContext).GetList().GetStart()
				}
			}()).GetColumn(), localctx.(*ListArrayContext).GetList().GetP(), localctx.(*ListArrayContext).Get_expr().GetE())

		}
		p.SetState(504)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 19, p.GetParserRuleContext())
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

// IListAcesoContext is an interface to support dynamic dispatch.
type IListAcesoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IListAcesoContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// SetList sets the list rule contexts.
	SetList(IListAcesoContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetL returns the l attribute.
	GetL() []interface{}

	// SetL sets the l attribute.
	SetL([]interface{})

	// Getter signatures
	CORIZQ() antlr.TerminalNode
	Expr() IExprContext
	CORDER() antlr.TerminalNode
	ListAceso() IListAcesoContext

	// IsListAcesoContext differentiates from other interfaces.
	IsListAcesoContext()
}

type ListAcesoContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	l      []interface{}
	list   IListAcesoContext
	_expr  IExprContext
}

func NewEmptyListAcesoContext() *ListAcesoContext {
	var p = new(ListAcesoContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listAceso
	return p
}

func InitEmptyListAcesoContext(p *ListAcesoContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listAceso
}

func (*ListAcesoContext) IsListAcesoContext() {}

func NewListAcesoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListAcesoContext {
	var p = new(ListAcesoContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_listAceso

	return p
}

func (s *ListAcesoContext) GetParser() antlr.Parser { return s.parser }

func (s *ListAcesoContext) GetList() IListAcesoContext { return s.list }

func (s *ListAcesoContext) Get_expr() IExprContext { return s._expr }

func (s *ListAcesoContext) SetList(v IListAcesoContext) { s.list = v }

func (s *ListAcesoContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ListAcesoContext) GetL() []interface{} { return s.l }

func (s *ListAcesoContext) SetL(v []interface{}) { s.l = v }

func (s *ListAcesoContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORIZQ, 0)
}

func (s *ListAcesoContext) Expr() IExprContext {
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

func (s *ListAcesoContext) CORDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORDER, 0)
}

func (s *ListAcesoContext) ListAceso() IListAcesoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListAcesoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListAcesoContext)
}

func (s *ListAcesoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListAcesoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListAcesoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterListAceso(s)
	}
}

func (s *ListAcesoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitListAceso(s)
	}
}

func (p *SwiftGrammarParser) ListAceso() (localctx IListAcesoContext) {
	return p.listAceso(0)
}

func (p *SwiftGrammarParser) listAceso(_p int) (localctx IListAcesoContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewListAcesoContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListAcesoContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 38
	p.EnterRecursionRule(localctx, 38, SwiftGrammarParserRULE_listAceso, _p)
	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(506)
		p.Match(SwiftGrammarParserCORIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(507)

		var _x = p.expr(0)

		localctx.(*ListAcesoContext)._expr = _x
	}
	{
		p.SetState(508)
		p.Match(SwiftGrammarParserCORDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

	localctx.(*ListAcesoContext).l = []interface{}{}
	localctx.(*ListAcesoContext).l = append(localctx.(*ListAcesoContext).l, localctx.(*ListAcesoContext).Get_expr().GetE())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(519)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 20, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListAcesoContext(p, _parentctx, _parentState)
			localctx.(*ListAcesoContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_listAceso)
			p.SetState(511)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
				goto errorExit
			}
			{
				p.SetState(512)
				p.Match(SwiftGrammarParserCORIZQ)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(513)

				var _x = p.expr(0)

				localctx.(*ListAcesoContext)._expr = _x
			}
			{
				p.SetState(514)
				p.Match(SwiftGrammarParserCORDER)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

			var arr []interface{}
			arr = append(localctx.(*ListAcesoContext).GetList().GetL(), localctx.(*ListAcesoContext).Get_expr().GetE())
			localctx.(*ListAcesoContext).l = arr

		}
		p.SetState(521)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 20, p.GetParserRuleContext())
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

func (p *SwiftGrammarParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 11:
		var t *ElifsContext = nil
		if localctx != nil {
			t = localctx.(*ElifsContext)
		}
		return p.Elifs_Sempred(t, predIndex)

	case 13:
		var t *CasesContext = nil
		if localctx != nil {
			t = localctx.(*CasesContext)
		}
		return p.Cases_Sempred(t, predIndex)

	case 15:
		var t *ExprContext = nil
		if localctx != nil {
			t = localctx.(*ExprContext)
		}
		return p.Expr_Sempred(t, predIndex)

	case 17:
		var t *ListParamsContext = nil
		if localctx != nil {
			t = localctx.(*ListParamsContext)
		}
		return p.ListParams_Sempred(t, predIndex)

	case 18:
		var t *ListArrayContext = nil
		if localctx != nil {
			t = localctx.(*ListArrayContext)
		}
		return p.ListArray_Sempred(t, predIndex)

	case 19:
		var t *ListAcesoContext = nil
		if localctx != nil {
			t = localctx.(*ListAcesoContext)
		}
		return p.ListAceso_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *SwiftGrammarParser) Elifs_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *SwiftGrammarParser) Cases_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 1:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *SwiftGrammarParser) Expr_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 2:
		return p.Precpred(p.GetParserRuleContext(), 20)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 19)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 18)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 17)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 16)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 15)

	case 8:
		return p.Precpred(p.GetParserRuleContext(), 14)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *SwiftGrammarParser) ListParams_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 9:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *SwiftGrammarParser) ListArray_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 10:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *SwiftGrammarParser) ListAceso_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 11:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
