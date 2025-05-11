package kyu_7.number_to_digit_tiers.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;


class SolutionTest {

    @Test
    void sampleTests() {
        int[] input = new int[]{ 0,6,420,2017,2010,4020,80200 };
        String[][] expected = new String[][]{
                {"0"},
                {"6"},
                {"4", "42", "420"},
                {"2", "20", "201", "2017"},
                {"2", "20", "201", "2010"},
                {"4", "40", "402", "4020"},
                {"8", "80", "802", "8020", "80200"}
        };
        for (int i = 0; i < input.length; i++) {
            String[] actual = Solution.createArrayOfTiers(input[i]);
            String msg = "For num = " + input[i] + "\nExpected: " + Arrays.toString(expected[i]) + "\nActual:   " + Arrays.toString(actual) + "\n";
            assertArrayEquals(expected[i], actual, msg);
        }
    }
}
