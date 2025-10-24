package kyu_6.tricky_kotlin_0_extension_constructor.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.util.*

class KotlinTricks0 {
    @Test
    fun testInt() {
        val r = Random(System.currentTimeMillis())
        (0..100).forEach { r.nextInt().let { assertEquals(it, kotlin.Int(it.toString())) } }
    }
}