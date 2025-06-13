package kyu_3.binomial_expansion.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testBPositive() {
        assertEquals("1", KataSolution.expand("(x+1)^0"));
        assertEquals("x+1", KataSolution.expand("(x+1)^1"));
        assertEquals("x^2+2x+1", KataSolution.expand("(x+1)^2"));
    }

    @Test
    public void testBNegative() {
        assertEquals("1", KataSolution.expand("(x-1)^0"));
        assertEquals("x-1", KataSolution.expand("(x-1)^1"));
        assertEquals("x^2-2x+1", KataSolution.expand("(x-1)^2"));
    }

    @Test
    public void testAPositive() {
        assertEquals("625m^4+1500m^3+1350m^2+540m+81", KataSolution.expand("(5m+3)^4"));
        assertEquals("8x^3-36x^2+54x-27", KataSolution.expand("(2x-3)^3"));
        assertEquals("1", KataSolution.expand("(7x-7)^0"));
    }

    @Test
    public void testANegative() {
        assertEquals("625m^4-1500m^3+1350m^2-540m+81", KataSolution.expand("(-5m+3)^4"));
        assertEquals("-8k^3-36k^2-54k-27", KataSolution.expand("(-2k-3)^3"));
        assertEquals("1", KataSolution.expand("(-7x-7)^0"));
    }
}
