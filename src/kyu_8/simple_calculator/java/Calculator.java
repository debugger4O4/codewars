// https://www.codewars.com/kata/5810085c533d69f4980001cf/train/java

package kyu_8.simple_calculator.java;

public class Calculator {
    public static double calculate(double a, double b, String op) {
        switch (op) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
            default -> {
                throw new IllegalArgumentException("Невалидный оператор!");
            }
        }
    }
}
