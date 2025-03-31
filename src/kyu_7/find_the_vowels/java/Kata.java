// https://www.codewars.com/kata/5680781b6b7c2be860000036/train/java

package kyu_7.find_the_vowels.java;

public class Kata {

    public static int[] vowelIndices(String word) {
        int size = word.toLowerCase().replaceAll("[^aeouiy]", "").length();
        int[] result = new int[size];
        char[] chars = word.toLowerCase().toCharArray();
        for (int i = 0, j = 0; i < chars.length && j < result.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'i' || chars[i] == 'y') {
                result[j] = i + 1;
                j++;
            }
        }
        return result;
    }
}
