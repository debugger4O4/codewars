package kyu_7.cogs.java;

public class Dinglemouse {

    public static double cogRpm(final int[] cogs) {
        return (cogs.length % 2 == 0 ? -1d : 1d) * cogs[0] / cogs[cogs.length-1];
    }
}
