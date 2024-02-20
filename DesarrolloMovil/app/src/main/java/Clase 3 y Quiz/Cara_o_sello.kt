package com.example.desarrollomovil.EstructurasAlgoritmicas

class Cara_o_sello {
}

fun main(){
    print("Juguemos cara o sello... Cuantas veces quieres jugar? ")
    var respuesta:String
    var n=1
    var nveces:Int = readln()!!.toInt()
    for(i in 1..nveces){
        var result:Int = (1..2).random()
        print("Escriba su apuesta: ")
        respuesta= readln().toString().uppercase()
        when(result){
            1 -> if(respuesta=="CARA"){
                print("Has ganado esta ronda\n")
            }
            else{
                print("Perdiste...\n")
            }
            2 -> if(respuesta =="SELLO"){
                print("Has ganado esta ronda\n")
            }else{
                print("Perdiste... \n")
            }
        }
    }

}