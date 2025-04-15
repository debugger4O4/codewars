package kyu_6.regex_pattern_to_check_if_string_has_all_characters.java;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;


public class SolutionTest {
    @Test
    public void sampleTests() {
        String abc = "abc";
        String regex = Kata.regexContainsAll(abc);
        Pattern pattern = Pattern.compile(regex);
        assertTrue(assertionMsg("bca",abc,regex), pattern.matcher("bca").find());
        assertTrue(assertionMsg("baczzz",abc,regex), pattern.matcher("baczzz").find());
        assertFalse(assertionMsg("ac",abc,regex), pattern.matcher("ac").find());
        assertFalse(assertionMsg("bc",abc,regex), pattern.matcher("bc").find());
        assertFalse(assertionMsg("cb",abc,regex), pattern.matcher("cb").find());
    }

    private String assertionMsg(String test, String letters, String regex) {
        return String.format("Checking if %s contains all characters in %s with your pattern %s",test,letters,regex);
    }
}

