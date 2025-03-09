// https://www.codewars.com/kata/5a53a17bfd56cb9c14000003/train/java

package kyu_7.disarium_number_special_numbers_series_3.java;

import java.util.Arrays;

public class Solution {
    public static String disariumNumber(int number) {
        int compare = 0;
        int[] digits = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0, pow = 1; i < digits.length; i++, pow++) {
            compare += Math.pow(digits[i], pow);
        }
        return number == compare ? "Disarium !!" : "Not !!";
    }
}
