package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type Guard struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewGuard(lin int, col int, condition interfaces.Expression, bloque []interface{}) Guard {
	ifInstr := Guard{lin, col, condition, bloque}
	return ifInstr
}

func (p Guard) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	//Validando tipo
	if condicion.Tipo != environment.BOOLEAN {
		ast.SetError("El tipo de variable es incorrecto para un Guard", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}
	//Ejecutando guard
	if condicion.Valor == false { //ejecuta el else
		var guarEnv environment.Environment
		guarEnv = environment.NewEnvironment(env.(environment.Environment), "GUARD")
		//ejecución
		for _, inst := range p.Bloque {
			trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, guarEnv)
			if trasferencia != nil {
				if valor, ok := trasferencia.(string); ok && valor == "break" {
					return "break"
				} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
					return "continue"
				} else {
					return trasferencia
				}
			}
		}
		ast.SetError("El Guard contiene una sentencia de trasferencia", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
	}
	return nil
}
