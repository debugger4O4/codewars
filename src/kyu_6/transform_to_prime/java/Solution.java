// https://www.codewars.com/kata/5a946d9fba1bb5135100007c/train/java

package kyu_6.transform_to_prime.java;

import java.util.Arrays;

public class Solution {
    public static int minimumNumber(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        if (isPrime(sum)) {
            return 0;
        } else {
            int i = 0;
            while (!isPrime(sum)) {
                sum++;
                i++;
            }
            return i;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
