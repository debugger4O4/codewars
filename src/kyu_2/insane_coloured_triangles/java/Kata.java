package kyu_2.insane_coloured_triangles.java;

public class Kata {
    public static char triangle(final String row) {
        char[] a = row.toCharArray();
        for (int s = 59049; s > 0; s /= 3) {
            while (a.length > s) {
                char[] b = new char[a.length - s];
                for (int i = 0; i + s < a.length; i++)
                    b[i] = (char) ((666 - a[i] - a[i + s]) % 3);
                a = b;
            }
        }
        return "BRG".charAt(a[0] % 3);
    }
}
