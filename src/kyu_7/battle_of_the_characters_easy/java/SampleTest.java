package kyu_7.battle_of_the_characters_easy.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void basicTests() {
        doTest("AAA",  "Z",    "Z");
        doTest("ONE",  "TWO",  "TWO");
        doTest("ONE",  "NEO",  "Tie!");
        doTest("FOUR", "FIVE", "FOUR");
    }
    private void doTest(final String x, final String y, final String expected) {
        assertEquals(expected, BattleOfTheCharacters.battle(x, y));
    }
}
