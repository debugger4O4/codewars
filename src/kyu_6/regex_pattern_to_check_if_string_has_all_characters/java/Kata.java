// https://www.codewars.com/kata/5e4eb72bb95d28002dbbecde/train/java

package kyu_6.regex_pattern_to_check_if_string_has_all_characters.java;

public class Kata {

    public static String regexContainsAll(String str) {
        StringBuilder result = new StringBuilder();
        String[] strings = str.split("");
        for (String s : strings) {
            result.append("(?=.*").append(s).append(")");
        }
        return result.toString();
    }
}
