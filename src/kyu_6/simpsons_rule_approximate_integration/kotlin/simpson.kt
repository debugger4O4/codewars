// https://www.codewars.com/kata/565abd876ed46506d600000d/train/kotlin

package kyu_6.simpsons_rule_approximate_integration.kotlin

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sin

fun simpson(n: Int): Double {
    val a = 0.0
    val b = PI
    val deltaX = (b - a) / n
    fun f(x: Double): Double = (3.0 / 2.0) * sin(x).pow(3)
    val s1 = (1..n / 2).sumOf { i -> f(a + (2 * i - 1) * deltaX) } // Нечётные узлы
    val s2 = (1 until n / 2).sumOf { i -> f(a + 2 * i * deltaX) }  // Чётные узлы
    return ((b - a) / (3 * n)) * (f(a) + f(b) + 4 * s1 + 2 * s2)
}