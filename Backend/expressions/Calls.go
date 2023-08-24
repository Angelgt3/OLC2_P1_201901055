package expressions

import (
	"Backend/environment"
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

/* para las funciones
type Callfunc struct {
	Lin    int
	Col    int
	Bloque []interface{}
}

func NewCallFunc(lin int, col int, id string) CallVar {
	exp := CallVar{lin, col, id}
	return exp
}
*/
