package kyu_6.simple_simple_simple_string_sxpansion.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun sampleTestCases() {
        assertEquals("DDDaadddddff", stringExpansion("3D2a5d2f"))
        assertEquals("aaabbbccc", stringExpansion("3abc"))
        assertEquals("abcd", stringExpansion("abcd"))
    }
}