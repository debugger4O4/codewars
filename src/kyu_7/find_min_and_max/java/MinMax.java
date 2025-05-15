// https://www.codewars.com/kata/57a1ae8c7cb1f31e4e000130/train/java

package kyu_7.find_min_and_max.java;

import java.util.Comparator;
import java.util.List;

class MinMax {
    static int[] getMinMax(List<Integer> list) {
        return new int[] {
          list.stream().min(Comparator.comparing(Integer::intValue)).get(),
          list.stream().max(Comparator.comparing(Integer::intValue)).get()
        };
    }
}
