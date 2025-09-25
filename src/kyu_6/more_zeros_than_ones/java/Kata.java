// https://www.codewars.com/kata/5d41e16d8bad42002208fe1a/train/java

package kyu_6.more_zeros_than_ones.java;

public class Kata {
    public static char[] moreZeros(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        for (char aChar : chars) {
            if (check(aChar) && !duplicate(result, aChar)) {
                result += aChar;
            }
        }
        return result.toCharArray();
    }

    public static boolean check(char c) {
        String binary = Integer.toBinaryString(c);
        int onesCount = binary.replaceAll("0", "").length();
        int zerosCount = binary.replaceAll("1", "").length();
        return zerosCount > onesCount;
    }

    public static boolean duplicate(String s, char c) {
        return s.contains(c + "");
    }
}