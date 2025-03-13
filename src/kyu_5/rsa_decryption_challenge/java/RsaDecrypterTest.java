package kyu_5.rsa_decryption_challenge.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RsaDecrypterTest {

    @Test
    public void testExamplesFromDescription() {
        assertEquals("Z", RsaDecrypter.decryptRsaCipher("372", "3", "391", "23"));
        assertEquals("RSA", RsaDecrypter.decryptRsaCipher("121330", "257", "576761", "673"));
        assertEquals("HELLO WORLD", RsaDecrypter.decryptRsaCipher("60407535701324298645777196", "65537", "160719199861369881405873071", "17394808553761"));
    }

}

