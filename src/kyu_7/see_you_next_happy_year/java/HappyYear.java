// https://www.codewars.com/kata/5ae7e3f068e6445bc8000046/train/java

package kyu_7.see_you_next_happy_year.java;

import java.util.Arrays;
import java.util.HashSet;

public class HappyYear {
    static public int nextHappyYear(int year) {
        while (true) {
            if (new HashSet(Arrays.asList((++year + "").split(""))).size() == 4) {
                return year;
            }
        }
    }
}
