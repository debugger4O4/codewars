// https://www.codewars.com/kata/56f7493f5d7c12d1690000b6/train/java

package kyu_7.calculate_mean_and_concatenate_string.java;

public class Kata {
    public static Object[] mean(char[] lst) {
        double sum = 0;
        int count = 0;
        for (char c : lst) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(c + "");
                count++;
            }
        }
        double element1 = count > 0 ? sum / count : 0;
        String element2 = new String(lst).replaceAll("[0-9]", "");
        return new Object[]{element1, element2};
    }
}
