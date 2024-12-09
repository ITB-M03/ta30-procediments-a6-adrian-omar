package org.example.controllers

import java.util.*

/**
 * @author Adrian Galinsoga
 * @since 09/12/2024
 *
 *L’operació de translació permet desplaçar un punt de coordenades (x, y) a
 * (x+a, y+b), sent el desplaçament (a, b) un altre punt. Implementa un
 * procediment que rebi dos paràmetres del tipus Punt i modifiqui el primer de
 * forma que es traslladi el que indica el desplaçament. Recorda que els
 * procediments no han de retornar cap valor.
 *
 */
fun main() {
    val scanner = Scanner(System.`in`)

    println("Introdueix les coordenades del punt inicial (x y): ")
    val xInicial = scanner.nextFloat()
    val yInicial = scanner.nextFloat()

    println("Introdueix les coordenades del desplaçament (a b): ")
    val a = scanner.nextFloat()
    val b = scanner.nextFloat()

    val puntInicial = Punt2(xInicial, yInicial)
    val desplacament = Punt2(a, b)

    println("Punt inicial: (${puntInicial.x}, ${puntInicial.y})")
    trasladarPunt(puntInicial, desplacament)
    println("Després del desplaçament: (${puntInicial.x}, ${puntInicial.y})")
}

/**
 * Classe que representa un punt amb coordenades X i Y.
 * @property x Coordenada X del punt.
 * @property y Coordenada Y del punt.
 */
data class Punt2 (
    var x: Float,
    var y: Float
)
/**
 * Funció que realitza la translació d'un punt segons un desplaçament.
 * @param punt Punt a ser desplaçat.
 * @param desplacament Punt que indica el desplaçament.
 */
fun trasladarPunt(punt: Punt2, desplacament: Punt2) {
    punt.x += desplacament.x
    punt.y += desplacament.y
}
/**
 * Sol·licita les coordenades del punt inicial i del desplaçament,
 * aplica la translació i mostra els resultats.
 */

