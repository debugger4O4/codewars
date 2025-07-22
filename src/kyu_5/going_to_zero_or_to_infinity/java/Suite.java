// https://www.codewars.com/kata/55a29405bc7d2efaff00007c/train/java

package kyu_5.going_to_zero_or_to_infinity.java;

public class Suite {
    public static double going(int n) {
        double result = 0, factorial = 1;
        for (int i = n; i >= 1; factorial /= i, i--) {
            result += factorial;
        }
        return result;
    }
}
