package kyu_2.insane_coloured_triangles.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void examples() {
        assertEquals('B', Kata.triangle("B"));
        assertEquals('R', Kata.triangle("GB"));
        assertEquals('R', Kata.triangle("RRR"));
        assertEquals('B', Kata.triangle("RGBG"));
        assertEquals('G', Kata.triangle("RBRGBRB"));
        assertEquals('G', Kata.triangle("RBRGBRBGGRRRBGBBBGG"));

    }
}
