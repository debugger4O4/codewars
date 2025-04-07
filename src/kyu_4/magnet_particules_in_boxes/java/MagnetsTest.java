package kyu_4.magnet_particules_in_boxes.java;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import org.junit.Test;


public class MagnetsTest {

    private static void assertFuzzyEquals(double act, double exp) {
        boolean inrange = Math.abs(act - exp) <= 1e-9;
        DecimalFormat df = new DecimalFormat("#0.000000000");
        assertEquals("At 1e-9: Expected must be " + df.format(exp) +", but got " + df.format(act), true, inrange);
    }

    @Test
    public void sample_tests() {
        System.out.println("Fixed Tests: doubles");
        assertFuzzyEquals(Magnets.doubles(1, 10), 0.5580321939764581);
        assertFuzzyEquals(Magnets.doubles(10, 1000), 0.6921486500921933);
        assertFuzzyEquals(Magnets.doubles(10, 10000), 0.6930471674194457);
        assertFuzzyEquals(Magnets.doubles(20, 10000), 0.6930471955575918);
    }
}
