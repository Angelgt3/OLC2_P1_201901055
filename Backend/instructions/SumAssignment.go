package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type SumAssigment struct {
	Lin       int
	Col       int
	Id        string
	Expresion interfaces.Expression
}

func NewSumAssigment(lin int, col int, id string, val interfaces.Expression) SumAssigment {
	instr := SumAssigment{lin, col, id, val}
	return instr
}

func (p SumAssigment) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)

	//hago la operacion
	if variable.Tipo == environment.FLOAT && result.Tipo == environment.FLOAT {
		result.Valor = variable.Valor.(float64) + result.Valor.(float64)
		result.Tipo = environment.FLOAT
	} else if variable.Tipo == environment.FLOAT && result.Tipo == environment.INTEGER {
		result.Valor = variable.Valor.(float64) + float64(result.Valor.(int))
		result.Tipo = environment.FLOAT
	} else if variable.Tipo == environment.INTEGER && result.Tipo == environment.INTEGER {
		result.Valor = variable.Valor.(int) + result.Valor.(int)
		result.Tipo = environment.INTEGER
		/*} else if variable.Tipo == environment.STRING && result.Tipo == environment.STRING {
		result.Valor = strconv.Itoa(variable.Valor.(int)) + strconv.Itoa(result.Valor.(int))
		result.Tipo = environment.STRING
		*/
	} else {
		ast.SetError("No se puedo realizar la suma", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}
	//modificar la variable si se puede
	env.(environment.Environment).SetVariable(p.Id, result)
	return nil
}
