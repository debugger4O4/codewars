package kyu_6.the_deaf_rats_of_hamelin.java;

public class Dinglemouse {

    public static int countDeafRats(final String town) {
        String trim = town.replaceAll(" ", "");
        int count = 0;
        for (int i = 0; i < trim.length(); i += 2) {
            if (trim.charAt(i) == 'O') {
                count++;
            }
        }
        return count;
    }
}
