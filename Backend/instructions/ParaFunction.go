package instructions

import (
	"Backend/environment"
)

type ParamsDeclaration struct {
	Lin        int
	Col        int
	Id_Externo string
	Id_Interno string
	Inout      string
	Tipo       environment.TipoExpresion
}

func NewParamsDeclaration(lin int, col int, id string, id2 string, inout string, tipo environment.TipoExpresion) ParamsDeclaration {
	instr := ParamsDeclaration{lin, col, id, id2, inout, tipo}
	return instr
}

func (p ParamsDeclaration) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	var result environment.Symbol

	result = environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  p.Tipo,
		Valor: 0,
	}

	env.(environment.Environment).SaveVariable(p.Id_Interno, false, result)

	return nil
}
