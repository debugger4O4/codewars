// https://www.codewars.com/kata/5a090c4e697598d0b9000004/train/java

package kyu_7.max_min_arrays.java;

import java.util.Arrays;

class Solution {
    public static int[] solve(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = i % 2 == 0 ? arr[arr.length - i / 2 - 1] : arr[i / 2];
        }
        return result;
    }
}