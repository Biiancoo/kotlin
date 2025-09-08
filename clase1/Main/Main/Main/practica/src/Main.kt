open class Persona{
    var nombre: String =""
    var edad: Int=0
        set(value) {
            if (value < 0)
                field = 0
            else
                field = value
        }


    constructor(nombre: String,edad: Int){
        this.nombre = nombre
        this.edad = edad
    }

    fun presentarse(){
        println("Hola mi nombre es ${nombre}")
    }


}


class Empleado : Persona("",0)

fun main() {
    val persona = Persona("",0)
    val empleado = Empleado()

    persona.nombre = "Nicolas maduro"

}