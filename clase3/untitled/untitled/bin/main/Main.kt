package org.example
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import  kotlin.coroutines.*




data class Veiculo(var marca: String,var modelo: String,var anio : Int, var kilometraje: Int=0){
    fun conducir(distancia: Int){
        kilometraje = kilometraje + distancia
    }

    fun describir():String{
        return "Veiculo $marca"+"-"+" $modelo"+"$anio - $kilometraje"
    }
}


suspend fun retornarDatos() : String {
    delay(2000)
    return "Datos obtenidos"
}



fun main(): Unit = runBlocking {
    var civic = Veiculo("Honda", "Civic", 2000).apply {
        kilometraje = 200
        conducir(100)
        println(describir())
    }

    var v16 : Veiculo ? = Veiculo("Nissan", "V16", 1992)
    v16?.let{
        it.conducir(1000000)
        println(it.describir())
    }
    val datosNuevos = retornarDatos()
    println(datosNuevos)

    civic.apply {
        conducir(100)
        println(civic.describir())
    }

}