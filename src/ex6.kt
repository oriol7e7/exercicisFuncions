fun main() {
    println("El preu a pagar es: \u001b[1;32m${String.format("%.2f", gestorDescompte(demanaPreu()))}€\u001b[0m")
}

fun demanaPreu(): Double {
    var preu: Double?
    var preuAcumulable: Double = 0.0
    do {
        do {
            println("Posa el preu del producte (posa no vulguis posar més productes)")
            preu = readln().toDoubleOrNull()
            if (preu == null || preu <0) {
                println("Error, posa un preu valid")
            }
        } while (preu == null)
        preuAcumulable+=preu
    }while(preu != 0.0)

   return preuAcumulable
}

fun gestorDescompte(preu: Double): Double {
    var nouPreu = preu
    print("Preu sense descompte: ")
    println("\u001b[1;31m${nouPreu}€\u001b[0m")
    if (esBlackFriday()) {
        nouPreu = ferEstafa(nouPreu)
        nouPreu = aplicaDescompte(nouPreu, 0.50)
    } else if (promoCiberMonday()) {
        nouPreu = ferEstafa(nouPreu)
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
    println("\u001b[1;32m Descompte ${percentatge*100}%\u001b[0m")
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


fun ferEstafa(preu: Double): Double {
    var nouPreu = preu + preu * 0.15
    nouPreu = aplicaDescompte(nouPreu, 0.20)
    return nouPreu
}

