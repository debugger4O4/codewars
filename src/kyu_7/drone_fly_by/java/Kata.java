// https://www.codewars.com/kata/58356a94f8358058f30004b5/train/java

package kyu_7.drone_fly_by.java;

public class Kata {
    public static String flyBy(String lamps, String drone) {
        return drone.length() > lamps.length() ?
                lamps.replaceAll("x", "o") :
                lamps.substring(0, drone.length()).replaceAll("x", "o") + lamps.substring(drone.length());
    }
}
