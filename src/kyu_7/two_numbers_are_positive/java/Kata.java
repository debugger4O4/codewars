// https://www.codewars.com/kata/602db3215c22df000e8544f0/train/java

package kyu_7.two_numbers_are_positive.java;

import java.util.Arrays;

public class Kata {

    public static boolean twoArePositive(int a, int b, int c) {
        return Arrays.stream(new int[]{a, b, c}).filter(f -> f > 0).toArray().length == 2;
    }
}
