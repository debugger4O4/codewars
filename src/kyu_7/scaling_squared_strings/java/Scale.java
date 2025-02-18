// https://www.codewars.com/kata/56ed20a2c4e5d69155000301/train/java

package kyu_7.scaling_squared_strings.java;

public class Scale {

    public static String scale(String strng, int k, int v) {
        String[] strings = strng.split("\n");
        String result = "";
        for(int i = 0; i < strings.length; i++) {
            String s = "";
            for (int j = 0; j < strings[i].length(); j++) {
                s += (strings[i].charAt(j) + "").repeat(k);
            }
            result += (s + "\n").repeat(v);
        }
        return result.trim();
    }
}
