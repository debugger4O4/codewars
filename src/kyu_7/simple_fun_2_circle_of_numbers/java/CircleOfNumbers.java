// https://www.codewars.com/kata/58841cb52a077503c4000015/train/java

package kyu_7.simple_fun_2_circle_of_numbers.java;

public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
        return (firstNumber + n / 2) % n;
    }
}
