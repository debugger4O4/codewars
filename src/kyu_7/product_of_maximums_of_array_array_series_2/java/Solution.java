package kyu_7.product_of_maximums_of_array_array_series_2.java;

import java.util.Arrays;

public class Solution {
    public static long maxProduct(int[] numbers, int sub_size) {
        Arrays.sort(numbers);
        long result = 1;
        for (int i = numbers.length - 1; sub_size > 0; sub_size--, i--) {
            result *= numbers[i];
        }
        return result;
    }
}