// https://www.codewars.com/kata/5a0b4dc2ffe75f72f70000ef/train/java

package kyu_7.santas_naughty_list.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FindList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        List<String> result = new ArrayList<>();
        children.forEach(child -> {
            String chld = santasList.stream().filter(f -> f.equals(child)).findFirst().orElse("");
            result.add(chld);
        });
        return result.stream().filter(f -> !f.isEmpty()).distinct().sorted().collect(Collectors.toList());
    }
}
