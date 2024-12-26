package kyu_8.never_visit_a.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTest() {
        assertEquals("apple", Kata.subtractSum(10));
        assertEquals("apple", Kata.subtractSum(9878));
        assertEquals("apple", Kata.subtractSum(4401));
    }
}
