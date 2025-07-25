package kyu_7.basic_math_add_or_subtract.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateExampleTest {

    @Test @DisplayName("calculate(\"1plus2plus3plus4\")")
    public void test1plus2plus3plus4() {
        assertEquals("10", Kata.calculate("1plus2plus3plus4"));
    }

    @Test @DisplayName("calculate(\"1minus2minus3minus4\")")
    public void test1minus2minus3minus4() {
        assertEquals("-8", Kata.calculate("1minus2minus3minus4"));
    }

    @Test @DisplayName("calculate(\"1plus2plus3minus4\")")
    public void test1plus2plus3minus4() {
        assertEquals("2", Kata.calculate("1plus2plus3minus4"));
    }

    @Test @DisplayName("calculate(\"1minus2plus3minus4\")")
    public void test1minus2plus3minus4() {
        assertEquals("-2", Kata.calculate("1minus2plus3minus4"));
    }

    @Test @DisplayName("calculate(\"1plus2minus3plus4minus5\")")
    public void test1plus2minus3plus4minus5() {
        assertEquals("-1", Kata.calculate("1plus2minus3plus4minus5"));
    }
}

