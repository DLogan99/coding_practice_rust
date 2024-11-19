import java.io.IO.*
import kotlin.math.pow

fun main (args: Array<String>) {
    println("This program is designed to find pi to the Nth digit, please specify N now:")
    val n = readLine()?.toInt()
    if (n == 0) { println("Here ya go: fuck you"); return }
    else if (n == 1) { println("Here ya go: 3"); return}
    val nth = n?.let { nth_digit(it) }
    println("Here ya go: $nth")
}

fun nth_digit (n: Int): Double {
    var nth: Double = 0.0
    val mult = 10.0.pow(n-1)
    nth = (Math.PI * mult).toInt().toDouble()/mult
    return nth
}