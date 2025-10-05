package kyu_6.whats_a_name_in.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTest() {
        assertEquals(true, Kata.nameInStr("Across the rivers", "chris"));
        assertEquals(false, Kata.nameInStr("Next to a lake", "chris"));
        assertEquals(false, Kata.nameInStr("Under a sea", "chris"));
        assertEquals(false, Kata.nameInStr("A crew that boards the ship", "chris"));
        assertEquals(false, Kata.nameInStr("A live son", "Allison"));
    }
}
