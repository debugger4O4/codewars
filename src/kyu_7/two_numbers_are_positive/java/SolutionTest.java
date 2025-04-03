package kyu_7.two_numbers_are_positive.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Two numbers are positive")
class SolutionTest {
    @Test @DisplayName("Sample Tests")
    void sampleTests() {
        assertTrue(Kata.twoArePositive(2, 4, -3), "(2, 4, -3)");
        assertTrue(Kata.twoArePositive(-4, 6, 8), "(-4, 6, 8)");
        assertTrue(Kata.twoArePositive(4, -6, 9), "(4, -6, 9)");
        assertTrue(Kata.twoArePositive(4, 6, 0), "(4, 6, 0)");
        assertFalse(Kata.twoArePositive(-4, 6, 0), "(-4, 6, 0)");
        assertFalse(Kata.twoArePositive(4, 6, 10), "(4, 6, 10)");
        assertFalse(Kata.twoArePositive(-14, -3, -4), "(-14, -3, -4)");
    }
}

