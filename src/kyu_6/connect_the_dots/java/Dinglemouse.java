package kyu_6.connect_the_dots.java;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Dinglemouse {

    public static String connectTheDots(String paper) {
        int Y = paper.indexOf("\n") + 1;
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = paper.toCharArray();
        IntStream.range(0, paper.length())
                .forEach(i -> {
                    if (paper.charAt(i) >= 'a') map.put(paper.charAt(i), i);
                });
        Character[] characters = map.keySet().stream().sorted().toArray(Character[]::new);
        for (int k = 0; k < characters.length - 1; k++) {
            int a = map.get(characters[k]);
            int b = map.get(characters[k + 1]);
            int x = a / Y;
            int y = a % Y;
            int u = b / Y;
            int v = b % Y;
            int dx = u == x ? 0 : (u - x) / Math.abs(u - x) * Y;
            int dy = v == y ? 0 : (v - y) / Math.abs(v - y);
            int dA = dx + dy;

            chars[a] = '*';
            while (a != b) {
                a += dA;
                chars[a] = '*';
            }
        }
        return new String(chars);
    }
}