// https://www.codewars.com/kata/5a1ee4dfffe75f0fcb000145/train/java

package kyu_7.bingo_or_not.java;

import java.util.Arrays;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
        return Arrays.stream(numberArray)
                .filter(f -> f == 2 || f == 9 || f == 7 || f == 14 || f == 15)
                .distinct()
                .toArray()
                .length == 5 ? "WIN" : "LOSE";
    }
}