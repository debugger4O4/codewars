// https://www.codewars.com/kata/5a24254fe1ce0ec2eb000078/train/java

package kyu_6.simple_string_indices.java;

import java.util.Stack;

public class Indice {

    public static int solve(String str, int index){
        char[] chars = str.toCharArray();
        if (chars[index] != '(') {
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = index; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.add(chars[i]);
            } else if (chars[i] == ')') {
                stack.pop();
            }
            if (stack.empty()) {
                return i;
            }
        }
        return -1;
    }
}
