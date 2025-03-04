// https://www.codewars.com/kata/55733d3ef7c43f8b0700007c/train/java

package kyu_7.complete_the_pattern_2.java;

public class CompleteThePattern {
    public static String pattern ( int n) {
        StringBuilder result = new StringBuilder();
        StringBuilder s = new StringBuilder();
        for (int i = n; i > 0; i--) {
            s.append(i);
            result.insert(0, "\n" + s);
        }
        return result.toString().trim();
    }
}
