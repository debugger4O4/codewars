package kyu_7.valid_parentheses.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests {
    @Test @DisplayName("Should return true for valid parentheses")
    void validCases() {
        runTest(true, "()");
        runTest(true, "((()))");
        runTest(true, "()()()");
        runTest(true, "(()())()");
        runTest(true, "()(())((()))(())()");
    }

    @Test @DisplayName("Should return false for invalid parentheses")
    void invalidCases() {
        runTest(false, ")(");
        runTest(false, "()()(");
        runTest(false, "((())");
        runTest(false, "())(()");
        runTest(false, ")()");
        runTest(false, ")");
    }

    @Test @DisplayName("Should return true for empty strings")
    void emptyString() {
        runTest(true, "");
    }
    private void runTest(boolean expected, String input) {
        assertEquals(expected, Kata.validParentheses(input), "Test failed for input \""+input+"\"");
    }
}
