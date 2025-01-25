package kyu_7.nice_array.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTest() {
        assertEquals(true, Kata.isNice(new Integer[]{1,2,3,4,5}));
        assertEquals(true, Kata.isNice(new Integer[]{5,4,3,2,1}));
        assertEquals(false, Kata.isNice(new Integer[]{1,3,5,2}));
        assertEquals(false, Kata.isNice(new Integer[]{10,10,2,2,3}));
        assertEquals(false, Kata.isNice(new Integer[]{}));
        assertEquals(false, Kata.isNice(new Integer[]{1}));
    }
}
