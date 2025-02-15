// https://www.codewars.com/kata/58f0ba42e89aa6158400000e/train/java

package kyu_7.folding_your_way_to_the_moon.java;

public class PaperFolder {

    private static final double WIDTH = 0.0001;

    public static Long fold(Double distance) {
        if (distance < 0) {
            return null;
        }
        long result = 0;
        for (double i = WIDTH; i < distance; i *= 2) {
            result++;
        }
        return result;
    }
}