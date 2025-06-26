// https://www.codewars.com/kata/566be96bb3174e155300001b/train/java

package kyu_6.ball_upwards.java;

public class Ball {

    private static final float g = 9.81f;

    public static int maxBall(int v0) {
        float mBys = v0 / 3.6f;
        float prevH = 0;
        float currentH;
        int count = 0;
        for (float t = 0.1f; ; t += 0.1) {
            currentH = mBys * t - 0.5f * g * t * t;
            if (currentH < prevH) {
               break;
            }
            prevH = currentH;
            count++;
        }
        return count;
    }
}