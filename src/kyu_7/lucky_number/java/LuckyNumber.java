// https://www.codewars.com/kata/55afed09237df73343000042/train/java

package kyu_7.lucky_number.java;

import java.util.Arrays;

public class LuckyNumber {

    public static boolean isLucky(long n) {
        long sum = Arrays.stream(String.valueOf(n).split("")).mapToLong(Long::parseLong).sum();
        return sum % 9 == 0;
    }
}
