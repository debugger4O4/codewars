// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java

package kyu_7.simple_fun_176_reverse_letter.java;

public class Kata {
    public static String reverseLetter(final String str) {
        String s = str.replaceAll("[^a-zA-Z]", "");
        StringBuilder result = new StringBuilder(s);
        return result.reverse().toString();
    }
}
