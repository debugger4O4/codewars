// https://www.codewars.com/kata/58a3a735cebc0630830000c0/train/java

package kyu_6.simple_fun_122_string_constructing.java;

public class Kata {
    public static int stringConstructing(String a, String s) {
        int aLength = a.length();
        int index = 0;
        int result = 0;
        for (int i = 0; i < s.length(); ) {
            if (index == 0) {
                result++;
            }
            if (s.charAt(i) == a.charAt(index)) {
                i++;
            } else {
                result++;
            }
            index = (index + 1) % aLength;
        }
        return result + (index == 0 ? 0 : aLength - index);
    }
}
