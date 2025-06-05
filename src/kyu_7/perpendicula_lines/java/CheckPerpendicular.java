package kyu_7.perpendicula_lines.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CheckPerpendicular {
    @Test
    public void basicTests() {
        assertEquals(0, Perpendicular.maxBisectors(0));
        assertEquals(0, Perpendicular.maxBisectors(1));
        assertEquals(1, Perpendicular.maxBisectors(2));
        assertEquals(2, Perpendicular.maxBisectors(3));
        assertEquals(4, Perpendicular.maxBisectors(4));
        assertEquals(6, Perpendicular.maxBisectors(5));
        assertEquals(9, Perpendicular.maxBisectors(6));
        assertEquals(650, Perpendicular.maxBisectors(51));
    }
}
