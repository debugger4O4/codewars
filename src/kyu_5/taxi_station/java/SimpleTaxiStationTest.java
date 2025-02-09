package kyu_5.taxi_station.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SimpleTaxiStationTest {

    @Test
    public void simpleTrip() {
        assertArrayEquals(new int[] { 3 }, TaxiStation.calculateTrips(new int[] { 120, 80, 60 }, new int[] { 50 }));

        assertArrayEquals(new int[] { 2, 1 },
                TaxiStation.calculateTrips(new int[] { 100, 50, 80 }, new int[] { 50, 80 }));

        assertArrayEquals(new int[] { 0 }, TaxiStation.calculateTrips(new int[] {}, new int[] { 50 }));

        assertArrayEquals(new int[0], TaxiStation.calculateTrips(new int[] { 120 }, new int[] {}));

        assertArrayEquals(new int[] { 2, 2, 1 },
                TaxiStation.calculateTrips(new int[] { 100, 50, 80, 40, 40 }, new int[] { 30, 20, 10 }));

        assertArrayEquals(new int[] { 5, 3, 2 }, TaxiStation
                .calculateTrips(new int[] { 100, 50, 80, 40, 40, 100, 50, 80, 40, 40 }, new int[] { 30, 20, 10 }));

        assertArrayEquals(new int[] { 7, 5, 3 }, TaxiStation.calculateTrips(
                new int[] { 100, 50, 80, 40, 40, 100, 50, 80, 40, 40, 100, 50, 80, 40, 40 }, new int[] { 30, 20, 10 }));
    }
}