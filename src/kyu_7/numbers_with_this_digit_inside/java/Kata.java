// https://www.codewars.com/kata/57ad85bb7cb1f3ae7c000039/train/java

package kyu_7.numbers_with_this_digit_inside.java;

public class Kata {
    public static long[] NumbersWithDigitInside(long x, long d) {
        return x < d || x <= 1 ? new long[3] : getResult(x, d);
    }

    public static long[] getResult(long x, long d) {
        long count = 0;
        long sum = 0;
        long mult = 1;
        for (long i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                count++;
                sum += i;
                mult *= i;
            }
        }
        return new long[]{count, sum, mult};
    }
}
