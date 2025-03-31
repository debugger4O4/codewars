package kyu_7.find_the_vowels.java;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VowelIndicesTest {

    private static void doTest(String wd, int[] expected) {
        int[] actual = Kata.vowelIndices(wd);
        assertArrayEquals(expected, actual, "Incorrect answer for word = \"" + wd + "\"\nExpected: " + Arrays.toString(expected) + "\nBut got :" + Arrays.toString(actual) + "\n\n");
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("mmm", new int[]{});
        doTest("apple", new int[]{1, 5});
        doTest("super", new int[]{2, 4});
        doTest("orange", new int[]{1, 3, 6});
        doTest("supercalifragilisticexpialidocious", new int[]{2, 4, 7, 9, 12, 14, 16, 19, 21, 24, 25, 27, 29, 31, 32, 33});
    }
}

