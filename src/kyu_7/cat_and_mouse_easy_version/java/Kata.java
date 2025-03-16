// https://www.codewars.com/kata/57ee24e17b45eff6d6000164/train/java

package kyu_7.cat_and_mouse_easy_version.java;

public class Kata{
    public static String catMouse(String x){
        return x.substring(1, x.length() - 1).length() > 3 ? "Escaped!" : "Caught!";
    }
}
