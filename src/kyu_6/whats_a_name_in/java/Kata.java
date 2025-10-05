// https://www.codewars.com/kata/59daf400beec9780a9000045/train/java

package kyu_6.whats_a_name_in.java;

public class Kata {
    public static boolean nameInStr(String str, String name) {
        str = str.toLowerCase();
        name = name.toLowerCase();
        int cnt = 0;
        for (char ch : str.toCharArray()) {
            if (cnt < name.length() && ch == name.charAt(cnt)) {
                cnt++;
            }
            if (cnt >= name.length()) {
                return true;
            }
        }
        return false;
    }
}