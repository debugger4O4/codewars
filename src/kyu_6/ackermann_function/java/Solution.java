// https://www.codewars.com/kata/53ad69892a27079b34000bd9/train/java

package kyu_6.ackermann_function.java;

public class Solution {

    public static int Ackermann(int m, int n) {
        return m == 0 ? n + 1 :
               m > 0 && n == 0 ? Ackermann(m - 1, 1) :
               Ackermann(m - 1, Ackermann(m, n - 1));
    }
}
