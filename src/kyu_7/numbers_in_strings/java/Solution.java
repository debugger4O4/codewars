package kyu_7.numbers_in_strings.java;

import java.util.Arrays;

public class Solution {
    public static int solve(String s) {
        return Arrays.stream(s.split("[^0-9]"))
                .filter(f -> !f.equals(""))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
    }
}
