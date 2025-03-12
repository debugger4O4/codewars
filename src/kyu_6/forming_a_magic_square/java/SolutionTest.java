package kyu_6.forming_a_magic_square.java;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    @Test
    public void MixedTests() throws Exception {
        assertThat(Solution.formingMagicSquare(new int[][] {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}}), is(1));
        assertThat(Solution.formingMagicSquare(new int[][] {{4, 8, 2}, {4, 5, 7}, {6, 1, 6}}), is(4));
    }
}
