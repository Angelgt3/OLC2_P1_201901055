package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type FunCall struct {
	Lin        int
	Col        int
	Id         string
	Parametros []interface{}
}

func NewFunCall(lin int, col int, id string, parametros []interface{}) FunCall {
	instr := FunCall{lin, col, id, parametros}
	return instr
}

func (p FunCall) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	//obtengo la funcion
	funcion := env.(environment.Environment).GetFunc(p.Id)

	if funcion.Bloque == nil { // no se encontro la funcion
		return nil
	}
	//definiendo nuevo entorno de funcion
	var funcEnv environment.Environment
	//si no es modulo se usa el global como anterior
	funcEnv = environment.NewEnvironment(environment.GetEntornoGlobal(env), p.Id+"FUNCION")

	if len(p.Parametros) == len(funcion.Parametros) { //que sea la misma cantidad de parametros que se envien y reciba
		for i := 0; i < len(p.Parametros); i++ {
			var val environment.Symbol
			val = p.Parametros[i].(interfaces.Expression).Ejecutar(ast, env)
			if val.Tipo == funcion.Parametros[i].(ParamsDeclaration).Tipo || (val.Tipo == environment.ARRAY && funcion.Parametros[i].(ParamsDeclaration).Tipo > environment.ARRAY && funcion.Parametros[i].(ParamsDeclaration).Tipo < environment.A_CHAR) { //que sean del mismo tipo los parametros
				funcEnv.SaveVariable(funcion.Parametros[i].(ParamsDeclaration).Id_Interno, true, val)
			} else {
				ast.SetError("El tipo de parámetro es incorrecto", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
				return nil
			}
		}
	} else {
		ast.SetError("Faltan parámetros en la función", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return nil
	}

	//ejecución
	for _, inst := range funcion.Bloque {
		inst.(interfaces.Instruction).Ejecutar(ast, funcEnv)
	}

	return nil
}
