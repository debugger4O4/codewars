// https://www.codewars.com/kata/5a1a9e5032b8b98477000004/train/java

package kyu_7.evens_times_last.java;

public class Kata {

    public static int evenLast(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                result += numbers[i];
            }
        }
        return result * numbers[numbers.length - 1];
    }
}