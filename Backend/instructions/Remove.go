package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type Remove struct {
	Lin       int
	Col       int
	Id        string
	Expresion interfaces.Expression
}

func NewRemove(lin int, col int, id string, expr interfaces.Expression) Remove {
	instr := Remove{lin, col, id, expr}
	return instr
}

func (p Remove) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)

	if result.Tipo == environment.NULL {
		return nil
	}

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)

	//verificar que la variable llamada sea vector
	if variable.Tipo < environment.ARRAY || variable.Tipo > environment.A_CHAR {
		ast.SetError("La variable no es un vector para realizar remove", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}

	var se_encontro = false
	var newvariable_valor []interface{}
	//copio los datos a la nueva variable
	for cont := range variable.Valor.([]interface{}) {
		temp_result := variable.Valor.([]interface{})[cont].(environment.Symbol)
		if cont != result.Valor {
			newvariable_valor = append(newvariable_valor, temp_result)
		} else {
			se_encontro = true
		}
	}
	if !se_encontro {
		ast.SetError("No se encontro la posicion que se busca eliminar", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}
	variable.Valor = newvariable_valor

	//escribo la nueva variable
	env.(environment.Environment).SetVariable(p.Id, variable)

	return nil
}
