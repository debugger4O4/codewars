// https://www.codewars.com/kata/5300901726d12b80e8000498/train/java

package kyu_7.fizz_buzz.java;

public class FizzBuzzArray {
    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = (i + 1) % 3 == 0 && (i + 1) % 5 == 0 ? "FizzBuzz"
                    : (i + 1) % 3 == 0 ? "Fizz"
                    : (i + 1) % 5 == 0 ? "Buzz"
                    : (i + 1) + "";
        }
        return result;
    }
}
