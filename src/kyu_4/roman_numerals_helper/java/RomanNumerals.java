// https://www.codewars.com/kata/51b66044bce5799a7f000003/solutions/java

package kyu_4.roman_numerals_helper.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {

    public static String toRoman(int n) {
        TreeMap<Integer, String> mapToRoman = fillMapToRoman();
        StringBuilder result = new StringBuilder();
        int l = mapToRoman.floorKey(n);
        if (n == l) {
            return mapToRoman.get(n);
        }
        result.append(mapToRoman.get(l) + toRoman(n - l));
        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        Map<Character, Integer> mapToNumeral = fillMapToNumeral();
        int number = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i + 1 == romanNumeral.length() || mapToNumeral.get(romanNumeral.charAt(i)) >= mapToNumeral.get(romanNumeral.charAt(i + 1))) {
                number += mapToNumeral.get(romanNumeral.charAt(i));
            } else {
                number -= mapToNumeral.get(romanNumeral.charAt(i));
            }
        }
        return number;
    }

    public static TreeMap<Integer, String> fillMapToRoman() {
        TreeMap<Integer, String> result = new TreeMap<>();
        result.put(1000, "M");
        result.put(900, "CM");
        result.put(500, "D");
        result.put(400, "CD");
        result.put(100, "C");
        result.put(90, "XC");
        result.put(50, "L");
        result.put(40, "XL");
        result.put(10, "X");
        result.put(9, "IX");
        result.put(5, "V");
        result.put(4, "IV");
        result.put(1, "I");
        return result;
    }

    public static Map<Character, Integer> fillMapToNumeral() {
        Map<Character, Integer> result = new LinkedHashMap<>();
        result.put('M', 1000);
        result.put('D', 500);
        result.put('C', 100);
        result.put('L', 50);
        result.put('X', 10);
        result.put('V', 5);
        result.put('I', 1);
        return result;
    }
}
