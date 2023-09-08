package expressions

import (
	"Backend/environment"
)

type Count struct {
	Lin int
	Col int
	Id  string
}

func NewCount(lin int, col int, id string) Count {
	instr := Count{lin, col, id}
	return instr
}

func (p Count) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	//Obtengo la variable
	var variable = environment.Symbol{}
	variable = env.(environment.Environment).GetVariable(p.Id)

	//verificar que la variable llamada sea vector
	if variable.Tipo < environment.ARRAY || variable.Tipo > environment.A_CHAR {
		ast.SetError("La variable no es un vector para llamar la funcion count", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		return environment.Symbol{
			Lin:   p.Lin,
			Col:   p.Col,
			Tipo:  environment.NULL,
			Valor: 0,
		}
	}
	var ret_cont = len(variable.Valor.([]interface{}))

	return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.INTEGER, Valor: ret_cont}
}
