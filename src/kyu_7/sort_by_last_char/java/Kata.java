// https://www.codewars.com/kata/57eba158e8ca2c8aba0002a0/train/java

package kyu_7.sort_by_last_char.java;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

    public static String[] last(String x) {
        return Arrays.stream(x.split(" ")).sorted(Comparator.comparing(c -> c.charAt(c.length() - 1))).toArray(String[]::new);
    }
}
