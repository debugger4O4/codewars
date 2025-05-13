package kyu_8.simple_calculator.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    /********************************
     *** helper functions/methods ***
     ********************************/

    void doTest(double a, double b, String op, double expected) {
        double actual = Calculator.calculate(a, b, op);
        String messageOnFail = "Test failed for a = " + a + ", b = " + b + ", op = \"" + op + "\"\n\n";

        assertEquals(expected, actual, 1e-3, messageOnFail);
    }
    void testError(double a, double b, String op) {
        String messageOnFail = "Didn't throw an IllegalArgumentException for a = " + a + ", b = " + b + ", op = \"" + op + "\"\n\n";

        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(a, b, op), messageOnFail);
    }

    /*************
     *** tests ***
     *************/

    @Test
    @Order(1)
    @DisplayName("Fixed tests: Valid input")
    void validFixedTests() {
        // format: a, b, op, expected
        doTest(1, 2, "+", 3);
        doTest(6, 2, "+", 8);
        doTest(4, 3, "-", 1);
        doTest(5, 5, "*", 25);
        doTest(5, 4, "/", 1.25);
    }

    @Test
    @Order(2)
    @DisplayName("Fixed tests: Invalid input")
    void invalidFixedTests() {
        // format: a, b, op
        testError(6, 2, "&");
        testError(3, 5, "\\");
        testError(5, 5, "=");
        testError(6, 3, "\t");
    }
}

