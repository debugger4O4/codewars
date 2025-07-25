// https://www.codewars.com/kata/5809b62808ad92e31b000031/train/java

package kyu_7.basic_math_add_or_subtract.java;

import java.util.Arrays;

public class Kata {
    public static String calculate(String str) {
        int[] nums = Arrays.stream(str.split("\\D+")).filter(f -> !f.isEmpty()).mapToInt(Integer::parseInt).toArray();
        String[] operations = Arrays.stream(str.split("[\\W\\d]+")).filter(f -> !f.isEmpty()).toArray(String[]::new);
        int result = nums[0];
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "plus" -> result += nums[i + 1];
                case "minus" -> result -= nums[i + 1];
            }
        }
        return String.valueOf(result);
    }
}
