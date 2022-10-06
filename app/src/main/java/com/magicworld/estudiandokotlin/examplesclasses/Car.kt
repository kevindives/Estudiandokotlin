package com.magicworld.estudiandokotlin.examplesclasses

class Car {

    private var color  = ""
    private var modelo = 0
    private var marca  = ""
    private var acceso = false

    fun meterLLave(llave:String){
        if (llave === "1234") {
            acceso = true
            println("Puedes acceder al auto")
        } else println("sonar alarma")
    }
    fun mando(accion:String){
        if (!acceso ) error("No tienes acceso al auto (sonar alarma)")

        when (accion){
            "encender"  -> enciende()
            "acelera"   -> acelera()
            "frena"     -> frena()
        }

    }
    private fun enciende(){
        println("El auto esta encendido")
    }
    private fun acelera(){
        println("el auto acelera 10km/h mas")
    }
    private fun frena(){
        println("el auto frena 10km/h menos")
    }

}