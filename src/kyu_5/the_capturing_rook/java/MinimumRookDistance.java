// https://www.codewars.com/kata/67857e40220da0b5a0e7cae2/train/java

package kyu_5.the_capturing_rook.java;

import java.util.*;

public class MinimumRookDistance {

    private final static Map<Integer, Integer> memo = new HashMap<>();

    private static int search(int x, int y, int[][] pawns, int captures) {
        int key = x * 15 + y + captures * 1000;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int length = pawns.length;
        if (captures == (1 << length) - 1) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (((1 << i) & captures) != 0) {
                continue;
            }
            int a = pawns[i][0];
            int b = pawns[i][1];
            result = Math.min(result, Math.abs(x - a) + Math.abs(y - b) + search(a, b, pawns, captures | (1 << i)));
        }
        memo.put(key, result);
        return result;
    }

    public static int calculateMinRookDistance(int[][] pawns, int[] rook) {
        memo.clear();
        return search(rook[0], rook[1], pawns, 0);
    }
}

