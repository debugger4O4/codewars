package kyu_5.the_capturing_rook.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class MinimumRookDistanceTests {

    @Test
    @DisplayName("Example From Description")
    void testExampleCase() {
        final int[][] pawns = {{3, 0}, {5, 4}, {2, 2}, {1, 5}};
        final int[] rook = {2, 3};
        final int expected = 15;
        final int actual = MinimumRookDistance.calculateMinRookDistance(pawns, rook);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Rectangle")
    void testRectangle() {
        final int[][] pawns = {{6, 4}, {6, 2}, {1, 2}, {1, 4}};
        final int[] rook = {7, 7};
        final int expected = 13; // 'Min path is 1->2->3->4 (or 1->4->3->2)'
        final int actual = MinimumRookDistance.calculateMinRookDistance(pawns, rook);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Horizontal Line with 'Bump'")
    void testHorizontalLine() {
        final int[][] pawns = {{6, 3}, {2, 3}, {3, 4}, {5, 3}, {1, 3}, {4, 3}, {0, 3}};
        final int[] rook = {0, 0};
        final int expected = 11; // 'Min path is 7->5->2->3->6->4->1'
        final int actual = MinimumRookDistance.calculateMinRookDistance(pawns, rook);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Pawns Ascending and Descending")
    void testPawnsAscendingDescending() {
        final int[][] pawns = {{0, 5}, {1, 4}, {2, 3}, {3, 2}, {4, 2}, {5, 3}, {6, 4}, {7, 5}};
        final int[] rook = {3, 0};
        final int expected = 20; // 'Min path is 4->5->6->7->8->1->2->3'
        final int actual = MinimumRookDistance.calculateMinRookDistance(pawns, rook);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Z-Shape")
    void testZShape() {
        final int[][] pawns = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {3, 2}, {2, 3}, {1, 4}, {2, 4}, {3, 4}, {4, 4}};
        final int[] rook = {9, 9};
        final int expected = 22; // 'One min path is 10->9->8->7->6->5->4->3->2->1 (others possible)'
        final int actual = MinimumRookDistance.calculateMinRookDistance(pawns, rook);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Nested Squares")
    void testNestedSquares() {
        final int[][] pawns = {{0, 0}, {0, 9}, {9, 9}, {9, 0}, {4, 3}, {5, 4}, {5, 3}, {4, 4}, {0, 4}};
        final int[] rook = {6, 5};
        final int expected = 39; // 'Min path is 6->8->5->7->4->1->9->2->3'
        final int actual = MinimumRookDistance.calculateMinRookDistance(pawns, rook);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Edge Cases: n = 2")
    void edgeCases() {
        final int[][] pawns1 = {{1, 0}};
        final int[] rook1 = {0, 0};
        assertEquals(1, MinimumRookDistance.calculateMinRookDistance(pawns1, rook1));

        final int[][] pawns2 = {{0, 1}};
        final int[] rook2 = {1, 0};
        assertEquals(2, MinimumRookDistance.calculateMinRookDistance(pawns2, rook2));

        final int[][] pawns3 = {{0, 1}, {1, 0}};
        final int[] rook3 = {1, 1};
        assertEquals(3, MinimumRookDistance.calculateMinRookDistance(pawns3, rook3));
    }

    @Test
    @DisplayName("Stress Test: 15x15 board with 15 pawns")
    void stressTest() {
        final int[][] pawns = {{0, 0}, {4, 9}, {2, 10}, {11, 9}, {13, 0}, {4, 5}, {7, 12}, {12, 2}, {11, 5}, {13, 12}, {1, 0}, {12, 5}, {4, 8}, {5, 12}, {2, 8}};
        final int[] rook = {6, 9};
        final int expected = 55; // 'Min path is 2->6->13->15->3->14->7->10->4->9->12->8->5->11->1'
        final int actual = MinimumRookDistance.calculateMinRookDistance(pawns, rook);
        assertEquals(expected, actual);
    }
}

