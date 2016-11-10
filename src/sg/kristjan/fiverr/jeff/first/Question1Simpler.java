package sg.kristjan.fiverr.jeff.first;


import java.util.ArrayList;

/**
 * You have an integer matrix representing a plot of land,
 * where the value at that location represents the height above sea level.
 * A value of zero indicates water.
 * A pond is a region of water connected vertically, horizontally, or diagonally.
 * The size of the pond is the total number of connected water cells.
 * Write a method to compute the sizes of all ponds in the matrix.
 */
class Land {
    private int[][] matrix;

    public Land(int[][] matrix) {
        this.matrix = matrix;
    }

    public ArrayList<Integer> sizesOfPonds() {
        ArrayList<Integer> ponds = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return ponds;
        }
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                int pondSize = getPondSize(i, j);
                if (pondSize > 0) {
                    ponds.add(pondSize);
                }
            }
        }
        return ponds;
    }


    private int getPondSize(int row, int column) {
        if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[0].length) {
            return 0;
        }
        int cell = matrix[row][column];
        matrix[row][column] = -1;
        if (cell != 0) {
            return 0;
        }
        int topLeft = getPondSize(row - 1, column - 1);
        int top = getPondSize(row - 1, column);
        int topRight = getPondSize(row - 1, column + 1);
        int right = getPondSize(row, column + 1);
        int bottomRight = getPondSize(row + 1, column + 1);
        int bottom = getPondSize(row + 1, column);
        int bottomLeft = getPondSize(row + 1, column - 1);
        int left = getPondSize(row, column - 1);
        return 1 + topLeft + top + topRight + right + bottomRight + bottom + bottomLeft + left;
    }
}

public class Question1Simpler {
    public static void main(String[] args) {
        int[][] matrix = new int[30000][3000];
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                matrix[i][j] = 1;
            }
        }
        matrix[0][0] = 0;
        matrix[1][2] = 0;
        Land land = new Land(matrix);
        System.out.println(land.sizesOfPonds());
    }

}