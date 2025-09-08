//TIP Para <b>ejecutar</b> el código, pulsa <shortcut actionId="Run"/> o
// Clic en el icono <icon src="AllIcons.Actions.Execute"/> en el canalón.
open class Persona{
    var nombre: String = ""
    var apellido: String = ""
    var edad: Byte = 0
        set(value) {
            if (value < 0)
                field = 0
            else
                field = value
        }
    fun mostrarInfo(){
        println("${nombre} ${apellido} ${edad}")
    }
    constructor(nombre: String, apellido: String, edad: Byte){
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
    }

}

class Estudiante : Persona("Daniel", "Toro", 18){

}

fun main() {
    val persona = Persona(nombre = "Viviana", apellido = "Rojas", edad = 52)
    val estudiante = Estudiante()

    //persona.nombre = "Viviana"
    //persona.apellido = "Rojas"
    //persona.edad = 52
    //println(persona.edad)

    persona.mostrarInfo() //este muestra lo que es el constructor en el fun main
    estudiante.mostrarInfo()
}