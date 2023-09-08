package expressions

import (
	"Backend/environment"
)

type IsEmpty struct {
	Lin int
	Col int
	Id  string
}

func NewIsEmpty(lin int, col int, id string) IsEmpty {
	instr := IsEmpty{lin, col, id}
	return instr
}

func (p IsEmpty) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)

	//verificar que la variable llamada sea vector
	if variable.Tipo < environment.ARRAY || variable.Tipo > environment.A_CHAR {
		ast.SetError("La variable no es un vector para llamar la funcion isEmpty", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return environment.Symbol{
			Lin:   p.Lin,
			Col:   p.Col,
			Tipo:  environment.NULL,
			Valor: 0,
		}
	}
	var ret bool
	if len(variable.Valor.([]interface{})) == 0 {
		ret = true
	} else {
		ret = false
	}

	return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.BOOLEAN, Valor: ret}
}
