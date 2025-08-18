package kyu_6.the_papefold_sequence.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaperFoldTest {
    @Test
    public void testWithTwenty() {
        PaperFold p = new PaperFold();
        int testArray[] = {1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i < 20; i++) {
            assertEquals("Element " + (i + 1), testArray[i], p.getAsInt());
        }
    }
}

