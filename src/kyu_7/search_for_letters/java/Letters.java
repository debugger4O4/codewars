// https://www.codewars.com/kata/52dbae61ca039685460001ae/train/java

package kyu_7.search_for_letters.java;

public class Letters {

    public static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String search(String line) {
        StringBuilder result = new StringBuilder("00000000000000000000000000");
        char[] chars = line.toLowerCase().toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                int idx = ALPHABET.indexOf(aChar);
                result.replace(idx, idx + 1, "1");
            }
        }
        return result.toString();
    }
}
