package kyu_6.simpsons_rule_approximate_integration.kotlin

import org.junit.Assert.*
import org.junit.Test
import java.text.DecimalFormat

class SimpsonIntegrationTest {
    @Test
    fun test1() {
        println("Fixed Tests: simpson")
        assertFuzzyEquals(simpson(290), 1.9999999986)
        assertFuzzyEquals(simpson(72), 1.9999996367)

    }
    companion object {
        private fun assertFuzzyEquals(act:Double, exp:Double) {
            val inrange = Math.abs(act - exp) <= 1e-10
            if (inrange == false)
            {
                val df = DecimalFormat("#.0000000000")
                println("At 1e-10: Expected must be " + df.format(exp) + ", but got " + df.format(act))
            }
            assertEquals(true, inrange)
        }
    }
}