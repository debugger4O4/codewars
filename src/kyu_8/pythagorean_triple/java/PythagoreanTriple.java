// https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java

package kyu_8.pythagorean_triple.java;

public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple) {
        if ((Math.pow(triple[0], 2) + (Math.pow(triple[1], 2)) == (Math.pow(triple[2], 2)))) {
            return 1;
        } else {
            return 0;
        }
    }
}

