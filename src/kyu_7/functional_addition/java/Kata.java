// https://www.codewars.com/kata/538835ae443aae6e03000547/train/java

package kyu_7.functional_addition.java;

import java.util.function.IntUnaryOperator;

public class Kata {

    public static IntUnaryOperator add(int n) {
        return a -> a + n;
    }

}