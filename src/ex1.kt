fun main() {
    println(quadrat(llegirEnter()))
}

fun llegirEnter(): Int {
    var num: Int?
    do {
        num = readln().toIntOrNull()
        if (num == null) {
            println("Posa un enter")
        }
    }while (num == null)
    return num
}

fun quadrat(num: Int): Int {
    return num*num
}

