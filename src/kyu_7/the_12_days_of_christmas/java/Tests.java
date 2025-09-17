package kyu_7.the_12_days_of_christmas.java;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Tests {

    // Show
    private String forDisplay(final List<String> lines) {
        final StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append("\t").append(line).append("\n");
        }
        return sb.toString();
    }

    @Test
    public void ex() {
        final String[] linesOrig = new String[]{
                "On the 12th day of Christmas my true love gave to me",
                "12 drummers drumming,",
                "11 pipers piping,",
                "10 lords a leaping,",
                "9 ladies dancing,",
                "8 maids a milking,",
                "7 swans a swimming,",
                "6 geese a laying,",
                "5 golden rings,",
                "4 calling birds,",
                "3 French hens,",
                "2 turtle doves and",
                "a partridge in a pear tree."
        };

        final List<String> lines = new ArrayList<>(Arrays.asList(linesOrig));
        Collections.shuffle(lines);
        System.out.println("Jumbled:\n"+forDisplay(lines));
        lines.sort(new Dinglemouse.HelpSaveChristmas());
        System.out.println("Sorted:\n"+forDisplay(lines));
        assertArrayEquals(linesOrig, lines.toArray());
    }

}
