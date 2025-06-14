package kyu_6.simple_square_numbers.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals(-1,Solution.solve(1));
        assertEquals(-1,Solution.solve(2));
        assertEquals(1,Solution.solve(3));
        assertEquals(-1,Solution.solve(4));
        assertEquals(4,Solution.solve(5));
        assertEquals(9,Solution.solve(7));
        assertEquals(1,Solution.solve(8));
        assertEquals(16,Solution.solve(9));
        assertEquals(-1,Solution.solve(10));
        assertEquals(25,Solution.solve(11));
        assertEquals(36,Solution.solve(13));
        assertEquals(64,Solution.solve(17));
        assertEquals(5428900,Solution.solve(88901));
        assertEquals(429235524,Solution.solve(290101));
    }
}
