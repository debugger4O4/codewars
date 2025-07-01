package kyu_8.basic_making_six_toast.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SixToastTest {

    private static void doTest(int num, int expected) {
        assertEquals(expected, Kata.sixToast(num), "Incorrect answer for num = " + num + "\n\n");
    }

    @Test @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(15, 9);
        doTest(6, 0);
        doTest(3, 3);
    }
}

