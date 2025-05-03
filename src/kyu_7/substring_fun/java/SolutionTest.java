package kyu_7.substring_fun.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testBasic() {
        assertEquals("", SubstringFun.nthChar(new String[] {}));
        assertEquals("yes", SubstringFun.nthChar(new String[] {"yoda", "best", "has"}));
    }
}
