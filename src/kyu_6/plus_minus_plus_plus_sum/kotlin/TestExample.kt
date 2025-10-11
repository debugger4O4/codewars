package kyu_6.plus_minus_plus_plus_sum.kotlin

import groovy.test.GroovyTestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic Tests`() {
        assertEquals(true, getSolution(intArrayOf(1, 3, 4, 6, 8), -2))
        assertEquals(true, getSolution(intArrayOf(15, 2, 3), 10))
        assertEquals(false, getSolution(intArrayOf(1, 5, 3, 2, 5), -2))
    }
}