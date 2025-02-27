package kyu_7.summing_a_numbers_digits.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static void doTest(int num, int expected) {
        assertEquals(expected, Kata.sumDigits(num), String.format("Incorrect answer for num = %d\n\n", num));
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(10, 1);
        doTest(99, 18);
        doTest(-32, 5);
    }
}

