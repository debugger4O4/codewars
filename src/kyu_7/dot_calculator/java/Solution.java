// https://www.codewars.com/kata/6071ef9cbe6ec400228d9531/train/java

package kyu_7.dot_calculator.java;

class Solution {
    public static String calc(String txt){
        int count = 0;
        String[] data = txt.split(" ");
        switch (data[1]) {
            case "+" -> {
                count = data[0].length() + data[2].length();
            }
            case "-" -> {
                count = data[0].length() - data[2].length();
            }
            case "*" -> {
                count = data[0].length() * data[2].length();
            }
            case "//" -> {
                count = data[0].length() / data[2].length();
            }
        }
        return ".".repeat(count);
    }
}
