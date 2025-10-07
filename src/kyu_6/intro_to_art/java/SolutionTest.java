package kyu_6.intro_to_art.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[0], Kata.getW(-5));
        assertArrayEquals(new String[0], Kata.getW(1));
        assertArrayEquals(new String[] {
                "*   *   *",
                " * * * * ",
                "  *   *  "
        }, Kata.getW(3));
        assertArrayEquals(new String[] {
                "*           *           *",
                " *         * *         * ",
                "  *       *   *       *  ",
                "   *     *     *     *   ",
                "    *   *       *   *    ",
                "     * *         * *     ",
                "      *           *      "
        }, Kata.getW(7));
    }
}
