// https://www.codewars.com/kata/5629db57620258aa9d000014/train/java

package kyu_4.strings_mix.java;

import java.nio.CharBuffer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mixing {
    public static String mix(String s1, String s2) {
        if (s1.equals(s2)) {
            return "";
        }

        final Map<Character, Long> mapS1 = getFrequency(s1);
        final Map<Character, Long> mapS2 = getFrequency(s2);
        final List<Character> resultMap = new ArrayList<>(mapS1.keySet());

        for (char c : new ArrayList<>(mapS2.keySet())) {
            if (!resultMap.contains(c)) {
                resultMap.add(c);
            }
        }

        List<String> result = new ArrayList<>();

        for (Character character : resultMap) {
            final StringBuilder sb = new StringBuilder();
            final char current = character;
            final long frequency1 = mapS1.getOrDefault(current, 0L);
            final long frequency2 = mapS2.getOrDefault(current, 0L);
            final long frequencyMax = Math.max(frequency1, frequency2);

            if (frequency1 == frequency2) {
                sb.append('=');
            } else {
                sb.append(frequency1 > frequency2 ? '1' : '2');
            }
            sb.append(':');

            for (int j = 0; j < frequencyMax; j++) {
                sb.append(current);
            }

            result.add(sb.toString());
        }

        return result.stream()
                .sorted(Comparator.comparing(String::length)
                        .reversed()
                        .thenComparing(s -> s.length() == 0 ? -1 : s.charAt(0))
                        .thenComparing(Function.identity()))
                .collect(Collectors.joining("/"));
    }

    private static Map<Character, Long> getFrequency(String s) {
        return CharBuffer.wrap(s.toCharArray())
                .chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isAlphabetic)
                .filter(c -> Character.toUpperCase(c) != c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}

