package kyu_7.find_the_index_of_the_second_occurrence_of_a_letter_in_a_string.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    @DisplayName("Example Tests")
    void sampleTestCases() {
        assertEquals( 3, SecondOcurrence.secondSymbol("Hello world!!!", 'l'), "Find the index of the second symbol 'l' in the string");
        assertEquals( 7, SecondOcurrence.secondSymbol("Hello world!!!", 'o'), "Find the index of the second symbol 'o' in the string");
        assertEquals(-1, SecondOcurrence.secondSymbol("Hello world!!!", 'A'), "The symbol 'A' is not in the string");
        assertEquals(-1, SecondOcurrence.secondSymbol("", 'q'),"The symbol 'q' is not in the string");
        assertEquals(-1, SecondOcurrence.secondSymbol("Hello", '!'), "The symbol '!' is not in the string");
    }
}





