// https://www.codewars.com/kata/675dc1d3830826975c58a09d/train/java

package kyu_7.c_is_for_codewars.java;


public class GenerateC {
    public static String generateC(int size) {
        String top = transform(size, "top");
        String mid = transform(size, "mid");
        String bot = transform(size, "bot");
        return top + mid + bot;
    }

    public static String transform(int size, String position) {
        String topOrBot = "CCCCC".repeat(size);
        String mid = "C".repeat(size);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < size; i++) {
            if (position.equals("top")) {
                result.append(topOrBot).append("\n");
            }
            if (position.equals("mid")) {
                result.append(mid).append("\n").append(mid).append("\n").append(mid).append(i < size - 1 ? "\n" : "");
            }
            if (position.equals("bot")) {
                result.append("\n").append(topOrBot);
            }
        }
        return result.toString();
    }
}
