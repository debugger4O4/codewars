package kyu_7.previous_multiple_of_three.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test


class SampleTestCases {
    @Test
    fun sampleTestCases() {
        assertEquals(null, prevMultOfThree(1))
        assertEquals(null, prevMultOfThree(25))
        assertEquals(36, prevMultOfThree(36))
        assertEquals(12, prevMultOfThree(1244))
        assertEquals(9, prevMultOfThree(952406))
    }
}
