package kyu_6.ackermann_function.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AckermannTest {

    @Test
    public void shouldWork() {
        assertEquals("3", 3, Solution.Ackermann(1, 1), 0);
        assertEquals("13", 13, Solution.Ackermann(4, 0), 0);
    }

}
