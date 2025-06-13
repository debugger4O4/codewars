// https://www.codewars.com/kata/540d0fdd3b6532e5c3000b5b/train/java

package kyu_3.binomial_expansion.java;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class KataSolution {

    public static String expand(String expr) {

        Matcher m = Pattern.compile("(-?\\d*)([a-z])([+-])(-?\\d+)\\D+(\\d+)").matcher(expr);
        m.find();
        int p = Integer.parseInt(m.group(5));
        String[] str = new String[p + 1];
        int a = m.group(1).length() == 0 ? 1 : m.group(1).equals("-") ? -1 : Integer.parseInt(m.group(1));
        int b = (m.group(3).equals("-") ? -1 : 1) * Integer.parseInt(m.group(4));
        for (int i = 0; i <= p; i++) {
            long f = (long) (nOverK(p, i) * Math.pow(a, p - i) * (i == 0 ? 1 : Math.pow(b, i)));
            if (f != 0) {
                str[i] = p - i == 0 ? f + ""
                        : (f == 1 ? "" : f == -1 ? "-" : f) + m.group(2) + (p - i != 1 ? "^" + (p - i) : "");
            }
        }
        return Arrays.stream(str).filter(Objects::nonNull).collect(Collectors.joining("+")).replaceAll("\\+-", "-");
    }

    public static int nOverK(int n, int k) {
        if (n < k)
            return 0;
        if (k == 0 || k == n)
            return 1;
        return nOverK(n - 1, k - 1) + nOverK(n - 1, k);
    }
}