package kyu_6._1_n_cycle.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CycleTest {
    private static void dotest(int n, int expected) {
        int actual = Cycle.cycle(n);
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        dotest(33, 2);
        dotest(18118, -1);
        dotest(69, 22);
        dotest(197, 98);
        dotest(65, -1);
    }
}

