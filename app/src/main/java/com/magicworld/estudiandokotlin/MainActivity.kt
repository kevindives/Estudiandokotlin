package com.magicworld.estudiandokotlin


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.magicworld.estudiandokotlin.animales.Perro
import com.magicworld.estudiandokotlin.cleancode.CleanCode
import com.magicworld.estudiandokotlin.cleancode.HouseProps
import com.magicworld.estudiandokotlin.cleancode.MovieProps
import com.magicworld.estudiandokotlin.examplesclasses.Car
import com.magicworld.estudiandokotlin.examplesclasses.Person1
import com.magicworld.estudiandokotlin.hackerrank.HackerRank
import com.magicworld.estudiandokotlin.matrices.Matrices
import com.magicworld.estudiandokotlin.persons.Person
import com.magicworld.estudiandokotlin.persons.Settings
import com.magicworld.estudiandokotlin.persons.User
import com.magicworld.estudiandokotlin.persons.UserSettings
import com.magicworld.estudiandokotlin.solid.*

class MainActivity : AppCompatActivity() {

    private val hackerRank   = HackerRank()
    private val cleanCode    = CleanCode()
    private val vocho        = Car()
    private val tesla        = Tesla(5)
    private val volvo        = Volvo(7)
    private val ferrari      = Ferrari(4)
    private val renault      = Renault(6)
    private val cars         = arrayListOf(tesla , volvo , ferrari , renault)
    private val person       = Person("carlos", "M", "1992-12-20")
    private val user         = User("kevin@google.com", "android Dev")
    private val settings     = Settings("/usr/home", "/home")
    private val userSettings = UserSettings(person, user, settings)
    private val matrices     = Matrices()
    private val person1      = Person1("pedro", 17)
    private val perro1       = Perro()
    private val palindromo   = "anna"
    private val query        = arrayOf("kevin", "sapo", "abc")
    private val dictionary   = arrayOf(
        "vinke",
        "einkv",
        "ienvk",
        "posa",
        "aosp",
        "cba",
        "bca",
        "acb",
        "cab",
        "bac",
        "rida",
        "terr"
    )
    private val myArray = arrayListOf(1, 3, 4, 5, 6, 1, 1, 5, 6)
    private val myArray2 = arrayListOf(1, 1, 3, 3, 4, 4, 1)
    private val stepsRobot = arrayListOf("R", "R", "L", "U", "U", "L", "D", "D")
    private val stepsRobot2 = arrayListOf("R", "U", "U", "L", "D", "L", "L")
    private val pointsAnna = arrayOf(1, 2, 3)
    private val pointBob = arrayOf(3, 2, 1)
    private val ponitKevin = arrayOf(5, 4, -7)
    private val arr = arrayOf(pointsAnna, pointBob, ponitKevin)
    private val date = "07:45:55PM"
    private val grades = arrayOf(73, 67, 38, 33)
    private val names = arrayOf("kevin", "ana", "lisa")
    private val name = arrayListOf("kevin", "ana", "lisa")
    private val parts = HouseProps("techo", "patio", " jardin", "techo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        showData()
//        hackerRank.palindromo(palindromo)
//        hackerRank.robotNasa(stepsRobot)
//        hackerRank.comparateAnagram(query , dictionary)
//        println(cleanCode.itsColor("reDi"))
        exampleForEach(name)
        printsCarsSeats(cars)
        cleanCode.showPartsOfHouse(parts)
        hackerRank.comparateAnagram(query ,dictionary)

    }


    fun showData() {
        println(userSettings.person.name)
        println(userSettings.person.birthdate)
        println(userSettings.user.email)
        println(userSettings.user.role)
        println(userSettings.settings.workingDirectory)
    }
    //uso una clase para no implementar mas de 3 parametros en la funcion
    fun CreateMovie( movieProps: MovieProps){
        with(movieProps){
            println(" $title $description $rating $cast")
        }
    }
    fun exampleForEach(array : ArrayList<string>){
        array.forEach { name ->
            println("el nombre es: $name")
        }

    }
    //principio de susutitucion de liskov y opena and close
    fun printsCarsSeats( cars: ArrayList<Vehicle>){
        cars.forEach{ car ->
            println("Nombre: ${car.javaClass.simpleName} , Asientos: ${car.getNumberOfSeats()} ")

        }
    }


}


typealias Predicate<T> = (T) -> Boolean
typealias string = String