package kyu_7.difference_of_squares.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceOfSquaresTest {

    private static void doTest(int n, int expected) {
        assertEquals(expected, Kata.differenceOfSquares(n),
                "Incorrect answer for n = " + n + "\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(5, 170);
        doTest(10, 2640);
        doTest(100, 25164150);
    }
}

