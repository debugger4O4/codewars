// https://www.codewars.com/kata/60a58520c42fb60055546ce5/train/java

package kyu_4.survivors_ep5.java;

import java.util.*;

public class Kata {

    public static String survivors(String[] arr) {
        List<char[]> board = new ArrayList<>();
        for (String s : arr) {
            board.add(s.toCharArray());
        }
        List<List<int[]>> groups = findGroups(board);
        return removeLetters(board, groups);
    }

    private static List<List<int[]>> findGroups(List<char[]> board) {
        List<List<int[]>> groups = new ArrayList<>();
        boolean[][] visited = new boolean[board.size()][];
        for (int i = 0; i < board.size(); i++) {
            visited[i] = new boolean[board.get(i).length];
        }
        for (int r = 0; r < board.size(); r++) {
            for (int c = 0; c < board.get(r).length; c++) {
                if (board.get(r)[c] != ' ' && !visited[r][c]) {
                    List<int[]> group = bfs(board, r, c, visited);
                    groups.add(group);
                }
            }
        }
        return groups;
    }

    private static List<int[]> bfs(List<char[]> board, int startRow, int startCol, boolean[][] visited) {
        List<int[]> group = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            group.add(current);
            for (int[] neighbor : neighbors(board, current[0], current[1])) {
                if (!visited[neighbor[0]][neighbor[1]]) {
                    visited[neighbor[0]][neighbor[1]] = true;
                    queue.add(neighbor);
                }
            }
        }
        return group;
    }

    private static List<int[]> neighbors(List<char[]> grid, int r, int c) {
        List<int[]> result = new ArrayList<>();
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < grid.size() && nc >= 0 && nc < grid.get(nr).length && grid.get(nr)[nc] != ' ') {
                result.add(new int[]{nr, nc});
            }
        }
        return result;
    }

    private static String removeLetters(List<char[]> board, List<List<int[]>> groups) {
        Set<int[]> removes = new HashSet<>();

        for (int i = 0; i < groups.size(); i++) {
            List<int[]> group1 = groups.get(i);
            int range = group1.size();

            for (int j = 0; j < groups.size(); j++) {
                if (i == j) continue;

                List<int[]> group2 = groups.get(j);

                for (int[] g1 : group1) {
                    for (int[] g2 : group2) {
                        if (chebyshev(g1[0], g1[1], g2[0], g2[1]) <= range) {
                            removes.add(g2);
                        }
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (List<int[]> group : groups) {
            for (int[] i : group) {
                if (!removes.contains(i)) {
                    result.append(board.get(i[0])[i[1]]);
                }
            }
        }

        return result.toString();
    }

    private static int chebyshev(int r1, int c1, int r2, int c2) {
        return Math.max(Math.abs(r1 - r2), Math.abs(c1 - c2));
    }
}
