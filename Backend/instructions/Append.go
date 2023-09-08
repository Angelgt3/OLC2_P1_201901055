package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type Append struct {
	Lin       int
	Col       int
	Id        string
	Expresion interfaces.Expression
}

func NewAppend(lin int, col int, id string, val interfaces.Expression) Append {
	instr := Append{lin, col, id, val}
	return instr
}

func (p Append) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)

	//verificar que la variable llamada sea vector
	if variable.Tipo < environment.ARRAY || variable.Tipo > environment.A_CHAR {
		ast.SetError("La variable no es un vector para relizar la funcion append", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}

	var newvariable_valor []interface{}
	//copio los datos a la nueva variable
	for cont := range variable.Valor.([]interface{}) {

		temp_result := variable.Valor.([]interface{})[cont].(environment.Symbol)
		newvariable_valor = append(newvariable_valor, temp_result)
		//verificco que sea del mismo tipo
		if temp_result.Tipo != result.Tipo {
			ast.SetError("La expresion no es del mismo tipo para realizar el append", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
			return nil
		}
	}
	//agrego el nuevo valor
	newvariable_valor = append(newvariable_valor, result)
	variable.Valor = newvariable_valor

	//escribo la nueva variable
	env.(environment.Environment).SetVariable(p.Id, variable)

	return nil
}
