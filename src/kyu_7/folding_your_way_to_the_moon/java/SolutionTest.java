package kyu_7.folding_your_way_to_the_moon.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals((Long)42L, PaperFolder.fold(384000000.0));
        assertEquals((Long)0L, PaperFolder.fold(0.00005));
    }
}
