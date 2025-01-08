package kyu_2.prime_streaming_nc_17.java;

import java.util.BitSet;
import java.util.stream.IntStream;

public class Primes {
    private static final BitSet bitSet = getBitSet();

    public static IntStream stream() {
        return IntStream.iterate(2, i -> bitSet.nextSetBit(i + 1));
    }

    private static BitSet getBitSet() {
        int max = 810000000;
        int min = 28460;
        BitSet set = new BitSet(max);
        set.set(2, max - 1);
        int i = 1;
        while (i < min) {
            i = set.nextSetBit(i + 1);
            for (int j = i * i; j < max; j += i) {
                set.clear(j);
            }
        }
        return set;
    }
}
