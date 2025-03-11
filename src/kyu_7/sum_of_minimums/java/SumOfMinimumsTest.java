package kyu_7.sum_of_minimums.java;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfMinimumsTest {

    private static void doTest(int[][] arr, int expected) {
        assertEquals(expected, Kata.sumOfMinimums(arr), "Incorrect answer for arr: " + Arrays.deepToString(arr) + "\n\n");
    }

    @Test @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(new int[][]{{7, 9, 8, 6, 2}, {6, 3, 5, 4, 3}, {5, 8, 7, 4, 5}}, 9);
        doTest(new int[][]{{11, 12, 14, 54}, {67, 89, 90, 56}, {7, 9, 4, 3}, {9, 8, 6, 7}}, 76);
    }

}

