package kyu_6.where_is_my_parent_cry.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class WhereIsMyParentTest {
    private static void test(final String expected, final String input) {
        assertEquals("For input \"" + input + '"', expected, WhereIsMyParent.findChildren(input));
    }

    @Test public void basicTests() {
        test("AaBb", "abBA");
        test("AaaaaaZzzz", "AaaaaZazzz");
        test("AaBbbCcc", "CbcBcbaA");
        test("FfUuuuXx", "xXfuUuuF");
        test("", "");
    }
}