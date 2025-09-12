// https://www.codewars.com/kata/5aa3af22ba1bb5209f000037/train/java

package kyu_7.simple_equation_reversal.java;

class Solution{
    public static String solve(String eq){
        String[] nums = eq.split("[*+-/]");
        String[] ops = eq.replaceAll("[^*/\\-+]","").split("");
        StringBuilder result = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = i - 1;
            result.append(nums[i]);
            if (n >= 0) {
                result.append(ops[n]);
            }
        }
        return result.toString();
    }
}
