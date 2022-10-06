package com.magicworld.estudiandokotlin.cleancode

import java.util.*
import kotlin.collections.ArrayList


//usar una data class cuando son mas de 3 paramaetros en una funcion
data class HouseProps (
    val frontdoor : String,
    val patio     : String,
    val garden    : String,
    val roof      : String,
)

class CleanCode {



    fun showPartsOfHouse(parts : HouseProps){
        with(parts){
            println("$frontdoor $patio $garden $roof")
        }
    }

    //ejercicio con if y boolean
    fun valid (isWorking :Boolean) {
        if (!isWorking) println("is working false") else println("is working true")

    }

    //reducir un if a una sola linea condicional ternario no existe se usa asi
    fun isZero(num: Int) {
        if (num == 0) println("es cero") else println("el numero no es igual a cero")

    }

    /*
    //funcion en typescript
    function isRedFruit( fruit: string ): boolean {

        if ( fruit === 'manzana' || fruit === 'cereza' || fruit === 'ciruela' ) {
            return true;
        } else {
            return false;
        }
    }*/
    //funcion mejorada en kotlin
    fun isRedFruit(fruit: String): Boolean {

        val fruits = arrayOf("manzana", "cereza", "ciruela")
        println("${fruits.contains(fruit)}")
        return fruits.contains(fruit)
    }

    /*
    function getFruitsByColor( color: string ): string[] {
        if ( color === 'red' ) {
            return ['manzana','fresa'];
        } else if ( color === 'yellow') {
            return ['piña','banana'];
        } else if ( color === 'purple') {
            return ['moras','uvas']
        } else {
            throw Error('the color must be: red, yellow, purple');
        }

    }*/
    fun getFruitsByColor(color: String): ArrayList<String> {

        val fruits = when (color) {
            "red" -> arrayListOf("manzana", "fresa")
            "yellow" -> arrayListOf("piña", "banana")
            "purple" -> arrayListOf("moras", "uvas")
            else -> error("the color must be: red, yellow, purple")
        }
        println(fruits)
        return fruits
    }

    fun exampleReturn(num: Int): Int {
        return when (num) {
            in 0..10 -> {
                println("el numero es positivo")
                5
            }
            in -10..0 -> {
                println("el numero es negativo")
                -5
            }
            else -> 0
        }
    }

    fun isPositivoNegativoOrNeutro(num: Int): String{
        return when{
            num > 0 -> "is positive"
            num < 0 -> "is negative"
            else -> "is zero"
        }
    }

    fun isPOsitiveNegativeOrZero(num: Int): String {

        if (num == 0) return "es cero"
        return if (num > 0) "Es positivo " else "Es negativo"
    }

    fun itsColor(color: String): String {
        if (color.equals("Red"    , ignoreCase = true)) return "El color es rojo"
        if (color.equals("Blue"   , ignoreCase = true)) return "El color es azul"
        if (color.equals("Purple" , ignoreCase = true)) return "El color es morado"
        return "No se conoce el color"

    }
}