package kyu_7.reverse_the_bits_in_an_integer.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void fixedTests() {
        assertEquals("Failed for n = 417:\n", 267, BitsOfInteger.reverseBits(417));
        assertEquals("Failed for n = 267:\n", 417, BitsOfInteger.reverseBits(267));
        assertEquals("Failed for n = 0:\n", 0, BitsOfInteger.reverseBits(0));
        assertEquals("Failed for n = 2017:\n", 1087, BitsOfInteger.reverseBits(2017));
        assertEquals("Failed for n = 1023:\n", 1023, BitsOfInteger.reverseBits(1023));
        assertEquals("Failed for n = 1024:\n", 1, BitsOfInteger.reverseBits(1024));
    }
}

