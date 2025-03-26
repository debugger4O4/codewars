// https://www.codewars.com/kata/56a1c63f3bc6827e13000006/train/java

package kyu_3.how_many_are_smaller_than_me_II.java;

import java.util.Arrays;

public class Smaller {

    public static int[] smaller(int[] unsorted) {
        int[] result = new int[unsorted.length];
        int min = Arrays.stream(unsorted).min().getAsInt();
        int max = Arrays.stream(unsorted).max().getAsInt();
        int[] count = new int[max - min + 1];
        for (int i = result.length - 1; i >= 0; i--) {
            int n = unsorted[i];
            int correct = n - min;
            for (int j = correct - 1; j >= 0; j--) {
                result[i] += count[j];
            }
            count[correct]++;
        }
        return result;
    }
}
