// https://www.codewars.com/kata/58afce23b0e8046a960000eb/train/java

package kyu_6.simple_fun_165_withdraw.java;

public class Solution {

    public static int[] withdraw(int n) {
        int[] result = new int[3];
        result[0] = (n % 100 == 10 || n % 100 == 30) && n >= 100 ? (n / 100 - 1) : (n / 100);
        n -= result[0] * 100;

        result[1] = n % 20 == 0 ? 0 : n < 50 ? 0 : 1;
        n -= result[1] * 50;

        result[2] = n / 20;

        return result;
    }
}
