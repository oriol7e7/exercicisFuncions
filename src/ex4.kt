fun main() {
    var num1: Double = demanaNums()
    var num2: Double = demanaNums()
    println(calculadora(num1, num2))
}

fun demanaNums():Double {
    var num:Double?
    do {
        println("Posa un enter")
        num = readln().toDoubleOrNull()
        if (num == null) {
            println("Error, posa un enter")
        }
    }while (num == null)
    return num
}

fun calculadora(num1: Double, num2: Double): Double {
    println("que vols fer? (1-Suma, 2-Resta, 3-Multiplicacio, 4 - Divisio)")
    var operacio: Int
    do {
        operacio = demanaNums().toInt()
        if (operacio !in 1..4) {
            println("Num incorrecte")
        }
    }while(operacio !in 1..4)
    
    when (operacio) {
        1 -> return suma(num1, num2)
        2 -> return resta(num1, num2)
        3 -> return multiplicacio(num1, num2)
        4 -> return divisio(num1, num2)
        else -> return 0.0
    }
}

fun suma(num1: Double, num2: Double): Double {
    return num1+num2
}

fun resta(num1: Double, num2: Double): Double {
    return num1-num2
}
fun multiplicacio(num1: Double, num2: Double): Double {
    return num1*num2
}
fun divisio(num1: Double, num2: Double): Double {
    return num1/num2
}

