// https://www.codewars.com/kata/5650ab06d11d675371000003/train/java

package kyu_7.split_in_parts.java;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % partLength == 0) {
                result.append(" ");
            }
            result.append(s.charAt(i));
        }
        return result.toString().trim();
    }
}
