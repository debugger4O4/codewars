package kyu_7.consecutive_digits_to_form_sum.java;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SampleTest {
    @Test
    public void checkSmallValues() {
        assertTrue(Kata.consecutiveDucks(69));
        assertFalse(Kata.consecutiveDucks(8));
        assertTrue(Kata.consecutiveDucks(57));
        assertTrue(Kata.consecutiveDucks(6));
        assertTrue(Kata.consecutiveDucks(13));
        assertFalse(Kata.consecutiveDucks(16));
        assertTrue(Kata.consecutiveDucks(91));
    }
    @Test
    public void checkMediumValues() {
        assertTrue(Kata.consecutiveDucks(522));
        assertTrue(Kata.consecutiveDucks(974));
        assertTrue(Kata.consecutiveDucks(755));
        assertFalse(Kata.consecutiveDucks(512));
        assertTrue(Kata.consecutiveDucks(739));
        assertTrue(Kata.consecutiveDucks(1006));
        assertTrue(Kata.consecutiveDucks(838));
    }
    @Test
    public void checkLargeValues() {
        assertTrue(Kata.consecutiveDucks(382131));
        assertTrue(Kata.consecutiveDucks(118070));
        assertTrue(Kata.consecutiveDucks(17209));
        assertFalse(Kata.consecutiveDucks(32768));
        assertTrue(Kata.consecutiveDucks(161997));
        assertTrue(Kata.consecutiveDucks(400779));
        assertTrue(Kata.consecutiveDucks(198331));
    }
}
