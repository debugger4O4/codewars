// https://www.codewars.com/kata/5a87449ab1710171300000fd/train/java

package kyu_7.tidy_number_special_numbers_series_9.java;

import java.util.Arrays;

public class Solution {
    public static boolean tidyNumber(int number) {
        int[] arr = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
