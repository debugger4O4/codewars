package kyu_7.easy_line.kotlin

import org.junit.Assert.*
import java.math.BigInteger
import org.junit.Test

class EasylineTest {
    private fun testing(actual:BigInteger, expected:BigInteger) {
        assertEquals(expected, actual)
    }
    @Test
    fun test1() {
        testing(easyLine(7), BigInteger("3432"))
        testing(easyLine(13), BigInteger("10400600"))

    }

}
