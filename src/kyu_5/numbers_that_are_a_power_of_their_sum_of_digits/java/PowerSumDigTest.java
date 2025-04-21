package kyu_5.numbers_that_are_a_power_of_their_sum_of_digits.java;

import static org.junit.Assert.*;
import org.junit.Test;

public class PowerSumDigTest {

    private static void testing(long act, long exp) {
        assertEquals(exp, act);
    }
    @Test
    public void test1() {
        testing(PowerSumDig.powerSumDigTerm(1), 81);
        testing(PowerSumDig.powerSumDigTerm(2), 512);
        testing(PowerSumDig.powerSumDigTerm(3), 2401);
        testing(PowerSumDig.powerSumDigTerm(4), 4913);
    }
}
