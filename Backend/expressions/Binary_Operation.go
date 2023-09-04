package expressions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"strconv"
)

type BinaryOperation struct {
	Lin      int
	Col      int
	Op_izq   interfaces.Expression
	Operador string
	Op_der   interfaces.Expression
}

func NewOperationBinary(lin int, col int, Op1 interfaces.Expression, Operador string, Op2 interfaces.Expression) BinaryOperation {
	exp := BinaryOperation{Lin: lin, Col: col, Op_izq: Op1, Operador: Operador, Op_der: Op2}
	return exp
}

func (operacion BinaryOperation) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var dominante environment.TipoExpresion

	tabla_dominante := [6][6]environment.TipoExpresion{
		//		INTEGER			FLOAT				STRING				BOOLEAN				NULL			CHAR
		{environment.INTEGER, environment.FLOAT, environment.STRING, environment.BOOLEAN, environment.NULL, environment.STRING},
		//FLOAT
		{environment.FLOAT, environment.FLOAT, environment.STRING, environment.NULL, environment.NULL, environment.STRING},
		//STRING
		{environment.STRING, environment.STRING, environment.STRING, environment.STRING, environment.NULL, environment.STRING},
		//BOOLEAN
		{environment.BOOLEAN, environment.NULL, environment.STRING, environment.BOOLEAN, environment.NULL, environment.STRING},
		//NULL
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//CHAR
		{environment.STRING, environment.STRING, environment.STRING, environment.STRING, environment.NULL, environment.STRING},
	}

	var op1, op2 environment.Symbol
	op1 = operacion.Op_izq.Ejecutar(ast, env)
	op2 = operacion.Op_der.Ejecutar(ast, env)

	switch operacion.Operador {
	case "+":
		{
			//validar tipo dominante
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			//valida el tipo
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: op1.Valor.(int) + op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: val1 + val2}
			} else if dominante == environment.STRING {
				r1 := fmt.Sprintf("%v", op1.Valor)
				r2 := fmt.Sprintf("%v", op2.Valor)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: r1 + r2}
			} else {
				ast.SetError("ERROR: No es posible realizar la sumar", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "-":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]

			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: op1.Valor.(int) - op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: val1 - val2}
			} else {
				ast.SetError("ERROR: No es posible realizar la restar", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "*":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: op1.Valor.(int) * op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: val1 * val2}
			} else {
				ast.SetError("ERROR: No es posible realizar la multiplicacion", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "/":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				if op2.Valor.(int) != 0 {
					return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: op1.Valor.(int) / op2.Valor.(int)}
				} else {
					ast.SetError("ERROR: No es posible dividir entre cero", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
				}

			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				if val2 != 0 {
					return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: val1 / val2}
				} else {
					ast.SetError("ERROR: No es posible dividir entre cero", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
				}
			} else {
				ast.SetError("ERROR: No es posible realizar la division", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}

		}
	case "%":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				if op2.Valor.(int) != 0 {
					return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: dominante, Valor: op1.Valor.(int) % op2.Valor.(int)}
				} else {
					ast.SetError("ERROR: No es posible dividir entre cero para realizar el modulo", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
				}
			} else {
				ast.SetError("ERROR: No es posible realizar el modulo", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}

		}
	case "<":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) < op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: val1 < val2}
			} else {
				ast.SetError("ERROR: No es posible comparar <", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case ">":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) > op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: val1 > val2}
			} else {
				ast.SetError("ERROR: No es posible comparar >", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "<=":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) <= op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: val1 <= val2}
			} else {
				ast.SetError("ERROR: No es posible comparar <=", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case ">=":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) >= op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: val1 >= val2}
			} else {
				ast.SetError("ERROR: No es posible comparar >=", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "==":
		{
			if op1.Tipo == op2.Tipo {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor == op2.Valor}
			} else {
				ast.SetError("ERROR: No es posible realziar la igualdad", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "!=":
		{
			if op1.Tipo == op2.Tipo {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor != op2.Valor}
			} else {
				ast.SetError("ERROR: No es posible realizar la desigualdad", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "&&":
		{
			if (op1.Tipo == environment.BOOLEAN) && (op2.Tipo == environment.BOOLEAN) {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(bool) && op2.Valor.(bool)}
			} else {
				ast.SetError("ERROR: tipo no compatible para realizar el AND", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	case "||":
		{
			if (op1.Tipo == environment.BOOLEAN) && (op2.Tipo == environment.BOOLEAN) {
				return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(bool) || op2.Valor.(bool)}
			} else {
				ast.SetError("ERROR: tipo no compatible para realizar el OR", operacion.Col, operacion.Lin, env.(environment.Environment).GetEntorno())
			}
		}
	}
	var result interface{}
	return environment.Symbol{Lin: operacion.Lin, Col: operacion.Col, Tipo: environment.NULL, Valor: result}
}
