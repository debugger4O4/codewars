package kyu_7.drone_fly_by.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DroneFlyByTest {

    private static void doTest(String lamps, String drone, String expected) {
        assertEquals(expected, Kata.flyBy(lamps, drone),
                "flyBy(\"" + lamps + "\", \"" + drone + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("xxxxxx", "====T", "ooooox");
        doTest("xxxxxxxxx", "==T", "oooxxxxxx");
        doTest("xxxxxxxxxxxxxxx", "=========T", "ooooooooooxxxxx");
    }
}

