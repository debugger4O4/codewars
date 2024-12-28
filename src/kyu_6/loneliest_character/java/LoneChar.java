package kyu_6.loneliest_character.java;

public class LoneChar {
    public static char[] loneliest(String s) {
        int[] x = new int[26];
        char last = 'a';
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int max = 0;
        s = s.trim();
        if (s.indexOf(' ') == -1) {
            return s.toCharArray();
        }
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                x[c - 'a'] += count;
                x[last - 'a'] += count;
                max = Math.max(max, Math.max(x[c - 'a'], x[last - 'a']));
                last = c;
                count = 0;
            } else {
                count++;
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if (max == x[c - 'a']) {
                sb.append(c);
            }
        }
        return sb.toString().toCharArray();
    }
}