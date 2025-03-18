// https://www.codewars.com/kata/5286b2e162056fd0cb000c20/train/java

package kyu_6.collatz.java;

public class Collatz {

    public static String collatz(int n) {
        return n > 1 ? n + "->" + collatz(n % 2 == 0 ?  n / 2 : 3 * n + 1) : "1";
    }
}
