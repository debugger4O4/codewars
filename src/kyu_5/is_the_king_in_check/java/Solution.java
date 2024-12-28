package kyu_5.is_the_king_in_check.java;

public class Solution {
    public static boolean isTheKinginCheck(char[][] board) {
        int kingRow = 0;
        int kingCol = 0;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == 'K') {
                    kingRow = row;
                    kingCol = col;
                    break;
                }
            }
        }

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == 'Q' || board[row][col] == 'B' || board[row][col] == 'N' ||
                        board[row][col] == 'P' || board[row][col] == 'R') {

                    if (canAttack(row, col, kingRow, kingCol, board)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean canAttack(int row, int col, int kingRow, int kingCol, char[][] board) {
        return switch (board[row][col]) {
            case 'Q' -> (row == kingRow || col == kingCol || Math.abs(row - kingRow) == Math.abs(col - kingCol)) &&
                    isPathClear(row, col, kingRow, kingCol, board);
            case 'B' -> Math.abs(row - kingRow) == Math.abs(col - kingCol) &&
                    isPathClear(row, col, kingRow, kingCol, board);
            case 'N' -> (Math.abs(row - kingRow) == 2 && Math.abs(col - kingCol) == 1) ||
                    (Math.abs(row - kingRow) == 1 && Math.abs(col - kingCol) == 2);
            case 'R' -> (row == kingRow || col == kingCol) &&
                    isPathClear(row, col, kingRow, kingCol, board);
            case 'P' -> row == kingRow - 1 && Math.abs(col - kingCol) == 1;
            default -> false;
        };
    }

    private static boolean isPathClear(int row1, int col1, int row2, int col2, char[][] board) {
        int dRow = Integer.signum(row2 - row1);
        int dCol = Integer.signum(col2 - col1);
        int row = row1 + dRow;
        int col = col1 + dCol;

        while (row != row2 || col != col2) {
            if (board[row][col] != ' ') {
                return false;
            }
            row += dRow;
            col += dCol;
        }

        return true;
    }
}
