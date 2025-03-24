// https://www.codewars.com/kata/59678a814e686ba17b000079/train/java

package kyu_6.b_a_d_hashing.java;

import java.util.Arrays;
import java.util.Collections;

public class BadWorkHash {
    public static String hashString(String toHash) {
        StringBuilder result = new StringBuilder();
        String[] hex = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String[] strings = new String[32];
        StringBuilder toHashBuilder = new StringBuilder(toHash);
        toHashBuilder.append("a".repeat(Math.max(0, 32 - toHashBuilder.length())));
        toHash = toHashBuilder.toString();
        for (int i = 0; i < 32; i++) {
            strings[i] = String.valueOf((int) toHash.charAt(i));
        }
        Arrays.sort(strings, Collections.reverseOrder());
        for (int i = 0; i < 32; i++) {
            result.append(hex[(Integer.parseInt(strings[i]) + i) % 16]);
        }
        return result.toString();
    }
}