package kyu_6.circularly_sorted_array.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void testtrue() throws Exception {
        CircleSorted calc = new CircleSorted();

        int[] A = {3, 0, 1, 2};
        assertEquals(true,
                calc.isCircleSorted(A));

    }

    @Test
    public void testfalse() throws Exception {
        CircleSorted calc = new CircleSorted();
        int[] A = {9, 10, 14, 12};
        assertEquals(false,
                calc.isCircleSorted(A));
    }
}
