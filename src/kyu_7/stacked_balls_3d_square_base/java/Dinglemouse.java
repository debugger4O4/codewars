package kyu_7.stacked_balls_3d_square_base.java;

public class Dinglemouse {

    public static double stackHeight3d(int layers) {
        return layers == 0 ? 0d : (layers - 1) / Math.sqrt(2) + 1;
    }

}
