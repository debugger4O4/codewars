package kyu_6.where_is_my_parent_cry.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WhereIsMyParent {
    static String findChildren(final String text) {
        char[] chars = text.toCharArray();
        Arrays.sort(chars);
        List<Character> uppers = new ArrayList<>();
        List<Character> lowers = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int j = 0;
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                uppers.add(c);
            } else {
                lowers.add(c);
            }
        }
        for (Character upper : uppers) {
            result.append(upper);
            for (; j < lowers.size(); j++) {
                if (Math.abs(upper - lowers.get(j)) == 32) {
                    result.append(lowers.get(j));
                } else {
                    break;
                }
            }
        }
        return result.toString();
    }
}

