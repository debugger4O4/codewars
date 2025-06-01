package kyu_8.wilson_primes.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class WilsonPrimeTest {
    @Test void test0() {
        assertEquals(false, WilsonPrime.amIWilson(0));
    }

    @Test void test1() {
        assertEquals(false, WilsonPrime.amIWilson(1));
    }

    @Test void test5() {
        assertEquals(true, WilsonPrime.amIWilson(5));
    }
}
