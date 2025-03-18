// https://www.codewars.com/kata/539ee3b6757843632d00026b/train/java

package kyu_7.find_the_capitals.java;

public class Kata {
    public static int[] capitals(String s) {
        int size = s.replaceAll("[a-zа-я]", "").length();
        int[] result = new int[size];
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}
