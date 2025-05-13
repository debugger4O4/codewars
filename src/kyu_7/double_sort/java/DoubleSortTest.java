package kyu_7.double_sort.java;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author ruslan.lopez
 */
@RunWith(Parameterized.class)
public class DoubleSortTest {

    private Object[] a;
    private Object[] expResult;

    public DoubleSortTest(Object[] a, Object[] expResult) {
        this.a = a;
        this.expResult = expResult;
    }

    @Parameters
    public static Iterable<Object[]> data() throws Throwable {
        return Arrays.asList(new Object[][]{
                {new Integer[]{6, 2, 3, 4, 5}, new Integer[]{2, 3, 4, 5, 6}},
                {new Integer[]{14, 32, 3, 5, 5}, new Integer[]{3, 5, 5, 14, 32}},
                {new Integer[]{1, 2, 3, 4, 5}, new Integer[]{1, 2, 3, 4, 5}},
                {new Object[]{"Banana", "Orange", "Apple", "Mango", 0, 2, 2}, new Object[]{0, 2, 2, "Apple", "Banana", "Mango", "Orange"}},
                {new Object[]{"C", "W", "W", "W", 1, 2, 0}, new Object[]{0,1,2,"C","W","W","W"}},
                {new Object[]{"Apple",46,"287",574,"Peach","3","69",78,"Grape","423"}, new Object[]{46, 78, 574, "287", "3", "423", "69", "Apple", "Grape", "Peach"}},
        });
    }


    /**
     * Test of dbSort method, of class DoubleSort.
     */
    @Test
    public void basicTests() {
        Object[] result = DoubleSort.dbSort(a);
        assertArrayEquals(expResult, result);
    }

}
