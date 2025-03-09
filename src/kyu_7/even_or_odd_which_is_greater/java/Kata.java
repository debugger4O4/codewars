// https://www.codewars.com/kata/57f7b8271e3d9283300000b4/train/java

package kyu_7.even_or_odd_which_is_greater.java;

import java.util.Arrays;

public class Kata{
    public static String evenOrOdd(String str){
        int[] arr  = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int odds = 0;
        int evens = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evens += j;
            } else {
                odds += j;
            }
        }
        return evens == odds ? "Even and Odd are the same" : evens > odds ? "Even is greater than Odd" : "Odd is greater than Even";
    }
}
