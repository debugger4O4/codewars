// https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e/train/java

package kyu_6.error_correction_1_hamming_code.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CodeWars {
    public String encode(String text) {
        return text
                .chars()
                .mapToObj(Integer::toBinaryString)
                .map(binary -> String.format("%8s", binary).replace(' ', '0'))
                .flatMap(binary -> binary.chars().mapToObj(bit -> String.valueOf((char) bit)))
                .map(bit -> bit.repeat(3))
                .collect(Collectors.joining());
    }

    public String decode(String bits) {
        bits = Stream.of(bits.split("(?<=\\G.{3})")).map(s -> s.indexOf('0') != s.lastIndexOf('0') ? "0" : "1").collect(Collectors.joining());
        return Stream.of(bits.split("(?<=\\G.{8})")).map(i -> (char) Integer.parseInt(i, 2) + "").collect(Collectors.joining());
    }

}