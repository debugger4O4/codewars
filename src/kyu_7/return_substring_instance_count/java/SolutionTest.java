package kyu_7.return_substring_instance_count.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private void doTest(String fullText, String search, int expected) {
        String messageOnFail = "Test failed for fullText = \"" + fullText + "\", search = \"" + search + "\"\n\n";

        assertEquals(expected, Solution.substringCount(fullText, search), messageOnFail);
    }

    @Test
    @DisplayName("Sample tests")
    void fixedTests() {
        doTest("abcdeb", "b", 2);
        doTest("abcdeb", "a", 1);
        doTest("ccddeeccddeecc", "cc", 3);

        // overlaps
        doTest("aaabbbccc", "bb", 1);
        doTest(",,,..239,,,,,.,", ",,", 3);
    }
}
