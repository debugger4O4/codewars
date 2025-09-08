package kyu_7.dot_calculator.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest{
    @Test
    public void exampleTest() {
        assertEquals(".....", Solution.calc("..... // ."));
        assertEquals("..........", Solution.calc("..... * .."));
        assertEquals("..", Solution.calc("..... // .."));
        assertEquals("....", Solution.calc("..... - ."));
        assertEquals("....................", Solution.calc("..... + ..............."));
        assertEquals("...............", Solution.calc("..... * ..."));
        assertEquals("..", Solution.calc("..... - ..."));
        assertEquals("", Solution.calc(". - ."));
        assertEquals("", Solution.calc(". // .."));
    }
}

