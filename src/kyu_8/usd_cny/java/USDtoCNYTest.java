package kyu_8.usd_cny.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class USDtoCNYTest {

    private static void doTest(int usd, String expected) {
        assertEquals(expected, Kata.usdcny(usd), "Incorrect answer for usd = " + usd + "\n\n");
    }

    @Test @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(15, "101.25 Chinese Yuan");
        doTest(465, "3138.75 Chinese Yuan");
    }
}

