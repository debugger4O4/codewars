package kyu_7.steps.kotlin

import groovy.test.GroovyTestCase.assertEquals
import org.junit.Test
import kotlin.random.Random
import kotlin.math.pow

class StepsTest {

    @Test
    fun sampleTests() {
        val random = Random.Default
        val n = random.nextInt(1, Int.MAX_VALUE) // Random number between 1 and Int.MAX_VALUE
        assertEquals(0, step(n, n))

        assertEquals(0, step(45, 45))
        assertEquals(1, step(45, 46))
        assertEquals(2, step(45, 47))
        assertEquals(3, step(45, 48))
        assertEquals(4, step(45, 50))
        assertEquals(5, step(45, 52))
        assertEquals(6, step(45, 55))
        assertEquals(7, step(45, 58))

        assertEquals(10, step(45, 71))

        // Stress Test
        assertEquals(92681, step(1, (2.0.pow(31).toInt())))
    }
}
