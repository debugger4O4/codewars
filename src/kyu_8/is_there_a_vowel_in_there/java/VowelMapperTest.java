package kyu_8.is_there_a_vowel_in_there.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class VowelMapperTest {

    private void doTest(List<Integer> input, List<Object> expected) {
        List<Object> actual = VowelMapper.isVow(input);
        assertEquals(expected, actual, "Failed for input: " + input);
    }

    @Test
    public void sampleTests() {
        doTest(
                List.of(118,117,120,121,117,98,122,97,120,106,104,116,113,114,113,120,106),
                List.of(118,"u",120,121,"u",98,122,"a",120,106,104,116,113,114,113,120,106)
        );

        doTest(
                List.of(101,121,110,113,113,103,121,121,101,107,103),
                List.of("e",121,110,113,113,103,121,121,"e",107,103)
        );
    }

}
