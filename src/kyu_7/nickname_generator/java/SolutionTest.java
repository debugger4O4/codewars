package kyu_7.nickname_generator.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("Jim", Generator.nickname("Jimmy"));
        assertEquals("Sam", Generator.nickname("Samantha"));
        assertEquals("Error: Name too short", Generator.nickname("Sam"));
        assertEquals("Kay", Generator.nickname("Kayne"));
        assertEquals("Mel", Generator.nickname("Melissa"));
        assertEquals("Jam", Generator.nickname("James"));
    }
}
