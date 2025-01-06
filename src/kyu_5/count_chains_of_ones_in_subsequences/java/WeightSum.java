package kyu_5.count_chains_of_ones_in_subsequences.java;

public class WeightSum {
    public static long weightSum(byte[] arr) {
        int n = 0;
        int n1 = 0;
        int m = 0;
        int m1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                n = n * 2 + n1;
                m = m * 2 + m1 + 1;
            } else {
                n1 = n1 * 2 + n + m + 1;
                m1 = m1 * 2 + m + 1;
            }
        }
        return Integer.toUnsignedLong(n + n1);
    }
}
