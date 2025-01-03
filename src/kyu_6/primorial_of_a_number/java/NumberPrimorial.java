package kyu_6.primorial_of_a_number.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberPrimorial {
    @Test
    public void checkSmallValues() {
        assertEquals(  "30", Primorial.numPrimorial(3));
        assertEquals( "210", Primorial.numPrimorial(4));
        assertEquals("2310", Primorial.numPrimorial(5));
    }
    @Test
    public void checkLargerValues() {
        assertEquals(  "9699690", Primorial.numPrimorial(8));
        assertEquals("223092870", Primorial.numPrimorial(9));
    }
}
