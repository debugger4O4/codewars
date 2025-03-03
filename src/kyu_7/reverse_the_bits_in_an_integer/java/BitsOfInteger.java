// https://www.codewars.com/kata/5959ec605595565f5c00002b/train/java

package kyu_7.reverse_the_bits_in_an_integer.java;

public class BitsOfInteger{
    public static int reverseBits(int n){
        return Integer.parseInt(new StringBuffer(Integer.toBinaryString(n)).reverse().toString(), 2);
    }
}
