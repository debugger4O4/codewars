package kyu_8.get_ascii_value_of_character.kotlin

import groovy.test.GroovyTestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals(65, getAscii('A'))
        assertEquals(32, getAscii(' '))
        assertEquals(33, getAscii('!'))
    }
}