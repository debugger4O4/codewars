// https://www.codewars.com/kata/5765870e190b1472ec0022a2/train/java

package kyu_4.path_finder_1_can_you_reach_the_exit.java;

public class Finder {


    static boolean pathFinder(String maze) {
        final String[] rows = maze.split("\n");
        final char[][] grid = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            grid[i] = rows[i].toCharArray();
        }
        return findExit(new Position(0, 0), grid);
    }

    private static boolean findExit(Position p, char[][] g) {
        if (p.x == g.length - 1 && p.x == p.y) {
            return true;
        }
        if (!p.onPath(g)) {
            return false;
        }
        g[p.y][p.x] = 'B';
        final Position[] n = p.neighbours();
        return findExit(n[0], g) | findExit(n[1], g) | findExit(n[2], g) | findExit(n[3], g);
    }

    private record Position(int x, int y) {
        Position[] neighbours() {
                return new Position[]{new Position(x - 1, y), new Position(x + 1, y), new Position(x, y - 1), new Position(x, y + 1)};
            }
            boolean onPath(char[][] g) {
                return x >= 0 && x < g[0].length && y >= 0 && y < g.length && g[y][x] == '.';
            }
        }
}
