package kyu_4.path_finder_1_can_you_reach_the_exit.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void sampleTests() {

        String a = ".W.\n" +
                   ".W.\n" +
                   "...",

                b = ".W.\n" +
                    ".W.\n" +
                    "W..",

                c = "......\n" +
                    "......\n" +
                    "......\n" +
                    "......\n" +
                    "......\n" +
                    "......",

                d = "......\n" +
                    "......\n" +
                    "......\n" +
                    "......\n" +
                    ".....W\n" +
                    "....W.";

        assertEquals(true, Finder.pathFinder(a));
        assertEquals(false, Finder.pathFinder(b));
        assertEquals(true, Finder.pathFinder(c));
        assertEquals(false, Finder.pathFinder(d));
    }
}


