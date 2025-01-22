// https://www.codewars.com/kata/5898b4b71d298e51b600014b/train/java

package kyu_6.srot_the_inner_ctonnet_in_dsnnieedcg_oredr.java;


import java.util.Arrays;

public class Kata {
    public static String sortTheInnerContent(String words) {
        String[] split = words.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = descending(split[i].toLowerCase().toCharArray());
        }
        return String.join(" ", split);
    }

    private static String descending(char[] chars) {
        if (chars.length < 2) {
            return String.valueOf(chars[0]);
        }
        StringBuilder result = new StringBuilder();
        char[] charsForRes = new char[chars.length - 2];
        System.arraycopy(chars, 1, charsForRes, 0, charsForRes.length);
        Arrays.sort(charsForRes);
        StringBuilder reverse = new StringBuilder();
        reverse.append(charsForRes).reverse();
        result.append(chars[0]).append(reverse).append(chars[chars.length - 1]);
        return result.toString();
    }
}
