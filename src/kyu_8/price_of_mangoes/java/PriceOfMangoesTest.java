package kyu_8.price_of_mangoes.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceOfMangoesTest {

    private static void doTest(int q, int p, int expected) {
        assertEquals(expected, Mango.mango(q, p), String.format("Incorrect answer for quantity = %d, price = %d", q, p));
    }

    @Test @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(3, 3, 6);
        doTest(9, 5, 30);
    }
}
