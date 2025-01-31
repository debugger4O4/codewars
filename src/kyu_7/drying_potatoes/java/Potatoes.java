// https://www.codewars.com/kata/58ce8725c835848ad6000007/train/java

package kyu_7.drying_potatoes.java;

class Potatoes {

    public static int potatoes(int p0, int w0, int p1) {
       return w0 * (100 - p0) / (100 - p1);
    }
}
