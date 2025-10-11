package kyu_8.enumerable_magic_does_my_list_include_this.kotlin

import groovy.test.GroovyTestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic Tests`() {
        assertEquals(true, include(intArrayOf(1,2,3,4), 2))
        assertEquals(false, include(intArrayOf(1,2,4,5), 3))
    }
}