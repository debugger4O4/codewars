// https://www.codewars.com/kata/55eca815d0d20962e1000106/train/java

package kyu_8.generate_range_of_integers.java;

import java.util.Arrays;

public class Solution {
    public static int[] generateRange(int min, int max, int step) {
        if (max < step) {
            return new int[]{1};
        }
        int[] result = new int[max];
        for (int i = min, j = 0; i <= max; i += step, j++) {
            result[j] = i;
        }
        return Arrays.stream(result).filter(f -> f != 0).toArray();
    }
}