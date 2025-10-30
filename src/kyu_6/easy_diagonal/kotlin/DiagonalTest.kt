package kyu_6.easy_diagonal.kotlin

import junit.framework.TestCase.assertEquals
import java.math.BigInteger
import org.junit.Test

class DiagonalTest {

    @Test
    fun basicTests() {
        assertEquals(BigInteger.valueOf(5985), Diagonal.diagonal(20, 3))
        assertEquals(BigInteger.valueOf(20349), Diagonal.diagonal(20, 4))
        assertEquals(BigInteger.valueOf(54264), Diagonal.diagonal(20, 5))

    }
}