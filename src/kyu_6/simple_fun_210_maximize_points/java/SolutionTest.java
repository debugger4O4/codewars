package kyu_6.simple_fun_210_maximize_points.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {
    @Test
    void testBasic() {
        assertEquals(3, Tennis.maximizePoints(new int[] { 3, 2, 4 }, new int[] { 1, 2, 3 }));
        assertEquals(0, Tennis.maximizePoints(new int[] { 1 }, new int[] { 99 }));
        assertEquals(1, Tennis.maximizePoints(new int[] { 99 }, new int[] { 1 }));
        assertEquals(3, Tennis.maximizePoints(new int[] { 25, 7, 26, 48 }, new int[] { 1, 36, 5, 33 }));
        assertEquals(7, Tennis.maximizePoints(new int[] { 7, 19, 23, 18, 38, 37, 38, 40 }, new int[] { 21, 12, 1, 0, 13, 38, 25, 49 }));
    }
}

