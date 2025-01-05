package kyu_7.responsible_drinking.java;

import java.util.Arrays;

public class Drinkin {
    public String hydrate(String drinkString) {
        int glasses = Arrays.stream(drinkString.split("[^0-9]"))
                .filter(f -> !f.equals(""))
                .mapToInt(Integer::parseInt)
                .sum();
        return glasses > 1 ? glasses + " glasses of water" : "1 glass of water";
    }
}
