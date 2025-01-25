// https://www.codewars.com/kata/59b844528bcb7735560000a0/train/java

package kyu_7.nice_array.java;

import java.util.*;

public class Kata{
    public static boolean isNice(Integer[] arr){
        if (arr.length == 0) {
            return false;
        }
        for (Integer integer : arr) {
            if (!contains(arr, integer + 1) && !contains(arr, integer - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean contains(Integer[] array, int value) {
        return Arrays.stream(array).anyMatch(x -> x == value);
    }
}
