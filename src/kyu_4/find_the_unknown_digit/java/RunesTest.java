package kyu_4.find_the_unknown_digit.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class RunesTest {

    @DisplayName("Sample tests")
    @Test void testSample() {
        assertEquals( 2, Runes.solveExpression("1+1=?"), "expression = \"1+1=?\"");
        assertEquals( 6, Runes.solveExpression("123*45?=5?088"), "expression = \"123*45?=5?088\"");
        assertEquals( 0, Runes.solveExpression("-5?*-1=5?"), "expression = \"-5?*-1=5?\"");
        assertEquals(-1, Runes.solveExpression("19--45=5?"), "expression = \"19--45=5?\"");
        assertEquals( 5, Runes.solveExpression("??*??=302?"), "expression = \"??*??=302?\"");
        assertEquals( 2, Runes.solveExpression("?*11=??"), "expression = \"?*11=??\"");
        assertEquals( 2, Runes.solveExpression("??*1=??"), "expression = \"??*1=??\"");
        assertEquals(-1, Runes.solveExpression("??+??=??"), "expression = \"??+??=??\"");
    }
}
