// https://www.codewars.com/kata/5d5a7525207a674b71aa25b5/train/java

package kyu_6.row_of_the_odd_triangle.java;


public class UserSolution {
    public static long[] oddRow(int n) {
        long[] result = new long[n];
        long  firstElement = (long) n * n - n + 1;
        for (int i = 0; i < n; i++) {
            result[i] = firstElement + 2L * i;
        }
        return result;
    }
}