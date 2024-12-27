package kyu_6.matrix_strings.java;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class MatrixTest {

    @RunWith(Parameterized.class)
    public static class CountRowsTest {
        private Matrix matrix;
        private int numberOfRows;

        @Parameterized.Parameters(name = "{index}: expected matrix constructed with string \n\"{0}\" to have {1} row(s).")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {"0", 1},
                    {"0 1", 1},
                    {  "0\n"
                            + "1", 2},
                    {  "0 1\n"
                            + "2 3", 2},
                    {  "0 1 2\n"
                            + "3 4 5\n"
                            + "6 7 8", 3}
            });
        }

        public CountRowsTest(String matrixAsString, int numberOfRows) {
            this.matrix = new Matrix(matrixAsString);
            this.numberOfRows = numberOfRows;
        }

        @Test
        public void countRowsTest() {
            assertEquals(numberOfRows, matrix.getRowsCount());
        }
    }
}
