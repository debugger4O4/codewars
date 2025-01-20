// https://www.codewars.com/kata/567bed99ee3451292c000025/solutions/java

package kyu_7.regexp_basics_is_it_a_vowel.java;

public class StringUtils {

    public static boolean isVowel(String s) {
        if (s.isEmpty()) {
            return false;
        }

        if (s.length() == 1) {
            return s.toLowerCase().matches("[aeiou]");
        }
        return false;
    }
}
