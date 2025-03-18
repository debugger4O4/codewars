package kyu_7.elevator_distance.java;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElevatorDistanceTest {

    private static void doTest(int[] arr, int expected) {
        assertEquals(expected, Kata.elevatorDistance(arr),
                "elevatorDistance(" + Arrays.toString(arr) + ") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(new int[]{5, 2, 8}, 9);
        doTest(new int[]{1, 2, 3}, 2);
        doTest(new int[]{7, 1, 7, 1}, 18);
    }
}

