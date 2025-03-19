// https://www.codewars.com/kata/5977618080ef220766000022/train/java

package kyu_8.usd_cny.java;

import java.text.DecimalFormat;

public class Kata {
    public static String usdcny(int usd) {
        return new DecimalFormat("#0.00").format(usd * 6.75) + " Chinese Yuan";
    }
}
