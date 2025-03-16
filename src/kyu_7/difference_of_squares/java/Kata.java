// https://www.codewars.com/kata/558f9f51e85b46e9fa000025/train/java

package kyu_7.difference_of_squares.java;

public class Kata{
    public static int differenceOfSquares(int n){
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            a += Math.pow(i, 2);
            b += i;
        }
        return (int) (Math.pow(b, 2) - a);
    }
}
