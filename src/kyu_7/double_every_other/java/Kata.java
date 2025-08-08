// https://www.codewars.com/kata/5809c661f15835266900010a/train/java

package kyu_7.double_every_other.java;

public class Kata {
    public static int[] doubleEveryOther(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i % 2 != 0 ? a[i] * 2 : a[i];
        }
        return a;
    }
}
