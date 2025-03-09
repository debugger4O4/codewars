package kyu_7.even_or_odd_which_is_greater.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    private static void doTest(String str, String expected) {
        assertEquals(expected, Kata.evenOrOdd(str),
                "evenOrOdd(\"" + str + "\") returned an incorrect result.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("12", "Even is greater than Odd");
        doTest("123", "Odd is greater than Even");
        doTest("112", "Even and Odd are the same");
    }
}

