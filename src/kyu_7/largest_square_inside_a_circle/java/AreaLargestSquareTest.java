package kyu_7.largest_square_inside_a_circle.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaLargestSquareTest {

    private static void doTest(int r, int expected) {
        assertEquals(expected, Kata.areaLargestSquare(r),
                "Incorrect answer for r = " + r + "\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(5, 50);
        doTest(7, 98);
        doTest(15, 450);
    }
}

