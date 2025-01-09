package kyu_7.simple_fun_40_timed_reading.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void basicTests() {
        doTest(4, "The Fox asked the stork, 'How is the soup?'", 7);
        doTest(1, "...", 0);
        doTest(3, "This play was good for us.", 3);
        doTest(3, "Suddenly he stopped, and glanced up at the houses", 5);
        doTest(6, "Zebras evolved among the Old World horses within the last four million years.", 11);
        doTest(5, "Although zebra species may have overlapping ranges, they do not interbreed.", 6);
        doTest(1, "Oh!", 0);
        doTest(5, "Now and then, however, he is horribly thoughtless, and seems to take a real delight in giving me pain.", 14);
        doTest(6, "Vu hc qrnqtayywz, cxogppxk ymzbj wvh zy, aoiwxe.", 6);
    }
    private void doTest(final int maxLength, final String text, final int expected) {
        assertEquals(expected, Kata.timedReading(maxLength, text));
    }
}
