// https://www.codewars.com/kata/5f7c38eb54307c002a2b8cc8/train/java

package kyu_6.remove_the_parentheses.java;

public class Kata {
    public static String removeParentheses(final String str) {
        String result = str.replaceAll("\\([^()]*\\)", "");
        if (result.contains("(")) {
            result = removeParentheses(result);
        }
        return result;
    }
}
