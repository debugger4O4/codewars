// https://www.codewars.com/kata/65128732b5aff40032a3d8f0/train/java

package kyu_8.neutralisation.java;

public class Solution {
    public static String neutralise(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            result.append(
                    s1.charAt(i) == s2.charAt(i) ? s1.charAt(i) : "0"
            );
        }
        return result.toString();
    }
}
