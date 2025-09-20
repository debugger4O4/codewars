// https://www.codewars.com/kata/5a0d38c9697598b67a000041/train/java

package kyu_7.eliminate_the_intruders_bit_manipulation.java;

public class SetBits {
    public static long eliminateUnsetBits(String number) {
        String s = number.replaceAll("0", "");
        return convertBitsToNumber(s);
    }

    public static long convertBitsToNumber(String bits) {
        char[] bitArray = bits.toCharArray();
        long number = 0;
        for (char bit : bitArray) {
            number <<= 1;
            if (bit == '1') {
                number |= 1;
            }
        }
        return number;
    }
}
