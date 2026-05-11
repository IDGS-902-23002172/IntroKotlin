import kotlin.math.*

/*

Crear un programa que permita calcular el área de 4 figuras, 
mostrara un menú para elegir la figura a calcular el área, 
pedirá los valores necesarios y mostrara el resultado, a continuación,
mostrara nuevamente el menú termina al elegir opción 5

*/

fun menuFiguras(): Int{
    println("Ingrese la figura que quiera calcular")
    println("""
    1. Cuadrado 
    2. Rectangulo
    3. Circulo
    4. Triangulo
    5. Salir
    """)

    return readln().toInt()
}

fun areaCuadrado(lado:Double): Double {
    val res = lado*lado
    return res
}

fun areaRectangulo(base:Double, altura:Double): Double{
    val res = base*altura
    return res
}

fun areaCirculo(radio:Double):Double{
    val res = radio.pow(2)*PI
    return res

}

fun areaTriangulo(base: Double, altura: Double): Double{
    val res = (base*altura)/2

    return res

}

fun limpiarPantalla(){
    ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor()
}

fun main(){
    var opc : Int

    do{
        limpiarPantalla()
        opc = menuFiguras()
        when (opc){
            1 -> {
                println("Ingrese el lado del cuadrado")
                val lado = readln().toDouble()
                println("El area del cuadrado es: ${areaCuadrado(lado)}")
            }
            2 -> {
                println("Ingrese la base del rectangulo")
                val base = readln().toDouble()
                println("Ingrese la altura del rectangulo")
                val altura = readln().toDouble()
                println("El area del rectangulo es: ${areaRectangulo(base,altura)}")
            }
            3 -> {
                println("Ingrese el radio del circulo")
                val radio = readln().toDouble()
                println("El area del circulo es: ${areaCirculo(radio)}")
            }
            4 -> {
                println("Ingrese la base del triangulo")
                val base = readln().toDouble()
                println("Ingrese la altura del triangulo")
                val altura = readln().toDouble()
                println("El area del triangulo es: ${areaTriangulo(base,altura)}")
            }
            5 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opcion no valida")
            }
        }
    }while (opc != 5)

}