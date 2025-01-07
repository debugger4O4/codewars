package kyu_7.cyrillic_letters.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sample Tests")
class SampleTests {

    @Test @DisplayName("Fixed Tests")
    void fixedTests() {
        doTest(true, 'Д');
        doTest(false, 'D');
        doTest(true, 'а');
        doTest(false, 'a');
    }

    void doTest(boolean expected, char letter) {
        assertEquals(expected, Kata.isCyrillic(letter), String.format("Incorrect answer for letter = '%c'", letter));
    }
}

