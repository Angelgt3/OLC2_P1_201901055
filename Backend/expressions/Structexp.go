package expressions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type StructExp struct {
	Lin     int
	Col     int
	Id      string
	ListExp []interface{}
}

func NewStructExp(lin int, col int, id string, list []interface{}) StructExp {
	exp := StructExp{lin, col, id, list}
	return exp
}

func (p StructExp) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var valor map[string]environment.Symbol
	var result environment.Symbol
	var tempExp []interface{}
	//se guarda el listado de valores nuevos
	for _, s := range p.ListExp {
		tempExp = append(tempExp, s)
	}
	//se obtiene la estructura guardada
	resultStruct := env.(environment.Environment).GetStruct(p.Id)

	//se valida si existe struct
	if resultStruct.Tipo == environment.STRUCT {
		//Validar tamaño y que cada tipo coincida con el struct existente
		if len(resultStruct.Valor.([]interface{})) == len(p.ListExp) {
			valor = make(map[string]environment.Symbol)
			//recorrer el struct almacenado
			for i := 0; i < len(resultStruct.Valor.([]interface{})); i++ {
				//validar los identificadores
				if resultStruct.Valor.([]interface{})[i].(environment.StructType).Id == p.ListExp[i].(environment.StructContent).Id {
					tempVal := p.ListExp[i].(environment.StructContent).Expresion.(interfaces.Expression).Ejecutar(ast, env)
					//validando tipos
					if resultStruct.Valor.([]interface{})[i].(environment.StructType).Tipo == tempVal.Tipo {
						valor[resultStruct.Valor.([]interface{})[i].(environment.StructType).Id] = tempVal
					} else {
						fmt.Println("El tipo de parámetro de la variable " + p.ListExp[i].(environment.StructContent).Id + " es incorrecto")
						//ast.SetError("El tipo de parámetro de la variable " + p.ListExp[i].(environment.StructContent).Id + " es incorrecto")
					}
				}
			}
			result = environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.STRUCT, Valor: valor}
		} else {
			fmt.Println("La cantidad de valores en el struct es incorrecta")
			//ast.SetError("La cantidad de valores en el struct es incorrecta")
		}
	} else {
		fmt.Println("No se ha encontrado el struct correspondiente")
		//ast.SetError("No se ha encontrado el struct correspondiente")
	}
	return result
}

type StructAccess struct {
	Lin    int
	Col    int
	Struct interfaces.Expression
	Id     string
}

func NewStructAccess(lin int, col int, str interfaces.Expression, id string) StructAccess {
	exp := StructAccess{lin, col, str, id}
	return exp
}

func (p StructAccess) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	var result, tempStruct environment.Symbol
	tempStruct = p.Struct.Ejecutar(ast, env)

	if tempStruct.Tipo == environment.STRUCT {

		if variable, ok := tempStruct.Valor.(map[string]environment.Symbol)[p.Id]; ok {
			return variable
		}
		fmt.Println("No existe el elemento " + p.Id)
		//ast.SetError("No existe el elemento " + p.Id)
		return result
	}
	fmt.Println("La expresión no es un struct")
	//ast.SetError("La expresión no es un struct")
	return result
}
