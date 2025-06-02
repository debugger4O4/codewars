// https://www.codewars.com/kata/5edc8c53d7cede0032eb6029/train/java

package kyu_6.simple_square_numbers.java;

class Solution {

    public static long solve(int n) {
        double i = Math.ceil(Math.sqrt(n));
        while (--i > 0)
            if (i % 2 == n / i % 2)
                return (long) (Math.pow(n / i - i, 2) / 4);
        return -1;
    }
}
