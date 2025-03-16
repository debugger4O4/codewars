package kyu_8.grasshopper_If_else_syntax_debug.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SolutionTest {

    private static void doTest(int health, boolean expected) {
        String     msg = "checkAlive(" + health + ") returned an incorrect answer.\n\n";
        boolean actual = Solution.checkAlive(health);
        if(expected) assertTrue(actual, msg);
        else         assertFalse(actual, msg);
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(5, true);
        doTest(0, false);
    }
}
