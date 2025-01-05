package kyu_7.arithmetic_progression.java;


class Progression {

    public static String arithmeticSequenceElements(int a, int d, long n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(a + (i - 1) * d).append(", ");
        }

        return result.substring(0, result.length() - 2);
    }
}
