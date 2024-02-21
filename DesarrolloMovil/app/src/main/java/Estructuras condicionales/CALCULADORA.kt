package com.example.desarrollomovil.EstructurasAlgoritmicas

import kotlin.math.*

class CALCULADORA {
}

fun main(){
    println("Primer número: ")
    var n1:Double = readLine()!!.toDouble()
    println("Segundo número: ")
    var n2:Double = readLine()!!.toDouble()
    println("Ingrese la operación a realizar:\n" +
            "1. Suma\n" +
            "2. Resta \n" +
            "3. Multiplicación\n" +
            "4. División del primero sobre el segundo\n" +
            "5. División del segundo sobre el primero\n" +
            "6. Raíz cuadrada del primero\n" +
            "7. Raíz cuadrada del segundo\n" +
            "8. El primero elevado al segundo \n" +
            "9. El segundo elevado al primero\n" +
            "E L I J A : ")
    var op:Int = readLine()!!.toInt()
    var res:Double =0.0
    when(op){
        1 -> {
            print("Usted seleccionó suma. \n")
            res=n1+n2
            print("El resultado de $n1 + $n2 es igual a: $res")
        }
        2 -> {
            print("Usted seleccionó resta\n")
            res=n1-n2
            print("El resultado de $n1 - $n2 es igual a: $res")
        }
        3 -> {
            print("Usted seleccionó multiplicación\n")
            res=n1*n2
            print("El resultado de $n1 * $n2 es igual a: $res")
        }
        4 -> {
            print("Usted seleccionó división del primero sobre el segundo\n")
            res=n1/n2
            print("El resultado de $n1 / $n2 es igual a: $res")
        }
        5 ->{
            print("Usted seleccionó división del segundo sobre el primero\n")
            res=n2/n1
            print("El resultado de $n2 / $n1 es igual a: $res")
        }
        6 ->{
            print("Usted seleccionó Raíz cuadrada del primero\n")
            res= sqrt(n1)
            print("El resultado de la raíz cuadrada de $n1 es igual a: $res")
        }
        7 -> {
            print("Usted seleccionó Raíz cuadrada del segundo\n")
            res= sqrt(n2)
            print("El resultado de la raíz cuadrada de $n2 es igual a: $res")
        }
        8 ->{
            print("Usted seleccionó el primero elevado al segundo\n")
            res = n1.pow(n2)
            print("El resultado de $n1 ^$n2 es igual a: $res")
        }
        9 ->{
            print("Usted seleccionó el segundo elevado al primero\n")
            res = n2.pow(n1)
            print("El resultado de $n1 ^$n2 es igual a: $res")
        }
    }
}