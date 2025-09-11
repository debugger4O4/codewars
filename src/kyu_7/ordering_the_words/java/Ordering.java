// https://www.codewars.com/kata/55d7e5aa7b619a86ed000070/train/java

package kyu_7.ordering_the_words.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ordering {
    public String orderWord(String s){
        return s == null || s.isEmpty() ? "Invalid String!" :
                Arrays.stream(s.split(""))
                        .sorted()
                        .collect(Collectors.joining());
    }
}
