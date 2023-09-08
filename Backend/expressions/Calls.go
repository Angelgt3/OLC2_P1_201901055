package expressions

import (
	"Backend/environment"
	"Backend/instructions"
	"Backend/interfaces"
)

type CallVar struct {
	Lin int
	Col int
	Id  string
}

func NewCallVariable(lin int, col int, id string) CallVar {
	exp := CallVar{lin, col, id}
	return exp
}

func (p CallVar) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	result := env.(environment.Environment).GetVariable(p.Id)
	return result
}

type FunCallE struct {
	Lin        int
	Col        int
	Id         string
	Parametros []interface{}
}

func NewFunCallE(lin int, col int, id string, parametros []interface{}) FunCallE {
	instr := FunCallE{lin, col, id, parametros}
	return instr
}

func (p FunCallE) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var result environment.Symbol
	//obtengo la funcion
	funcion := env.(environment.Environment).GetFunc(p.Id)

	if funcion.Bloque == nil { // no se encontro la funcion
		return result
	}

	//definiendo nuevo entorno de funcion
	var funcEnv environment.Environment
	//si no es modulo se usa el global como anterior
	funcEnv = environment.NewEnvironment(environment.GetEntornoGlobal(env), p.Id+"FUNCION")

	if len(p.Parametros) == len(funcion.Parametros) { //que sea la misma cantidad de parametros que se envien y reciba
		for i := 0; i < len(p.Parametros); i++ {
			var val environment.Symbol
			val = p.Parametros[i].(interfaces.Expression).Ejecutar(ast, env)
			if val.Tipo == funcion.Parametros[i].(instructions.ParamsDeclaration).Tipo { //que sean del mismo tipo los parametros
				funcEnv.SaveVariable(funcion.Parametros[i].(instructions.ParamsDeclaration).Id_Interno, false, val)
			} else {
				ast.SetError("El tipo de parámetro es incorrecto", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
				return result
			}
		}
	} else {
		ast.SetError("Faltan parámetros en la función", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return result
	}

	//ejecución
	for _, inst := range funcion.Bloque {
		trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, funcEnv)
		if trasferencia != nil {
			if valor, ok := trasferencia.(string); ok && (valor == "break" || valor == "continue") {
				ast.SetError("Instruccion break o cotinue inecesaria", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
				continue
			} else {
				result = trasferencia.(interfaces.Expression).Ejecutar(ast, funcEnv)
				return result
			}

		}
	}

	return result
}
