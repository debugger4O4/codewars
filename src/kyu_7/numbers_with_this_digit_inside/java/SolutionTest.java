package kyu_7.numbers_with_this_digit_inside.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void BasicTests() {
        assertArrayEquals(new long[] { 0, 0, 0 }, Kata.NumbersWithDigitInside(5, 6));
        assertArrayEquals(new long[] { 1, 6, 6 }, Kata.NumbersWithDigitInside(7, 6));
        assertArrayEquals(new long[] { 3, 22, 110 }, Kata.NumbersWithDigitInside(11, 1));
        assertArrayEquals(new long[] { 2, 30, 200 }, Kata.NumbersWithDigitInside(20, 0));
        assertArrayEquals(new long[] { 9, 286, 5955146588160L }, Kata.NumbersWithDigitInside(44, 4));
    }
}
