/*
Problema3: Un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar
una clave de seguridad.
*/

fun main(){
    var claveseg : String = "minion"

    for (i in 1..3) {
        println("Ingresa tu clave (Intento $i de 3):")
        val claveseg = readln()

        if(claveseg == "minion"){
            println("Acceso concedido")
            break
        } else {
            println("Clave incorrecta")
        } 
    }
       

}