// https://www.codewars.com/kata/5b4070144d7d8bbfe7000001/train/java

package kyu_6.numericals_of_a_string.java;

import java.util.HashMap;
import java.util.Map;

public class JomoPipi {
    public static String numericals(String s) {
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                int cnt = map.get(aChar);
                map.put(aChar, ++cnt);
            } else {
                map.put(aChar, 1);
            }
            result.append(map.get(aChar));
        }
        return result.toString();
    }
}
