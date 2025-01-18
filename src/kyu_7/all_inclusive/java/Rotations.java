// https://www.codewars.com/kata/5700c9acc1555755be00027e/train/java

package kyu_7.all_inclusive.java;

import java.util.List;

public class Rotations {

    public static Boolean containAllRots(String strng, List<String> arr) {
        for (int i = 0; i < strng.length(); i++)
            if (!arr.contains(strng.substring(i) + strng.substring(0, i)))
                return false;
        return true;
    }
}
