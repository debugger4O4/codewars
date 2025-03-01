// https://www.codewars.com/kata/52a382ee44408cea2500074c/train/java

package kyu_4.matrix_determinant.java;

public class Matrix {

    public static int determinant(int[][] matrix) {
        int length = matrix.length;
        if (length == 1) {
            return matrix[0][0];
        }
        if (length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int result = 0;
        for (int k = 0; k < length; k++) {
            int[][] mtrx = new int[length - 1][length - 1];
            for (int i = 1; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (j < k) {
                        mtrx[i - 1][j] = matrix[i][j];
                    } else if (j > k) {
                        mtrx[i - 1][j - 1] = matrix[i][j];
                    }
                }
            }
            result += (k % 2 == 0 ? 1 : -1) * matrix[0][k] * determinant(mtrx);
        }
        return result;
    }
}
