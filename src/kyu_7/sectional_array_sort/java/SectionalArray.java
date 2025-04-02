// https://www.codewars.com/kata/58ef87dc4db9b24c6c000092/train/java

package kyu_7.sectional_array_sort.java;

import java.util.Arrays;

class SectionalArray {
    static int[] sort(int[] array, int start, int... length) {
        Arrays.sort(array, start, length.length > 0 && start + length[0] < array.length ? start + length[0] : array.length);
        return array;
    }
}

