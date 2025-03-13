// https://www.codewars.com/kata/5afb26f7de4c7f42bb000529/train/java

package kyu_5.rsa_decryption_challenge.java;

import java.math.*;

class RsaDecrypter {

    public static String decryptRsaCipher(String c, String e, String n, String p) {
        BigInteger u = new BigInteger(c)
                .modPow(new BigInteger(e)
                        .modInverse(new BigInteger(p)
                                .subtract(new BigInteger("1"))
                                .multiply(new BigInteger(n)
                                        .divide(new BigInteger(p))
                                        .subtract(new BigInteger("1")))), new BigInteger(n));
        StringBuilder result = new StringBuilder();
        for (; 0 < u.compareTo(new BigInteger("0")); u = u.divide(new BigInteger("100"))) {
            result.insert(0, " ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(Integer.parseInt("" + u.mod(new BigInteger("100")))));
        }
        return result.toString();
    }
}
