package kyu_4.survivors_ep5.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

class Tests {
    @Test
    void lengthOne() {
        assertEquals("afs", sort(Kata.survivors(new String[] {"afs"})));
        assertEquals("kl", sort(Kata.survivors(new String[] {"l k"})));
        assertEquals("bb", sort(Kata.survivors(new String[] {"bb bb"})));
        assertEquals("adfg", sort(Kata.survivors(new String[] {"afdg  bb"})));
    }
    @Test
    void lengthMultiple() {
        assertEquals("ab", sort(Kata.survivors(new String[] {"ab", "   ", "d"})));
        assertEquals("", sort(Kata.survivors(new String[] {"a", " b ", "d"})));
        assertEquals("ab", sort(Kata.survivors(new String[] {"a", "b", "  d"})));
        assertEquals("jv", sort(Kata.survivors(new String[] {"a", " ", " v", " j"})));

        assertEquals("", sort(Kata.survivors(new String[] {"tb", "ch", "  gt"})));
        assertEquals("abcd", sort(Kata.survivors(new String[] {"    abcd", "f"})));
        assertEquals("ar", sort(Kata.survivors(new String[] {"      ", "      ", "  ra  ", "      ", "      "})));
        assertEquals("fgx", sort(Kata.survivors(new String[] {"             a", "      ", "",  "        fxg"})));

        assertEquals("zzzzz", sort(Kata.survivors(new String[] {"b", "f", "", "aaa", "z z", "zzz"})));
        assertEquals("bz", sort(Kata.survivors(new String[] {"   a", "bz"})));
        assertEquals("", sort(Kata.survivors(new String[] {"opq", "   ", "amd   "})));
        assertEquals("abcdefg", sort(Kata.survivors(new String[] {"a b", "cde", "f g"})));

        assertEquals("ab", sort(Kata.survivors(new String[] {"ab  ", "ch  ", " ", " gt "})));
        assertEquals("aat", sort(Kata.survivors(new String[] {"r     ", "    ", "  aa  ", "        ", "j    g  t"})));
        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", sort(Kata.survivors(new String[] {"xxxx xxxxx xx", "xxxxxxxxxxxx", "xxx xxxx xx"})));
        assertEquals("abcdefghijklm", sort(Kata.survivors(new String[] {"a  z  m", "bc   kl", " de ij ", "  fgh  "})));

        assertEquals("x", sort(Kata.survivors(new String[] {"      o      ", "     o o     ", "    o   o    ", "   o  x  o   ", "    o   o    ", "     o o     ", "      o      "})));
        assertEquals("ccddddhiijjjjkmsux", sort(Kata.survivors(new String[] {"   oc umdd    ", "  o hjk  h  ", "  o      j", "         j", "ll   sddiijccx"})));
        assertEquals("", sort(Kata.survivors(new String[] {"a gggg", "aa ggg  ", "aaa gg         ", "aaaa g        "})));
    }
    @Test
    void islands() {
        assertEquals("df", sort(Kata.survivors(new String[] {"a", "", "fd"})));
        assertEquals("kklp", sort(Kata.survivors(new String[] {"agd", "", "", "", "klkp"})));
    }
    @Test
    void newEdge() {
        assertEquals("", sort(Kata.survivors(new String[] {" l", "bon b", "m  n m  ", "p  oj p o j", "    u z", " f   ic", "h     r", " ej x ", "  x", " bdr", "  fp  b ", "dkh  o", "  pw", " b ", "tld lk", "    dur", " wm ", "x  ", "o g", "  f px"})));
        assertEquals("addkmoty", sort(Kata.survivors(new String[] {" o","","  ","",""," o    ia  ","wn  g    ","  e g v  w"," mk  z","u    ","a    o ","n ","   i  ","n  bk"," d  t t ","        q  ","","  l  ",""," dmy s  d "})));
        assertEquals("", sort(Kata.survivors(new String[] {" q   x","    ","  dr      ","g t   ","s   d e","    a  e"," z i  s ","     o   ","o  u  j   "," o z","ib    e  ","    qe db","    "," dzu      ",""," w xqks ","  f   n","k   ",""," l  e i  f"})));
    }
    static private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

