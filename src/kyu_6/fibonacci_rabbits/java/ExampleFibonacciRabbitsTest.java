package kyu_6.fibonacci_rabbits.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleFibonacciRabbitsTest {

    @CsvSource(textBlock = """
        0,  4,     0
        1,  4,     1
        4,  0,     1
        6,  3,    40
        8, 12,  8425
        7,  4,   181
    """)
    @ParameterizedTest(name = "n = {0}, b = {1}")
    @DisplayName("Sample tests")
    void test(int n, int b, int expected) {
        assertEquals(expected, FibonacciRabbits.fibRabbits(n, b));
    }
}
