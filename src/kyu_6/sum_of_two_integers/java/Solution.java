// https://www.codewars.com/kata/5a9c35e9ba1bb5c54a0001ac/train/java

package kyu_6.sum_of_two_integers.java;

public class Solution {
    public static int add(int x, int y) {
        do {
            int xor = x ^ y;
            int and = x & y;
            x = xor;
            y = and << 1;
        } while (y != 0);
        return x;
    }
}