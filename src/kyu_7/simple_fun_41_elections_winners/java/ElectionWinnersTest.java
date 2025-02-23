package kyu_7.simple_fun_41_elections_winners.java;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class ElectionWinnersTest {
    private static void test(final int expected, final int[] input, final int k) {
        assertEquals("For input " + Arrays.toString(input) + " and k = " + k, expected, ElectionWinners.find(input, k));
    }

    @Test public void basicTests() {
        test(2, new int[]{2, 3, 5, 2}, 3);
        test(0, new int[]{1, 3, 3, 1, 1}, 0);
        test(1, new int[]{5, 1, 3, 4, 1}, 0);
        test(4, new int[]{1, 1, 1, 1}, 1);
        test(0, new int[]{1, 1, 1, 1}, 0);
        test(2, new int[]{3, 1, 1, 3, 1}, 2);
    }
}
