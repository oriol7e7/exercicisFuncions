fun main() {
    gestorMenu()
}

fun mostraMenu() {
    println(
        """
        Que vols calcular?
        1) Volum esfera
        2) Area Quadrat
        3) Area Rectangle
        4) Area triangle
    """.trimIndent()
    )
}

fun gestorMenu() {
    do {
        var opcio: Int?
        var continuar: String
        do {
            mostraMenu()
            opcio = readln().toIntOrNull()
            if (opcio == null || opcio !in 1..4) {
                println("Posa un valor correcte")
            }
        } while (opcio == null || opcio !in 1..4)
        when (opcio) {
            1 -> {
                println("El volum es: ${calculVolum(comprovarRadi())}")
            }

            2 -> {
                println("L'area del quadrat es: ${areaQuadrat(comprovaCostat())}")
            }

            3 -> {
                println("L'area del rectangle es: ${areaRectange(comprovaCostat(), comprovaCostat())}")
            }

            4 -> {
                println("L'area del triangle es ${areaTriange(comprovaCostatTriangle())}")
            }
        }
        do {
            println("Vols continuar? (s/n)")
            continuar = readln().lowercase()
            if (continuar != "s" && continuar != "n") {
                println("Posa s/n")
            }
        }while (continuar != "s" && continuar != "n")

    } while (continuar == "s")
}

fun comprovarRadi(): Double {
    var radi: Double?
    do {
        println("Posa el valor del radi")
        radi = readln().toDoubleOrNull()
        if (radi == null) {
            println("Posa un numero")
        }
    } while (radi == null)
    return radi
}

fun calculVolum(radi: Double): Double {
    return 4.0 / 3 * 3.14 * cub(radi)
}

fun cub(radi: Double): Double {
    return radi * radi * radi
}

fun comprovaCostat(): Double {
    var num: Double?
    do {
        println("Posa el valor d'un costat")
        num = readln().toDoubleOrNull()
        if (num == null) {
            println("Posa un numero")
        }
    } while (num == null)
    return num
}

fun areaQuadrat(costat: Double): Double {
    return costat * costat
}

fun areaRectange(costat1: Double, costat2: Double): Double {
    return costat1 * costat2
}

fun comprovaCostatTriangle(): DoubleArray {
    var base: Double?
    var altura: Double?
    do {
        println("Posa la base del triangle")
        base = readln().toDoubleOrNull()
        println("Posa la altura")
        altura = readln().toDoubleOrNull()
        if (base == null) {
            println("La base no es un numero")
        }else if(altura == null) {
            println("La altura no es un numero")
        }
    }while(base == null || altura == null)

    return doubleArrayOf(base, altura)
}

fun areaTriange(array: DoubleArray): Double {
    return (array[0] * array[1]) / 2
}