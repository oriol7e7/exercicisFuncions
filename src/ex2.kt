fun main() {
    var num1: Int?
    var num2: Int?
    do {
        println("Posa dos numeros")
        num1 = readln().toIntOrNull()
        num2 = readln().toIntOrNull()
        if (num1 == null || num2 == null) {
            println("Posa un enter")
        }
    }while (num1 == null || num2 == null)
    if (compararNums(num1, num2)) {
        println("El primer nombre es major que el segon")
    }else {
        println("No ho es")
    }
}

fun compararNums(num1: Int, num2: Int): Boolean {
    return if (num1>num2) {
        true
    } else {
        false
    }
}