// https://www.codewars.com/kata/60d2325592157c0019ee78ed/train/java

package kyu_6.sum_the_nums_sum_the_sums_and_sum_the_nums_up_to_that_sum.java;

import java.math.BigInteger;

public class Solution {
    public static BigInteger sumOfSums(int n) {
        BigInteger N = BigInteger.valueOf(n);
        BigInteger ONE = BigInteger.ONE;
        BigInteger TWO = BigInteger.valueOf(2);
        BigInteger SIX = BigInteger.valueOf(6);
        BigInteger Zn = N.multiply(N.add(ONE)).multiply(N.add(TWO)).divide(SIX);
        return Zn.multiply(Zn.add(ONE)).divide(TWO);
    }
}
