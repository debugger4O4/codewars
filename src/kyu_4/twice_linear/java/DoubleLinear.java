// https://www.codewars.com/kata/5672682212c8ecf83e000050/train/java

package kyu_4.twice_linear.java;


class DoubleLinear {

    public static int dblLinear (int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        int iy = 0;
        int iz = 0;
        int i = 1;
        while (i <= n) {
            int y = 2 * arr[iy] + 1;
            int z = 3 * arr[iz] + 1;
            if (y < z) {
                arr[i++] = y;
                iy++;
            } else if (z < y) {
                arr[i++] = z;
                iz++;
            } else {
                arr[i++] = y;
                iy++;
                iz++;
            }
        }
        return arr[n];
    }
}
