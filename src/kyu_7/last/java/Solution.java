// https://www.codewars.com/kata/541629460b198da04e000bb9/train/java

package kyu_7.last.java;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);
    }
    public static char last(final String string) {
        return string.charAt(string.length() - 1);
    }
    public static <T> T last(final T... list) {
        return Arrays.stream(list).toList().get(list.length - 1);
    }
}

