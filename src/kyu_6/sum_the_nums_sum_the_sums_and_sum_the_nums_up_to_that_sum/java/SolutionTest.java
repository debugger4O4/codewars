package kyu_6.sum_the_nums_sum_the_sums_and_sum_the_nums_up_to_that_sum.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

class SolutionTest {
    @Test
    void exampleTests() {
        assertEquals(new BigInteger("55"), Solution.sumOfSums(3));
        assertEquals(new BigInteger("630"), Solution.sumOfSums(5));
        assertEquals(new BigInteger("14740530850"), Solution.sumOfSums(100));
    }
}