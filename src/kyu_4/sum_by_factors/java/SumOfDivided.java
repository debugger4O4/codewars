// https://www.codewars.com/kata/54d496788776e49e6b00052f/train/java

package kyu_4.sum_by_factors.java;

import java.util.ArrayList;
import java.util.List;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {
        List<String> result = new ArrayList<>();
        int max = getMax(l);

        start:
        for (int i = 2; i <= max; i++) {
            int sum = 0;
            boolean add = false;
            if (!isPrime(i)) { continue start; }
            for (int k : l) {
                if (k % i == 0) {
                    sum += k;
                    add = true;
                }
            }
            if (add) { result.add("(" + i + " " + sum + ")"); }
        }
        return String.join("", result);
    }

    public static int getMax(int[] l) {
        int result = 0;
        for (int j : l) {
            if (Math.abs(j) > result) {
                result = Math.abs(j);
            }
        }
        return result;
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

