package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type While struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewWhile(lin int, col int, condition interfaces.Expression, bloque []interface{}) While {
	whileInstr := While{lin, col, condition, bloque}
	return whileInstr
}

func (p While) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Validando condicion
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	if condicion.Tipo != environment.BOOLEAN {
		fmt.Println("El tipo de variable es incorrecto para la condicion del while")
		ast.SetError("El tipo de variable es incorrecto para la condicion del while")
	}
	//Ejecutando while
	for condicion.Valor == true {
		//Validando condicion
		condicion = p.Expresion.Ejecutar(ast, env)
		if condicion.Valor == false { //se sale del while
			return nil
		}
		//ejecución while
		var whileEnv environment.Environment
		whileEnv = environment.NewEnvironment(env.(environment.Environment), "WHILE")
		for _, inst := range p.Bloque {
			inst.(interfaces.Instruction).Ejecutar(ast, whileEnv)
		}
	}

	return nil
}
