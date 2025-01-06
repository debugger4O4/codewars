package kyu_6.ascii_betizer.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void basicTestCases() {
        assertArrayEquals(new String[]{"The", "dog", "the", "fox", "over", "lazy", "quick", "brown", "jumped"},
                Kata.ASCIIbetize("The quick brown fox jumped over the lazy dog"));
        assertArrayEquals(new String[]{"DOG", "THE", "FOX", "The", "dog", "OVER", "LAZY", "the", "fox", "QUICK", "BROWN", "over", "lazy", "JUMPED", "quick", "brown", "jumped"},
                Kata.ASCIIbetize("The THE quick QUICK brown BROWN fox FOX jumped JUMPED over OVER the lazy LAZY dog DOG"));
        assertArrayEquals(new String[]{"A", "a"},
                Kata.ASCIIbetize("a a a a A A a A a a A A A"));

    }
}
