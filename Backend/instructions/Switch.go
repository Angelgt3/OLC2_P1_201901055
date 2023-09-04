package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type Switch struct {
	Lin            int
	Col            int
	Expresion      interfaces.Expression
	Cases          []interface{}
	Bloque_default []interface{}
}

type Cases struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewCase(lin int, col int, condition interfaces.Expression, bloque []interface{}) Cases {
	casesInstr := Cases{lin, col, condition, bloque}
	return casesInstr
}

func NewSwitch(lin int, col int, condition interfaces.Expression, cases []interface{}, bloque_default []interface{}) Switch {
	switchInstr := Switch{lin, col, condition, cases, bloque_default}
	return switchInstr
}

func (p Switch) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)

	//Ejecutando switch
	if p.Cases != nil {
		//ejecución cases
		for _, ins := range p.Cases {
			if caseInstance, ok := ins.(Cases); ok {
				result_case := caseInstance.Ejecutar(ast, env, condicion)
				if result_case == true { //si ya realizo un bloque case se sale
					return nil
				}
			}
		}
	}
	//ejecunado el default
	var defaultEnv environment.Environment
	defaultEnv = environment.NewEnvironment(env.(environment.Environment), "DEFAULT")

	for _, inst := range p.Bloque_default {
		inst.(interfaces.Instruction).Ejecutar(ast, defaultEnv)
	}

	return nil
}

func (p Cases) Ejecutar(ast *environment.AST, env interface{}, condicion environment.Symbol) interface{} {

	var exp_case environment.Symbol
	exp_case = p.Expresion.Ejecutar(ast, env)
	if exp_case.Valor == condicion.Valor { //es el mismo case
		//ejecutar el case
		var caseEnv environment.Environment
		caseEnv = environment.NewEnvironment(env.(environment.Environment), "CASE")
		//ejecución
		for _, inst := range p.Bloque {
			trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, caseEnv)
			if trasferencia != nil {
				if valor, ok := trasferencia.(string); ok && valor == "break" {
					return true //se sale del case
				} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
					fmt.Println("Error continue sin motivo")
				}
			}
		}
		return true
	}

	return false
}
