package com.example.desarrollomovil.EstructurasAlgoritmicas

class Ejercicio{

}
fun main(){
    println("Ingrese un número: ")
    var n1:Int= readLine()!!.toInt()
    if(n1 in 1..10){
        println("El número $n1 está en el rango")
    }else{
        println("El número $n1 no está en el rango")
    }
}