// https://www.codewars.com/kata/5a431c0de1ce0ec33a00000c/train/java

package kyu_7.even_numbers_in_an_array.java;

public class Kata {

    public static int[] evenNumbers(int[] arr, int n) {
        int[] result = new int[n];
        int idxArr = arr.length - 1;
        int idxResult = result.length - 1;
        while (n > 0) {
            if (arr[idxArr] % 2 == 0) {
                result[idxResult--] = arr[idxArr];
                n--;
            }
            idxArr--;
        }
        return result;
    }
}
