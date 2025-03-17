// https://www.codewars.com/kata/5966e33c4e686b508700002d/train/java

package kyu_8.sum_the_strings.java;

public class Kata{

    public static String sumStr(String a, String b){
        a = a.isEmpty() ? "0" : a;
        b = b.isEmpty() ? "0" : b;
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

}
