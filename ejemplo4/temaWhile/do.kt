fun main(){
    var x = 1

    while(x<=10){
        println(x)
        x++
    }

    var cant = 0
    var suma = 0

    do{
        println("Ingrese un numero (0 para terminar):")
        val valor = readln().toInt()

        if(valor !=0){
            suma += valor
            cant ++
        }
    } while(valor != 0)
        if (cant != 0){
            val promedio = suma / cant
            print("El promedio es : $promedio")
        }else
            println("No se ingresaron valores")

}
