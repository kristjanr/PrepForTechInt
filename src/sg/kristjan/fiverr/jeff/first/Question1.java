package sg.kristjan.fiverr.jeff.first;

import java.util.HashSet;

/**
 * Created by kristjan on 9/11/16.
 * You have an integer matrix representing a plot of land,
 * where the value at that location represents the height above sea level.
 * A value of zero indicates water.
 * A pond is a region of water connected vertically, horizontally, or diagonally.
 * The size of the pond is the total number of connected water cells.
 * Write a method to compute the sizes of all ponds in the matrix.
 */

class Cell {
    int row;
    int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }
}

public class Question1 {
    public static int[] sizesOfPonds(int[][] matrix) {
        HashSet<Cell> cells = new HashSet<>();
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                Cell cell = new Cell(i, j);
                if (cells.contains(cell)) {
                    continue;
                }
                if (matrix[i][j] == 0) {
                    addConnectedZeroCells(cell, matrix);
                }
            }
        }
        return null;
    }


    private static void addConnectedZeroCells(Cell cell, int[][] matrix) {
        Cell topLeft = createNeighbor(cell.row - 1, cell.column - 1, matrix);

    }


    private static Cell createNeighbor(int row, int column, int[][] matrix) {
        if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[0].length) {
            return null;
        }
        return new Cell(row, column);
    }
}


