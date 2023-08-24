package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type Assigment struct {
	Lin       int
	Col       int
	Id        string
	Expresion interfaces.Expression
}

func NewAssigment(lin int, col int, id string, val interfaces.Expression) Assigment {
	instr := Assigment{lin, col, id, val}
	return instr
}

func (p Assigment) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)
	//modificar la variable si se puede
	env.(environment.Environment).SetVariable(p.Id, result)

	return nil
}
