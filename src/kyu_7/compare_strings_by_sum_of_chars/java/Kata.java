// https://www.codewars.com/kata/576bb3c4b1abc497ec000065/train/java

package kyu_7.compare_strings_by_sum_of_chars.java;


public class Kata {
    public static boolean compare(String s1, String s2) {
        if (s1 == null || s2 == null) { return  true; }
        char[] chars1 = s1.toUpperCase().toCharArray();
        char[] chars2 = s2.toUpperCase().toCharArray();
        int sum1 = getSum(chars1);
        int sum2 = getSum(chars2);
        return sum1 == sum2;
    }

    public static int getSum(char[] chars) {
        int sum = 0;
        for (char c : chars) {
            if (c <= 90 && c >= 65) {
                sum += c;
            } else {
                return 0;
            }
        }
        return sum;
    }
}
