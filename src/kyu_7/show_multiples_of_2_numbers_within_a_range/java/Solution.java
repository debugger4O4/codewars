// https://www.codewars.com/kata/583989556754d6f4c700018e/train/java

package kyu_7.show_multiples_of_2_numbers_within_a_range.java;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        List<Integer> result = new ArrayList<>();
        IntStream.range(1, s3).forEach(f -> {
            if (f % s1 == 0 && f % s2 == 0) {
                result.add(f);
            }
        });
        return result;
    }
}