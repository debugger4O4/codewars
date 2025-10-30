// https://www.codewars.com/kata/559b8e46fa060b2c6a0000bf/train/kotlin

package kyu_6.easy_diagonal.kotlin

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {
        var result = BigInteger.valueOf(1L)
        var i = BigInteger.valueOf(1L)
        while (i <= BigInteger.valueOf((p + 1).toLong())) {
            result = result * (BigInteger.valueOf(n.toLong()) - i + BigInteger.valueOf(2L)) / i
            i += BigInteger.valueOf(1L)
        }
        return result
    }
}