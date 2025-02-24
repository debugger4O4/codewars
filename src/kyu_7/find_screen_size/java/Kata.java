// https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f/train/java

package kyu_7.find_screen_size.java;

class Kata {
    public static String findScreenHeight(int width, String ratio) {
        String[] params = ratio.split(":");
        return width + "x" + (width * Integer.parseInt(params[1]) / Integer.parseInt(params[0]));
    }
}
