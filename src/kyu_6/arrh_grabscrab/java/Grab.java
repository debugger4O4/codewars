// https://www.codewars.com/kata/52b305bec65ea40fe90007a7/train/java

package kyu_6.arrh_grabscrab.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Grab {

    public static List<String> grabscrab(String s, List<String> words) {
        List<String> filterList = words.stream().filter(f -> f.length() == s.length()).toList();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        List<String> result = new ArrayList<>();
        outerLoop:
        for (String value : filterList) {
            char[] compare = value.toCharArray();
            Arrays.sort(compare);
            for (int j = 0; j < chars.length; j++) {
                if (compare[j] != chars[j]) {
                    continue outerLoop;
                }
            }
            result.add(value);
        }
        return result;
    }
}
