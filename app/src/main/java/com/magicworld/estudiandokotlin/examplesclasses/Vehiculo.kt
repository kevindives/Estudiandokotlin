package com.magicworld.estudiandokotlin.examplesclasses

class Vehiculo {
    var nombre: String? = null
    var marca: String? = null
    var sku: String? = null

    constructor(_nombre:String , _marca:String){
        nombre = _nombre
        marca = _marca
    }
    constructor(_sku:String){
        sku = _sku
    }
}