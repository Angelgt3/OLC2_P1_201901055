# OLC2_P1_201901055

*Universidad de San Carlos de Guatemala*  
*Escuela de Ingeniería en Ciencias y Sistemas, Facultad de Ingenieria*  
*Organizacion de Lenguajes y Compiladores 2, 2023.*  


___
## **PROYECTO 1**
___
**Angel Geovany Aragón Pérez**  
**201901055**
___
## **MANUAL DE USUARIO**
___

##### ***Inicializacion del Programa***
Al dar comienzo al programa, se desplegará en la pantalla una interfaz inicial que contendrá dos campos de entrada de texto y un botón. En el primer campo de entrada, se introducirá el código Swift, mientras que el segundo campo funcionará como una consola donde se exhibirá el resultado. Para iniciar la ejecución del programa, se procederá a presionar el botón de ejecución..

##### **Expresiones**
##### ***Aritmeticas***
```Swift
  10+20 -> 30
  10-20 -> -10
  5*5 -> 25
  10/2 -> 5
  10 % 3 -> 1
```
##### ***Comparacion***
```Swift
  1=1 -> true
  20!=20 -> false
```
##### ***Relacionales***
```Swift
  1 < 1 -> false
  13.0 >= 13.0 -> true
```

##### ***Logico***
```Swift
  true && true -> true
  false || true -> true
  !false -> true
```

##### **Instrucciones**
##### ***Print***
```Swift
  print(<expresion>)
```
##### ***Declaraciones de variables***
###### ***Mutables***
Para declarar variable mutables se usa 'var'
###### ***Inmutable***
Para declarar variable mutables se usa 'let'
```Swift
  var <id> = <expresion>
  let variable_b: String = "Hola"
  var <id> : [<TIPO>] (  |<exp, expr...>)
  var vec1: [Int] = [10,20,30,40,50]
  var mtx1 : [[Int]] = [[1,2,3],[4,5,6],[7,8,9]]
```
##### ***If - else if - else***
```Swift
  if <expresion> {
    <instruccion>
  }else{
    <instruccion>
  }

  if <expresion> {
      <instruccion>
  }else if <expresion>{
    <instruccion>  
  }else if <expresion>{
    <instruccion>  
  }else{
    <instruccion>
  }
```
##### ***Switch***
```Swift
let numero = 2
switch numero {
case 1:
  <instruccion>
case 2:
  <instruccion>
case 3:
  <instruccion>
default:
  <instruccion>
}
```
##### ***While***
```Swift
while <expresion> {
  <instruccion>
}
```
##### ***For***
```Swift
for <id> in <numero>...<numero> {
  <instruccion>
}
for <id> in <string>|<vector>  {
  <instruccion>
}
```
##### ***Guard***
```Swift
guard <expresion> else {
  <instruccion>
  <continue | break | return>
}
```
## **MANUAL Tecnico**

