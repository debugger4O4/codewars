// https://www.codewars.com/kata/5a092d9e46d843b9db000064/train/java

package kyu_7.array_element_parity.java;

import java.util.HashSet;
import java.util.Set;

class Solution{
    public static int solve(int [] arr){
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int sum = 0;
        for (int num : set) {
            sum += num;
        }
        return sum;
    }
}
