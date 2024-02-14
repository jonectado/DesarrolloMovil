package com.example.desarrollomovil.EstructurasAlgoritmicas

class Valores_aleatorios {
}

fun main(){
    var res:Int = (0..50).random()
    when (res){
        0 -> println("No hay resultados")
        1,2,3,4,5,6,7,8,9 -> println("El resultado es menor a 10")
        in 10..40 -> println("El resultado está entre 10 y 40")
        else -> print("Fuera de rango")
    }
}