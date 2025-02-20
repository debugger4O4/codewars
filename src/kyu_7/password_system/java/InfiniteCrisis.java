package kyu_7.password_system.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InfiniteCrisis {
    @Test
    public void VS_ZOOM() {
        doTest(new int[]{1,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1}, "Yes");
        doTest(new int[]{1,1,0,0,0,0,1,1,0}, "No");
    }
    private void doTest(final int[] key, final String expected) {
        assertEquals(expected, Kata.helpZoom(key));
    }
}
