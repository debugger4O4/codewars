package kyu_7.regexp_basics_is_it_a_letter.java;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isLetter(""));
        assertTrue(StringUtils.isLetter("a"));
        assertTrue(StringUtils.isLetter("X"));
        assertFalse(StringUtils.isLetter("7"));
        assertFalse(StringUtils.isLetter("*"));
        assertFalse(StringUtils.isLetter("ab"));
        assertFalse(StringUtils.isLetter("a\n"));
    }
}
