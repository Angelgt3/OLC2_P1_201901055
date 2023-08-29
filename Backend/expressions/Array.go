package expressions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type Array struct {
	Lin     int
	Col     int
	ListExp []interface{}
}

func NewArray(lin int, col int, list []interface{}) Array {
	exp := Array{lin, col, list}
	return exp
}

func (p Array) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var tempExp []interface{}

	for _, s := range p.ListExp {
		tempExp = append(tempExp, s.(interfaces.Expression).Ejecutar(ast, env))
	}

	return environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.ARRAY,
		Valor: tempExp,
	}
}

type ArrayAccess struct {
	Lin   int
	Col   int
	Array interfaces.Expression
	Index interfaces.Expression
}

func NewArrayAccess(lin int, col int, array interfaces.Expression, index interfaces.Expression) ArrayAccess {
	exp := ArrayAccess{lin, col, array, index}
	return exp
}

func (p ArrayAccess) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var tempArray environment.Symbol
	tempArray = p.Array.Ejecutar(ast, env)

	if tempArray.Tipo >= environment.ARRAY && tempArray.Tipo <= environment.A_CHAR {
		var tempIndex environment.Symbol
		tempIndex = p.Index.Ejecutar(ast, env)
		var tempValue interface{}
		tempValue = tempArray.Valor
		//validando indice
		if tempIndex.Valor.(int) >= 0 && tempIndex.Valor.(int) < len(tempValue.([]interface{})) {
			valret := tempValue.([]interface{})[(tempIndex.Valor.(int))].(environment.Symbol)
			return valret
		} else {
			ast.SetError("Indice fuera de los limites")
			fmt.Println("indice: ", tempIndex.Valor.(int))
			fmt.Println("tamaño: ", len(tempValue.([]interface{})))
		}

	} else {
		ast.SetError("La expresión no es un arreglo")
	}
	return environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.NULL,
		Valor: 0,
	}
}
