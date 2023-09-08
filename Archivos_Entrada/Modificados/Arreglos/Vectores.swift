// No se realizo parametro inout
//Se agregaron espacios para que no lo detectara como character
// se cambia el out+= "valor" -> out= out + "valor" (solo en cadenas)

// Algoritmo de ordenamiento por intercambio (Bubble Sort)
func ordIntercambio(_ arr: [Int]) -> [Int] {
    var sortedArr = arr
    var i = 0

    while i < sortedArr.count - 1 {
        var j = 0

        while j < sortedArr.count - i - 1 {
            if sortedArr[j] > sortedArr[j + 1] {
                let temp = sortedArr[j]
                sortedArr[j] = sortedArr[j + 1]
                sortedArr[j + 1] = temp
            }
            j += 1
        }

        i += 1
    }

    return sortedArr
}

// Algoritmo de ordenamiento por selección (Selection Sort)
func ordSeleccion(_ arr: [Int]) -> [Int] {
    var sortedArr = arr
    var i = 0

    while i < sortedArr.count - 1 {
        var indiceMenor = i
        var j = i + 1

        while j < sortedArr.count {
            if sortedArr[j] < sortedArr[indiceMenor] {
                indiceMenor = j
            }
            j += 1
        }

        if i != indiceMenor {
            let temp = sortedArr[i]
            sortedArr[i] = sortedArr[indiceMenor]
            sortedArr[indiceMenor] = temp
        }

        i += 1
    }

    return sortedArr
}

// Función para imprimir un arreglo
func printArray(_ msg: String, _ arr: [Int]) {
    var out = " ["
    for i in 0...arr.count-1 {
        if i == arr.count - 1 {
            out = out +String(arr[i])
        } else {
            out = out +String(arr[i]) + ", "
        }
    }
    out = out +"] "
    print(msg + out)
}

print("=============================================")
print("===============ORDENAMIENTO==================")
print("=============================================")
print("INTERCAMBIO:")
var arr1: [Int] = [8, 4, 6, 2]
printArray("entrada: ", arr1)
arr1 = ordIntercambio(arr1)
printArray("salida: ", arr1)
print("SELECCIÓN:")
var arr2: [Int] = [40, 21, 1, 3, 14, 4]
printArray("entrada: ", arr2)
arr2 = ordSeleccion(arr2)
printArray("salida: ", arr2)

var arr3: [Int] = [90, 3, 40, 10, 8, 5]

print("=============================================")
print("================FUNCIONES====================")
print("=============================================")

printArray("arr1: ", arr1)
arr1.append(9)
printArray("arr1: ", arr1)

printArray("arr2: ", arr2)
arr2.removeLast()
printArray("arr2: ", arr2)

printArray("arr2: ", arr3)
arr3.remove(at: 3)
printArray("arr2: ", arr3)

print("arr1 vacío: ", arr1.isEmpty)
print("arr1 cantidad: ", arr1.count)

/*
=============================================
===============ORDENAMIENTO==================
=============================================
INTERCAMBIO:
entrada: [8, 4, 6, 2]
salida: [2, 4, 6, 8]
SELECCIÓN:
entrada: [40, 21, 1, 3, 14, 4]
salida: [1, 3, 4, 14, 21, 40]
=============================================
================FUNCIONES====================
=============================================
arr1: [2, 4, 6, 8]
arr1: [2, 4, 6, 8, 9]
arr2: [1, 3, 4, 14, 21, 40]
arr2: [1, 3, 4, 14, 21]
arr2: [90, 3, 40, 10, 8, 5]
arr2: [90, 3, 40, 8, 5]
arr1 vacío:  false
arr1 cantidad:  5
*/