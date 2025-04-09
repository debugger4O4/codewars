package kyu_7.evens_times_last.java;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenLastTest {

    private static void doTest(int[] arr, int expected) {
        assertEquals(expected, Kata.evenLast(arr),
                "evenLast(" + Arrays.toString(arr) + ") returned an incorrect result.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(new int[]{2, 3, 4, 5}, 30);
        doTest(new int[]{}, 0);
        doTest(new int[]{2, 2, 2, 2}, 8);
        doTest(new int[]{1, 3, 3, 1, 10}, 140);
        doTest(new int[]{-11, 3, 3, 1, 10}, 20);
    }
}

