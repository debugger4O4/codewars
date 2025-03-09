// https://www.codewars.com/kata/536a155256eb459b8700077e/train/java

package kyu_5.the_clockwise_spiral.java;

public class TheClockwiseSpiral {

    public static int[][] createSpiral(int N) {
        int[][] result = new int[N][N];
        int row = 0;
        int col = 0;
        int x = 1;
        int y = 0;
        int changes = 0;
        int visits = N;

        for (int i = 0; i < N * N; i++) {
            result[row][col] = i + 1;
            if (--visits == 0) {
                visits = N * (changes % 2) + N * ((changes + 1) % 2) - (changes / 2 - 1) - 2;
                int temp = x;
                x = -y;
                y = temp;
                changes++;
            }
            col += x;
            row += y;
        }

        return result;
    }
}
