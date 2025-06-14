// https://www.codewars.com/kata/59a1cdde9f922b83ee00003b/train/java

package kyu_7.stanton_measure.java;

import java.util.Arrays;

public class Kata {

    public static int stantonMeasure(int[] arr) {
        return (int) Arrays.stream(arr)
                .filter(f -> f ==  (int) Arrays.stream(arr).filter(f1 -> f1 == 1).count())
                .count();
    }
}