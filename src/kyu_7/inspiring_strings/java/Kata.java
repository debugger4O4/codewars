package kyu_7.inspiring_strings.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Kata {
    public static String longestWord(String wordString) {
        String[] strings = wordString.split(" ");
        int maxLength = Arrays.stream(strings).max(Comparator.comparing(String::length)).get().length();
        List<String> stringArrayList = new ArrayList<>();
        Arrays.stream(strings).forEach(f -> {
            if (f.length() == maxLength) {
                stringArrayList.add(f);
            }
        });
        return stringArrayList.get(stringArrayList.size() - 1);
    }
}
