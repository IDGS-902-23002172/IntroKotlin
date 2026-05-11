
/*
Problema2: Una batería comienza con 0 de carga. 
Un cargador añade (15%) cada minuto. 
Se debe detener el ciclo cuando la carga llegue o supere el (100%).
*/

fun main(){
    var carga = 0
    do{
        carga += 15
        println("carga : $carga %")

    }while(carga < 100)

    println("La bateria esta cargada")

}

