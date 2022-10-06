package com.magicworld.estudiandokotlin.matrices

import kotlin.math.absoluteValue

class Matrices {

    // trabajar con array: los array no son mutables entonces hay que darle el size
    fun arrays(): Array<Int?> {
        val arr = arrayOfNulls<Int>(5)
        for (i in 0..4) {
            arr[i] = i
        }

        return arr
    }

    fun createMatrizSquare(matrizSize: Int): Array<Array<String?>> {

        return Array(matrizSize) { Array<String?>(matrizSize) { null } }
    }

    fun pritnMatriz(arr: Array<*>) {
        for (element in arr) {
            println(element)

        }
    }

    //recorre una matriiz
    fun recorrerMatriz(arr: ArrayList<ArrayList<Int>>) {

        for (myArray in arr) {
            for (num in myArray.indices) {
                print(myArray[num])
            }
            println()
        }
    }

    //crear una matriz NO SIRVE si se modifica un numero se modifica en todos
    private fun createMatrizOfCeros(size: Int): ArrayList<ArrayList<Int>> {

        val range = size - 1
        val matriz: ArrayList<ArrayList<Int>> = arrayListOf()
        val myArray = arrayListOf<Int>()

        for (i in 0..range) {
            myArray.add(0)
        }
        for (i in 0..range) {
            matriz.add(myArray)
        }
        return matriz
    }

    //muestra la diferencia entre la diagonal principal y secudaria de una matriz
    fun diagonalDifference(arr: Array<Array<Int>>) {

        var sumDigPrin = 0
        var sumDigSec = 0

        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i == j) {
                    sumDigPrin += arr[i][j]
                }
                if (i + j == arr.size - 1) {
                    sumDigSec += arr[i][j]
                }
            }
        }
        val difference = (sumDigPrin - sumDigSec).absoluteValue
        println(difference)

    }

    //suma la diagonal principal de una matriz cuadrada
    fun sumDiagMatriz(arr: Array<Array<Int>>) {
        var sumDigPrinMatriz = 0
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i == j) {
                    sumDigPrinMatriz += arr[i][j]
                }
            }
        }
        println("la suma de la diagonal principal de la matriz es : $sumDigPrinMatriz ")
    }


    //suma diagonal secundaria de una matriz cuadrada
    fun sumDigMatrizDer(arr: Array<Array<Int>>) {

        var sumDigDerMatriz = 0

        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i + j == arr.size - 1) {
                    sumDigDerMatriz += arr[i][j]
                }
            }
        }
        println("la suma de la diagonal secundaria de la matriz: $sumDigDerMatriz ")
    }


}