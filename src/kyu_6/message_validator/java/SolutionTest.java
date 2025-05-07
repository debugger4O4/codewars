package kyu_6.message_validator.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test
    void basicTests() {
        assertTrue(Kata.isAValidMessage("3hey5hello2hi"), "3hey5hello2hi");
        assertTrue(Kata.isAValidMessage("4code13hellocodewars"), "4code13hellocodewars");
        assertFalse(Kata.isAValidMessage("3hey5hello2hi5"), "3hey5hello2hi5");
        assertFalse(Kata.isAValidMessage("code4hello5"), "code4hello5");
        assertTrue(Kata.isAValidMessage("1a2bb3ccc4dddd5eeeee"), "1a2bb3ccc4dddd5eeeee");
        assertTrue(Kata.isAValidMessage("0"), "");
        assertTrue(Kata.isAValidMessage(""), "");
    }
}

