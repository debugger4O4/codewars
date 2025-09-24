package kyu_7.max_min_arrays.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertArrayEquals(new int[]{15,7,12,10,11},Solution.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},Solution.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},Solution.solve(new int[]{15,11,10,7,12}));
    }
}
