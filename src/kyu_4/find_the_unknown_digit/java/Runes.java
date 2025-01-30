// https://www.codewars.com/kata/546d15cebed2e10334000ed9/train/java

package kyu_4.find_the_unknown_digit.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runes {

    private static final Pattern pattern = Pattern.compile("(-?+[0-9]+)([*+-])(-?+[0-9]+)=(.*)");

    public static int solveExpression(final String expression) {
        for (int i = 0; i < 10; i++) {
            if (expression.contains("" + i)) continue;
            if (isTrue(expression.replace("?", "" + i))) return i;
        }
        return -1;
    }

    private static boolean isTrue(final String expr) {
        final Matcher matcher = pattern.matcher(expr);
        if (matcher.matches()) {
            final String s = matcher.group(1), b = matcher.group(3), c = matcher.group(4);
            if (s.matches("-*0.+") || b.matches("-*0.+") || c.matches("-*0.+"))
                return false;
            final int ai = Integer.parseInt(s), bi = Integer.parseInt(b), ci = Integer.parseInt(c);
            switch (matcher.group(2)) {
                case "+" -> {
                    return ai + bi == ci;
                }
                case "-" -> {
                    return ai - bi == ci;
                }
                case "*" -> {
                    return ai * bi == ci;
                }
            }
        }
        return false;
    }
}
