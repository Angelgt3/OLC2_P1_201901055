package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type RestAssigment struct {
	Lin       int
	Col       int
	Id        string
	Expresion interfaces.Expression
}

func NewResAssigment(lin int, col int, id string, val interfaces.Expression) RestAssigment {
	instr := RestAssigment{lin, col, id, val}
	return instr
}

func (p RestAssigment) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)

	//hago la operacion
	if variable.Tipo == environment.FLOAT && result.Tipo == environment.FLOAT {
		result.Valor = variable.Valor.(float64) - result.Valor.(float64)
		result.Tipo = environment.FLOAT
	} else if variable.Tipo == environment.FLOAT && result.Tipo == environment.INTEGER {
		result.Valor = variable.Valor.(float64) - float64(result.Valor.(int))
		result.Tipo = environment.FLOAT
	} else if variable.Tipo == environment.INTEGER && result.Tipo == environment.INTEGER {
		result.Valor = variable.Valor.(int) - result.Valor.(int)
		result.Tipo = environment.INTEGER
	} else {
		ast.SetError(" No es posible realizar la restar", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}
	//modificar la variable si se puede
	env.(environment.Environment).SetVariable(p.Id, result)
	return nil
}
