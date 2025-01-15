// https://www.codewars.com/kata/573f5c61e7752709df0005d2/train/java

package kyu_8.merging_sorted_integer_arrays_without_duplicates.java;

import java.util.*;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        int[] total = new int[first.length + second.length];
        System.arraycopy(first, 0, total, 0, first.length);
        System.arraycopy(second, 0, total, first.length, second.length);
        Arrays.sort(total);
        return Arrays.stream(total).distinct().toArray();
    }
}
