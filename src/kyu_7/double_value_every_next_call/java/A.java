// https://www.codewars.com/kata/632408defa1507004aa4f2b5/train/java

package kyu_7.double_value_every_next_call.java;

public class A {
    private static int n = 0;

    public static int getNumber() {
        if (n == 0) {
            n = 1;
        } else {
            n *= 2;
        }
        return n;
    }
}
