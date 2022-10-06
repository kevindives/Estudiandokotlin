package com.magicworld.estudiandokotlin.solid

//pricipio de sustitucion de liskov
//la funciones deberian poder usar una subclase sin verse afectadas
abstract class Vehicle {
    abstract fun getNumberOfSeats(): Int
}

class Volvo(private val numberOfseats: Int) : Vehicle() {

    override fun getNumberOfSeats(): Int {
        return numberOfseats
    }
}

class Tesla(private val numberOfSeats: Int) : Vehicle() {

    override fun getNumberOfSeats(): Int {
        return numberOfSeats
    }
}

class Ferrari(private val numberOfSeats: Int) : Vehicle() {

    override fun getNumberOfSeats(): Int {
        return numberOfSeats
    }
}

class Renault(private val numberOfSeats: Int) : Vehicle() {

    override fun getNumberOfSeats(): Int {
        return numberOfSeats
    }
}

