package kyu_7.find_sum_of_top_left_to_bottom_right_diagonals.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testMatrix1() {
        final int[][] matrix = new int[][]{{12}};
        assertEquals(12, Diagonal.diagonalSum(matrix));
    }

    @Test
    public void testMatrix2() {
        final int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        assertEquals(5, Diagonal.diagonalSum(matrix));
    }

    @Test
    public void testMatrix3() {
        final int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(15, Diagonal.diagonalSum(matrix));
    }

    @Test
    public void testMatrix4() {
        final int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        assertEquals(34, Diagonal.diagonalSum(matrix));
    }
}
