package kyu_7.make_backronym.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;

class BackronymExampleTest {
    @ParameterizedTest(name = "Testing for \"{0}\"")
    @CsvSource(textBlock = """
    dgm,         disturbing gregarious mustache
    lkj,         literal klingon joke
    interesting, ingestable newtonian turn eager rant eager stylish turn ingestable newtonian gregarious
    codewars,    confident oscillating disturbing eager weird awesome rant stylish
    """)
    @DisplayName("Sample Tests")
    void test(String input, String expected) {
        assertEquals(expected, Backronym.makeBackronym(input));
    }
}
