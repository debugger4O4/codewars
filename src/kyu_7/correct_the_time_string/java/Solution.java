// https://www.codewars.com/kata/57873ab5e55533a2890000c7/train/java

package kyu_7.correct_the_time_string.java;

public class Solution {
    public static String timeCorrect(String timestring) {
        if (timestring == null || !timestring.matches("^\\d{2}:\\d{2}:\\d{2}$")) {
            return null;
        }
        String[] times = timestring.split(":");
        int hours = Integer.parseInt(times[0]);
        int minutes = Integer.parseInt(times[1]);
        int seconds = Integer.parseInt(times[2]);
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
