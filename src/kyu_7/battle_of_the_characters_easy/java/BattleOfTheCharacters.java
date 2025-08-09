// https://www.codewars.com/kata/595519279be6c575b5000016/train/java

package kyu_7.battle_of_the_characters_easy.java;

public class BattleOfTheCharacters {

    private final static String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String battle(final String x, final String y) {
        int xSum = getSum(x);
        int ySum = getSum(y);
        return xSum > ySum ? x : ySum > xSum ? y : "Tie!";
    }

    private static int getSum (String s) {
        return s.chars()
                .map(c -> LETTERS.indexOf((char) c) + 1)
                .sum();
    }
}
