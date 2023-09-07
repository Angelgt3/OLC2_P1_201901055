package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"reflect"
)

// variables
type Declaration struct {
	Lin        int
	Col        int
	Id         string
	Tipo       environment.TipoExpresion
	Expresion  interfaces.Expression
	changeable bool
}

func NewDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression, mut bool) Declaration {
	instr := Declaration{lin, col, id, tipo, val, mut}
	return instr
}

func (p Declaration) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Traer simbolo
	var result environment.Symbol
	result = p.Expresion.Ejecutar(ast, env)
	// var valor : string ? | variable con tipo sin valor | para eso nomas
	if result.Tipo == environment.NULL && p.Tipo != environment.NULL {
		result.Tipo = p.Tipo
	}
	//casteo
	//float | int -> float  | unicamente
	if p.Tipo == environment.FLOAT && result.Tipo == environment.INTEGER {
		if intValue, ok := result.Valor.(int); ok {
			// Convertir el int a float64
			result.Valor = float64(intValue)
			result.Tipo = environment.FLOAT
		}
	}
	//validar tipos
	if result.Tipo == environment.ARRAY {
		if p.ArrayValidation(ast, env, result) { //para array
			result.Tipo = p.Tipo
			env.(environment.Environment).SaveVariable(p.Id, p.changeable, result)
			ast.SetRs(p.Id, "vector", result.Tipo, env.(environment.Environment).GetEntorno(), p.Lin, p.Col)
		} else if p.MatrizValidation(ast, env, result) { //para matriz
			result.Tipo = p.Tipo
			env.(environment.Environment).SaveVariable(p.Id, p.changeable, result)
			ast.SetRs(p.Id, "matriz", result.Tipo, env.(environment.Environment).GetEntorno(), p.Lin, p.Col)
		} else {
			fmt.Println("La estructura del array es incorrecta")
			ast.SetError("La estructura del array es incorrecta", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		}
		// variable con el mismo tipo y valor || variable sin tipo asignado pero con valor
	} else if result.Tipo == p.Tipo || (result.Tipo != p.Tipo && p.Tipo == environment.NULL) {
		env.(environment.Environment).SaveVariable(p.Id, p.changeable, result)
		ast.SetRs(p.Id, "variable", result.Tipo, env.(environment.Environment).GetEntorno(), p.Lin, p.Col)
	} else {
		fmt.Println("Los tipos de datos son incorrectos")
		ast.SetError("Los tipos de datos son incorrectos", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
	}

	return nil
}

// validacion matriz
func (p Declaration) MatrizValidation(ast *environment.AST, env interface{}, result environment.Symbol) bool {
	//validaciones de matriz

	for cont := range result.Valor.([]interface{}) {
		temp_result := result.Valor.([]interface{})[cont].(environment.Symbol)
		if temp_result.Tipo == environment.ARRAY {
			var a = p.recursividad_valores_matriz(ast, env, temp_result)
			if a.Tipo == environment.NULL {
				return false
			}
		}
	}
	return true
}

func (p Declaration) recursividad_valores_matriz(ast *environment.AST, env interface{}, result environment.Symbol) environment.Symbol {

	if reflect.TypeOf(result.Valor).Kind() == reflect.Slice && reflect.TypeOf(result.Valor).Elem().Kind() == reflect.Interface {
		for cont := range result.Valor.([]interface{}) {
			temp_result := result.Valor.([]interface{})[cont].(environment.Symbol)
			if temp_result.Tipo == environment.ARRAY {
				var r = p.recursividad_valores_matriz(ast, env, temp_result)
				if r.Valor == nil {
					return environment.Symbol{Lin: temp_result.Lin, Col: temp_result.Col, Tipo: environment.NULL, Valor: nil}
				}

			} else if temp_result.Tipo != p.Tipo-7 { // es de diferente
				return environment.Symbol{Lin: temp_result.Lin, Col: temp_result.Col, Tipo: environment.NULL, Valor: nil}
			}
		}

	}
	return result

}

// validacion array
func (p Declaration) ArrayValidation(ast *environment.AST, env interface{}, result environment.Symbol) bool {
	//validaciones de array
	//fmt.Println("p:", p)
	//fmt.Println("result:", result)
	//si es un vector nulo
	if result.Valor == nil {
		return true
	}
	for cont := range result.Valor.([]interface{}) {
		temp_result := result.Valor.([]interface{})[cont].(environment.Symbol)
		//verifico que todos los valores del vector sean de mismno tipo
		if temp_result.Tipo != p.Tipo-7 { // es de diferente
			return false
		}
	}
	return true
}

// funciones
type DeclarationFunc struct {
	Lin        int
	Col        int
	Id         string
	Tipo       environment.TipoExpresion
	Parametros []interface{}
	Bloque     []interface{}
}

func NewDeclarationFunc(lin int, col int, id string, tipo environment.TipoExpresion, parametros []interface{}, bloque []interface{}) DeclarationFunc {
	instr := DeclarationFunc{lin, col, id, tipo, parametros, bloque}
	return instr
}

func (p DeclarationFunc) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	value := environment.InstF{
		Lin:        p.Lin,
		Col:        p.Col,
		Id:         p.Id,
		Tipo:       p.Tipo,
		Parametros: p.Parametros,
		Bloque:     p.Bloque,
	}

	env.(environment.Environment).SaveFunc(p.Id, value)
	ast.SetRs(p.Id, "Funcion", p.Tipo, env.(environment.Environment).GetEntorno(), p.Lin, p.Col)

	return nil
}

// Declaracion de struct
type Struct struct {
	Lin     int
	Col     int
	Id      string
	ListAtr []interface{}
}

func NewStruct(lin int, col int, id string, list []interface{}) Struct {
	instr := Struct{lin, col, id, list}
	return instr
}

func (p Struct) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	env.(environment.Environment).SaveStruct(p.Id, p.ListAtr)
	return nil
}
