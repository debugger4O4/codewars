package kyu_6.matrix_strings.java;

import java.util.Arrays;

public class Matrix {

    private final int[][] matrix;

    public Matrix(String matrixAsString) {
        String[] strings = matrixAsString.split("\n");
        matrix = new int[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            this.matrix[i] = Arrays.stream(strings[i].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public int[] getRow(int rowNumber) {
        return matrix[rowNumber];
    }

    public int[] getColumn(int columnNumber) {
        int[] column = new int[getRowsCount()];
        for (int i = 0; i < column.length; i++) {
            column[i] = matrix[i][columnNumber];
        }
        return column;
    }

    public int getRowsCount() {
        return matrix.length;
    }

    public int getColumnsCount() {
        return matrix[0].length;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}

