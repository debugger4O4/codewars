// https://www.codewars.com/kata/56e7d40129035aed6c000632/train/kotlin

package kyu_7.easy_line.kotlin

import java.math.BigInteger

fun easyLine(n: Int): BigInteger {
    return choose(2 * n, n)
}

fun choose(n: Int, k: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 0 until k) {
        result = result.multiply(BigInteger.valueOf(n - i.toLong()))
            .divide(BigInteger.valueOf((i + 1).toLong()))
    }
    return result
}