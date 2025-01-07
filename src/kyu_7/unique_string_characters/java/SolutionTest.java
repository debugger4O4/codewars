package kyu_7.unique_string_characters.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals("ybzc",Solution.solve("xyab","xzca"));
        assertEquals("ybbzc",Solution.solve("xyabb","xzca"));
        assertEquals("abcdxyz",Solution.solve("abcd","xyz"));
        assertEquals("zca",Solution.solve("xxx","xzca"));
    }
}
