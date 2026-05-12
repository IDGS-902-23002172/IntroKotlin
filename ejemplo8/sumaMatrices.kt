/*
--Suma de dos matrices 3x3 en Kotlin---
crear un programa que permita al usuario ingresar por teclado
los valores de dos matrices de tamaño 3x3 y posteriormente realiza
la suma de ambas matrices, mostrando el resultado en pantalla.
---Explicación del programa--.
Se crean tres matrices:
matriz1 para almacenar la primera matriz. 
matriz2 para almacenar la segunda matriz.
resultado para guardar la suma.

*/


fun main() {
    val matriz1 = Array(3) { Array(3) { 0 } }
    val matriz2 = Array(3) { Array(3) { 0 } }
    val resultado = Array(3) { Array(3) { 0 } }

    println(" primera matriz:")
    for (i in 0..2) { 
        for (j in 0..2) { 
            println("ingrese un solo valor para la posicion [${i + 1}    ${j + 1}]:")
            matriz1[i][j] = readln().toInt()
        }
    }
    println("\n segunda matriz:")
    for (i in 0..2) {
        for (j in 0..2) {
            println("ingrese un solo valor para la posicion [${i + 1}    ${j + 1}]:")
            matriz2[i][j] = readln().toInt()
        }
    }
    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\n resultado de la matriz")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${resultado[i][j]}   ") 
        }
        println() 
    }
}