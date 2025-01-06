package kyu_5.count_chains_of_ones_in_subsequences.java;

import org.junit.*;

import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void sampleTests() {
        assertEquals("For input 1", 1, WeightSum.weightSum(new byte[]{1}));
        assertEquals("For input 0", 0, WeightSum.weightSum(new byte[]{0}));
        assertEquals("For input 00000", 0, WeightSum.weightSum(new byte[]{0, 0, 0, 0, 0}));
        assertEquals("For input 11111", 31, WeightSum.weightSum(new byte[]{1, 1, 1, 1, 1}));
        assertEquals("For input 1101", 17, WeightSum.weightSum(new byte[]{1, 1, 0, 1}));
    }
}
