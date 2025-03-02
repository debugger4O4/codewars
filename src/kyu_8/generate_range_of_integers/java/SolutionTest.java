package kyu_8.generate_range_of_integers.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void testSomething() {
        int[] actual = Solution.generateRange(2, 10, 2);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, actual,
                "generateRange(2, 10, 2)\nExpected: [2, 4, 6, 8, 10]\nActual:   " + java.util.Arrays.toString(actual) + "\n");
    }
}
