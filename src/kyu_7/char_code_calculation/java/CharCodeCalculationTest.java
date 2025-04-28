package kyu_7.char_code_calculation.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharCodeCalculationTest {

    private static void doTest(String s, int expected) {
        assertEquals(expected, Kata.calc(s),
                "calc(\"" + s + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("abcdef", 6);
        doTest("ifkhchlhfd", 6);
        doTest("aaaaaddddr", 30);
        doTest("jfmgklf8hglbe", 6);
        doTest("jaam", 12);
        doTest("M", 12);
        doTest("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 96);
    }
}
