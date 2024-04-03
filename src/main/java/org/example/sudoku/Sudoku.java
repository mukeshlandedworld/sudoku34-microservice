package org.example.sudoku;

public class Sudoku {
    private int[][] grid;

    public Sudoku(int[][] grid) {
        this.grid = grid;
    }

    // Method to validate the entered number
    public boolean isValid(int row, int col, int num) {
        // Check if the number is already present in the row
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num) {
                return false;
            }
        }

        // Check if the number is already present in the column
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == num) {
                return false;
            }
        }

        // Check if the number is already present in the 3x3 subgrid
        int subGridRowStart = row - row % 3;
        int subGridColStart = col - col % 3;
        for (int i = subGridRowStart; i < subGridRowStart + 3; i++) {
            for (int j = subGridColStart; j < subGridColStart + 3; j++) {
                if (grid[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}

