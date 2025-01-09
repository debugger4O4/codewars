package kyu_7.nth_power_rules_them_all.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(30, Kata.modifiedSum(new int[] {1,2,3}, 3));
        assertEquals(30, Kata.modifiedSum(new int[] {1,2}, 5));
    }
}
