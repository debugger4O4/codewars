package kyu_7.ean_validation.java;

import java.util.Arrays;

public class EANValidator {
    public static boolean validate(String eanCode) {
        Object[] digits = Arrays.stream(eanCode.split("")).map(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            if ((i + 1) % 2 == 0) {
                sum += (int) digits[i] * 3;
            } else {
                sum += (int) digits[i];
            }
        }
        return sum % 10 == 0 || 10 - (sum % 10) == (int) digits[digits.length - 1];
    }
}