package kyu_6.collatz.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("3->10->5->16->8->4->2->1", Collatz.collatz(3));
    }
}
