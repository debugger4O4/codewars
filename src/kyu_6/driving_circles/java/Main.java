// https://www.codewars.com/kata/59a6d020485a4df315000117/train/java

package kyu_6.driving_circles.java;

public class Main {

    public static int tour(int[] petrol, int[] distance) {
        int start = 0;
        int balance = 0;
        int deficit = 0;
        for (int i = 0; i < petrol.length; i++) {
            balance += petrol[i] - distance[i];
            if (balance < 0) {
                deficit += balance;
                balance = 0;
                start = i + 1;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }
}
