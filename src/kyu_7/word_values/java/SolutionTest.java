package kyu_7.word_values.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertArrayEquals(new int[]{6,24},Solution.nameValue(new String[]{"abc","abc abc"}));
        assertArrayEquals(new int[]{88,12,225},Solution.nameValue(new String[]{"codewars","abc","xyz"}));
        assertArrayEquals(new int[]{351,282,330},Solution.nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz","stamford bridge","haskellers"}));
    }
}
