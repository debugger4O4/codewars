// https://www.codewars.com/kata/555b5726783b10beaf00004a/train/java

package kyu_6.imperfect_fibonacci_rabbits.java;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRabbits {
    public static int imperfectFibonacciRabbits(int n, int b, int l) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= n; i++) {
            list.add(b * list.subList(Math.max(0, i - l), i - 1).stream().mapToInt(m -> m).sum());
        }
        return list.subList(Math.max(0, n + 1 - l), n + 1).stream().mapToInt(m -> m).sum();
    }
}

