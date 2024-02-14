package Retos
class Reto2 {
}

fun main(){

    println("Ingrese el peso del bebe: ")
    var pesobebe = readln()!!.toInt()

    println("Ingrese los meses del bebe: ")
    var mesesbebe = readln()!!.toInt()

    var resultado = dosisvacuna(pesobebe, mesesbebe)

    println("la dosis de la vacuna es : $resultado")
}

fun dosisvacuna(pesobebe:Int, mesesbebe:Int):Int{

    var dosis = (pesobebe +10)*8/(mesesbebe*10)

    return dosis
}