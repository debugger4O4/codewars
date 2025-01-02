package kyu_7.insert_dashes.java;

public class Solution {

    public static String insertDash(int num) {
        StringBuilder result = new StringBuilder();
        String length = num + "";
        for (int i = 0; i < length.length(); i++) {
            if (i > 0) {
                if (
                        Integer.parseInt(length.charAt(i) + "") % 2 != 0
                                && Integer.parseInt(length.charAt(i - 1) + "") % 2 != 0
                ) {
                    result.append("-").append(length.charAt(i));
                } else {
                    result.append(length.charAt(i));
                }
            } else {
                result.append(length.charAt(i));
            }
        }
        return result.toString();
    }
}
