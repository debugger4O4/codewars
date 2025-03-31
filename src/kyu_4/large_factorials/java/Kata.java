// https://www.codewars.com/kata/557f6437bf8dcdd135000010/train/java

package kyu_4.large_factorials.java;

import java.math.BigInteger;

public class Kata {

    public static String Factorial(int n) {
        BigInteger result = BigInteger.ONE;
        if (n == 0) {
            return result.toString();
        }
        for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(n)) < 1 ; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result.toString();
    }
}
