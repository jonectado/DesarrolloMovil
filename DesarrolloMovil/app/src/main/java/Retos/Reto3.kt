package Retos

import kotlin.math.pow
import kotlin.math.sqrt

class Reto3 {
}

fun main(){

    println("Ingrese el primer número: ")
    var primer_numero = readln()!!.toDouble()

    println("Ingrese el segundo número: ")
    var segundo_numero = readln()!!.toDouble()

    calculadora(primer_numero, segundo_numero)
}

fun calculadora(primer_numero:Double, segundo_numero:Double){

    var suma = primer_numero + segundo_numero
    println("La suma es: $suma")

    var resta = primer_numero - segundo_numero
    println("La resta es: $resta")

    var multiplicacion = primer_numero * segundo_numero
    println("La multiplicación es: $multiplicacion")

    var division = primer_numero / segundo_numero
    println("La división es: $division")

    var raiz1 = sqrt(primer_numero)
    println("La raíz del primer número es: $raiz1")
    var raiz2 = sqrt(segundo_numero)
    println("La raíz del segundo número es: $raiz2")

    var potencia = primer_numero.pow(segundo_numero)
    println("El primer número elevado al segundo es: $potencia")
}