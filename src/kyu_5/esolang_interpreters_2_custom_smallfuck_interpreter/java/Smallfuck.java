// https://www.codewars.com/kata/58678d29dbca9a68d80000d7/train/java

package kyu_5.esolang_interpreters_2_custom_smallfuck_interpreter.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Smallfuck {

    public static String interpreter(String code, String tape) {
        Map<Integer, Integer> bracketMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '[') {
                stack.push(i);
            } else if (c == ']') {
                if (!stack.isEmpty()) {
                    int prev = stack.pop();
                    bracketMap.put(prev, i);
                    bracketMap.put(i, prev);
                }
            }
        }

        int[] nums = tape.chars().map(c -> c - '0').toArray();

        int j = 0;
        int idx = 0;

        while (idx >= 0 && idx < code.length()) {
            if (j < 0 || j >= nums.length) {
                break;
            }

            char data = code.charAt(idx);
            switch (data) {
                case '>' -> j++;
                case '<' ->
                        j--;
                case '*' ->
                        nums[j] = nums[j] == 1 ? 0 : 1;
                case '[' -> {
                    if (nums[j] == 0) {
                        idx = bracketMap.getOrDefault(idx, idx + 1);
                    }
                }
                case ']' -> {   // Конец цикла
                    if (nums[j] != 0) {
                        idx = bracketMap.getOrDefault(idx, idx - 1);
                    }
                }
            }
            idx++;
        }

        return String.join("", Arrays.stream(nums).mapToObj(Integer::toString).toList());
    }
}
