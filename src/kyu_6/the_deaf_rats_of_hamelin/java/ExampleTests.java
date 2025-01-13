package kyu_6.the_deaf_rats_of_hamelin.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void ex1() {
        assertEquals(0, Dinglemouse.countDeafRats("~O~O~O~O P"));
    }

    @Test
    public void ex2() {
        assertEquals(1, Dinglemouse.countDeafRats("P O~ O~ ~O O~"));
    }

    @Test
    public void ex3() {
        assertEquals(2, Dinglemouse.countDeafRats("~O~O~O~OP~O~OO~"));
    }

}
