// https://www.codewars.com/kata/57cff961eca260b71900008f/train/java

package kyu_8.is_there_a_vowel_in_there.java;

import java.util.List;
import java.util.stream.Collectors;

public class VowelMapper {

    public static List<Object> isVow(List<Integer> a) {
        return a.stream().map(m ->
                m == 97 ? "a"
                : m == 101 ? "e"
                : m == 105 ? "i"
                : m == 111 ? "o"
                : m == 117 ? "u"
                : m)
                .collect(Collectors.toList());
    }
}
