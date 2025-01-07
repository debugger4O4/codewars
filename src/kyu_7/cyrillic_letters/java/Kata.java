package kyu_7.cyrillic_letters.java;

public class Kata {
    public static boolean isCyrillic(char letter) {
        return (int) letter >= 1039 && (int) letter <= 1111;
    }
}
