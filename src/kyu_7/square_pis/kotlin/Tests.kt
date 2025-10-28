package kyu_7.square_pis.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class Tests {
    @Test
    fun fixedTests() {
        assertEquals(8, squarePi(5))
        assertEquals(15, squarePi(10))
    }
}