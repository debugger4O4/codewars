// https://www.codewars.com/kata/5a793fdbfd8c06d07f0000d5/train/java

package kyu_5.simple_string_expansion.java;

class Solution {
    public static String solve(String s) {
        StringBuilder result = new StringBuilder();
        char[] chars = new StringBuilder(s).reverse().toString().toCharArray();
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                result = new StringBuilder(result.toString().repeat(Integer.parseInt(ch + "")));
            }
            if (Character.isLetter(ch)) {
                result.insert(0, ch);
            }
        }
        return result.toString();
    }
}
