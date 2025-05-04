// https://www.codewars.com/kata/57faf32df815ebd49e000117/train/java

package kyu_7.exclamation_marks_series_5_remove_all_exclamation_marks_from_the_end_of_words.java;

import java.util.Arrays;

public class R {
    public static String removeBang(String str) {
        return String.join(" ",
                Arrays.stream(str.split(" "))
                        .map(word -> word.replaceFirst("\\s*\\p{Punct}+\\s*$", ""))
                        .toArray(String[]::new));
    }
}
