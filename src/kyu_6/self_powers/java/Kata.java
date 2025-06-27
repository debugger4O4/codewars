// https://www.codewars.com/kata/5a90140efd8c06df340000bf/train/java

package kyu_6.self_powers.java;

import java.math.BigInteger;

public class Kata {

    public static String power(int n) {
        if (n == 1) {
            return "1";
        }
        BigInteger MOD = BigInteger.TEN.pow(10);
        BigInteger result = BigInteger.ZERO;
        for (int k = 1; k <= n; k++) {
            BigInteger base = BigInteger.valueOf(k);
            BigInteger pow = base.modPow(BigInteger.valueOf(k), MOD);
            result = result.add(pow).mod(MOD);
        }

        return result.toString();
    }
}
