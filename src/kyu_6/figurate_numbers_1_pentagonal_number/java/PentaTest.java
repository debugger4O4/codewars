package kyu_6.figurate_numbers_1_pentagonal_number.java;

import static org.junit.Assert.*;
import org.junit.Test;


public class PentaTest {

    @Test
    public void BasicTests1() {
        System.out.println("****** Basic tests small pNum******");
        assertEquals(false, Penta.pNum(0));
        assertEquals(true, Penta.pNum(1));
        assertEquals(false, Penta.pNum(2));
        assertEquals(false, Penta.pNum(3));
        assertEquals(false, Penta.pNum(4));
        assertEquals(true, Penta.pNum(5));
    }
    @Test
    public void BasicTests2() {
        System.out.println("****** Basic tests small gpNum******");
        assertEquals(true, Penta.gpNum(0));
        assertEquals(true, Penta.gpNum(1));
        assertEquals(true, Penta.gpNum(2));
        assertEquals(false, Penta.gpNum(3));
        assertEquals(false, Penta.gpNum(4));
        assertEquals(true, Penta.gpNum(5));
    }
    @Test
    public void BasicTests3() {
        System.out.println("****** Basic tests small spNum******");
        assertEquals(false, Penta.spNum(0));
        assertEquals(true, Penta.spNum(1));
        assertEquals(false, Penta.spNum(2));
        assertEquals(false, Penta.spNum(3));
        assertEquals(false, Penta.spNum(4));
        assertEquals(false, Penta.spNum(5));
    }
}

