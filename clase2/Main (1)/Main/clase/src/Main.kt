import kotlin.compareTo

open class Persona{
    // Atributos
    var nombre: String = ""
    var apellido: String = ""
    var edad: Int =0
        set(value) {
            if (value < 0)
                field = 0
            else
                field = value
        }


    constructor(nombre: String, apellido: String, edad: Int) {
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
    }


    fun mostrarDatos(){
        println("${nombre} ${apellido} ${edad}")
    }
}


class Estudiante : Persona("","",0){
}

fun main() {
    val persona = Persona("","",0)
    val estudiante = Estudiante()

    persona.nombre = "Lucho"
    persona.apellido = "Pontero"
    persona.edad= 11

    persona.mostrarDatos()
    estudiante.mostrarDatos()
}