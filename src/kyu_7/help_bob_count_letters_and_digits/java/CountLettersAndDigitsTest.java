package kyu_7.help_bob_count_letters_and_digits.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersAndDigitsTest {

    private static void doTest(String s, int expected) {
        assertEquals(expected, Kata.countLettersAndDigits(s),
                "countLettersAndDigits(\"" + s + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("hel2!lo", 6);
        doTest("n!!_ice!!123", 7);
        doTest("1", 1);
        doTest("?", 0);
        doTest("", 0);
        doTest("12345f%%%t5t&/6", 10);
        doTest("aBcDeFg090", 10);
        doTest("u_n_d_e_r__S_C_O_R_E", 10);
    }

}
