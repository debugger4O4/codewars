// https://www.codewars.com/kata/5b02ae6aa2afd8f1b4001ba4/train/java

package kyu_7.laxative_shot_roulette.java;

public class Kata {

    public static double getChance(int n, int x, int a) {
        double chance = 1;
        for (double i = 0; i < a; i++) {
            chance *= (double) (n - x) / n;
            n--;
        }
        return Math.round(chance * 100.0) / 100.0;
    }
}
