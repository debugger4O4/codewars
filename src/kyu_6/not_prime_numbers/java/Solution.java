package kyu_6.not_prime_numbers.java;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static List<Integer> notPrimes(int a, int b) {
        return IntStream
                .range(a, b)
                .boxed()
                .filter(i -> (i + "").matches("[2357]+") && !BigInteger.valueOf(i).isProbablePrime(9))
                .toList();
    }
}