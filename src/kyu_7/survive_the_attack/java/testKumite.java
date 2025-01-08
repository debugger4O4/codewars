package kyu_7.survive_the_attack.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testKumite {

    @Test
    void testDefenders() {
        assertEquals(true, Kumite.block(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}));
        assertEquals(false, Kumite.block(new int[]{2, 9, 9, 7}, new int[]{1, 1, 3, 8}));
        assertEquals(true, Kumite.block(new int[]{10, 10, 1, 1}, new int[]{4, 4, 7, 7}));
        assertEquals(true, Kumite.block(new int[]{}, new int[]{1, 2, 3}));
        assertEquals(false, Kumite.block(new int[]{1, 2, 3}, new int[]{}));
        assertEquals(true, Kumite.block(new int[]{4, 9, 18, 6, 45, 39, 6, 26, 19}, new int[]{5, 15, 7, 28, 50, 7, 34}));
    }
}
