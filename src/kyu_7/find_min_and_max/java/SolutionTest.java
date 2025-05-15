package kyu_7.find_min_and_max.java;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sampleTests() {
        assertArrayEquals(new int[] {1, 1}, MinMax.getMinMax(Arrays.asList(1)),     "input: [1]");
        assertArrayEquals(new int[] {1, 2}, MinMax.getMinMax(Arrays.asList(1, 2)),  "input: [1, 2]");
        assertArrayEquals(new int[] {1, 2}, MinMax.getMinMax(Arrays.asList(2, 1)),  "input: [2, 1]");
    }
}

