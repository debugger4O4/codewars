// https://www.codewars.com/kata/56882731514ec3ec3d000009/train/java

package kyu_4.connect_four.java;

import java.util.*;

public class ConnectFour {
    public static String whoIsWinner(List<String> piecesPositionList) {
        String[][] matrix = new String[7][6];
        for (String s : piecesPositionList) {
            int i, j = s.charAt(0) - 'A';
            for (i = 0; matrix[j][i] != null; i++) {
            }
            matrix[j][i] = s.substring(2);
            for (int[] k : new int[][]{{0, 1}, {1, 0}, {1, 1}, {1, -1}}) {
                for (int n = 0, f = 1; f >= -1; f -= 2) {
                    for (int c = j, r = i; c >= 0 && c < 7 && r >= 0 && r < 6 && s.substring(2).equals(matrix[c][r]); c += k[0] * f, r += k[1] * f) {
                        if (++n > 4) {
                            return s.substring(2);
                        }
                    }
                }
            }
        }
        return "Draw";
    }
}
