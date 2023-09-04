package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type FunCall struct {
	Lin int
	Col int
	Id  string
}

func NewFunCall(lin int, col int, id string) FunCall {
	instr := FunCall{lin, col, id}
	return instr
}

func (p FunCall) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	result := env.(environment.Environment).GetFunc(p.Id)

	if result.Bloque == nil { // no se encontro la funcion
		return nil
	}

	var fuEnv environment.Environment
	fuEnv = environment.NewEnvironment(env.(environment.Environment), "FUNCION")
	//ejecución
	for _, inst := range result.Bloque {
		inst.(interfaces.Instruction).Ejecutar(ast, fuEnv)
	}

	return nil
}
