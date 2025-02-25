// https://www.codewars.com/kata/54b45c37041df0caf800020f/train/java

package kyu_7.greatest_common_divisor_bitcount.java;

public class BinaryGCD {
    public static int gcdBinary(int x, int y) {
        int gcd = gcd(Math.abs(x), Math.abs(y));
        return Integer.bitCount(gcd);
    }

    public static int gcd(int x, int y) {
        if (x == 0 || y == 0) {
            return Math.max(x, y);
        }
        return gcd(y, x % y);
    }
}

