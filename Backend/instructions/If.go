package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type If struct {
	Lin         int
	Col         int
	Expresion   interfaces.Expression
	Bloque_if   []interface{}
	Bloque_else []interface{}
	Elif        []interface{}
}

type Elif struct {
	Lin         int
	Col         int
	Expresion   interfaces.Expression
	Bloque_elif []interface{}
}

func NewElif(lin int, col int, condition interfaces.Expression, bloque_elif []interface{}) Elif {
	elifInstr := Elif{lin, col, condition, bloque_elif}
	return elifInstr
}

func NewIf(lin int, col int, condition interfaces.Expression, bloque_if []interface{}, bloque_else []interface{}, ELIF []interface{}) If {
	ifInstr := If{lin, col, condition, bloque_if, bloque_else, ELIF}
	return ifInstr
}

func (p If) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	//Validando tipo
	if condicion.Tipo != environment.BOOLEAN {
		fmt.Println("El tipo de variable es incorrecto para un If")
		ast.SetError("El tipo de variable es incorrecto para un If", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}
	//Ejecutando if
	if condicion.Valor == true {
		var ifEnv environment.Environment
		ifEnv = environment.NewEnvironment(env.(environment.Environment), "IF")
		//ejecución
		for _, inst := range p.Bloque_if {
			trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, ifEnv)
			if trasferencia != nil {
				if valor, ok := trasferencia.(string); ok && valor == "break" {
					return "break"
				} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
					return "continue"
				}
			}
		}
		return nil
	} else {
		//verificar  si vienen else ifs
		if p.Elif != nil {
			//ejecución else ifs
			for _, ins := range p.Elif {
				if elifInstance, ok := ins.(Elif); ok {
					result_elif := elifInstance.Ejecutar(ast, env)
					if result_elif != nil {
						if valor, ok := result_elif.(string); ok && valor == "break" {
							return "break"
						} else if valor, ok := result_elif.(string); ok && valor == "continue" {
							return "continue"
						}
						if result_elif == true { //si ya realizo un bloque else if se sale
							return nil
						}
					}
				}
			}
		}
		if p.Bloque_else == nil { //si no viene bloque else  se sale
			return nil
		}
		//ejecuta el else
		var elseEnv environment.Environment
		elseEnv = environment.NewEnvironment(env.(environment.Environment), "ELSE")
		//ejecución
		for _, inst := range p.Bloque_else {
			trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, elseEnv)
			if trasferencia != nil {
				if valor, ok := trasferencia.(string); ok && valor == "break" {
					return "break"
				} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
					return "continue"
				}
			}
		}
		return nil
	}
	return nil
}

func (p Elif) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	//Validando tipo
	if condicion.Tipo != environment.BOOLEAN {
		fmt.Println("El tipo de variable es incorrecto para un else if")
		ast.SetError("El tipo de variable es incorrecto para un else if", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}
	//Ejecutando else if
	if condicion.Valor == true {
		var elifEnv environment.Environment
		elifEnv = environment.NewEnvironment(env.(environment.Environment), "ELIF")
		//ejecución
		for _, inst := range p.Bloque_elif {
			trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, elifEnv)
			if trasferencia != nil {
				if valor, ok := trasferencia.(string); ok && valor == "break" {
					return "break"
				} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
					return "continue"
				}
			}
		}
		return true
	}
	return false
}
