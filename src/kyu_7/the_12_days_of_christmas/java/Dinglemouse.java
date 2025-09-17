// https://www.codewars.com/kata/57dd3a06eb0537b899000a64/train/java

package kyu_7.the_12_days_of_christmas.java;

import java.util.*;

public class Dinglemouse {

    public static class HelpSaveChristmas implements Comparator<String> {

        @Override
        public int compare(final String line1, final String line2) {
            final int i1 = Integer.parseInt("0" + line1.replaceAll("\\D", ""));
            final int i2 = Integer.parseInt("0" + line2.replaceAll("\\D", ""));
            return i1 > i2 || i1 == i2 && line1.length() > line2.length() ? -1 : 1;
        }
    }
}
