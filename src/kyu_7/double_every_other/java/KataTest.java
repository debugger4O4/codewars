package kyu_7.double_every_other.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

class KataTest {

    @Test
    void sampleTests() {
        doTest(new int[]{1, 2, 3, 4}, new int[]{1, 4, 3, 8});
        doTest(new int[]{1, 19, 6, 2, 12, -3}, new int[]{1, 38, 6, 4, 12, -6});
        doTest(new int[]{-1000, 1653, 210, 0, 1}, new int[]{-1000, 3306, 210, 0, 1});
    }

    private void doTest(int[] input, int[] expected) {
        int[] actual = Kata.doubleEveryOther(input.clone());
        String msg = "For input " + Arrays.toString(input) + "\nexpected: " + Arrays.toString(expected) + "\nactual:   " + Arrays.toString(actual) + "\n";
        assertArrayEquals(expected, actual, msg);
    }
}
