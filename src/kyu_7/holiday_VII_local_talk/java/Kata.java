// https://www.codewars.com/kata/57e92812750fcc051800004d/train/java

package kyu_7.holiday_VII_local_talk.java;

public class Kata {

    public static String pak(final String s) {
        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]).append(i == arr.length - 1 ? "" : " pak ");
        }
        return result.toString();
    }
}