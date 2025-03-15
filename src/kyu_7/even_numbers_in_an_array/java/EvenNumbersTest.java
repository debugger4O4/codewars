package kyu_7.even_numbers_in_an_array.java;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvenNumbersTest {

    private static void doTest(int[] array, int number, int[] expected) {
        int[] actual = Kata.evenNumbers(array, number);
        assertArrayEquals(expected, actual, "evenNumbers(" + Arrays.toString(array) + ", " + number + ") returned an incorrect answer\nExpected: " + Arrays.toString(expected) + "\nBut got : " + Arrays.toString(actual) + "\n\n");
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
//        doTest(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, new int[]{4, 6, 8});
        doTest(new int[]{-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26}, 2, new int[]{-8, 26});
        doTest(new int[]{6, -25, 3, 7, 5, 5, 7, -3, 23}, 1, new int[]{6});
    }
}

