// https://www.codewars.com/kata/66461f89e569d45b0f07116d/train/java

package kyu_6.the_train_driver.java;

class Kata {
    static String arrivalTime(String[] r, String d) {
        int p = 0;
        int time = 0;
        int[] intervals = {60, 135, 200, 255, 130, 60, 100, 385, 195, 105, 60, 450, 250, 385, 450, 60};
        for (String s : r) {
            time += intervals[4 * p + (p = "SCON".indexOf(s.charAt(0)))];
        }
        return r.length > 0
                ? String.format("%02d:%02d", (time = (time + Integer.parseInt((r = d.split(":"))[1]) + 60 * Integer.parseInt(r[0])) % 1440) / 60, time % 60)
                : "The Train Driver has the day off";
    }
}

