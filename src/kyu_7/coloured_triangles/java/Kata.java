package kyu_7.coloured_triangles.java;

public class Kata {

    public static char triangle(final String row) {
        if (row.length() == 1) {
            return row.charAt(0);
        }
        if (row.length() == 2) {
            return ifLengthIs2(row);
        }
        String currentRow = row;
        String nextRow = "";
        int length = row.length();

        for (int i = 1; i < length; ) {
            if (currentRow.charAt(i) == 'R' && currentRow.charAt(i - 1) == 'B' || (currentRow.charAt(i) == 'B' && currentRow.charAt(i - 1) == 'R')) {
                nextRow += "G";
                i++;
            } else if (currentRow.charAt(i) == 'R' && currentRow.charAt(i - 1) == 'G' || (currentRow.charAt(i) == 'G' && currentRow.charAt(i - 1) == 'R')) {
                nextRow += "B";
                i++;
            } else if (currentRow.charAt(i) == 'B' && currentRow.charAt(i - 1) == 'G' || (currentRow.charAt(i) == 'G' && currentRow.charAt(i - 1) == 'B')) {
                nextRow += "R";
                i++;
            } else if (currentRow.charAt(i) == currentRow.charAt(i - 1)) {
                nextRow += currentRow.charAt(i);
                i++;
            }
            if (length - nextRow.length() == 1) {
                i = 1;
                currentRow = nextRow;
                nextRow = "";
                length = currentRow.length();
            }
        }
        return currentRow.length() == 1 ? currentRow.charAt(0) : ifLengthIs2(currentRow);
    }

    public static char ifLengthIs2(String s) {
        return s.charAt(0) == 'R' && s.charAt(1) == 'B' || (s.charAt(0) == 'B' && s.charAt(1) == 'R') ? 'G' :
                s.charAt(0) == 'R' && s.charAt(1) == 'G' || (s.charAt(0) == 'G' && s.charAt(1) == 'R') ? 'B' :
                s.charAt(0) == 'B' && s.charAt(1) == 'G' || (s.charAt(0) == 'G' && s.charAt(1) == 'B') ? 'R' :
                s.charAt(0) == s.charAt(1) ? s.charAt(0) : ' ';
    }
}
