// https://www.codewars.com/kata/5bdc191306a8a678f6000187/train/java

package kyu_7.shift_left.java;

public class Solution {
    public static int shiftLeft(String a, String b) {
        int i = 0;
        while (!b.endsWith(a)) {
            a = a.substring(1);
            i++;
        }
        return i + b.length() - a.length();
    }
}
