package kyu_6.dominant_primes.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals(8,Solution.solve(0,10));
        assertEquals(1080,Solution.solve(2,200));
        assertEquals(52114889,Solution.solve(1000,100000));
        assertEquals(972664400,Solution.solve(4000,500000));
    }
}
