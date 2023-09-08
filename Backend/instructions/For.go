package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type ForRange struct {
	Lin        int
	Col        int
	Id         string
	Expresion  interfaces.Expression
	Expresion2 interfaces.Expression
	Bloque     []interface{}
}

func NewForRange(lin int, col int, id string, condition interfaces.Expression, condition2 interfaces.Expression, bloque []interface{}) ForRange {
	forInstr := ForRange{lin, col, id, condition, condition2, bloque}
	return forInstr
}

func (p ForRange) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Validando condicion
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	var condicion2 environment.Symbol
	condicion2 = p.Expresion2.Ejecutar(ast, env)
	if condicion.Tipo != environment.INTEGER || condicion2.Tipo != environment.INTEGER {
		ast.SetError("El tipo de rango es incorrecto para la condicion del for", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
	}

	var contador = condicion.Valor.(int) - 1
	//Ejecutando for
	for contador < condicion2.Valor.(int) {
		contador = contador + 1

		//ejecución for
		var forEnv environment.Environment
		forEnv = environment.NewEnvironment(env.(environment.Environment), "FOR")
		//guardar la variable
		var result environment.Symbol
		result.Valor = contador
		result.Col = p.Col
		result.Lin = p.Lin
		result.Tipo = environment.INTEGER
		forEnv.SaveVariable(p.Id, true, result)
		ast.SetRs(p.Id, "variable", result.Tipo, "FOR", p.Lin, p.Col)
		for _, inst := range p.Bloque {
			trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, forEnv)
			if trasferencia != nil {
				if valor, ok := trasferencia.(string); ok && valor == "break" {
					return nil //se sale del ciclo
				} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
					break //termina el ciclo (inicia de nuevo)
				} else {
					return trasferencia
				}
			}
		}
	}
	return nil
}

type For struct {
	Lin       int
	Col       int
	Id        string
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewFor(lin int, col int, id string, condition interfaces.Expression, bloque []interface{}) For {
	forInstr := For{lin, col, id, condition, bloque}
	return forInstr
}

func (p For) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//Validando condicion
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	if condicion.Tipo != environment.STRING {
		if condicion.Tipo < environment.ARRAY && condicion.Tipo > environment.A_CHAR {
			ast.SetError("El tipo de rango es incorrecto para la condicion del for", p.Col, p.Lin, env.(environment.Environment).GetEntorno())
		}
	}

	if condicion.Tipo == environment.STRING { //para cadenas
		contador := 0
		//Ejecutando for
		for contador < len(condicion.Valor.(string)) {
			//ejecución for
			var forEnv environment.Environment
			forEnv = environment.NewEnvironment(env.(environment.Environment), "FOR")
			//guardar la variable
			var result environment.Symbol
			result.Valor = string(condicion.Valor.(string)[contador])
			result.Col = p.Col
			result.Lin = p.Lin
			result.Tipo = condicion.Tipo
			forEnv.SaveVariable(p.Id, true, result)
			ast.SetRs(p.Id, "variable", result.Tipo, "FOR", p.Lin, p.Col)
			for _, inst := range p.Bloque {

				trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, forEnv)
				if trasferencia != nil {
					if valor, ok := trasferencia.(string); ok && valor == "break" {
						return nil //se sale del ciclo
					} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
						break //termina el ciclo (inicia de nuevo)
					} else {
						return trasferencia
					}
				}
			}
			contador += 1
		}
	} else { //para vectores
		//Ejecutando for
		for cont := range condicion.Valor.([]interface{}) {
			temp_result := condicion.Valor.([]interface{})[cont].(environment.Symbol)

			//ejecución for
			var forEnv environment.Environment
			forEnv = environment.NewEnvironment(env.(environment.Environment), "FOR")
			//guardar la variable
			var result environment.Symbol
			result.Valor = string(temp_result.Valor.(string))
			result.Col = p.Col
			result.Lin = p.Lin
			result.Tipo = temp_result.Tipo
			forEnv.SaveVariable(p.Id, true, result)
			ast.SetRs(p.Id, "variable", result.Tipo, "FOR", p.Lin, p.Col)
			for _, inst := range p.Bloque {

				trasferencia := inst.(interfaces.Instruction).Ejecutar(ast, forEnv)
				if trasferencia != nil {
					if valor, ok := trasferencia.(string); ok && valor == "break" {
						return nil //se sale del ciclo
					} else if valor, ok := trasferencia.(string); ok && valor == "continue" {
						break //termina el ciclo (inicia de nuevo)
					} else {
						return trasferencia
					}
				}
			}

		}
	}

	return nil
}
