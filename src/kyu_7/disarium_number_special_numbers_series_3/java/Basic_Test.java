package kyu_7.disarium_number_special_numbers_series_3.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Basic_Test
{
    @Test
    public void Disarium_Or_NOT()
    {
        assertEquals("Disarium !!", Solution.disariumNumber(89));
        assertEquals("Not !!", Solution.disariumNumber(564));
        assertEquals("Not !!", Solution.disariumNumber(1024));
    }
    @Test
    public void Larger_Numbers()
    {
        assertEquals("Not !!", Solution.disariumNumber(64599));
        assertEquals("Not !!", Solution.disariumNumber(136586));
        assertEquals("Not !!", Solution.disariumNumber(1048576));
    }
}
