package kyu_8.neutralisation.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("Fixed Tests")
    void testBasic() {
        assertEquals("", Solution.neutralise("", ""));
        assertEquals("+", Solution.neutralise("+", "+"));
        assertEquals("-", Solution.neutralise("-", "-"));
        assertEquals("0", Solution.neutralise("+", "-"));
        assertEquals("0", Solution.neutralise("-", "+"));
        assertEquals("000000", Solution.neutralise("--++--", "++--++"));
        assertEquals("-+-+-+", Solution.neutralise("-+-+-+", "-+-+-+"));
        assertEquals("-+00", Solution.neutralise("-++-", "-+-+"));
        assertEquals("00++", Solution.neutralise("--++", "++++"));
        assertEquals("++0--000-", Solution.neutralise("+++--+---", "++----++-"));
        assertEquals("-----", Solution.neutralise("-----", "-----"));
        assertEquals("0+", Solution.neutralise("-+", "++"));
        assertEquals("-0", Solution.neutralise("--", "-+"));
        assertEquals("000", Solution.neutralise("-++", "+--"));
        assertEquals("0+0+0000+0", Solution.neutralise("++-++--++-", "-+++-++-++"));
        assertEquals("00+0+000-", Solution.neutralise("-++-+-++-", "+-++++---"));
        assertEquals("-00+0-+0-", Solution.neutralise("---++-+--", "-+++--++-"));
        assertEquals("0-0-0-++0-", Solution.neutralise("+-----+++-", "--+-+-++--"));
        assertEquals("0--00-+0", Solution.neutralise("+-----+-", "---++-++"));
        assertEquals("-+--+-+-0-", Solution.neutralise("-+--+-+---", "-+--+-+-+-"));
        assertEquals("00+", Solution.neutralise("+-+", "-++"));
        assertEquals("-+0", Solution.neutralise("-++", "-+-"));
        assertEquals("-00+", Solution.neutralise("---+", "-+++"));
        assertEquals("+--", Solution.neutralise("+--", "+--"));
        assertEquals("00+++-0-", Solution.neutralise("--+++-+-", "+++++---"));
    }
}

