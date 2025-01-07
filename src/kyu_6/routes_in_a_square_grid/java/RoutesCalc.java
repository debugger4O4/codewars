package kyu_6.routes_in_a_square_grid.java;

import java.util.stream.IntStream;

public class RoutesCalc {

    public static long calculateRoutes(int n) {
        if (n < 0) {
            return 0;
        }
        long[] longs = {1};
        IntStream.rangeClosed(1, n).forEach(f -> longs[0] += longs[0] * n / f);
        return longs[0];
    }

}
