package kyu_7.letterbox_paint_squad.java;

import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {

    public static int[] paintLetterboxes(final int start, final int end) {
        Map<Integer, Integer> map = fillMap(start, end);
        return fillResult(map);
    }

    public static int[] fillResult(Map<Integer, Integer> map) {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.getOrDefault(i, 0);
        }
        return result;
    }

    public static Map<Integer, Integer> fillMap(int start, int end) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = start; i <= end; i++) {
            int j = i;
            while (j > 0) {
                if (map.containsKey(j % 10)) {
                    int cnt = map.get(j % 10);
                    map.put(j % 10, ++cnt);
                } else {
                    map.put(j % 10, 1);
                }
                j /= 10;
            }
        }
        return map;
    }
}