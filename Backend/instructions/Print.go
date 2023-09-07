package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"reflect"
)

type Print struct {
	Lin   int
	Col   int
	Value interface{}
}

func NewPrint(lin int, col int, val interface{}) Print {
	return Print{lin, col, val}
}

func (p Print) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var consoleOut string
	valueToPrint := p.Value.(interfaces.Expression).Ejecutar(ast, env)
	if reflect.TypeOf(valueToPrint.Valor).Kind() == reflect.Slice && reflect.TypeOf(valueToPrint.Valor).Elem().Kind() == reflect.Interface {
		for cont := range valueToPrint.Valor.([]interface{}) {
			temp_result := valueToPrint.Valor.([]interface{})[cont].(environment.Symbol)
			consoleOut += fmt.Sprintf("%v", temp_result.Valor)
		}
		ast.SetPrint(consoleOut + "\n")
		return nil
	} else {
		consoleOut += fmt.Sprintf("%v", valueToPrint.Valor)
		ast.SetPrint(consoleOut + "\n")
		return nil
	}
}
