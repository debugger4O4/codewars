package kyu_6.figurate_numbers_1_pentagonal_number.java;

public class Penta {

    public static boolean pNum(long n) {
        return ((Math.sqrt(24 * n + 1) + 1) / 6) % 1 == 0;
    }

    public static boolean gpNum(long n) {
        return Math.sqrt(24 * n + 1) % 1 == 0;
    }

    public static boolean spNum(long n) {
        return Math.sqrt(n) % 1 == 0 && pNum(n);
    }
}
