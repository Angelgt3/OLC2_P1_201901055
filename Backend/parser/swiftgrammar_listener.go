// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// SwiftGrammarListener is a complete listener for a parse tree produced by SwiftGrammarParser.
type SwiftGrammarListener interface {
	antlr.ParseTreeListener

	// EnterS is called when entering the s production.
	EnterS(c *SContext)

	// EnterBlock is called when entering the block production.
	EnterBlock(c *BlockContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterPrintstmt is called when entering the printstmt production.
	EnterPrintstmt(c *PrintstmtContext)

	// EnterVariablestmt is called when entering the variablestmt production.
	EnterVariablestmt(c *VariablestmtContext)

	// EnterTypestmt is called when entering the typestmt production.
	EnterTypestmt(c *TypestmtContext)

	// EnterIfstmt is called when entering the ifstmt production.
	EnterIfstmt(c *IfstmtContext)

	// EnterExpr is called when entering the expr production.
	EnterExpr(c *ExprContext)

	// EnterPrimitives is called when entering the primitives production.
	EnterPrimitives(c *PrimitivesContext)

	// ExitS is called when exiting the s production.
	ExitS(c *SContext)

	// ExitBlock is called when exiting the block production.
	ExitBlock(c *BlockContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitPrintstmt is called when exiting the printstmt production.
	ExitPrintstmt(c *PrintstmtContext)

	// ExitVariablestmt is called when exiting the variablestmt production.
	ExitVariablestmt(c *VariablestmtContext)

	// ExitTypestmt is called when exiting the typestmt production.
	ExitTypestmt(c *TypestmtContext)

	// ExitIfstmt is called when exiting the ifstmt production.
	ExitIfstmt(c *IfstmtContext)

	// ExitExpr is called when exiting the expr production.
	ExitExpr(c *ExprContext)

	// ExitPrimitives is called when exiting the primitives production.
	ExitPrimitives(c *PrimitivesContext)
}
