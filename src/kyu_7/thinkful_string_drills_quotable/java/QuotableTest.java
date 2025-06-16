package kyu_7.thinkful_string_drills_quotable.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuotableTest {

    private static void doTest(String n, String q, String expected) {
        assertEquals(expected, Kata.quotable(n, q),
                "quotable(\"" + n + "\", \"" + q + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("Grae", "Practice makes perfect", "Grae said: \"Practice makes perfect\"");
        doTest("Dan", "Get back to work, Grae", "Dan said: \"Get back to work, Grae\"");
        doTest("Alex", "Ruby is great fun", "Alex said: \"Ruby is great fun\"");
        doTest("Bethany", "Yes, way more fun than R", "Bethany said: \"Yes, way more fun than R\"");
        doTest("Darrell", "What the heck is this thing?", "Darrell said: \"What the heck is this thing?\"");
    }
}

