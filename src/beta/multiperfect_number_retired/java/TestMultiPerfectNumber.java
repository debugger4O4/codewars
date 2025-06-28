package beta.multiperfect_number_retired.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import beta.multiperfect_number_retired.java.MultiPerfectNumber;

public class TestMultiPerfectNumber {

    private MultiPerfectNumber mpn;

    @Before
    public void setUp() throws Exception {
        mpn = new MultiPerfectNumber();
    }

    @Test
    public void test01() {
        assertEquals(1, mpn.calcMth(1, 1));
    }

    @Test
    public void test02() {
        assertEquals(6, mpn.calcMth(2, 1));
    }

    @Test
    public void test03() {
        assertEquals(120, mpn.calcMth(3, 1));
    }
}