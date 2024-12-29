package kyu_4.base91_encoding_and_decoding.java;

import java.io.ByteArrayOutputStream;

import static java.nio.charset.StandardCharsets.US_ASCII;

public class Base91 {

    private static final int BASE = 91;
    private static final byte[] TO_BASE_91 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&()*+,./:;<=>?@[]^_`{|}~\"'".getBytes(US_ASCII);
    private static final byte[] FROM_BASE_91 = new byte[256];

    static {
        assert BASE == TO_BASE_91.length;
        for (int i = 0; i < 256; ++i) {
            FROM_BASE_91[i] = -1;
        }
        for (int i = 0; i < BASE; i++) {
            FROM_BASE_91[TO_BASE_91[i]] = (byte) i;
        }
    }

    public static String encode(String data) {
        var out = new ByteArrayOutputStream();
        int queue = 0;
        int bitCount = 0;
        for (byte b : data.getBytes(US_ASCII)) {
            queue |= b << bitCount;
            bitCount += 8;
            if (bitCount > 13) {
                int encoded = queue & 0x1fff;
                if (encoded >= BASE - 4) {
                    queue >>= 13;
                    bitCount -= 13;
                } else {
                    encoded = queue & 0x3fff;
                    queue >>= 14;
                    bitCount -= 14;
                }
                out.write(TO_BASE_91[encoded % BASE]);
                out.write(TO_BASE_91[encoded / BASE]);
            }
        }
        if (bitCount > 0) {
            out.write(TO_BASE_91[queue % BASE]);
            if (bitCount > 7 || queue >= BASE) {
                out.write(TO_BASE_91[queue / BASE]);
            }
        }
        return out.toString(US_ASCII);
    }

    public static String decode(String data) {
        int queue = 0;
        int bitCount = 0;
        int value = -1;
        var out = new ByteArrayOutputStream();
        for (byte b : data.getBytes(US_ASCII)) {
            if (value == -1) {
                value = FROM_BASE_91[b];
            } else {
                value += FROM_BASE_91[b] * BASE;
                queue |= value << bitCount;
                bitCount += (value & 0x1fff) >= BASE - 4 ? 13 : 14;
                do {
                    out.write((byte) queue);
                    queue >>= 8;
                    bitCount -= 8;
                } while (bitCount > 7);
                value = -1;
            }
        }
        if (value != -1) {
            out.write((byte) (queue | value << bitCount));
        }
        return out.toString(US_ASCII);
    }
}
