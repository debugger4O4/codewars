// https://www.codewars.com/kata/5d2d115dc42a1300250b6f8d/train/java

package kyu_6.clique_of_three.java;

import java.util.*;

public class Clique_Of_Three {

    public static String clique_of_3(String friends) {
        final Map<String, Set<String>> map = new HashMap<>();
        for (String s : friends.split("\n")) {
            if (s.isEmpty()) {
                continue;
            }
            String[] names = s.split("/");
            map.computeIfAbsent(names[0], k -> new HashSet<>()).add(names[1]);
            map.computeIfAbsent(names[1], k -> new HashSet<>()).add(names[0]);
        }
        for (String s : map.keySet()) {
            for (String s1 : map.get(s)) {
                for (String s3 : map.get(s1)) {
                    if (map.get(s3).contains(s) && !s.equals(s1) && !s.equals(s3) && !s3.equals(s1)) {
                        return String.format("%s/%s/%s", s, s1, s3);
                    }
                }
            }
        }
        return "";
    }
}
