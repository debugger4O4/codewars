package kyu_8.sort_my_textbooks.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class SortingTest {
    @Test
    public void basicTest() {
        ArrayList<String> expected  = new ArrayList<String>(Arrays.asList("Algebra", "English", "Geometry", "History"));
        ArrayList<String> textbooks = new ArrayList<String>(Arrays.asList("Algebra", "History", "Geometry", "English"));
        assertEquals(expected, sorter.sort(textbooks));
    }
    @Test
    public void capitalizationTest() {
        ArrayList<String> expected  = new ArrayList<String>(Arrays.asList("Algebra", "english", "Geometry", "History"));
        ArrayList<String> textbooks = new ArrayList<String>(Arrays.asList("Algebra", "History", "Geometry", "english"));
        assertEquals(expected, sorter.sort(textbooks));
    }
    @Test
    public void symbolsTest() {
        ArrayList<String> expected  = new ArrayList<String>(Arrays.asList("$istory", "**English", "Alg#bra", "Geom^try"));
        ArrayList<String> textbooks = new ArrayList<String>(Arrays.asList("Alg#bra", "$istory", "Geom^try", "**English"));
        assertEquals(expected, sorter.sort(textbooks));
    }
}
