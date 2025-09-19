package kyu_6.two_cube_sums.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {

    @DisplayName("Sample tests")
    @ParameterizedTest(name = "n = {0}")
    @CsvSource(textBlock = """
         1, false
        42, false
      1729, true
      4104, true
      4105, false
    """)
    void sampleTests(int n, boolean expected){
        assertEquals(expected, Kata.hasTwoCubeSums(n));
    }
}
