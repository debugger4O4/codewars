package kyu_7.survive_the_attack.java;

import java.util.Arrays;

public class Kumite{
    public static boolean block(int[] attackers, int[] defenders) {
        int res = defenders.length - attackers.length;
        for (int i = 0; i < Math.min(attackers.length, defenders.length); i++) {
            res += Integer.compare(defenders[i], attackers[i]);
        }
        return res > 0 || (res == 0 && Arrays.stream(defenders).sum() >= Arrays.stream(attackers).sum());
    }
}
