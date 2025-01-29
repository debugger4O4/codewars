package kyu_7.lucky_number.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class LuckyNumberTest {

    @Test
    public void test1() {
        assertTrue("With input 0", LuckyNumber.isLucky(0));
    }

    @Test
    public void test2() {
        assertTrue("With input 1892376", LuckyNumber.isLucky(1892376));
    }

    @Test
    public void test3() {
        assertFalse("With input 189237", LuckyNumber.isLucky(189237));
    }
}
