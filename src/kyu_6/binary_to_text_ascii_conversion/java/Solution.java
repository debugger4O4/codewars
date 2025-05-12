// https://www.codewars.com/kata/5583d268479559400d000064/train/java

package kyu_6.binary_to_text_ascii_conversion.java;

class Solution {

    public static String binaryToText(String binary) {
        if (binary.isEmpty()) {
            return "";
        }
        String[] binaryArr = binary.split("(?<=\\G.{" + 8 + "})");
        StringBuilder result = new StringBuilder();
        for (String s : binaryArr) {
            char letter = (char) Integer.parseInt(s, 2);
            result.append(letter);
        }
        return result.toString();
    }

}
