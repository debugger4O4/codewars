package kyu_8.add_length.java;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static java.util.stream.Collectors.joining;

public class SolutionTest {

    private static void doTest(String str, String[] expected) {
        String[] actual = AddLength.addLength(str);
        String      msg = "addLength(\"" + str + "\") returned an incorrect result.\n\nExpected: ["
                + Arrays.stream(expected).map(s -> "\"" + s + "\"").collect(joining(", "))
                + "]\nBut got : ["
                + Arrays.stream(actual).map(s -> "\"" + s + "\"").collect(joining(", "))
                + "]\n\n";
        assertArrayEquals(expected, actual, msg);
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("apple ban", new String[]{"apple 5", "ban 3"});
        doTest("you will win", new String[]{"you 3", "will 4", "win 3"});
        doTest("you", new String[]{"you 3"});
        doTest("y", new String[]{"y 1"});
    }
}

