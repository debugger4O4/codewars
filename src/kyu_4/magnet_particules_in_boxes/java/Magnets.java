// https://www.codewars.com/kata/56c04261c3fcf33f2d000534/train/java

package kyu_4.magnet_particules_in_boxes.java;

class Magnets {

    public static double doubles(int maxk, int maxn) {
        double sum = 0.0;
        for (int n = 1; n <= maxn; n++) {
            for (int k = 1; k <= maxk; k++) {
                double result = sum + 1.0 / (k * Math.pow(n + 1, 2 * k));
                if (result == sum) {
                    break;
                } else {
                    sum = result;
                }
            }
        }
        return sum;
    }
}
