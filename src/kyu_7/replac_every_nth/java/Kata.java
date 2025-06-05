// https://www.codewars.com/kata/57fcaed83206fb15fd00027a/train/java

package kyu_7.replac_every_nth.java;

public class Kata {
    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        if (n <= 0 || text.isEmpty()) {
            return text;
        }
        StringBuilder result = new StringBuilder(text);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == oldValue) {
                count++;
            }
            if (count == n) {
                result.setCharAt(i, newValue);
                count = 0;
            }
        }
        return result.toString();
    }
}
