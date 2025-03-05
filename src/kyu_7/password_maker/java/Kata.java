// https://www.codewars.com/kata/5637b03c6be7e01d99000046/train/java

package kyu_7.password_maker.java;

public class Kata {
    public static String makePassword(String phrase) {
        if (phrase.isEmpty()) {
            return "";
        }
        String[] strings = phrase.split(" ");
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            char c = string.charAt(0);
            if (c == 'i' || c == 'I') {
                result.append(1);
            } else if (c == 'o' || c == 'O') {
                result.append(0);
            } else if (c == 's' || c == 'S') {
                result.append(5);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
