package kyu_7.move_10.java;

public class MoveTen {
    public static String moveTen(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int idx = alphabet.indexOf(c);
            int move = idx + 10;
            if (move >= alphabet.length()) {
                result.append(alphabet.charAt(move % alphabet.length()));
            } else {
                result.append(alphabet.charAt(idx + 10));
            }
        }
        return result.toString();
    }
}
