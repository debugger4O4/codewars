// https://www.codewars.com/kata/51f41fe7e8f176e70d0002b9/train/java

package kyu_6.sort_arrays_ignoring_case.java;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static String[] sort(String[] names) {
        return Arrays.stream(names)
                .sorted(Comparator.comparing(String::toLowerCase))
                .toArray(String[]::new);
    }
}
