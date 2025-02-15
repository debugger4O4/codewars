// https://www.codewars.com/kata/593b1909e68ff627c9000186/train/java

package kyu_7.nickname_generator.java;

class Generator {
    public static String nickname (String name) {
        if (name.length() <= 3) {
            return "Error: Name too short";
        }
        char c = name.toLowerCase().charAt(2);
        return c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i' ? name.substring(0, 4) : name.substring(0, 3);
    }
}
