// https://www.codewars.com/kata/55fd4919ce2a1d7c0d0000f3/train/java

package kyu_6.two_cube_sums.java;

public class Kata {
    public static boolean hasTwoCubeSums(int n) {
        int count = 0;
        for (int max = (int) Math.cbrt(n), min = 1; min < max; ) {
            int sum = (int) (Math.pow(max, 3) + Math.pow(min, 3));
            if (sum == n) {
                count++;
                min++;
                max--;
            } else if (sum > n) {
                max--;
            } else {
                min++;
            }
        }
        return count == 2;
    }
}
