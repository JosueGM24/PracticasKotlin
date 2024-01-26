import kotlin.math.sqrt

fun main() {
    var opcion: Int

    do {
        println("Menú de programas:")
        println("1. Generar un rombo de asteriscos")
        println("2. Encontrar la raíz cuadrada de un número")
        println("3. Agregar nombres de alumnos a una lista")
        println("4. Salir")

        print("Ingrese la opción deseada: ")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> generarRombo()
            2 -> encontrarRaizCuadrada()
            3 -> agregarNombresAlumnos()
            4 -> println("Saliendo del programa.")
            else -> println("Opción no válida. Por favor, elija una opción del menú.")
        }

    } while (opcion != 0)
}

fun generarRombo() {
    print("Ingrese el número límite para el rombo: ")
    val limite = readLine()!!.toInt()

    // Generar la mitad superior del rombo
    for (i in 1..limite) {
        for (j in 1..(limite - i)) {
            print(" ")
        }
        for (k in 1..i) {
            print("* ")
        }
        println()
    }

    // Generar la mitad inferior del rombo
    for (i in (limite - 1) downTo 1) {
        for (j in 1..(limite - i)) {
            print(" ")
        }
        for (k in 1..i) {
            print("* ")
        }
        println()
    }
}

fun encontrarRaizCuadrada() {
    print("Ingrese un número para encontrar su raíz cuadrada: ")
    val numero = readLine()!!.toDouble()

    val raizCuadrada = sqrt(numero)
    println("La raíz cuadrada de $numero es: $raizCuadrada")
}

fun agregarNombresAlumnos() {
    val listaAlumnos = mutableListOf<String>()

    print("Ingrese el nombre del alumno (o 'fin' para salir): ")
    var nombre = readLine()!!

    while (nombre != "fin") {
        listaAlumnos.add(nombre)
        print("Ingrese el nombre del siguiente alumno (o 'fin' para salir): ")
        nombre = readLine()!!
    }

    println("Nombres de alumnos agregados a la lista: $listaAlumnos")
}
