// https://www.codewars.com/kata/6473603854720900496e1c82/train/kotlin

package kyu_7.steps.kotlin

fun step(x: Int, y: Int): Int {
    val d = y - x
    if (d == 0) return 0

    val k = Math.sqrt(d.toDouble()).toInt()

    return if (d == k * k) {
        2 * k - 1
    } else if (d <= k * k + k) {
        2 * k
    } else {
        2 * k + 1
    }
}

