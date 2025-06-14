package kyu_7.stanton_measure.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals(3, Kata.stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
    }
}
