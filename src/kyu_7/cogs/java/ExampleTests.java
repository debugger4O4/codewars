package kyu_7.cogs.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void example() {
        double expected = -4d/3;
        assertEquals(expected ,Dinglemouse.cogRpm(new int[]{100, 75}), 0.001);
    }

}
