// https://www.codewars.com/kata/59590976838112bfea0000fa/train/java

package kyu_6.english_beggar.java;

public class Kata{
    public static int[] beggars(int[] values, int n) {
        int[] result = new int[n];
        int queue = n;
        int i = 0;
        while (queue > 0) {
            result[i] = getValue(values, i, n);
            i++;
            queue--;
        }
        return result;
    }

    public static int getValue(int[] values, int idx, int beggarsCount) {
        int result = 0;
        for (int i = idx; i < values.length; i += beggarsCount) {
            result += values[i];
        }
        return result;
    }
}
