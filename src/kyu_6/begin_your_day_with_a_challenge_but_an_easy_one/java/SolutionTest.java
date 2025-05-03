package kyu_6.begin_your_day_with_a_challenge_but_an_easy_one.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    void doTest(int n, String[] expected) {
        String[] actual = Kata.oneTwoThree(n);
        String message = "oneTwoThree(" + n + ") should return [\"" + expected[0] + "\", \"" + expected[1] + "\"]," +
                " but returned [\"" + actual[0] + "\",\"" + actual[1] + "\"].";

        assertArrayEquals(expected, actual, message);
    }

    @Test
    void basicTests() {
        doTest(0, new String[] {"0", "0"});
        doTest(1, new String[] {"1", "1"});
        doTest(2, new String[] {"2", "11"});
        doTest(3, new String[] {"3", "111"});
        doTest(19, new String[] {"991", "1111111111111111111"});
    }
}

