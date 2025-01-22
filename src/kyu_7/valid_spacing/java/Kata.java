// https://www.codewars.com/kata/5f77d62851f6bc0033616bd8/train/java

package kyu_7.valid_spacing.java;

public class Kata {

    public static boolean validSpacing(String s) {
        if (s.isEmpty()) {
            return true;
        }
        boolean prev = false;
        if (s.charAt(0) == 32 || s.charAt(s.length() - 1) == 32) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32 && prev) {
                return false;
            } else {
                prev = s.charAt(i) == 32;
            }
        }
        return true;
    }
}
