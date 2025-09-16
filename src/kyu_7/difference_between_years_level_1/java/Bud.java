// https://www.codewars.com/kata/588f5a38ec641b411200005b/train/java

package kyu_7.difference_between_years_level_1.java;

public class Bud {
    public static int howManyYears(String date1, String date2){
        int year1 = Integer.parseInt(date1.split("/")[0]);
        int year2 = Integer.parseInt(date2.split("/")[0]);
        return Math.abs(year1 - year2);
    }
}
