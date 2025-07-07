package kyu_7.laxative_shot_roulette.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    private void doTest(double expected, int n, int x, int a) {
        double actual = Kata.getChance(n, x, a);
        String message = String.format("n = %d, x = %d, a = %d\n", n, x, a);
        assertEquals(expected, actual, message);
    }

    @Test
    public void testChances() {
        doTest( 0.5,     2,   1,  1);
        doTest( 0.25,    4,   1,  3);
        doTest( 0.33,  100,  10, 10);
        doTest( 0.04, 1000, 150, 20);
        doTest( 0.29,   25,   5,  5);
        doTest( 0.42,    9,   3,  2);
    }
}