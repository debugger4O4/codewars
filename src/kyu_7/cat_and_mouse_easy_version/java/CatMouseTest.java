package kyu_7.cat_and_mouse_easy_version.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatMouseTest {

    private static void doTest(String s, String expected) {
        assertEquals(expected, Kata.catMouse(s),
                "catMouse(\"" + s + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("C....m", "Escaped!");
        doTest("C..m", "Caught!");
        doTest("C.....m", "Escaped!");
        doTest("C.m", "Caught!");
        doTest("C...m", "Caught!");
        doTest("Cm", "Caught!");
    }
}

