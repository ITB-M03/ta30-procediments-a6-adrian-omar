package controllers

import java.util.Scanner

/**
 * @since 09/12/2024
 * @author Adrian Galinsoga
 *
 * Implementa un programa que permeti gestionar la reserva de seients d'una sala de cinema.
 * La sala té 20 files i 15 seients per fila. El programa ha de permetre:
 * - Buidar la sala
 * - Visualitzar els seients disponibles
 * - Reservar un seient
 * - Sortir del programa
 */

val scanner = Scanner(System.`in`)
val sala = Array(20) { Array(15) { '_' } }

/**
 * Funció principal que inicia el programa de gestió de la sala de cinema.
 */

fun main() {
    menu()
}


/**
 * Mostra un menú interactiu i gestiona les opcions de l'usuari.
 */

fun menu() {
    while (true) {
        println("\nMenú:")
        println("a) Buidar sala")
        println("b) Visualitzar seients disponibles")
        println("c) Reserva de seients")
        println("d) Sortir")
        val opcio = scanner.next()

        when (opcio) {
            "a" -> buidarSala()
            "b" -> mostrarSala()
            "c" -> reservarSeient()
            "d" -> {
                println("Gràcies per utilitzar el programa. Fins aviat!")
                return
            }
            else -> println("Opció no vàlida. Si us plau, selecciona una opció correcta.")
        }
    }
}

/**
 * Buidar sala: Prepara la sala per a la següent projecció de la pel·lícula, marcant
 * tots els seients com a lliures.
 */
fun buidarSala() {
    for (i in sala.indices) {
        for (j in sala[i].indices) {
            sala[i][j] = '_'
        }
    }
    println("Sala buidada. Tots els seients estan lliures.")
}

/**
 * Visualitzar seients disponibles: El programa mostrarà una graella corresponent
 * als seients de la sala. Si el seient està reservat es mostrarà una ics (X) i si està
 * lliure es mostrarà un subratllat (_).
 */

fun mostrarSala() {
    for (fila in sala) {
        for (seient in fila) {
            print("$seient ")
        }
        println()
    }
}


/**
 * Reserva de seients: El programa demanarà les coordenades (fila i butaca) del
 * seient que es vol reservar. Després, comprovarà que estigui lliure i, si és així,
 * el marcarà com a reservat.
 */

fun reservarSeient() {
    print("Introdueix el número de fila (1-20): ")
    val fila = scanner.nextInt() - 1
    print("Introdueix el número de seient (1-15): ")
    val seient = scanner.nextInt() - 1

    if (fila in 0 until 20 && seient in 0 until 15) {
        if (sala[fila][seient] == '_') {
            sala[fila][seient] = 'X'
            println("Seient a la fila ${fila + 1}, seient ${seient + 1} reservat.")
        } else {
            println("Ho sentim, aquest seient ja està reservat.")
        }
    } else {
        println("Fila o seient no vàlid. Torna-ho a provar.")
    }
}



