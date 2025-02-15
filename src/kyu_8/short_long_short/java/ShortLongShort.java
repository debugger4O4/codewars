// https://www.codewars.com/kata/50654ddff44f800200000007/train/java

package kyu_8.short_long_short.java;

public class ShortLongShort {
    public static String solution(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }
}