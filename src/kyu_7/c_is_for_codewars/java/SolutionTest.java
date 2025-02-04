package kyu_7.c_is_for_codewars.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    public void testSimpleCases() {
        assertEquals("CCCCC\nC\nC\nC\nCCCCC", GenerateC.generateC(1));

        assertEquals(
                "CCCCCCCCCC\nCCCCCCCCCC\nCC\nCC\nCC\nCC\nCC\nCC\nCCCCCCCCCC\nCCCCCCCCCC",
                GenerateC.generateC(2)
        );

        assertEquals(
                "CCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC",
                GenerateC.generateC(3)
        );

        assertEquals(
                "CCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC",
                GenerateC.generateC(4)
        );
    }
}

