package expressions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"strconv"
)

type UnaryOperation struct {
	Lin      int
	Col      int
	Op_der   interfaces.Expression
	Operador string
}

func NewOperationUnary(lin int, col int, Op1 interfaces.Expression, Operador string) UnaryOperation {
	exp := UnaryOperation{Lin: lin, Col: col, Op_der: Op1, Operador: Operador}
	return exp
}

func (operacion UnaryOperation) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var op1 = operacion.Op_der.Ejecutar(ast, env)

	switch operacion.Operador {
	case "!":
		{
			if op1.Tipo == environment.BOOLEAN {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: !op1.Valor.(bool)}
			} else {
				fmt.Println("ERROR: tipo no compatible para realizar el NOT")
				ast.SetError("ERROR: tipo no compatible para realizar el NOT")
			}
		}
	case "-":
		{
			if op1.Tipo == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.INTEGER, Valor: (op1.Valor.(int) * -1)}
			} else if op1.Tipo == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.FLOAT, Valor: (val1 * -1)}
			} else {
				fmt.Println("ERROR: tipo no compatible para realizar la negacion")
				ast.SetError("ERROR: tipo no compatible para realizar la negacion")
			}
		}
	}
	var result interface{}
	return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.NULL, Valor: result}
}
