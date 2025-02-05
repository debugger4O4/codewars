package kyu_7.how_many_consecutive_numbers_are_needed.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void exampleTests() {
        assertEquals(Kata.consecutive(new int[]{4,8,6}), 2);
        assertEquals(Kata.consecutive(new int[]{1,2,3,4}), 0);
        assertEquals(Kata.consecutive(new int[]{}), 0);
        assertEquals(Kata.consecutive(new int[]{1}), 0);
    }
}
