// https://www.codewars.com/kata/5d5ee4c35162d9001af7d699/train/java

package kyu_7.sum_of_minimums.java;

import java.util.Arrays;

public class Kata{
    public static int sumOfMinimums(int[][] arr){
        int result = 0;
        for (int[] ints : arr) {
            Arrays.sort(ints);
            result += ints[0];
        }
        return result;
    }
}