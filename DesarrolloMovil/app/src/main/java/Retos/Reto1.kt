package Retos

class Reto1 {
}

fun main(){
    println("Ingrese los grados en Fahrenheit: ")
    var gradosF = readLine()!!.toInt()

    convertir(gradosF)
}
fun convertir(gradosF:Int) {

    var gradosC = (gradosF-32)/1.8

    println("Convertido es $gradosC")
}