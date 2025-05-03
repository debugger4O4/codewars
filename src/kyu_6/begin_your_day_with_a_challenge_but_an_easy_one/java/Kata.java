// https://www.codewars.com/kata/5873b2010565844b9100026d/train/java

package kyu_6.begin_your_day_with_a_challenge_but_an_easy_one.java;

class Kata {
    public static String[] oneTwoThree(int n) {
        String s1 = "9".repeat(n / 9) + (n > 0 && n % 9 < 1 ? "" : n % 9);
        String s2 = n > 0 ? "1".repeat(n) : "0";
        return new String[] {s1, s2};
    }
}