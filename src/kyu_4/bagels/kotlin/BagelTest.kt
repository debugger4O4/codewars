package kyu_4.bagels.kotlin

import org.junit.Test

class BagelTest {
	@Test
	fun testBagel() {
		org.junit.Assert.assertEquals((bagel as Bagel).value == 4, java.lang.Boolean.TRUE)
	}
}
