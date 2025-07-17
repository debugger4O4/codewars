// https://www.codewars.com/kata/55688b4e725f41d1e9000065/train/java

package kyu_6.even_fibonacci_sum.java;

class Kata {
    public static long fibonacci(long max) {
        long result = 0, a = 0, b = 1;
        for (; b < max; ) {
            if (b % 2 == 0) {
                result += b;
            }
            long temp = a;
            a = b;
            b = temp + b;
        }
        return result;
    }
}
