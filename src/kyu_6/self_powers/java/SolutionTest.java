package kyu_6.self_powers.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test @DisplayName("Sample tests")
    void sampleTests() {
        assertEquals("1", Kata.power(1), "n = 1");
        assertEquals("5", Kata.power(2), "n = 2");
        assertEquals("32", Kata.power(3), "n = 3");
        assertEquals("405071317", Kata.power(10), "n = 10");
        assertEquals("8342802636", Kata.power(327), "n = 327");
    }
}

