// https://www.codewars.com/kata/51c89385ee245d7ddf000001/train/java

package kyu_7.substituting_variables_into_strings_padded_numbers.java;

public class Kata {

    public static String solution(int value) {
        return "Value is " + "0".repeat(5 - String.valueOf(value).length()) + value;
    }
}