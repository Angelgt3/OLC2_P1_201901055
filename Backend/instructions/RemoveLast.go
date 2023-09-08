package instructions

import (
	"Backend/environment"
)

type RemoveLast struct {
	Lin int
	Col int
	Id  string
}

func NewRemoveLast(lin int, col int, id string) RemoveLast {
	instr := RemoveLast{lin, col, id}
	return instr
}

func (p RemoveLast) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)

	//verificar que la variable llamada sea vector
	if variable.Tipo < environment.ARRAY || variable.Tipo > environment.A_CHAR {
		ast.SetError("La variable no es un vector para llamar la funcion removelast", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}

	var newvariable_valor []interface{}
	//copio los datos a la nueva variable
	for cont := range variable.Valor.([]interface{}) {
		temp_result := variable.Valor.([]interface{})[cont].(environment.Symbol)
		newvariable_valor = append(newvariable_valor, temp_result)
	}
	//vuelo nulo el ultimo
	if len(newvariable_valor) > 0 {
		newvariable_valor = newvariable_valor[:len(newvariable_valor)-1]
	} else {
		ast.SetError("El vector esta vacio para realizar la funcion removelast", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
	}
	variable.Valor = newvariable_valor

	//escribo la nueva variable
	env.(environment.Environment).SetVariable(p.Id, variable)

	return nil
}
