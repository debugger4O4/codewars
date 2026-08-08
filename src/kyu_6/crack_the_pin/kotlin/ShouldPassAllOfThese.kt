package kyu_6.crack_the_pin.kotlin

import kotlin.test.assertEquals
import org.junit.Test

class ShouldPassAllOfThese {
    @Test
    fun SimplePIN() {
        assertEquals("12345", crack("827ccb0eea8a706c4c34a16891f84e7b"))
    }
    @Test
    fun HarderPIN() {
        assertEquals("00078", crack("86aa400b65433b608a9db30070ec60cd"))
    }
}
