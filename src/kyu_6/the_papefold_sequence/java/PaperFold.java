// https://www.codewars.com/kata/5d26721d48430e0016914faa/train/java

package kyu_6.the_papefold_sequence.java;

import java.util.function.IntSupplier;

public class PaperFold implements IntSupplier {
    int i = 0;

    public int getAsInt() {
        return (++i & Integer.lowestOneBit(i) << 1) == 0 ? 1 : 0;
    }
}
