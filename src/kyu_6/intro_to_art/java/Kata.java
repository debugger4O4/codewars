// https://www.codewars.com/kata/5d7d05d070a6f60015c436d1/train/java

package kyu_6.intro_to_art.java;

public class Kata {

    public static String[] getW(int height) {
        if (height <= 1) {
            return new String[0];
        }
        String[] result = new String[height];
        for (int i = 0, width = (4 * height - 3) / 2; i < result.length; i++, width--) {
            if (i == 0) {
                result[i] = "*" + " ".repeat(width - 1) + "*" + " ".repeat(width - 1) + "*";
            } else if (i == result.length - 1) {
                result[i] = " ".repeat( height- 1) + "*" + " ".repeat(2 * i - 1) + "*" + " ".repeat(height - 1);
            } else {
                result[i] = " ".repeat(i) + "*" +
                        " ".repeat(width - i - 1) + "*" +
                        " ".repeat(2 * i - 1) + "*" +
                        " ".repeat(width - i - 1) + "*" +
                        " ".repeat(i);
            }
        }
        return result;
    }
}