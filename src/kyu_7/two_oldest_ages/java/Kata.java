// https://www.codewars.com/kata/511f11d355fe575d2c000001/train/java

package kyu_7.two_oldest_ages.java;

import java.util.Arrays;

public class Kata {
    public static int[] twoOldestAges(int[] ages) {
        Arrays.sort(ages);
        return new int[]{ages[ages.length - 2], ages[ages.length - 1]};
    }
}
