package environment

import (
	"fmt"
)

type Environment struct {
	Anterior         interface{}
	Tabla_variable   map[string]Symbol
	mutable_variable map[string]bool
	Tabla_funciones  map[string]InstF
	Id               string
}

func NewEnvironment(ant interface{}, id string) Environment {
	return Environment{
		Anterior:         ant,
		Tabla_variable:   make(map[string]Symbol),
		mutable_variable: make(map[string]bool),
		Tabla_funciones:  make(map[string]InstF),
		Id:               id,
	}
}

func (env Environment) GetEntorno() string {
	return env.Id
}

func (env Environment) SaveVariable(id string, mut bool, value Symbol) {
	if variable, ok := env.Tabla_variable[id]; ok {
		fmt.Println("La variable "+id+" ya existe", variable)
		return
	}
	env.Tabla_variable[id] = value
	env.mutable_variable[id] = mut
}

func (env Environment) GetVariable(id string) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla_variable[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}

func (env Environment) SetVariable(id string, value Symbol) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla_variable[id]; ok { //busca la variable
			if tmpEnv.Tabla_variable[id].Tipo == value.Tipo && tmpEnv.mutable_variable[id] { //si son del mismo tipo y si es mutable la variable
				tmpEnv.Tabla_variable[id] = value
				return variable
			} else {
				if !tmpEnv.mutable_variable[id] {
					fmt.Println("La variable que quiere modificar es inmutable")
				} else {
					fmt.Println("El tipo de dato es incorrecto")
				}
				return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
			}
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}

func (env Environment) SaveFunc(id string, value InstF) {

	if variable, ok := env.Tabla_variable[id]; ok {
		fmt.Println("La variable "+id+" ya existe", variable)
		return
	}
	env.Tabla_funciones[id] = value

}

func (env Environment) GetFunc(id string) InstF {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if funcion, ok := tmpEnv.Tabla_funciones[id]; ok {
			return funcion
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La funcion", id, " no existe")
	return InstF{0, 0, NULL, nil}
}
