package kyu_6.continued_fraction.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

class SolutionSampleTest{
    @Test
    @DisplayName("Basic tests")
    void basicTests(){
        int[] numerators = new int[]{311, 761, 1721};
        int[] denominators = new int[]{144, 327, 9};
        int[][] expecteds = new int[][]{
                new int[]{2, 6, 3, 1, 5},
                new int[]{2, 3, 17, 1, 5},
                new int[]{191, 4, 2},
        };
        for(int i = 0; i < numerators.length; i++){
            int[] actual = Solution.continuedFraction(numerators[i], denominators[i]);
            String msg = String.format("Input : numerator=%s, denominator=%s. Actual %s should equal expected %s", numerators[i], denominators[i], Arrays.toString(actual), Arrays.toString(expecteds[i]));
            assertArrayEquals(expecteds[i], actual, msg);
        }
    }

    @Test
    @DisplayName("Tests for divisors")
    void divTests(){
        int[] numerators = new int[]{1089, 11011, 1173};
        int[] denominators = new int[]{9, 13, 17};
        int[][] expecteds = new int[][]{
                new int[]{121},
                new int[]{847},
                new int[]{69},
        };
        for(int i = 0; i < numerators.length; i++){
            int[] actual = Solution.continuedFraction(numerators[i], denominators[i]);
            String msg = String.format("Input : numerator=%s, denominator=%s. Actual %s should equal expected %s", numerators[i], denominators[i], Arrays.toString(actual), Arrays.toString(expecteds[i]));
            assertArrayEquals(expecteds[i], actual, msg);
        }
    }

    @Test
    @DisplayName("Test for zero")
    void zeroTest(){
        int[] actual = Solution.continuedFraction(0, 15);
        String msg = String.format("Input : numerator=0, denominator=15. Actual %s should equal expected []", Arrays.toString(actual));
        assertArrayEquals(new int[0], actual, msg);
    }
}