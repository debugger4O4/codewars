package kyu_6.count_the_divisible_numbers.java;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests {

    static Stream<Arguments> sampleTests() {
        return Stream.of(
                arguments(3,     6,  11,  2),
                arguments(20,   11, 345, 17),
                arguments(1,     0,   1,  7),
                arguments(1,    20,  20,  2),
                arguments(0,    20,  20,  8),
                arguments(1,    19,  20,  2),
                arguments(11,    0,  10,  1),
                arguments(2,    11,  14,  2),
                arguments(0,    64,  73, 27),
                arguments(195225777, 101, Integer.MAX_VALUE, 11),
                arguments(19701675, 1005, Integer.MAX_VALUE, 109),
                arguments(390451563, 101, 0xFFFFFFFFL, 11),
                arguments(39403360, 1005, 0xFFFFFFFFL, 109),
                arguments(838488366986797791L, 101, Long.MAX_VALUE, 11),
                arguments(84618092081236466L, 1005, Long.MAX_VALUE, 109)
        );
    }

    @ParameterizedTest(name = "x: {1}, y: {2}, k: {3}")
    @MethodSource
    @DisplayName("Sample tests")
    void sampleTests(long expected, long x, long y, long k) {
        assertEquals(expected, Kata.divisibleCount(x, y, k));
    }
}
