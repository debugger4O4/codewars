package kyu_7.valid_spacing.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test
    void fixedTests() {
//        assertTrue (Kata.validSpacing("Hello world"), "'Hello world'");
        assertFalse(Kata.validSpacing(" Hello world"), "' Hello world'");
        assertFalse(Kata.validSpacing("Hello  world "), "'Hello  world '");
        assertTrue (Kata.validSpacing("Hello"), "'Hello'");
        assertTrue (Kata.validSpacing("Helloworld"), "'Helloworld'");
    }
}

