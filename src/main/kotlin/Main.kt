import kotlin.math.sqrt

fun main() {
    while (true) {
        println("1. Números primos\n2. Potencia de un número\n3. Ecuación de segundo grado\n4. Ordenamiento\n5. Salir")
        when (readLine()!!.toInt()) {
            1 -> primeNumbers()
            2 -> powerOfNumber()
            3 -> quadraticEquation()
            4 -> sorting()
            5 -> return
        }
    }
}

fun primeNumbers() {
    println("Ingrese un número:")
    val limit = readLine()!!.toInt()
    var start = if (limit < 0) limit else 1
    while (start <= limit) {
        if (isPrime(start)) {
            println(start)
        }
        start++
    }
}

fun isPrime(num: Int): Boolean {
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

fun powerOfNumber() {
    println("Ingrese la base:")
    val base = readLine()!!.toDouble()
    println("Ingrese el exponente:")
    val exponent = readLine()!!.toDouble()
    val result = if (exponent < 0) 1 / genericPow(base, -exponent) else genericPow(base, exponent)
    println("El resultado es: $result")
}

fun genericPow(base: Double, exponent: Double): Double {
    var result = 1.0
    for (i in 1..exponent.toInt()) {
        result *= base
    }
    return result
}

fun quadraticEquation() {
    println("Ingrese los coeficientes a, b y c de la ecuación cuadrática:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    calculate(a, b, c)
}

fun calculate(a: Double, b: Double, c: Double) {
    val discriminant = b * b - 4.0 * a * c
    if (discriminant >= 0) {
        val root1 = (-b + sqrt(discriminant)) / (2 * a)
        val root2 = (-b - sqrt(discriminant)) / (2 * a)
        println("Las raíces son: $root1 y $root2")
    } else {
        val realPart = -b / (2 * a)
        val imaginaryPart = sqrt(-discriminant) / (2 * a)
        println("Las raíces son: $realPart + $imaginaryPart i y $realPart - $imaginaryPart i")
    }
}

fun sorting() {
    println("Ingrese la cantidad de nombres:")
    val count = readLine()!!.toInt()
    val lstNombres = mutableListOf<String>()
    var i = 0
    while (i < count) {
        println("Ingrese el nombre ${i + 1}:")
        lstNombres.add(readLine()!!)
        i++
    }
    lstNombres.sort()
    for ((index, name) in lstNombres.withIndex()) {
        println("[$index]=> $name")
    }
}
