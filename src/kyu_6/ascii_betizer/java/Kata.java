package kyu_6.ascii_betizer.java;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

    public static String[] ASCIIbetize(String str) {
        return Arrays.stream(str.split(" ")).sorted(compare).distinct().toArray(String[]::new);
    }

    static final Comparator<String> compare = Comparator
            .comparing((String s) -> s.chars().sum())
            .thenComparing(s -> s);
}
