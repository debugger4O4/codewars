// https://www.codewars.com/kata/52b5247074ea613a09000164/train/java

package kyu_7.boiled_eggs.java;

public class BoilingWater {

    public static int cookingTime(int eggs) {
        return (int) Math.ceil(eggs / 8.) * 5;
    }
}
