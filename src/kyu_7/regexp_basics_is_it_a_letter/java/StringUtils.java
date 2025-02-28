// https://www.codewars.com/kata/567de72e8b3621b3c300000b/train/java

package kyu_7.regexp_basics_is_it_a_letter.java;

public class StringUtils {

    public static boolean isLetter(String s) {
        return s.length() == 1 && s.matches("^[a-zA-Z]$");
    }
}
