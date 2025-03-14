// https://www.codewars.com/kata/55f347cfb44b879e1e00000d/train/java

package kyu_6.highest_number_with_two_prime_factors.java;

public class Highest2Factors {

    public static long[] highestBiPrimeFac(long p1, long p2, long n) {
        long[] result = new long[3];
        long expression = p1 * p2;
        for (int pow1 = 1; expression <= n; pow1++) {
            for (int pow2 = 1; expression <= n; pow2++) {
                expression = (long) (Math.pow(p1, pow1) * Math.pow(p2, pow2));
                if (expression > result[0]) {
                    result[0] = expression;
                    result[1] = pow1;
                    result[2] = pow2;
                }
                expression *= p2;
            }
            expression = (long) (Math.pow(p1, pow1 + 1) * p2);
        }
        return result;
    }
}
