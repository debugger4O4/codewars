// https://www.codewars.com/kata/5839c48f0cf94640a20001d3/train/java

package kyu_5.land_perimeter.java;

public class LandPerimiter {

    public static String landPerimeter(String[] arr) {
        int perimeter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'X') {
                    if (i == 0 || arr[i - 1].charAt(j) == 'O') {
                        perimeter += 1;
                    }
                    if (i == arr.length - 1 || arr[i + 1].charAt(j) == 'O') {
                        perimeter += 1;
                    }
                    if (j == 0 || arr[i].charAt(j - 1) == 'O') {
                        perimeter += 1;
                    }
                    if (j == arr[i].length() - 1 || arr[i].charAt(j + 1) == 'O') {
                        perimeter += 1;
                    }
                }
            }
        }

        return "Total land perimeter: " + perimeter;
    }
}