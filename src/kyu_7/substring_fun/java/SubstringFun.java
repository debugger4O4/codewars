// https://www.codewars.com/kata/565b112d09c1adfdd500019c/train/java

package kyu_7.substring_fun.java;

public class SubstringFun {
    public static String nthChar(String[] words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i].charAt(i));
        }
        return result.toString();
    }
}
