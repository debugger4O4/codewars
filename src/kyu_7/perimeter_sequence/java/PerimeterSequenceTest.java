package kyu_7.perimeter_sequence.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimeterSequenceTest {

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        assertEquals(12, Kata.perimeterSequence(1, 3), "perimeterSequence(1, 3) returned an incorrect result.\n\n");
    }

}

