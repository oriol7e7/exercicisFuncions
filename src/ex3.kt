fun main(){
    gestorMenu(mostraMenu())
}

fun comprovarRadi():Int {
    var radi: Int?
    do {
        println("Posa el valor")
        radi = readln().toIntOrNull()
        if (radi == null) {
            println("Posa un enter")
        }
    }while(radi == null)
    return radi
}

fun calculVolum(radi: Int): Double {
    return 4.0 / 3 * 3.14 * cub(radi)
}

fun cub(radi:Int): Int {
    return radi*radi*radi
}

fun mostraMenu():Int {
    println("""
        Que vols calcular?
        1) Volum esfera
        2) Area Quadrat
        3) Area Rectangle
        4) Area triangle
    """.trimIndent())
    var opcio: Int?
    do {
        opcio = readln().toIntOrNull()
        if (opcio == null || opcio !in 1..4) {
            println("Posa un valor correcte")
        }
    }while (opcio == null || opcio !in 1..4)

    return opcio
}

fun gestorMenu(num: Int) {
    when(num) {
        1 -> calculVolum(comprovarRadi())
        2 -> println("""
            La area del quadrat es ${comprovarRadi()*comprovarRadi()}
        """.trimIndent())
    }
}