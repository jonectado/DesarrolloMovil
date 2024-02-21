package Estructuras_ciclicas

class piedra_papel_tijera {
}

fun main(){
    var lives = 3
    println("Va a jugar piedra, papel o tijeras contra un bot.")
    while (lives>0){
        val result:Int = (1..3).random()
        println("Tiene $lives vidas")
        println("Ingrese su apuesta: 1 = piedra, 2 = papel, 3 = tijeras")
        when(readln().toInt()){
            1 ->{
                when (result) {
                    1 -> {
                        println("Empate")
                    }
                    2 -> {
                        println("Usted pierde")
                        lives -= 1
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
                        lives -= 1
                    }
                }
            }
            3 ->{
                when (result) {
                    1 -> {
                        println("Usted pierde")
                        lives -= 1
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