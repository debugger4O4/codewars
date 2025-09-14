package kyu_6.find_the_mine.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFinderTest {

    @Test()
    void basicTestCases() {
        assertArrayEquals(new int[] {0,0}, MineFinder.findMine( new int[][] { {1, 0}, {0, 0} } ));
        assertArrayEquals(new int[] {0,0}, MineFinder.findMine( new int[][] { {1, 0, 0}, {0, 0, 0}, {0, 0, 0} } ));
        assertArrayEquals(new int[] {2,2}, MineFinder.findMine( new int[][] { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0} } ));

    }
}

