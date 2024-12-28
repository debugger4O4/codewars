package kyu_5.is_the_king_in_check.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FixedTests {
    @Test
    void checkByPawn() {
        final char[][] test1 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', 'P', ' ', ' ', ' ', ' '},
                {' ', ' ', 'K', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(true, Solution.isTheKinginCheck(test1), Preloaded.printBoard(test1));
    }

    @Test
    void checkByBishop() {
        final char[][] test2 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', 'B'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'K', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(true, Solution.isTheKinginCheck(test2), Preloaded.printBoard(test2));
    }

    @Test
    void checkByRook() {
        final char[][] test3 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'K', ' ', ' ', 'R', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(true, Solution.isTheKinginCheck(test3), Preloaded.printBoard(test3));
    }

    @Test
    void checkByKnight() {
        final char[][] test4 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', 'K', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'N', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(true, Solution.isTheKinginCheck(test4), Preloaded.printBoard(test4));
    }

    @Test
    void checkByQueen() {
        final char[][] test5 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', 'K', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', 'Q', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(true, Solution.isTheKinginCheck(test5), Preloaded.printBoard(test5));
    }

    @Test
    void kingAlone() {
        final char[][] test6 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', 'K', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(false, Solution.isTheKinginCheck(test6), Preloaded.printBoard(test6));
    }

    @Test
    void kingWithPiecesNoCheck() {
        final char[][] test7 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'Q', ' ', ' ', 'N', ' ', ' ', ' ', 'Q'},
                {' ', ' ', ' ', 'K', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(false, Solution.isTheKinginCheck(test7), Preloaded.printBoard(test7));
    }

    @Test
    void noCheckBecauseBlockingPiece() {
        final char[][] test8 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'R', ' ', 'B', 'K', ' ', ' ', ' ', ' '},
                {' ', ' ', 'P', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(false, Solution.isTheKinginCheck(test8), Preloaded.printBoard(test8));
    }

    @Test
    void noCheckBecauseTwoBlockingPieces() {
        final char[][] test9 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', 'B', ' ', ' '},
                {' ', ' ', ' ', ' ', 'R', ' ', ' ', ' '},
                {'R', ' ', 'P', 'K', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        assertEquals(false, Solution.isTheKinginCheck(test9), Preloaded.printBoard(test9));
    }
}

