// https://www.codewars.com/kata/5a7893ef0025e9eb50000013/train/java

package kyu_7.maximum_gap_array_series.java;

import java.util.Arrays;

public class Solution {
    public static int maxGap(int[] numbers) {
        int result = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            result = Math.max(result, numbers[i] - numbers[i - 1]);
        }
        return result;
    }
}
