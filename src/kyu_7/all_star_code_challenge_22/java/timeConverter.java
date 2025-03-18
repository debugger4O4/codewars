// https://www.codewars.com/kata/5865cff66b5699883f0001aa/train/java

package kyu_7.all_star_code_challenge_22.java;

public class timeConverter{
    public static String toTime(int seconds){
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        return String.format("%d hour(s) and %d minute(s)", h, m);
    }
}
