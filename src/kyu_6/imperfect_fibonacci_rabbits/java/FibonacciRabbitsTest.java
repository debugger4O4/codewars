package kyu_6.imperfect_fibonacci_rabbits.java;

import static junit.framework.TestCase.*;
import org.junit.Test;

public class FibonacciRabbitsTest {

    @Test
    public void testExample1() {
        assertEquals(96, FibonacciRabbits.imperfectFibonacciRabbits(6, 3, 6));
    }

    @Test
    public void testExample2() {
        assertEquals(423, FibonacciRabbits.imperfectFibonacciRabbits(8, 3, 4));
    }
}
