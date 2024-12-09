package org.example.controllers
import java.util.*

/**
 * @author Adrian Galinsoga
 * @since 09/12/2024
 * Dissenya un procediment mostraPunt que mostri per pantalla un punt. Un
 * punt on p.x val 2.0 i p.y val 0.2 es mostrarà en pantalla així: (2.000000,0.200000).
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix el valor de x: ")
    val x = scanner.nextFloat()
    print("Introdueix el valor de y: ")
    val y = scanner.nextFloat()
    val punt = Punt(x, y)
    mostraPunt(punt)
}
/**
 * Classe que representa un punt al pla cartesià amb coordenades 'x' i 'y'.
 * @property x Valor de la coordenada a l'eix x.
 * @property y Valor de la coordenada a l'eix y.
 */
data class Punt(
    var x: Float,
    var y: Float
)

/**
 * Funció que mostra per consola les coordenades d'un punt en un format específic.
 * @param p El punt que es mostrarà.
 */
fun mostraPunt(p: Punt) {
    println("(${String.format("%.6f", p.x)}, ${String.format("%.6f", p.y)})")
}
