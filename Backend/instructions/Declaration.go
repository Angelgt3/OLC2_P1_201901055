package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type Declaration struct {
	Lin        int
	Col        int
	Id         string
	Tipo       environment.TipoExpresion
	Expresion  interfaces.Expression
	changeable bool
}

func NewDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression, mut bool) Declaration {
	instr := Declaration{lin, col, id, tipo, val, mut}
	return instr
}

func (p Declaration) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)
	// var valor : string ? | variable con tipo sin valor | para eso nomas
	if result.Tipo == environment.NULL && p.Tipo != environment.NULL {
		result.Tipo = p.Tipo
	}
	//casteo
	//float | int -> float  | unicamente
	if p.Tipo == environment.FLOAT && result.Tipo == environment.INTEGER {
		if intValue, ok := result.Valor.(int); ok {
			// Convertir el int a float64
			result.Valor = float64(intValue)
			result.Tipo = environment.FLOAT
		}
	}

	//validar tipos
	if result.Tipo == environment.ARRAY {
		if p.ArrayValidation(ast, env, result) {
			result.Tipo = p.Tipo
			env.(environment.Environment).SaveVariable(p.Id, p.changeable, result)
		} else {
			fmt.Println("La estructura del array es incorrecta")
			ast.SetError("La estructura del array es incorrecta")
		}
		// variable con el mismo tipo y valor || variable sin tipo asignado pero con valor
	} else if result.Tipo == p.Tipo || (result.Tipo != p.Tipo && p.Tipo == environment.NULL) {
		env.(environment.Environment).SaveVariable(p.Id, p.changeable, result)
	} else {
		fmt.Println("Los tipos de datos son incorrectos")
		ast.SetError("Los tipos de datos son incorrectos")
	}

	return nil
}

func (p Declaration) ArrayValidation(ast *environment.AST, env interface{}, result environment.Symbol) bool {
	//validaciones de array
	//fmt.Println("p:", p)
	//fmt.Println("result:", result)
	//si es un vector nulo

	if result.Valor == nil {
		return true
	}
	for cont := range result.Valor.([]interface{}) {
		temp_result := result.Valor.([]interface{})[cont].(environment.Symbol)
		//verifico que todos los valores del vector sean de mismno tipo
		if temp_result.Tipo != p.Tipo-7 { // es de diferente
			return false
		}
	}
	return true
}
