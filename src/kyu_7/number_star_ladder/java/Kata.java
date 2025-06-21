// https://www.codewars.com/kata/5631213916d70a0979000066/train/java

package kyu_7.number_star_ladder.java;

public class Kata {
    public static String pattern(int n){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(1).append(i > 1 ? "*".repeat(i - 1) : "").append(i > 1 ? i : "").append("\n");
        }
        return result.toString().trim();
    }
}
