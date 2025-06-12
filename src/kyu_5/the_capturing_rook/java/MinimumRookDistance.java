// https://www.codewars.com/kata/67857e40220da0b5a0e7cae2/train/java

package kyu_5.the_capturing_rook.java;

import java.util.*;

public class MinimumRookDistance {

    private final static Map<Integer, Integer> memo = new HashMap<>();

    private static int search(int i, int j, int[][] pawns, int captures) {
        int key = i * 15 + j + captures * 1000;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int len = pawns.length;
        if (captures == (1 << len) - 1) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int p = 0; p < len; p++) {
            if (((1 << p) & captures) != 0) {
                continue;
            }
            int u = pawns[p][0], v = pawns[p][1];
            res = Math.min(res, Math.abs(i - u) + Math.abs(j - v) + search(u, v, pawns, captures | (1 << p)));
        }
        memo.put(key, res);
        return res;
    }

    public static int calculateMinRookDistance(int[][] pawns, int[] rook) {
        memo.clear();
        return search(rook[0], rook[1], pawns, 0);
    }
}

