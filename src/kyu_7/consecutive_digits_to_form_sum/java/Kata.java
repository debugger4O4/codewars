// https://www.codewars.com/kata/5dae2599a8f7d90025d2f15f/train/java

package kyu_7.consecutive_digits_to_form_sum.java;

public class Kata {
    public static boolean consecutiveDucks(int n) {
        return (n & --n) > 0;
    }
}