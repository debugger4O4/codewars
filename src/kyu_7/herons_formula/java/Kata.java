// https://www.codewars.com/kata/57aa218e72292d98d500240f/train/java

package kyu_7.herons_formula.java;

public class Kata {
    public static double heron(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
