// https://www.codewars.com/kata/65126d52a5de2b11c94096d2/train/java

package kyu_7.closing_in_sum.java;

public class Solution {
    public static int closingInSum(long n) {
        String num = Long.toString(n);
        int len = num.length();
        int a = 0;
        int b = 0;
        for (int i = 0; i < len; i++) {
            int d = num.charAt(i) - '0';
            if (i < len / 2) {
                a += d;
            } else {
                b += d;
            }
        }
        return a * 10 + b;
    }
}
