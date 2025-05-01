// https://www.codewars.com/kata/62a611067274990047f431a8/train/java

package kyu_7.length_and_two_values.java;

public class Kata {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 2 == 0 ? firstValue : secondValue;
        }
        return result;
    }
}
