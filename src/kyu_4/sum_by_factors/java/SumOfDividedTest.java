package kyu_4.sum_by_factors.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfDividedTest {

    @Test
    public void testOne() {
        int[] lst = new int[]{12, 15};
        assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(lst));

        int[] lst1 = new int[]{224, 357, 181, 40, 220, 312, -27, 461, -17, 380, 326, 415, -70, 14, 384, -60, -2, -18, 213, 337, 448, 186};
        assertEquals("(2 2384)(3 1347)(5 925)(7 973)(11 220)(13 312)(17 340)(19 380)(31 186)(71 213)(83 415)(163 326)(181 181)(337 337)(461 461)", SumOfDivided.sumOfDivided(lst1));

        int[] lst2 = new int[]{-29804, -4209, -28265, -72769, -31744};
        assertEquals("(2 -61548)(3 -4209)(5 -28265)(23 -4209)(31 -31744)(53 -72769)(61 -4209)(1373 -72769)(5653 -28265)(7451 -29804)", SumOfDivided.sumOfDivided(lst2));

        int[] lst3 = new int[]{17, -17, 51, -51};
        assertEquals("(3 0)(17 0)", SumOfDivided.sumOfDivided(lst3));
    }
}

