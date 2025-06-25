// https://www.codewars.com/kata/6846eb0f532729229195d975/train/java

package kyu_6.exploding_robots.java;

public class Kata {
    public static boolean willRobotsCollide(int x1, int y1, int x2, int y2, String commands) {
        int xSteps = Math.abs(x1 - x2);
        int ySteps = Math.abs(y1 - y2);
        long xCount = commands.chars().filter(x -> x == 'L').count() + commands.chars().filter(x -> x == 'R').count();
        long yCount = commands.chars().filter(x -> x == 'U').count() + commands.chars().filter(x -> x == 'D').count();
        return xSteps <= xCount && ySteps <= yCount;
    }
}
