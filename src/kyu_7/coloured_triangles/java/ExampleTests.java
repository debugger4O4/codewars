// https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111/train/java

package kyu_7.coloured_triangles.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals('R', Kata.triangle("GB"));
        assertEquals('R', Kata.triangle("RRR"));
        assertEquals('B', Kata.triangle("RGBG"));
        assertEquals('G', Kata.triangle("RBRGBRB"));
        assertEquals('G', Kata.triangle("RBRGBRBGGRRRBGBBBGG"));
        assertEquals('B', Kata.triangle("B"));
    }
}
