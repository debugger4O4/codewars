package kyu_7.sum_it_continuously

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class Tests {
    @Test
    @DisplayName("Sample tests")
    public fun sampleTests() {
        val testCases = arrayOf(
            // basics
            arrayOf(1, 2, 3, 4, 5) to arrayOf(1, 3, 6, 10, 15),
            arrayOf(2, 4, 6, 8, 10) to arrayOf(2, 6, 12, 20, 30),
            arrayOf(1, 8, 27, 64, 125) to arrayOf(1, 9, 36, 100, 225),
            arrayOf(1, 4, 9, 16, 25, 36) to arrayOf(1, 5, 14, 30, 55, 91),
            arrayOf(20, 21, 22, 23, 24, 25) to arrayOf(20, 41, 63, 86, 110, 135),

            // larger cases
            arrayOf(9, 18, 27, 36, 45, 54) to arrayOf(9, 27, 54, 90, 135, 189),
            arrayOf(6, 12, 18, 24, 30, 36, 42) to arrayOf(6, 18, 36, 60, 90, 126, 168),
            arrayOf(5, 10, 15, 20, 25, 30, 35, 40) to arrayOf(5, 15, 30, 50, 75, 105, 140, 180),
            arrayOf(7, 14, 21, 28, 35, 42, 49, 56) to arrayOf(7, 21, 42, 70, 105, 147, 196, 252),
            arrayOf(8, 16, 24, 32, 40, 48, 56, 64) to arrayOf(8, 24, 48, 80, 120, 168, 224, 288),

            // edge cases
            arrayOf(0) to arrayOf(0),
            arrayOf(-33) to arrayOf(-33),
            arrayOf(1, 2) to arrayOf(1, 3),
            arrayOf(0, 0, 0, 0) to arrayOf(0, 0, 0, 0),
            arrayOf(0, 3, 0, 0) to arrayOf(0, 3, 3, 3),
            arrayOf(0, 0, 0, 3) to arrayOf(0, 0, 0, 3),
            arrayOf(32, -9, 2, 0) to arrayOf(32, 23, 25, 25),
        )

        for ((testCase, expected) in testCases) {
            doTest(testCase, expected)
        }
    }

    private fun doTest(list: Array<Int>, expected: Array<Int>) {
        val actual = add(list)

        assertArrayEquals(
            expected,
            actual,
            "Test failed\n\nlist: [${list.joinToString(", ")}]\n\nexpected: [${expected.joinToString(", ")}]\nbut got: [${actual.joinToString(", ")}]\n\n",
        )
    }
}
