package kyu_6.ip_validation.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class SolutionTest {
    @Test
    fun `Sample Tests`() {
        assertEquals(true, isValidIp("0.0.0.0"), "Failed for input: \"0.0.0.0\"")
        assertEquals(true, isValidIp("12.255.56.1"), "Failed for input: \"12.255.56.1\"")
        assertEquals(true, isValidIp("137.255.156.100"), "Failed for input: \"137.255.156.100\"")

        assertEquals(false, isValidIp(""), "Failed for input: \"\"")
        assertEquals(false, isValidIp("abc.def.ghi.jkl"), "Failed for input: \"abc.def.ghi.jkl\"")
        assertEquals(false, isValidIp("123.456.789.0"), "Failed for input: \"123.456.789.0\"")
        assertEquals(false, isValidIp("12.34.56"), "Failed for input: \"12.34.56\"")
        assertEquals(false, isValidIp("12.34.56.00"), "Failed for input: \"12.34.56.00\"")
        assertEquals(false, isValidIp("12.34.56.7.8"), "Failed for input: \"12.34.56.7.8\"")
        assertEquals(false, isValidIp("12.34.256.78"), "Failed for input: \"12.34.256.78\"")
        assertEquals(false, isValidIp("1234.34.56"), "Failed for input: \"1234.34.56\"")
        assertEquals(false, isValidIp("pr12.34.56.78"), "Failed for input: \"pr12.34.56.78\"")
        assertEquals(false, isValidIp("12.34.56.78sf"), "Failed for input: \"12.34.56.78sf\"")
        assertEquals(false, isValidIp("12.34.56 .1"), "Failed for input: \"12.34.56 .1\"")
        assertEquals(false, isValidIp("12.34.56.-1"), "Failed for input: \"12.34.56.-1\"")
        assertEquals(false, isValidIp("123.045.067.089"), "Failed for input: \"123.045.067.089\"")
        assertEquals(false, isValidIp(" 12.34.56.78"), "Failed for input: \" 12.34.56.78\"")
        assertEquals(false, isValidIp("12.+34.56.78"), "Failed for input: \"12.+34.56.78\"")
        assertEquals(false, isValidIp("12.34.56.78."), "Failed for input: \"12.34.56.78.\"")
        assertEquals(false, isValidIp("12.34..56.78"), "Failed for input: \"12.34..56.78\"")
        assertEquals(false, isValidIp(".12.34.56.78"), "Failed for input: \".12.34.56.78\"")
    }

}