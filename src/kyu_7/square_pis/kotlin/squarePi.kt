// https://www.codewars.com/kata/5cd12646cf44af0020c727dd/train/kotlin

package kyu_7.square_pis.kotlin

import kotlin.math.ceil
import kotlin.math.sqrt

const val pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"

fun squarePi(digits: Int): Int {
    var result = 0.0;
    for (i in 0 until digits) {
        result += (pi[i] + "").toDouble() * (pi[i] + "").toDouble()
    }
    return ceil(sqrt(result)).toInt()
}