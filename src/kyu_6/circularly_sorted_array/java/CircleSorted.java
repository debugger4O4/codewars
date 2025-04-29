// https://www.codewars.com/kata/544975fc18f47481ba00107b/train/java

package kyu_6.circularly_sorted_array.java;

public class CircleSorted {
    public boolean isCircleSorted(int[] a) {
        int disorder = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[(i == 0 ? a.length : i) - 1] > a[i]) {
                ++disorder;
            }
        }
        return disorder <= 1;
    }
}
