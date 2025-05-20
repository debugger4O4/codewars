// https://www.codewars.com/kata/57ebaa8f7b45ef590c00000c/train/java

package kyu_7.numbers_to_letters.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata {

    private static final Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("1", "z");
        dictionary.put("2", "y");
        dictionary.put("3", "x");
        dictionary.put("4", "w");
        dictionary.put("5", "v");
        dictionary.put("6", "u");
        dictionary.put("7", "t");
        dictionary.put("8", "s");
        dictionary.put("9", "r");
        dictionary.put("10", "q");
        dictionary.put("11", "p");
        dictionary.put("12", "o");
        dictionary.put("13", "n");
        dictionary.put("14", "m");
        dictionary.put("15", "l");
        dictionary.put("16", "k");
        dictionary.put("17", "j");
        dictionary.put("18", "i");
        dictionary.put("19", "h");
        dictionary.put("20", "g");
        dictionary.put("21", "f");
        dictionary.put("22", "e");
        dictionary.put("23", "d");
        dictionary.put("24", "c");
        dictionary.put("25", "b");
        dictionary.put("26", "a");
        dictionary.put("27", "!");
        dictionary.put("28", "?");
        dictionary.put("29", " ");

    }

    public static String switcher(String[] arr) {
        StringBuilder result = new StringBuilder();
        Arrays.stream(arr).forEach(f -> result.append(dictionary.get(f)));
        return result.toString();
    }
}
