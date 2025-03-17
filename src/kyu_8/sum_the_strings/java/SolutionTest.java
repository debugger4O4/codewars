package kyu_8.sum_the_strings.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static void doTest(String a, String b, String expected) {
        assertEquals(expected, Kata.sumStr(a, b),
                "sumStr(\"" + a + "\", \"" + b + "\") returned an incorrect result.\n\n");
    }

    @Test @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest("4", "5", "9");
        doTest("34", "5", "39");
        doTest("", "8", "8");
        doTest("9", "", "9");
        doTest("", "", "0");
    }
}

