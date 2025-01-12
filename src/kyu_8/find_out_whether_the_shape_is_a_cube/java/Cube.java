package kyu_8.find_out_whether_the_shape_is_a_cube.java;

class Cube {
    public static boolean isCube(int volume, int side) {
        return volume > 0 && side > 0 && volume == Math.pow(side, 3);
    }
}
