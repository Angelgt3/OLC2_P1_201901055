package expressions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"strconv"
)

type CastingInt struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
}

func NewCastingInt(lin int, col int, val interfaces.Expression) CastingInt {
	instr := CastingInt{lin, col, val}
	return instr
}

func (p CastingInt) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var result = p.Expresion.Ejecutar(ast, env)

	if result.Tipo == environment.STRING || result.Tipo == environment.CHAR {
		//convetir a entero
		temp := result.Valor.(string)
		floatValue, err := strconv.ParseFloat(temp, 64)
		intValue := int(floatValue)
		if err != nil { //error
			fmt.Println("No se pudo realizar el casteo a int")
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: nil}
		}
		result.Valor = intValue
		result.Tipo = environment.INTEGER
	} else if result.Tipo == environment.FLOAT {
		//convetir a entero
		temp := result.Valor.(float64)
		intValue := int(temp)

		result.Valor = intValue
		result.Tipo = environment.INTEGER
	} else {
		fmt.Println("No se pudo realizar el casteo a int")
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: nil}
	}

	return result
}

type CastingFloat struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
}

func NewCastingFloat(lin int, col int, val interfaces.Expression) CastingFloat {
	instr := CastingFloat{lin, col, val}
	return instr
}

func (p CastingFloat) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var result = p.Expresion.Ejecutar(ast, env)

	if result.Tipo == environment.STRING || result.Tipo == environment.CHAR {
		//convetir a float
		temp := result.Valor.(string)
		floatValue, err := strconv.ParseFloat(temp, 64)
		if err != nil { //error
			fmt.Println("No se pudo realizar el casteo a float")
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: nil}
		}
		result.Valor = floatValue
		result.Tipo = environment.FLOAT

	} else {
		fmt.Println("No se pudo realizar el casteo a float")
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: nil}
	}

	return result
}

type CastingString struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
}

func NewCastingString(lin int, col int, val interfaces.Expression) CastingString {
	instr := CastingString{lin, col, val}
	return instr
}

func (p CastingString) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var result = p.Expresion.Ejecutar(ast, env)
	if result.Tipo == environment.FLOAT || result.Tipo == environment.INTEGER || result.Tipo == environment.BOOLEAN {
		//convetir a string
		result.Tipo = environment.STRING

	} else {
		fmt.Println("No se pudo realizar el casteo a string")
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: nil}
	}
	return result
}
