package controllers
import java.util.*


/**
 * @author Adrian Galinsoga
 * @since 09/12/2024
 *
 * L’operació d’escalat transforma un punt (x, y) en un altre (a*x, a*y), on a és un
 * factor d’escala (float). Implementa un procediment que escali un punt d’acord
 * amb el factor d’escala que es subministri com a paràmetre. Recorda que els
 * procediments no han de retornar cap valor.
 */
fun main() {
    val scanner = Scanner(System.`in`)
    println("Introdueix les coordenades x i y del punt (separades per espai):")
    val x = scanner.nextFloat()
    val y = scanner.nextFloat()

    println("Introdueix el factor d'escala:")
    val factor = scanner.nextFloat()
    val puntInicial = Punt3(x, y)
    println("Punt inicial: (${puntInicial.x}, ${puntInicial.y})")

    escalarPunt(puntInicial, factor)
    println("Punt escalat (${factor}x): (${puntInicial.x}, ${puntInicial.y})")
}
/**
 * Representa un punt al pla amb coordenades x i y
 * @property x Coordenada x del punt
 * @property y Coordenada y del punt
 */

data class Punt3 (
    var x: Float,
    var y: Float
)

/**
 * Escala les coordenades d'un punt segons un factor d'escala donat
 * @param punt El punt a escalar
 * @param factorEscala El factor d'escala aplicat al punt
 */

fun escalarPunt(punt: Punt3, factorEscala: Float) {
    punt.x *= factorEscala
    punt.y *= factorEscala
}




