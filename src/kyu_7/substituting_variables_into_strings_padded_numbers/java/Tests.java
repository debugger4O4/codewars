package kyu_7.substituting_variables_into_strings_padded_numbers.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    private static void doTest(int n, String expected) {
        assertEquals(expected, Kata.solution(n), String.format("Incorrect answer for value = %d\n\n", n));
    }

    @Test
    @DisplayName("Sample Tests")
    public void sampleTest() {
        doTest(5, "Value is 00005");
        doTest(1204, "Value is 01204");
        doTest(109, "Value is 00109");
        doTest(0, "Value is 00000");
    }

}
