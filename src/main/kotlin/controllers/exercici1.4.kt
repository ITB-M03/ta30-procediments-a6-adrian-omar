package controllers
import java.util.*

/**
 * @author Adrian Galinsoga
 * @since 09/12/2024
 *
 * Implementa una funció que digui si dos punts són iguals.
 *
 */
fun main() {
    val scanner = Scanner(System.`in`)

    println("Introdueix les coordenades del primer punt (x y): ")
    val x1 = scanner.nextFloat()
    val y1 = scanner.nextFloat()
    val puntA = Punt4(x1, y1)

    println("Introdueix les coordenades del segon punt (x y): ")
    val x2 = scanner.nextFloat()
    val y2 = scanner.nextFloat()
    val puntB = Punt4(x2, y2)

    if (puntsIguals(puntA, puntB)) {
        println("Els punts són iguals.")
    } else {
        println("Els punts són diferents.")
    }
}

/**
 * Data class que representa un punt amb les coordenades [x] i [y].
 *
 * @property x La coordenada x del punt.
 * @property y La coordenada y del punt.
 */
data class Punt4(
    var x: Float,
    var y: Float
)

/**
 * Comprova si dos punts són iguals comparant les seves coordenades
 *
 * @param punt1 El primer punt
 * @param punt2 El segon punt
 * @return true si els punts són iguals, false si no ho són
 */
fun puntsIguals(punt1: Punt4, punt2: Punt4): Boolean {
    return punt1.x == punt2.x && punt1.y == punt2.y
}
