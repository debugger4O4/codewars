package kyu_7.shift_left.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class SolutionSampleTest {

    @Test
    @DisplayName("Test cases")
    void shouldBeEqual() {
        assertAll(
                () -> assertEquals(2, Solution.shiftLeft("test", "west")),
                () -> assertEquals(7, Solution.shiftLeft("test", "yes")),
                () -> assertEquals(1, Solution.shiftLeft("b", "ab")),
                () -> assertEquals(0, Solution.shiftLeft("", ""))
        );
    }
}
