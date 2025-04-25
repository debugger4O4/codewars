// https://www.codewars.com/kata/558ee8415872565824000007/train/java

package kyu_7.is_n_divisible_by.java;

public class Divisible {
    public static boolean isDivisible(int... ints) {
        int firstElement = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (firstElement % ints[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
