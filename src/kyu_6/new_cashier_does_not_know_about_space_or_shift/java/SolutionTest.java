package kyu_6.new_cashier_does_not_know_about_space_or_shift.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Solution.getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
        assertEquals("Burger Fries Fries Chicken Pizza Sandwich Milkshake Coke", Solution.getOrder("pizzachickenfriesburgercokemilkshakefriessandwich"));
    }
}
