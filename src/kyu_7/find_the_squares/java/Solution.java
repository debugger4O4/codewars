// https://www.codewars.com/kata/60908bc1d5811f0025474291/train/java

package kyu_7.find_the_squares.java;

public class Solution{
    public static String findSquares(int n){
        long a = n / 2;
        long b = n - a;
        return String.format("%.0f", Math.pow(b, 2)) + "-" + String.format("%.0f", Math.pow(a, 2));
    }
}
