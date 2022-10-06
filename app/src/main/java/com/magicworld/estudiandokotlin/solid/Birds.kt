package com.magicworld.estudiandokotlin.solid

//Principio de segregacion de interfaz las  clases no deberian
//estar obligadas a implementar una interfaz que no utilicen
interface Birds {
    fun eat()
}

interface FlyingBirds {
    fun fly()
}

interface RunnerBirds {
    fun run()
}

interface SwimmerBirds {
    fun swim()
}

class Tucan : Birds , FlyingBirds{

    override fun eat() {}

    override fun fly() {}

}

class Humminbird : Birds , FlyingBirds{

    override fun eat() {}

    override fun fly() {}

}

class Ostrich : Birds , RunnerBirds{

    override fun eat() {}

    override fun run() {}

}

class Penguin : Birds , SwimmerBirds{

    override fun eat() {}

    override fun swim() {}

}



