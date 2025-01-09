package kyu_7.nth_power_rules_them_all.java;

import java.util.Arrays;

public class Kata {
    public static int modifiedSum(int[] array, int power) {
        int sumPowers = (int) Arrays.stream(array).mapToDouble(m -> Math.pow(m, power)).sum();
        int sum = Arrays.stream(array).sum();
        return sumPowers - sum;
    }
}
