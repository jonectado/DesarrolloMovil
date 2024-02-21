package Estructuras_ciclicas

class piedra_papel_tijera_sin_while {
}

fun main(){
    println("Va a jugar piedra, papel o tijeras contra un bot." +
            "Cuantas veces quiere jugar?")
    for (i in 1 .. readln()!!.toInt()){
        val result:Int = (1..3).random()
        println("Ingrese su apuesta: 1 = piedra, 2 = papel, 3 = tijeras")
        when(readln().toInt()){
            1 ->{
                when (result) {
                    1 -> {
                        println("Empate")
                    }
                    2 -> {
                        println("Usted pierde")
                    }
                    else -> {
                        println("Usted gana")
                    }
                }
            }
            2 ->{
                when (result) {
                    1 -> {
                        println("Usted gana")
                    }
                    2 -> {
                        println("Empate")
                    }
                    else -> {
                        println("Usted pierde")
                    }
                }
            }
            3 ->{
                when (result) {
                    1 -> {
                        println("Usted pierde")
                    }
                    2 -> {
                        println("Usted gana")
                    }
                    else -> {
                        println("empate")
                    }
                }
            }
        }
    }
    println("Fin del juego.")
}