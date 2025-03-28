package kyu_7.tidy_number_special_numbers_series_9.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tidy_Number_Tests {
    @Test
    public void Check_Small_Values() {
        assertEquals(true, Solution.tidyNumber(12));
        assertEquals(false, Solution.tidyNumber(32));
        assertEquals(true, Solution.tidyNumber(39));
    }

    @Test
    public void Check_Larger_Values() {
        assertEquals(false, Solution.tidyNumber(1024));
        assertEquals(false, Solution.tidyNumber(12576));
        assertEquals(true, Solution.tidyNumber(13579));
        assertEquals(true, Solution.tidyNumber(2335));
    }
}
