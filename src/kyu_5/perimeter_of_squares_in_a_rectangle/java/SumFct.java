// https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java

package kyu_5.perimeter_of_squares_in_a_rectangle.java;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger[] bigIntegers = new BigInteger[n.intValue() + 1];
        bigIntegers[0] = BigInteger.ONE;
        bigIntegers[1] = BigInteger.ONE;
        BigInteger fibonacciSum = BigInteger.ONE.add(BigInteger.ONE);
        for (int i = 2; i <= n.intValue(); i++) {
            bigIntegers[i] = bigIntegers[i - 1].add(bigIntegers[i - 2]);
            fibonacciSum = fibonacciSum.add(bigIntegers[i]);
        }

        return fibonacciSum.multiply(BigInteger.valueOf(4));

    }
}
