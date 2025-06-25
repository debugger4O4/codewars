package kyu_6.exploding_robots.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests {
    private static void doTest(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    void FixedTests() {
        doTest(Kata.willRobotsCollide(0, 0, 1, 0, "UL"), true);
        doTest(Kata.willRobotsCollide(0, 0, 0, 1, "LRLR"), false);
        doTest(Kata.willRobotsCollide(5, 1, 1, 5, "LRUURLDDLR"), true);
        doTest(Kata.willRobotsCollide(5, 0, 1, 5, "LRUURLDDLR"), false);
        doTest(Kata.willRobotsCollide(4, 2, 3, 2, "R"), true);
        doTest(Kata.willRobotsCollide(4, 2, 3, 2, "D"), false);
        doTest(Kata.willRobotsCollide(8, 6, 8, 6, ""), true);
        doTest(Kata.willRobotsCollide(8, 6, 8, 7, ""), false);
    }
}
