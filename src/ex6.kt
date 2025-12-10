fun main() {
    println("El preu a pagar es: ${gestorPreu(demanaPreu())}")
}

fun demanaPreu(): Double {
    var preu: Double?
    do {
        println("Posa el preu del producte")
        preu = readln().toDoubleOrNull()
        if (preu == null) {
            println("Error, posa un preu valid")
        }
    } while (preu == null)
    return preu
}

fun gestorPreu(preu: Double): Double {
    var nouPreu = preu
    if (esBlackFriday()) {
        nouPreu = aplicaDescompte(nouPreu, 0.50)
    } else if (promoCiberMonday()) {
        nouPreu = aplicaDescompte(nouPreu, 0.30)
    } else {
        if (esVip() || preu > 200.0) {
            nouPreu = aplicaDescompte(nouPreu, 0.20)
        }
    }
    return nouPreu
}

fun esVip(): Boolean {
    var vip: String
    do {
        println("Ets client VIP? (s/n)")
        vip = readln().lowercase()
        if (vip != "s" && vip != "n") {
            println("Error, posa un s/n")
        }
    } while (vip != "s" && vip != "n")
    if (vip == "s") {
        return true
    } else {
        return false
    }
}

fun aplicaDescompte(preu: Double, percentatge: Double): Double {
    println("Descompte ${percentatge*100}%")
    return preu - preu * percentatge
}

fun esBlackFriday(): Boolean {
    var opcio: String
    do {
        println("Es black friday? (s/n)")
        opcio = readln().lowercase()
        if (opcio != "s" && opcio != "n") {
            println("Error, posa un s/n")
        }
    } while (opcio != "s" && opcio != "n")
    if (opcio == "s") {
        return true
    } else {
        return false
    }
}


fun promoCiberMonday(): Boolean {
    println("Posa el codi promocional de CiberMonday")
    var codi: String = readln().uppercase()
    val CODI_CORRECTE: String = "CIBER-ASDF"
    if (codi == CODI_CORRECTE) {
        println("El codi introduit es correcte")
        return true
    } else {
        println("El codi introduit es incorrecte")
        return false
    }
}


