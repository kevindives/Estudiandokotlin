package com.magicworld.estudiandokotlin.persons

class User(val email:String , val role: String) {

    fun checkCredentials(): Boolean {
        return true
    }
}