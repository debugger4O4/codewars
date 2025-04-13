// https://www.codewars.com/kata/566dc566f6ea9a14b500007b/train/java

package kyu_8.filtering_even_numbers_bug_fixes.java;

import java.util.List;
import java.util.stream.Collectors;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(odd -> odd % 2 != 0).collect(Collectors.toList());
    }
}