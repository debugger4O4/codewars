// https://www.codewars.com/kata/586bca7fa44cfc833e00005c/train/java

package kyu_7.number_to_digit_tiers.java;

public class Solution {

    public static String[] createArrayOfTiers(int num) {
        String value = String.valueOf(num);
        String[] result = new String[value.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = value.substring(0, i + 1);
        }
        return result;
    }
}
