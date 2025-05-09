package kyu_6.highest_number_with_two_prime_factors.java;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class Highest2FactorsTest {

    private static void testing(String i, String results) {
        assertEquals(results, i);
    }
    @Test
    public void test1() {
        System.out.println("Basic Tests");
        testing(Arrays.toString(Highest2Factors.highestBiPrimeFac(2, 3, 50)),
                Arrays.toString(new long[] {48, 4, 1}));
        testing(Arrays.toString(Highest2Factors.highestBiPrimeFac(5, 11, 1000)),
                Arrays.toString(new long[] {605, 1, 2}));
        testing(Arrays.toString(Highest2Factors.highestBiPrimeFac(3, 13, 5000)),
                Arrays.toString(new long[] {4563, 3, 2}));
        testing(Arrays.toString(Highest2Factors.highestBiPrimeFac(5, 7, 5000)),
                Arrays.toString(new long[] {4375, 4, 1}));
    }
}

