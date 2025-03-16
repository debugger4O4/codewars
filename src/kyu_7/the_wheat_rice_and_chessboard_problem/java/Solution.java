// https://www.codewars.com/kata/5b0d67c1cb35dfa10b0022c7/train/java

package kyu_7.the_wheat_rice_and_chessboard_problem.java;

public class Solution {
    public static int squaresNeeded(long grains) {
        return Long.SIZE - Long.numberOfLeadingZeros(grains);
    }
}
