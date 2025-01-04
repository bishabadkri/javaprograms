/* SODUKU solver */
public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board)) {
                                return true;
                            }
                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // Solved
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int x = 0; x < board.length; x++) {
            if (board[row][x] == num || board[x][col] == num || 
                board[3 * (row / 3) + x / 3][3 * (col / 3) + x % 3] == num) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int d = 0; d < board[r].length; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((r + 1) % Math.sqrt(board.length) == 0) {
                System.out.print("");
            }
        }
    }
}
