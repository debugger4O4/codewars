// https://www.codewars.com/kata/645fb55ecf8c290031b779ef/train/java

package kyu_7.latin_squares.java;

public class LatinSquares {
    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];
        for (int i = 0; i < latinSquare.length; i++) {
            for (int j = 0; j < latinSquare[i].length; j++) {
                latinSquare[i][j] = (i + j) % n + 1;
            }
        }
        return latinSquare;
    }
}
