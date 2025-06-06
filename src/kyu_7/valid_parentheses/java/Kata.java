// https://www.codewars.com/kata/6411b91a5e71b915d237332d/train/java

package kyu_7.valid_parentheses.java;

public class Kata {

    public static boolean validParentheses(String parenStr) {
        int diff = 0;
        for (char c : parenStr.toCharArray()) {
            if (c == '(') {
                diff++;
            } else if (c == ')') {
                diff--;
                if (diff < 0) {
                    return false;
                }
            }
        }
        return diff == 0;
    }
}
