package kyu_7.plus_minus_plus_plus_count.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
//        assertEquals(0, catchSignChange(arrayOf(1, 3, 4, 5)));
//        assertEquals(0, catchSignChange(arrayOf<Int>()));
        assertEquals(2, catchSignChange(arrayOf(1, -3, -4, 0, 5)));
        assertEquals(3, catchSignChange(arrayOf(-47,84,-30,-11,-5,74,77)));
    }
}
