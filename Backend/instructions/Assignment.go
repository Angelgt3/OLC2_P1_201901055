package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
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

type AssigmentVec struct {
	Lin        int
	Col        int
	Id         string
	Expresion  interfaces.Expression
	Expresion2 interfaces.Expression
}

func NewAssigmentVec(lin int, col int, id string, val interfaces.Expression, val2 interfaces.Expression) AssigmentVec {
	instr := AssigmentVec{lin, col, id, val, val2}
	return instr
}

func (p AssigmentVec) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	//posicion
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)

	//new valor
	var result2 environment.Symbol
	result2 = p.Expresion2.Ejecutar(ast, env)

	if result.Tipo == environment.NULL {
		return nil
	}

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)
	if variable.Tipo < environment.ARRAY || variable.Tipo > environment.A_CHAR {
		fmt.Println("La variable no es un vector para realizar esta asignacion")
		return nil
	}

	var se_encontro = false
	var newvariable_valor []interface{}
	//copio los datos a la nueva variable
	for cont := range variable.Valor.([]interface{}) {
		temp_result := variable.Valor.([]interface{})[cont].(environment.Symbol)
		if cont != result.Valor {
			newvariable_valor = append(newvariable_valor, temp_result)
		} else if cont == result.Valor {
			//validar que la nueva variable sea del mismo tipo del actual
			if result2.Tipo == temp_result.Tipo {
				newvariable_valor = append(newvariable_valor, result2)
				se_encontro = true
			} else {
				fmt.Println("No se le puede asignar un valor de distinto tipo")
				return nil
			}

		}
	}
	if !se_encontro {
		fmt.Println("Posicion que se busca es inexistente")
		return nil
	}
	variable.Valor = newvariable_valor

	//escribo la nueva variable
	env.(environment.Environment).SetVariable(p.Id, variable)

	return nil
}

type AssigmentMatriz struct {
	Lin        int
	Col        int
	Id         string
	Expresion  interfaces.Expression
	Expresion2 interfaces.Expression
}

func NewAssigmentMa(lin int, col int, id string, val interfaces.Expression, val2 interfaces.Expression) AssigmentMatriz {
	instr := AssigmentMatriz{lin, col, id, val, val2}
	return instr
}

func (p AssigmentMatriz) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	//posicion
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)

	var posicion []int
	for cont := range result.Valor.([]interface{}) {
		temp_result := result.Valor.([]interface{})[cont].(environment.Symbol)
		posicion = append(posicion, temp_result.Valor.(int))
	}
	fmt.Println("posicion: ", posicion)
	//new valor
	var result2 environment.Symbol
	result2 = p.Expresion2.Ejecutar(ast, env)
	fmt.Println("result2", result2)

	if result.Tipo == environment.NULL {
		return nil
	}

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)
	fmt.Println("variable", variable.Valor)
	if variable.Tipo < environment.ARRAY || variable.Tipo > environment.A_CHAR {
		fmt.Println("La variable no es un matriz para realizar esta asignacion")
		return nil
	}

	var newvariable_valor = variable.Valor.([]interface{})[posicion[0]].(environment.Symbol)
	var se_encontro = true
	for cont := 1; cont < len(posicion); cont++ { // Comienza desde 1
		// Verifica si newvariable_valor es de tipo []interface{}
		if valorSlice, ok := newvariable_valor.Valor.([]interface{}); ok {
			if cont < len(valorSlice) {
				newvariable_valor = valorSlice[posicion[cont]].(environment.Symbol)
			} else {
				fmt.Println("ERRRO: posicion inexistente")
				se_encontro = false
				break
			}
		} else {
			fmt.Println("ERRRO inesperado")
			se_encontro = false
			break
		}
	}

	fmt.Println("temp_result:", newvariable_valor)

	if !se_encontro {
		fmt.Println("Posicion que se busca es inexistente")
		return nil
	}
	variable.Valor = newvariable_valor
	fmt.Println(variable.Valor)

	//escribo la nueva variable
	env.(environment.Environment).SetVariable(p.Id, variable)

	return nil
}
