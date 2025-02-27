// https://www.codewars.com/kata/52f3149496de55aded000410/train/java

package kyu_7.summing_a_numbers_digits.java;

import java.util.Arrays;

public class Kata{
    public static int sumDigits(int number){
        return Integer.parseInt
                (Arrays.stream(String.valueOf(Math.abs(number))
                        .split(""))
                        .reduce((a, b) -> String.valueOf(Integer.parseInt(a) + Integer.parseInt(b)))
                        .get());
    }
}
