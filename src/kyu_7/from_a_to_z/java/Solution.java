package kyu_7.from_a_to_z.java;

public class Solution {

    private static final String TMP = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String gimmeTheLetters(String s) {
        String[] fromTo = s.split("-");
        int from = TMP.indexOf(fromTo[0]);
        int to = TMP.indexOf(fromTo[1]) + 1;
        return TMP.substring(from, to);
    }
}
