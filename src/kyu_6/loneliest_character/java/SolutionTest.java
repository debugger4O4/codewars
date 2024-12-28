package kyu_6.loneliest_character.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    @DisplayName("Example tests")
    void testBasic() {
        assertArrayEquals(new char[] { 'a' }, LoneChar.loneliest("a"));
        assertArrayEquals(new char[] { 'g' }, LoneChar.loneliest("abc d   ef  g   h i j      "));
        assertArrayEquals(new char[] { 'b' }, LoneChar.loneliest("a   b   c "));
        assertArrayEquals(new char[] { 'z' }, LoneChar.loneliest("  abc  d  z    f gk s "));
        assertArrayEquals(new char[] { 'b', 'c' }, LoneChar.loneliest("a  b  c  de  "));
        assertArrayEquals(new char[] { 'a', 'b', 'c' }, LoneChar.loneliest("abc"));
    }
}

