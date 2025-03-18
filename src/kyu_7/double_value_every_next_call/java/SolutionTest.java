package kyu_7.double_value_every_next_call.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void basicTests() {
        assertEquals(1, A.getNumber());
        assertEquals(2, A.getNumber());
        assertEquals(4, A.getNumber());
        assertEquals(8, A.getNumber());
        assertEquals(16, A.getNumber());
    }
}

