// https://www.codewars.com/kata/5a908da30025e995880000e3/train/java

package kyu_6.simple_prime_streaming.java;

public class SimplePrimeStreaming {

    private static final String INFINITY = getFibonacciInfinity();

    public static String solve(int a, int b) {
        return INFINITY.substring(a, a + b);
    }

    private static String getFibonacciInfinity() {
        int limit = 200000;

        StringBuilder result = new StringBuilder();

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                result.append(i);
            }
        }

        return result.toString();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
