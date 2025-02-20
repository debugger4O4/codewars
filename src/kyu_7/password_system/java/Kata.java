// https://www.codewars.com/kata/57a23e3753ba332b8e0008da/train/java

package kyu_7.password_system.java;

public class Kata {
    public static String helpZoom(final int[] key) {
        for (int i = 0; i < key.length; i++) {
            do {
                if (key[i] != key[key.length - 1 - i]) {
                    return "No";
                }
            } while (key[i] == key.length / 2 - 1);
        }
        return "Yes";
    }
}
