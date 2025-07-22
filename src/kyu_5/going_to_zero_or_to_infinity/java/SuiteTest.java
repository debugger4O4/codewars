package kyu_5.going_to_zero_or_to_infinity.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuiteTest {
    @Test
    public void sampleTests() {
        doTest(5, 1.275);
        doTest(6, 1.2125);
        doTest(7, 1.173214);
        doTest(8, 1.146651);
        doTest(30, 1.034525);
        doTest(20, 1.052786);
        doTest(50, 1.020416);
        doTest(113, 1.008929);
    }

    private static void doTest(int n, double expected) {
        String message = "for n = " + n + "\n";
        double actual = Suite.going(n);
        assertEquals(expected, actual, 1e-6, message);
    }
}
