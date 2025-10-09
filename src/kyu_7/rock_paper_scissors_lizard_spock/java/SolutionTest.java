package kyu_7.rock_paper_scissors_lizard_spock.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    @Test void player1Wins() {
        assertEquals("Player 1 Won!", Kata.rpsls("rock", "lizard"));
        assertEquals("Player 1 Won!", Kata.rpsls("paper", "rock"));
        assertEquals("Player 1 Won!", Kata.rpsls("scissors", "lizard"));
        assertEquals("Player 1 Won!", Kata.rpsls("lizard", "paper"));
        assertEquals("Player 1 Won!", Kata.rpsls("spock", "rock"));
    }

    @Test void player2Wins() {
        assertEquals("Player 2 Won!", Kata.rpsls("lizard","scissors"));
        assertEquals("Player 2 Won!", Kata.rpsls("spock","lizard"));
        assertEquals("Player 2 Won!", Kata.rpsls("paper","lizard"));
        assertEquals("Player 2 Won!", Kata.rpsls("scissors","spock"));
        assertEquals("Player 2 Won!", Kata.rpsls("rock","spock"));
    }

    @Test void draws() {
        assertEquals("Draw!", Kata.rpsls("rock", "rock"));
        assertEquals("Draw!", Kata.rpsls("spock", "spock"));
    }
}
