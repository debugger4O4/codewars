// https://www.codewars.com/kata/55a5c82cd8e9baa49000004c/train/java

package kyu_6.count_the_divisible_numbers.java;

public class Kata {

    public static long divisibleCount(long x, long y, long k) {
        return (y / k) - (x / k) + ((x % k == 0) ? 1 : 0);
    }
}