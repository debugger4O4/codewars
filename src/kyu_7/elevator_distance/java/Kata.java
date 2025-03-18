// https://www.codewars.com/kata/59f061773e532d0c87000d16/train/java

package kyu_7.elevator_distance.java;

public class Kata {
    public static int elevatorDistance(int[] arr) {
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            result += Math.abs(arr[i] - arr[i - 1]);
        }
        return result;
    }
}
