package kyu_7.eliminate_the_intruders_bit_manipulation.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests {
    @Test
    void sampleTests() {
        assertEquals(255, SetBits.eliminateUnsetBits("11010101010101"), "For input \"11010101010101\"");
        assertEquals(7, SetBits.eliminateUnsetBits("111"), "For input \"111\"");
        assertEquals(1, SetBits.eliminateUnsetBits("1000000"), "For input \"1000000\"");
        assertEquals(0, SetBits.eliminateUnsetBits(""), "For empty input");
    }
}
