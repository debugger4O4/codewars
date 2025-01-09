package kyu_8.a_wolf_in_sheeps_clothing.java;


import java.util.Arrays;
import java.util.Collections;

public class ZywOo {

    public static String warnTheSheep(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int position = Arrays.asList(array).indexOf("wolf");
        return position == 0 ? "Pls go away and stop eating my sheep"
                : "Oi! Sheep number " + position + "! You are about to be eaten by a wolf!";
    }

}
