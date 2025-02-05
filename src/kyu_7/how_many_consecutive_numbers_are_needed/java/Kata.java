// https://www.codewars.com/kata/559cc2d2b802a5c94700000c/train/java

package kyu_7.how_many_consecutive_numbers_are_needed.java;

import java.util.Arrays;

public class Kata {
    public static int consecutive(final int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0] - arr.length + 1;
    }
}
