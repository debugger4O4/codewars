// https://www.codewars.com/kata/5bccff463d36b0f6a8001a21/train/java

package kyu_6.forming_a_magic_square.java;

public class Solution {

    private static final int[][][] possibles = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
    };

    public static int formingMagicSquare(int[][] s) {

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            int cost = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++)
                    cost += Math.abs(s[j][k] - possibles[i][j][k]);
            }
            result = Math.min(result, cost);
        }
        return result;
    }
}
