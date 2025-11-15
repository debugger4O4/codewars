package kyu_6.lottery_ticket.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals("Loser!", bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 2))
        assertEquals("Winner!", bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 1))
        assertEquals("Loser!", bingo(arrayOf("HGTYRE" to 74, "BE" to 66, "JKTY" to 74), 3))
    }
}
