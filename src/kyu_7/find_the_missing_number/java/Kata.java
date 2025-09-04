// https://www.codewars.com/kata/57f5e7bd60d0a0cfd900032d/train/java

package kyu_7.find_the_missing_number.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int missingNo(int[] nums) {
        int sum1 = IntStream.range(0, nums.length + 1).sum();
        int sum2 = Arrays.stream(nums).sum();
        return sum1 - sum2;
    }
}
