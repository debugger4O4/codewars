package kyu_7.triangular_treasure.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Triangular_Test {

    @Test
    public void fixedTests(){
        assertEquals(3, Triangular.triangular(2));
        assertEquals(10, Triangular.triangular(4));
        assertEquals(813450, Triangular.triangular(1275));
        assertEquals(0, Triangular.triangular(0));
        assertEquals(0, Triangular.triangular(-1));
    }
}
