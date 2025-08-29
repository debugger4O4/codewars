// https://www.codewars.com/kata/5a905c2157c562994900009d/train/java

package kyu_7.product_array_array_series_5.java;

import java.util.Arrays;

public class Solution {
    public static long[] productArray(int[] numbers) {
        long[] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long element = Arrays.stream(removeElementByIndex(numbers, i)).reduce(1L, (a, b) -> a * b);
            result[i] = element;
        }
        return result;
    }

    public static long[] removeElementByIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException();
        }
        long[] result = new long[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
}
