// https://www.codewars.com/kata/63f96036b15a210058300ca9/train/java

package kyu_7.find_the_index_of_the_second_occurrence_of_a_letter_in_a_string.java;

import java.util.Arrays;

public class SecondOcurrence {
    public static int secondSymbol(String str, char c) {
        char[] chars = str.toCharArray();
        int[] idxs = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                idxs[i] = i;
            }
        }
        idxs = Arrays.stream(idxs).filter(f -> f != 0).toArray();
        return idxs.length == 0 || idxs.length == 1 ? -1 : idxs[1];
    }
}
