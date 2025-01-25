// https://www.codewars.com/kata/551f23362ff852e2ab000037/train/java

package kyu_4.pyramid_slide_down.java;

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {

        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        return pyramid[0][0];
    }
}
