package kyu_6.b_a_d_hashing.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BadWorkHashTest {
    @Test
    public void exampleTestCases() {
        assertEquals("123456789ABCDEF0123456789ABCDEF0", BadWorkHash.hashString("a"));
        assertEquals("323456789ABCDEF012345677D9A76634", BadWorkHash.hashString("apple juice"));
        assertEquals("22334567893453234456645544344434", BadWorkHash.hashString("this is a very long test okay bye wow cya"));
    }

}