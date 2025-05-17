package kyu_6.simple_prime_streaming.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void basicTests() {
        doTest(    2,  2, "57");
        doTest(   10,  3, "192");
        doTest(   20,  9, "414347535");
        doTest(   30, 12, "616771737983");
        doTest(   40,  8, "83899710");
        doTest(   50,  6, "031071");
        doTest(10000,  5, "02192");
        doTest(20000,  5, "09334");
    }
    private void doTest(int a, int b, String expected) {
        assertEquals(expected, SimplePrimeStreaming.solve(a, b));
    }
}
