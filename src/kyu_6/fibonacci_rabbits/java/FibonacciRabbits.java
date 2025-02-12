// https://www.codewars.com/kata/5559e4e4bbb3925164000125/train/java

package kyu_6.fibonacci_rabbits.java;

public class FibonacciRabbits {
    public static int fibRabbits(int n, int b) {
        return n > 1 ? fibRabbits(--n, b) + fibRabbits(--n, b) * b : n;
    }
}

