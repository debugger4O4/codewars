package kyu_7.log_without_dates.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Tests")
class CheckLogsTests {
    @Test
    @DisplayName("Sample tests")
    fun tests() {
        doTest(arrayOf("12:12:12"), 1)
        doTest(arrayOf("00:00:00", "00:01:11", "02:15:59", "23:59:58", "23:59:59"), 1)
        doTest(arrayOf("12:00:00", "23:59:59", "00:00:00"), 2)
        doTest(arrayOf("12:00:00", "12:00:00", "00:00:00"), 3)
    }
    private fun doTest(log: Array<String>, expected: Int) {
        val msg = "Log=(" + log.joinToString() + ")"
        assertEquals(expected, checkLogs(log), msg)
    }
}