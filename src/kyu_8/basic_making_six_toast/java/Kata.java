// https://www.codewars.com/kata/5834fec22fb0ba7d080000e8/train/java

package kyu_8.basic_making_six_toast.java;

public class Kata{
    public static int sixToast(int num){
        return num >= 6 ? num - 6 : num == 0 ? 6 : num;
    }
}
