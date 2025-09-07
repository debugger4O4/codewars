// https://www.codewars.com/kata/566efcfbf521a3cfd2000056/train/java

package kyu_7.reversing_fun.java;

public class FunReverse {

    public static String funReverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(0, i) + new StringBuilder(s.substring(i)).reverse();
        }
        return s;
    }
}
