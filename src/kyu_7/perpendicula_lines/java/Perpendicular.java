// https://www.codewars.com/kata/6391fe3f322221003db3bad6/train/java

package kyu_7.perpendicula_lines.java;

public class Perpendicular {
    public static int maxBisectors(int n) {
        int avg = (int) Math.floor(n / 2f);
        return (n - avg) * avg;
    }
}