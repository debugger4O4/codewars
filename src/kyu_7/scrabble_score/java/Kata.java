// https://www.codewars.com/kata/558fa34727c2d274c10000ae/train/java

package kyu_7.scrabble_score.java;

import java.util.HashMap;
import java.util.Map;

public class Kata {

    private static final Map<String, Integer> dictionary = new HashMap<>();

    static {
        dictionary.put("AEIOULNRST", 1);
        dictionary.put("DG", 2);
        dictionary.put("BCMP", 3);
        dictionary.put("FHVWY", 4);
        dictionary.put("K", 5);
        dictionary.put("JX", 8);
        dictionary.put("QZ", 10);
    }


    public static int scrabbleScore(String word) {
        if (word.isEmpty()) {
            return 0;
        }
        word = word.toUpperCase();
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            String chr = word.charAt(i) + "";
            for (String key : dictionary.keySet()) {
                if (key.contains(chr)) {
                    result += dictionary.get(key);
                }
            }
        }
        return result;
    }
}
