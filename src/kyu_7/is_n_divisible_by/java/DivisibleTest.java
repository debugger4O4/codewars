package kyu_7.is_n_divisible_by.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DivisibleTest {
    @Test
    void basicTests() {
//        assertFalse(Divisible.isDivisible(3, 3, 4));
        assertTrue(Divisible.isDivisible(12, 3, 4));
        assertFalse(Divisible.isDivisible(8, 3, 4, 2, 5));
    }
}

