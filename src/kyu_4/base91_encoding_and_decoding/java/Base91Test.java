package kyu_4.base91_encoding_and_decoding.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Base91Test {
    @Test
    public void fixedTests() {
        assertEquals(Base91.encode("test"), "fPNKd");
        assertEquals(Base91.encode("Hello World!"), ">OwJh>Io0Tv!8PE");
        assertEquals(Base91.decode("fPNKd"), "test");
        assertEquals(Base91.decode(">OwJh>Io0Tv!8PE"), "Hello World!");
    }
}
