package FundamentosKotlin.Reto_2

class Cancion {
    var nombre: String
    var artista: String
    var year: Int
    var reproducciones: Int
    var popular:Boolean

    constructor(nombre: String, artista: String, year: Int, reproducciones: Int) {
        this.nombre = nombre
        this.artista = artista
        this.year = year
        this.reproducciones = reproducciones
        if(reproducciones>=1000){
            this.popular = true
        }else{
            this.popular= false
        }
    }
    fun print(){
        if(popular){
            println("       $nombre, interpretada por $artista, se lanzó en $year y tiene $reproducciones reproducciones, es popular")
        }else{
            println("       $nombre, interpretada por $artista, se lanzó en $year y tiene $reproducciones reproducciones, no es popular")
        }
    }
}
class album {
    var canciones: MutableList<Cancion>
    var popular:String =""
    var nombre:String
    var type:String

    constructor(canciones: MutableList<Cancion>, nombre: String,type: String){
        this.canciones=canciones
        this.nombre=nombre
        this.type=type
        var rep:Int = 0
        for (i:Int in 0..<canciones.size){
            if(canciones[i].reproducciones>rep){
                println("si")
                rep = canciones[i].reproducciones
                popular = canciones[i].nombre
            }
        }

    }
    fun print() {
        println("$nombre:")
        println("   Tipo: $type")
        println("   Canciones:")
        for(i:Int in 0..<canciones.size){
            canciones[i].print()
        }
    }
}
fun main(){
    println("Por favor escriba cuántas canciones tiene el álbum: ")
    val canciones: Int = readLine()!!.toInt()
    var nombre: String
    var artista: String
    var year: Int
    var rep: Int
    val album = mutableListOf<Cancion>()
    println("Escriba el nombre del álbum:")
    val nombreA: String = readLine()!!
    println("Escriba el tipo de música del álbum:")
    val TipoA:String  = readLine()!!

    for (i in 1..canciones) {
        println("Nombre de la canción $i: ")
        nombre = readLine()!!.toString()

        println("Nombre del artista: ")
        artista = readLine()!!.toString()

        println("Año de lanzamiento: ")
        year = readLine()!!.toInt()

        println("Número de reproducciones: ")
        rep = readLine()!!.toInt()
        var a = Cancion(nombre, artista, year, rep)
        album.add(a)
    }
    val albumFinal:album = album(album,nombreA,TipoA)
    albumFinal.print()
}