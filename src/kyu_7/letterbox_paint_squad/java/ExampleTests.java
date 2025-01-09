package kyu_7.letterbox_paint_squad.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ExampleTests {

    @Test
    public void ex() {
        assertArrayEquals(new int[]{1,9,6,3,0,1,1,1,1,1}, Dinglemouse.paintLetterboxes(125,132));
    }

}
