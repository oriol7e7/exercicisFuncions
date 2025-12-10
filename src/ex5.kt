fun main() {
    println(comprovaNum(demanaValor()))
}

fun demanaValor(): Int{
    var num: Int?
    do {
        println("Posa un valor del 0 al 10")
        num = readln().toIntOrNull()
        if (num == null) {
            println("Error, posa un enter del 0 al 10")
        }
    }while (num == null)
    return num
}

fun comprovaNum(num: Int): Int{
    var num1 = num
    do {
        if (num1!in 0..10) {
            println("Error, posa un enter del 0 al 10")
            num1 = demanaValor()
        }
    }while (num1 !in 0..10)
    return num1
}