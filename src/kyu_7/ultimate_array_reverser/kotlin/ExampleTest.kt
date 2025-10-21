package kyu_7.ultimate_array_reverser.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
class ExampleTest {
    @Test
    fun fixedTest1() {
        assertEquals(listOf("!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"),
            reverse(listOf("I", "like", "big", "butts", "and", "I", "cannot", "lie!")))
    }
    @Test
    fun fixedTest2() {
        assertEquals(
            listOf("How", "many", "shrimp", "do", "you", "have", "to", "eat","before", "your", "skin", "starts", "to", "turn", "pink?"),
            reverse(listOf("?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH")))
    }
}