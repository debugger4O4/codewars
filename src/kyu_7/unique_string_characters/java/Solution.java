package kyu_7.unique_string_characters.java;

class Solution {

    public static String solve(String a, String b) {
        StringBuilder sb = new StringBuilder();

        for (String s : (a + b).split(""))
            if (a.contains(s) ^ b.contains(s))
                sb.append(s);

        return sb.toString();
    }
}