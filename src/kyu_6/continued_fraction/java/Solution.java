package kyu_6.continued_fraction.java;

import java.util.ArrayList;
import java.util.List;

public class Solution{
    public static int[] continuedFraction(int numerator, int denominator){
        if (numerator == 0) {
            return new int[0];
        }
        List<Integer> result = new ArrayList<>();
        while (denominator != 0) {
            result.add(numerator / denominator);
            int remainder = numerator % denominator;
            numerator = denominator;
            denominator = remainder;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
