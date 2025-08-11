package kyu_6.bifid_cipher.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class AllTest {

    @Test
    public void enCoding() {
        BifidCipher testCipher = new BifidCipher();
        assertEquals("CWUAS", testCipher.encodeBifid("","ELVIS"));
        assertEquals("", testCipher.encodeBifid("KEY",""));
        assertEquals("ORGFOSR", testCipher.encodeBifid("CODEWARS","WARRIOR"));
        assertEquals("EKUCERRRIS", testCipher.encodeBifid("ELVIS","JIMMY JAMES"));
        assertEquals("RCPGSSBBBDTELGTHLGHG", testCipher.encodeBifid("BIFID","THE INVENTOR OF BIFID IS"));

    }
    @Test
    public void deCoding() {
        BifidCipher testCipher = new BifidCipher();
        assertEquals("ELVIS", testCipher.decodeBifid("","CWUAS"));
        assertEquals("", testCipher.decodeBifid("",""));
        assertEquals("MEMPHIS", testCipher.decodeBifid("ELVIS","GMGIIBT"));
        assertEquals("FELIXDELASTELLE", testCipher.decodeBifid("INVENTOR","DLXEBIQNLVEVZLE"));
    }
}
