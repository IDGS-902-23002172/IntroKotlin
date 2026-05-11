

fun mostrarMayor(v1: Int, v2: Int, v3:Int){
    println("Mayor:")
    if(v1 > v2 && v1 > v3){
        println(v1)
    }else if(v2 > v3){
        println(v2)
    }else{
        println(v3)
    }
}




fun main(){
    limpiarPantalla()
    println("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    println("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    println("Ingrese el tercer valor:")
    val valor3 = readln().toInt()
    
    mostrarMayor(valor1, valor2, valor3)
}

