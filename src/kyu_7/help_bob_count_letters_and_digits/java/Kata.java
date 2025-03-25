// https://www.codewars.com/kata/5738f5ea9545204cec000155/train/java

package kyu_7.help_bob_count_letters_and_digits.java;

public class Kata{
    public static int countLettersAndDigits(String input){
        return input.replaceAll("[^a-zA-Z0-9]", "").length();
    }
}
