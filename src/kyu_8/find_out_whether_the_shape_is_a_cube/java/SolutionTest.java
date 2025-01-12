package kyu_8.find_out_whether_the_shape_is_a_cube.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test
    void sampleTest() {
        assertFalse(Cube.isCube( 12,  2), "For input (12, 2)");
        assertFalse(Cube.isCube(  8,  3), "For input (8, 3)");
        assertTrue (Cube.isCube(  8,  2), "For input (8, 2)");
        assertFalse(Cube.isCube( -8, -2), "For input (-8, -2)");
        assertFalse(Cube.isCube(  0,  0), "For input (0, 0)");
        assertTrue (Cube.isCube( 27,  3), "For input (27, 3)");
        assertFalse(Cube.isCube(  1,  5), "For input (1, 5)");
        assertTrue (Cube.isCube(125,  5), "For input (125, 5)");
        assertFalse(Cube.isCube(125, -5), "For input (125, -5)");
        assertFalse(Cube.isCube(  0, 12), "For input (0, 12)");
        assertFalse(Cube.isCube( 12, -1), "For input (12, -1)");
        assertTrue (Cube.isCube(  1,  1), "For input (1, 1)");
    }
}
