package kyu_7.changing_letters.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    private static void doTest(String input, String expected) {
        String actual = Kata.swap(input);
        String message = String.format("for input \"%s\"\n", input);
        assertEquals(expected, actual, message);
    }

    @Test
    void sampleTests() {
        doTest("HelloWorld!", "HEllOWOrld!");
        doTest("CodeWars", "COdEWArs");
        doTest("Sunday", "SUndAy");
        doTest("Monday", "MOndAy");
        doTest("Friday", "FrIdAy");
        doTest("@@@", "@@@");
        doTest("", "");
    }
}
