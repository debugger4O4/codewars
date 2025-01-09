package kyu_7.changing_letters.java;

public class Kata {
    public static String swap(String st) {
        StringBuilder result = new StringBuilder();
        char[] chars = st.toCharArray();
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
