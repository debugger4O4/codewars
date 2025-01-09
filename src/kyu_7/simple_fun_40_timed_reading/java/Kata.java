package kyu_7.simple_fun_40_timed_reading.java;

public class Kata {
    public static int timedReading(final int maxLength, final String text) {
        int count = 0;
        String[] strings = text.split("\\W+");
        for (String string : strings) {
            if (!string.isEmpty() && string.length() <= maxLength) {
                count++;
            }
        }
        return count;
    }
}
