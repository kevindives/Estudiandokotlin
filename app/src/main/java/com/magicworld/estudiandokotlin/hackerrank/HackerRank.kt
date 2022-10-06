package com.magicworld.estudiandokotlin.hackerrank

import java.math.RoundingMode
import java.text.DecimalFormat

class HackerRank {

    fun palindromo(text: String) {

        var (igual, aux) = Pair(0, 0)
        for (ind in text.length - 1 downTo 0) {
            when {
                text[ind] == text[aux] -> igual++
            }
            aux++
        }
        when (igual) {
            text.length -> println("$text es palindromo!!")
            else -> println("$text no es palindromo!!")
        }
    }

    //la funcion encuentra la cantidad de elementos contado solo uno por elemento
    fun elementsInArray(myArray: ArrayList<Int>) {
        myArray.sort()
        val myNewArray: ArrayList<Int> = arrayListOf()
        val arraySize = myArray.size - 1

        for (num in 0..arraySize) {
            //la condiciones busca comparar el elemento del array con el siguiente y cuando encuentre uno diferente
            //guardar el elemento en la posicion actual la primera condicion es para no salirse del index
            if (num < arraySize && myArray[num] != myArray[num + 1]) {
                myNewArray.add(myArray[num])
            }
        }

        myNewArray.add(myArray[arraySize])
        val elementInArray = myNewArray.size
        println("la respuesta es: $elementInArray")
        println("el nuevo array es: $myNewArray")

    }

    //determina los pasos que debe dar un robo para llegar a su punto de inicio
    fun robotNasa(coor: ArrayList<String>) {
        var absoluteX = 0
        var absoluteY = 0
        val totalSteps: ArrayList<String> = arrayListOf()

        for (steps in coor.indices) {
            when (coor[steps]) {
                "R" -> absoluteX++
                "L" -> absoluteX--
                "U" -> absoluteY++
                "D" -> absoluteY--
            }
        }

        if (absoluteX > 0) {
            for (num in 1..absoluteX) totalSteps.add("L")

        }
        if (absoluteX < 0) {
            for (num in absoluteX..-1) totalSteps.add("R")
        }

        if (absoluteY > 0) {
            for (num in 1..absoluteY) totalSteps.add("D")

        }
        if (absoluteY < 0) {
            for (num in absoluteY..-1) totalSteps.add("U")
        }
        if (absoluteX + absoluteY == 0) println("El robot se encuentra en su posicion inicial")
        else println(totalSteps)

    }

    //compara el resultado entre dos arrays de size = 3 cuando a es mayor que b se suma un punto en un array
    fun compareTriplets(a: Array<Int>, b: Array<Int>) {
        val results = arrayListOf(0, 0)
        //indices retorna el valor valido para el index del array
        for (num in a.indices) {
            if (a[num] > b[num]) {
                results[0]++
            } else if (b[num] > a[num]) {
                results[1]++
            }
        }
        println(results)
    }

    //Busca comparar las palabras de query y ver cuantas anagramas hay con las palabras de dictionary
    fun comparateAnagram(query: Array<String>, dictionary: Array<String>): ArrayList<Int> {
        val results = arrayListOf<Int>()

        var aux = 0
        for (i in query.indices) {
            for (j in dictionary.indices) {
                if (isAnagram(query[i], dictionary[j])) {
                    aux++
                }
            }
            results.add(aux)
            aux = 0
        }
        println(results)
        return results
    }

    private fun isAnagram(query: String, dictionary: String): Boolean {
        return query.toSortedSet() == dictionary.toSortedSet()
    }

    //funcion que recorre un array y cuenta la cantidad de nuemeros positivos,negativos
    // y ceros y los divide por su tamaño contiene funcion decimal format
    fun plusMinus(arr: Array<Int>): Unit {

        var positivos = 0.000000
        var negativos = 0.00000
        var zeros     = 0.00000
        val df        = DecimalFormat("#.######")
        df.roundingMode = RoundingMode.CEILING

        for (num in arr){
            if (num  == 0 ) zeros++
            if (num > 0) positivos++ else negativos ++
        }

        positivos /= arr.size
        negativos /= arr.size
        zeros /= arr.size

        println(df.format(positivos))
        println(df.format(negativos))
        println(df.format(zeros))

    }

    //dibuja una escalera de asteriscos
    fun staircase(n: Int) {
        val range    = n - 1
        val escalera = Array(n) { Array<String?>(n) { null } }

        // se dibuja la escalera
        var aux = n - 1
        for (i in 0..range) {
            for (j in 0..range) {
                if (j < aux) {
                    escalera[i][j] = " "
                } else {
                    escalera[i][j] = "#"
                }
                print(escalera[i][j])
            }
            aux--
            println()
        }

    }

    //se trabaja con strings para convertir la hora a formato 24 horas
    private fun convertTime(date: String): String {

        var hora     = ""
        val subChain = date.subSequence(0, 2)
        val time     = date.filter { inDate -> inDate.isLetter() }

        if (time == "AM") {
            hora = if (subChain == "12") {
                "00" + date.subSequence(2, 8)
            } else {
                date.subSequence(0, 8) as String
            }
        }
        if (time == "PM") {
            if (subChain == "12") {
                hora = date.subSequence(0, 8) as String
            } else {
                hora = (subChain.toString().toInt() + 12).toString()
                hora += date.subSequence(2, 8) as String
            }
        }
        println(hora)
        return hora
    }

    //redondea la nota si el siguiente multiplo de 5 de la nota menos la nota es menor que 3
    fun gradingStudents(grades: Array<Int>): Array<Int> {

        for (num in grades.indices) {
            if (grades[num]<38) continue
            if (nextMultiple(grades[num]) - grades[num] < 3) grades[num] = nextMultiple(grades[num])

        }
        println()
        return grades
    }

    private fun nextMultiple(grade: Int): Int {

        val lastNum = (grade.toString().subSequence(1, 2)).toString().toInt()
        return if (lastNum in 0..4) grade + (5-lastNum) else grade + (10-lastNum)

    }

//    ver enunciado en el block de notas
    fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
        // Write your code here
        if ( v1 < v2 )  return "NO"
        if ( v1 == v2 ) return "NO"
        return if ((x2 - x1) % (v1 -v2) == 0) "YES" else "NO"

    }

}