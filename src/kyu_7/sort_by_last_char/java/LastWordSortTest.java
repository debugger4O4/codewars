package kyu_7.sort_by_last_char.java;

import java.util.Arrays;
import org.junit.jupiter.api.*;
import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LastWordSortTest {

    private static void doTest(String s, String[] expected) {
        String[] actual = Kata.last(s);
        String message  = String.format("last(\"%s\") returned an incorrect answer.\nExpected: [%s]\nBut got : [%s]\n\n",
                s,
                Arrays.stream(expected).map(st -> "\"" + st + "\"").collect(joining(", ")),
                Arrays.stream(actual).map(st -> "\"" + st + "\"").collect(joining(", "))
        );
        assertArrayEquals(expected, actual, message);
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("man i need a taxi up to ubud", new String[]{"a", "need", "ubud", "i", "taxi", "man", "to", "up"});
        doTest("what time are we climbing up the volcano", new String[]{"time", "are", "we", "the", "climbing", "volcano", "up", "what"});
        doTest("take me to semynak", new String[]{"take", "me", "semynak", "to"});
        doTest("massage yes massage yes massage", new String[]{"massage", "massage", "massage", "yes", "yes"});
        doTest("take bintang and a dance please", new String[]{"a", "and", "take", "dance", "please", "bintang"});
    }

}
