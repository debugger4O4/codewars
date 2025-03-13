package kyu_7.area_of_an_arrow.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static void doTest(int a, int b, double expected) {
        assertEquals(expected, Solution.arrowArea(a, b), 1e-10,
                "arrowArea(" + a + ", " + b + ") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(4, 2, 2);
        doTest(7, 6, 10.5);
        doTest(25, 25, 156.25);
    }
}
