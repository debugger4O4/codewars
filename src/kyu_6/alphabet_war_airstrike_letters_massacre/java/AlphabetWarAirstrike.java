// https://www.codewars.com/kata/5938f5b606c3033f4700015a/train/java

package kyu_6.alphabet_war_airstrike_letters_massacre.java;

import java.util.HashMap;
import java.util.Map;

public class AlphabetWarAirstrike{

    public static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("w", 4);
        map.put("p", 3);
        map.put("b", 2);
        map.put("s", 1);
        map.put("m", -4);
        map.put("q", -3);
        map.put("d", -2);
        map.put("z", -1);
    }

    public static String alphabetWar(String fight){
        int result = 0;
        fight = " " + fight + " ";
        for (int i = 1; i < fight.length() - 1; i++) {
            if (fight.charAt(i) != '*' && fight.charAt(i - 1) != '*' && fight.charAt(i + 1) != '*') {
                result += map.getOrDefault(fight.charAt(i) + "", 0);
            }
        }
        if (result == 0) {
            return "Let's fight again!";
        }
        return result > 0 ? "Left side wins!" : "Right side wins!";
    }
}