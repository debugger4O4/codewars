package kyu_1.mine_sweepe.java;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class MineSweeperTests {
    /* Data structure for one test:
     *      0 -> name or comment of the test
     *      1 -> original map
     *      2 -> map sent to the user
     *      3 -> expected solution
     */

    private String[][] DATA = new String[][]{// Sample Tests:
            {"Simple map 1",
                    "1 x 1 1 x 1\n2 2 2 1 2 2\n2 x 2 0 1 x\n2 x 2 1 2 2\n1 1 1 1 x 1\n0 0 0 1 1 1",
                    "? ? ? ? ? ?\n? ? ? ? ? ?\n? ? ? 0 ? ?\n? ? ? ? ? ?\n? ? ? ? ? ?\n0 0 0 ? ? ?",
                    "1 x 1 1 x 1\n2 2 2 1 2 2\n2 x 2 0 1 x\n2 x 2 1 2 2\n1 1 1 1 x 1\n0 0 0 1 1 1"},

            {"Simple map 2",
                    "0 2 x\n0 2 x",
                    "0 ? ?\n0 ? ?",
                    "0 2 x\n0 2 x"},

            {"Simple unsolvable map",
                    "0 1 x\n0 1 1",
                    "0 ? ?\n0 ? ?",
                    "?"},

            {"Simple map 3",
                    "1 x x 1 0 0 0\n2 3 3 1 0 1 1\n1 x 1 0 0 1 x\n1 1 1 0 0 1 1\n0 1 1 1 0 0 0\n0 1 x 1 0 0 0\n0 1 1 1 0 1 1\n0 0 0 0 0 1 x\n0 0 0 0 0 1 1",
                    "? ? ? ? 0 0 0\n? ? ? ? 0 ? ?\n? ? ? 0 0 ? ?\n? ? ? 0 0 ? ?\n0 ? ? ? 0 0 0\n0 ? ? ? 0 0 0\n0 ? ? ? 0 ? ?\n0 0 0 0 0 ? ?\n0 0 0 0 0 ? ?",
                    "1 x x 1 0 0 0\n2 3 3 1 0 1 1\n1 x 1 0 0 1 x\n1 1 1 0 0 1 1\n0 1 1 1 0 0 0\n0 1 x 1 0 0 0\n0 1 1 1 0 1 1\n0 0 0 0 0 1 x\n0 0 0 0 0 1 1"},

            {"Various unsolvable map - 1",
                    "1 1 0 1 1 1 0 0 1 1 1 0 0 0 0 1 1 1 0\nx 1 0 1 x 1 0 0 2 x 2 0 0 0 0 1 x 2 1\n1 1 0 2 3 3 1 1 3 x 2 0 0 0 0 1 2 x 1\n0 1 1 2 x x 1 2 x 3 1 0 0 0 0 0 1 1 1\n0 1 x 2 2 2 1 3 x 3 0 0 0 0 0 0 0 0 0\n0 1 1 1 0 0 0 2 x 2 0 0 0 0 0 0 0 0 0\n0 0 0 0 0 0 0 1 1 1 1 2 2 1 0 0 0 0 0\n0 0 0 0 0 0 0 0 0 0 1 x x 1 0 0 0 0 0\n0 0 1 1 1 0 1 1 1 0 1 2 2 1 0 0 0 0 0\n0 0 1 x 2 1 3 x 2 0 0 0 0 0 0 1 1 1 0\n0 0 1 1 2 x 3 x 3 1 1 0 0 0 0 1 x 1 0\n0 0 0 0 1 2 3 2 2 x 1 0 0 0 0 1 1 1 0\n0 0 0 0 0 1 x 1 1 1 1 0 0 0 0 0 1 1 1\n0 0 1 1 2 2 2 1 0 0 0 0 0 0 0 0 1 x 1\n0 0 1 x 2 x 2 1 1 0 0 0 0 0 0 0 1 1 1\n0 0 1 1 2 1 3 x 3 1 0 0 0 0 0 0 0 1 1\n0 0 0 0 0 0 2 x x 1 0 0 0 1 1 1 0 1 x\n0 0 0 1 1 1 1 2 2 1 0 0 0 1 x 1 1 2 2\n0 0 0 1 x 3 2 1 0 0 0 1 1 2 1 1 1 x 2\n0 0 0 1 2 x x 1 0 0 0 1 x 1 0 1 2 3 x\n0 0 0 0 1 2 2 1 1 1 1 1 1 1 0 1 x 3 2\n0 0 0 0 1 1 1 1 2 x 1 1 1 1 0 2 3 x 2\n0 0 0 0 1 x 1 1 x 2 1 1 x 1 0 1 x 3 x",
                    "? ? 0 ? ? ? 0 0 ? ? ? 0 0 0 0 ? ? ? 0\n? ? 0 ? ? ? 0 0 ? ? ? 0 0 0 0 ? ? ? ?\n? ? 0 ? ? ? ? ? ? ? ? 0 0 0 0 ? ? ? ?\n0 ? ? ? ? ? ? ? ? ? ? 0 0 0 0 0 ? ? ?\n0 ? ? ? ? ? ? ? ? ? 0 0 0 0 0 0 0 0 0\n0 ? ? ? 0 0 0 ? ? ? 0 0 0 0 0 0 0 0 0\n0 0 0 0 0 0 0 ? ? ? ? ? ? ? 0 0 0 0 0\n0 0 0 0 0 0 0 0 0 0 ? ? ? ? 0 0 0 0 0\n0 0 ? ? ? 0 ? ? ? 0 ? ? ? ? 0 0 0 0 0\n0 0 ? ? ? ? ? ? ? 0 0 0 0 0 0 ? ? ? 0\n0 0 ? ? ? ? ? ? ? ? ? 0 0 0 0 ? ? ? 0\n0 0 0 0 ? ? ? ? ? ? ? 0 0 0 0 ? ? ? 0\n0 0 0 0 0 ? ? ? ? ? ? 0 0 0 0 0 ? ? ?\n0 0 ? ? ? ? ? ? 0 0 0 0 0 0 0 0 ? ? ?\n0 0 ? ? ? ? ? ? ? 0 0 0 0 0 0 0 ? ? ?\n0 0 ? ? ? ? ? ? ? ? 0 0 0 0 0 0 0 ? ?\n0 0 0 0 0 0 ? ? ? ? 0 0 0 ? ? ? 0 ? ?\n0 0 0 ? ? ? ? ? ? ? 0 0 0 ? ? ? ? ? ?\n0 0 0 ? ? ? ? ? 0 0 0 ? ? ? ? ? ? ? ?\n0 0 0 ? ? ? ? ? 0 0 0 ? ? ? 0 ? ? ? ?\n0 0 0 0 ? ? ? ? ? ? ? ? ? ? 0 ? ? ? ?\n0 0 0 0 ? ? ? ? ? ? ? ? ? ? 0 ? ? ? ?\n0 0 0 0 ? ? ? ? ? ? ? ? ? ? 0 ? ? ? ?",
                    "?"},

            {"Various unsolvable map - 2",
                    "0 0 0 0 0 0 0 0 1 x x 2 1 0 1 x 1 0 1 2 x\n0 0 0 0 0 0 0 0 1 2 3 x 1 0 2 2 2 1 2 x 2\n0 0 0 0 0 0 0 0 0 0 2 2 2 0 1 x 1 1 x 2 1\n0 0 0 0 0 1 1 1 0 0 1 x 1 0 1 2 2 2 1 1 0\n1 1 0 0 0 1 x 1 0 1 2 2 1 0 0 1 x 1 1 1 1\nx 1 0 0 0 1 1 1 0 1 x 1 0 0 0 1 1 1 1 x 1\n2 2 1 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 1 1 1\n1 x 1 0 0 0 0 0 0 0 1 2 2 1 0 0 1 1 1 0 0\n1 1 1 0 0 0 0 0 0 0 1 x x 1 0 0 1 x 1 0 0",
                    "0 0 0 0 0 0 0 0 ? ? ? ? ? 0 ? ? ? 0 ? ? ?\n0 0 0 0 0 0 0 0 ? ? ? ? ? 0 ? ? ? ? ? ? ?\n0 0 0 0 0 0 0 0 0 0 ? ? ? 0 ? ? ? ? ? ? ?\n0 0 0 0 0 ? ? ? 0 0 ? ? ? 0 ? ? ? ? ? ? 0\n? ? 0 0 0 ? ? ? 0 ? ? ? ? 0 0 ? ? ? ? ? ?\n? ? 0 0 0 ? ? ? 0 ? ? ? 0 0 0 ? ? ? ? ? ?\n? ? ? 0 0 0 0 0 0 ? ? ? 0 0 0 0 0 0 ? ? ?\n? ? ? 0 0 0 0 0 0 0 ? ? ? ? 0 0 ? ? ? 0 0\n? ? ? 0 0 0 0 0 0 0 ? ? ? ? 0 0 ? ? ? 0 0",
                    "?"}};


    private void makeAssertion_AndDisplay(String expected, String actual){
        makeAssertion_AndDisplay("", expected, actual);
    }

    private void makeAssertion_AndDisplay(String message, String expected, String actual){
        if (!expected.equals(actual)) {
            if (message.equals("")) message = "Failed test!!";
            System.out.println(" \n" + message + "\n\nExpected:\n" + expected + "\n\nBut was:\n" + actual);
        }
        assertEquals(message, expected, actual);
    }


    @Test
    public void sampleTests() {
        for (int count = 0 ; count < 6 ; count++) {
            Game.newGame(DATA[count][1]);
            Game.read(DATA[count][2]);
            makeAssertion_AndDisplay(DATA[count][0], DATA[count][3], new MineSweeper(DATA[count][2], Game.getMinesN()).solve());
        }
    }
}

