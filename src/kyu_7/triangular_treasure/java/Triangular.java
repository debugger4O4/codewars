// https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java

package kyu_7.triangular_treasure.java;

public class Triangular {
    public static long triangular(long n) {
        long result = 0L;
        for (long i = 0; i < n; i++) {
            result += n - i;
        }
        return result;
    }
}