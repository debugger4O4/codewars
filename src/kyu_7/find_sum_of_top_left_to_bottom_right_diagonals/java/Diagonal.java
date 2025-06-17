// https://www.codewars.com/kata/5497a3c181dd7291ce000700/train/java

package kyu_7.find_sum_of_top_left_to_bottom_right_diagonals.java;

public class Diagonal {
    public static int diagonalSum(final int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][i];

        }
        return result;
    }
}
