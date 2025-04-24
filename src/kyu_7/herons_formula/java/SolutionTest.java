package kyu_7.herons_formula.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertion(6, 3, 4, 5);
        assertion(24, 6, 8, 10);
    }

    private void assertion(double expected, double a, double b, double c) {
        assertEquals(
                String.format("Inputs: (%f, %f, %f)\n", a, b, c),
                expected,
                Kata.heron(a, b, c),
                0.01
        );
    }
}


