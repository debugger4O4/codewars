package kyu_6.routes_in_a_square_grid.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoutesCalcTest {

    @Test
    public void simpleTests() {
        assertEquals(2, RoutesCalc.calculateRoutes(1));
        assertEquals(6, RoutesCalc.calculateRoutes(2));
        assertEquals(20, RoutesCalc.calculateRoutes(3));
        assertEquals(137846528820L, RoutesCalc.calculateRoutes(20));
        assertEquals("If there are no squares there can't be any routes", 0, RoutesCalc.calculateRoutes(-4));
    }

}