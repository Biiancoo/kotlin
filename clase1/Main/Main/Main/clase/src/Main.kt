import kotlin.compareTo

open class Persona(){
    var nombre: String = ""
    var edad: Int =0


    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }


    open override fun presentarse(){
        println("Mi nombre es :"+nombre)
    }
}


class Empleado : Persona{
    val puesto: String
    private val salario: Double

    constructor(nombre: String,edad: Int,puesto: String,salario: Double) : super(nombre,edad){
        this.puesto = puesto
        this.salario = salario
    }

    fun mostrarPuesto(){
        println(nombre + "trabaja como" + puesto)
    }

    override fun presentarse() {
        println("Hola, soy "+nombre + "  y mi puesto es "+puesto)
    }


}





fun main() {
    val persona = Persona("Nicolas Maduro",11)
    val empleado = Empleado("Elvis",11,"Soporte",222222)

    persona.presentarse()
    empleado.presentarse()
}