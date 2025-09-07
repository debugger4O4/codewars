package kyu_7.reversing_fun.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    void sampleTests() {
        doTest("0", "0");
        doTest("", "");
        doTest("012", "201");
        doTest("012345", "504132");
        doTest("0123456789", "9081726354");
        doTest("Hello", "oHlel");
        doTest("4ppso1vdjc9rjyf5bkmd5nztr8", "84rptpzsno51dvmdkjbc59fryj");
    }
    private static void doTest(String input, String expected) {
        String message = String.format("for input \"%s\"\n", input);
        String actual = FunReverse.funReverse(input);
        assertEquals(expected, actual, message);
    }
}
