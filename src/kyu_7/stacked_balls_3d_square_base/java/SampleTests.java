package kyu_7.stacked_balls_3d_square_base.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SampleTests {

    private static double EPSILON = 0.001;

    @Test
    public void test1() {
        assertEquals(1.0, Dinglemouse.stackHeight3d(1), EPSILON);
    }

    @Test
    public void test2() {
        assertEquals(1.7071, Dinglemouse.stackHeight3d(2), EPSILON);
    }

}
