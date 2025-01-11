package kyu_7.the_office_i_outed.java;

public class TheOffice {
    public static String outed(Person[] meet, String boss) {
        double rating = 0;
        for (Person a : meet) {
            rating += a.happiness;
            if (a.name.equals(boss)) rating += a.happiness;
        }
        return (rating / meet.length) <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}