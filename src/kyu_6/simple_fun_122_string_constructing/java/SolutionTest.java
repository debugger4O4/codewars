package kyu_6.simple_fun_122_string_constructing.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(OrderAnnotation.class)
class SolutionTest {
    @Test
    @Order(1)
    @DisplayName("Fixed Basic Tests")
    void testFromExample() {
        assertEquals(9, Kata.stringConstructing("aba", "abbabba"));
        assertEquals(4, Kata.stringConstructing("aba", "abaa"));
        assertEquals(3, Kata.stringConstructing("aba", "a"));
        assertEquals(1, Kata.stringConstructing("a", "a"));
        assertEquals(3, Kata.stringConstructing("a", "aaa"));
        assertEquals(64, Kata.stringConstructing("abcdefgh", "hgfedcba"));
        assertEquals(288, Kata.stringConstructing("sxdfcgdgxdfgdxxf", "xgdfsxgdxgfsgdfxgfdgfgdfgdgsdfxgfdxgdfxgdgdfgdfxgsdxgdfxgfgsxfgdfgsdfxgdfxgsgsfgxsgsdxgsdfxgsgsdfxgsdfx"));
        assertEquals(12, Kata.stringConstructing("bbaabcbcbc", "bbcccbabcc"));
    }
}

