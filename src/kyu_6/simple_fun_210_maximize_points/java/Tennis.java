package kyu_6.simple_fun_210_maximize_points.java;

import java.util.Arrays;

public class Tennis {

    public static int maximizePoints(int[] team1, int[] team2) {
        int points = 0;
        Arrays.sort(team1);
        Arrays.sort(team2);
        for (int i = 0; i < team1.length; i++) {
            if (team1[i] > team2[points]) {
                points += 1;
            } else {
                points += 0;
            }
        }
        return points;
    }
}
