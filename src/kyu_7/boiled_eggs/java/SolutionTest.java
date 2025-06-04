package kyu_7.boiled_eggs.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static void doTest(int num, int expected) {
        assertEquals(expected, BoilingWater.cookingTime(num), String.format("Incorrect answer for eggs = %d\n\n", num));
    }

    @Test @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(0, 0);
        doTest(5, 5);
        doTest(10, 10);
    }
}

