// https://www.codewars.com/kata/670fd4615f6c253786cd49a2/train/java

package kyu_5.taxi_station.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class TaxiStation {

    public static int[] calculateTrips(int[] distances, int[] speeds) {
        int[] result = new int[speeds.length];
        if(Arrays.stream(speeds).sum() == 0) {
            return result;
        }
        double[] pos = new double[speeds.length];

        Comparator<Integer> comparator = Comparator.<Integer>comparingInt(i -> speeds[i] == 0 ? 1 : 0)
                .thenComparingDouble(i -> pos[i])
                .thenComparingInt(i -> -speeds[i])
                .thenComparingInt(i -> i);
        for(int i : distances) {
            int n = IntStream.range(0, speeds.length)
                    .boxed()
                    .min(comparator)
                    .orElseThrow();
            ++result[n];
            pos[n] += (double) i / speeds[n];
        }
        return result;
    }
}
