package kyu_6.dominant_primes.java;

public class Solution {
    public static int solve(int a, int b) {
        int sum = 0;
        boolean[] booleans = new boolean[b + 1];
        for (int i = 2, j = 0; i <= b; i++) {
            booleans[i] = prime(i);
            if (booleans[i] && booleans[++j] && i >= a) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
