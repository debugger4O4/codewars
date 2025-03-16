package kyu_7.the_wheat_rice_and_chessboard_problem.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void basicTests() {
        assertEquals(0, Solution.squaresNeeded(0));
        assertEquals(1, Solution.squaresNeeded(1));
        assertEquals(2, Solution.squaresNeeded(2));
        assertEquals(2, Solution.squaresNeeded(3));
        assertEquals(3, Solution.squaresNeeded(4));
    }
}
