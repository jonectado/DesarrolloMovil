package com.example.desarrollomovil.EstructurasAlgoritmicas

class Ejercicio_pero_con_Letras {
}

fun main(){
    println("Ingrese una letra: ")
    var n1:String= readLine()!!.toString()
    if(n1 in "a".."g"){
        println("El número $n1 está en el rango")
    }else{
        println("El número $n1 no está en el rango")
    }
}