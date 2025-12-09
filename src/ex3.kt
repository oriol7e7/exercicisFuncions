fun main(){
    calculVolum(comprovarRadi())
}

fun comprovarRadi():Int {
    var radi: Int?
    do {
        println("Posa el radi")
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