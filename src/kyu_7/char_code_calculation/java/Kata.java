// https://www.codewars.com/kata/57f75cc397d62fc93d000059/train/java

package kyu_7.char_code_calculation.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata{
    public static int calc(String x){
        StringBuilder numbers1 = new StringBuilder();
        char[] letters = x.toCharArray();
        IntStream.range(0, letters.length).map(letter -> letters[letter]).forEach(numbers1::append);
        String numbers2 = numbers1.toString().replaceAll("7", "1");
        int sum1 = Arrays.stream(numbers1.toString().split("")).map(Integer::parseInt).reduce(Integer::sum).get();
        int sum2 = Arrays.stream(numbers2.split("")).map(Integer::parseInt).reduce(Integer::sum).get();
        return sum1 - sum2;
    }
}
