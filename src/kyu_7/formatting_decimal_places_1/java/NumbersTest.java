package kyu_7.formatting_decimal_places_1.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersTest {
    @Test
    public void Test_01() {
        assertEquals(10.12, Numbers.twoDecimalPlaces(10.1289767789), 0.00);
    }

    @Test
    public void Test_Negative_02() {
        assertEquals(-7488.83, Numbers.twoDecimalPlaces(-7488.83485834983), 0.00);
    }
}
