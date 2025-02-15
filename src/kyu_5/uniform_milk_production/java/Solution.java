// https://www.codewars.com/kata/620f287d83ba7e0047a4affe/train/java

package kyu_5.uniform_milk_production.java;

import java.util.*;

public class Solution {
    public static int uniformMilkOutput(int[] a, int x) {
        int resultIndex = -1;
        long currentSum = 0;
        long maxDifference = -1;
        Deque<Integer> minDeq = new LinkedList<>();
        Deque<Integer> maxDeq = new LinkedList<>();
        for (int i = 0; i < a.length; ++i) {
            if (!minDeq.isEmpty() && minDeq.peekFirst() == i - x) {
                minDeq.pollFirst();
            }
            if (!maxDeq.isEmpty() && maxDeq.peekFirst() == i - x) {
                maxDeq.pollFirst();
            }
            while (!minDeq.isEmpty() && a[minDeq.peekLast()] > a[i]) {
                minDeq.pollLast();
            }
            while (!maxDeq.isEmpty() && a[maxDeq.peekLast()] < a[i]) {
                maxDeq.pollLast();
            }
            minDeq.offerLast(i);
            maxDeq.offerLast(i);
            currentSum += a[i];
            if (i >= x - 1) {
                long avg = currentSum * (x - 1);
                for (int j : new int[] {minDeq.peekFirst(), maxDeq.peekFirst()}) {
                    long d = Math.abs(avg - (currentSum - a[j]) * x);
                    if (d > maxDifference || d == maxDifference && j < resultIndex) {
                        maxDifference = d; resultIndex = j;
                    }
                }
                currentSum -= a[i - x + 1];
            }
        }
        return resultIndex;
    }
}
