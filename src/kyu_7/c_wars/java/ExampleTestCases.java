package kyu_7.c_wars.java;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ExampleTestCases {

    @Test
    public void testExamples() {
        assertEquals("C.Wars", CWars.initials("code wars"));
        assertEquals("B.H.Obama", CWars.initials("Barack hussain obama"));
        assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
    }

}
