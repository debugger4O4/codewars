// https://www.codewars.com/kata/51689e27fe9a00b126000004/train/java

package kyu_6.format_words_into_a_sentence.java;

import java.util.Arrays;
import java.util.List;

public class Kata {

    public static String formatWords(String[] words) {
        if (words == null) {
            return "";
        }
        if (words.length == 0) {
            return "";
        }
        List<String> forResult = Arrays.stream(words).filter(f -> !f.isEmpty()).toList();
        if (forResult.size() == 1) {
            return forResult.get(0);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < forResult.size(); i++) {
            if (i > 0 && i < forResult.size() - 1) {
                result.append(", ");
            }
            if (i == forResult.size() - 1) {
                result.append(" and ");
            }
            result.append(forResult.get(i));
        }
        return result.toString();
    }
}
