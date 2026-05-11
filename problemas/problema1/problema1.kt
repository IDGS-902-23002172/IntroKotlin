/*
Problema: Un programa solicita al usuario ingresar el diámetro de una tubería.
No se permiten valores negativos o cero. 
El programa debe pedir el dato repetidamente hasta que el usuario ingrese un valor válido.
*/

fun main(){

    do{
        println("Ingrese un diametro mayor a cero:")
        val diametro = readln().toInt()
        if (diametro > 0){
           println("El valor de diametro es $diametro")
        }else
            println("Diametro invalido")
        
    } while(diametro <= 0)

}


