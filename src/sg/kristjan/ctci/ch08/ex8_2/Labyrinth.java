package sg.kristjan.ctci.ch08.ex8_2;

import java.util.LinkedList;


public class Labyrinth {
    public static final boolean CLOSED = true;
    private boolean[][] walls;
    private LinkedList<Cell> path;

    public LinkedList<Cell> findPath(boolean[][] walls) {
        if (walls == null || walls.length == 0) return null;
        this.walls = walls;
        path = new LinkedList<>();
        if (step(walls.length - 1, walls[0].length - 1)) return path;
        return null;
    }


    private boolean step(int row, int column) {
        if (row == 0 && column == 0) {
            updatePosition(row, column);
            return true;
        }
        if (row < 0 || column < 0) return false;
        if (walls[row][column] == CLOSED) return false;

        if (goLeft(row, column) || goUp(row, column)) {
            updatePosition(row, column);
            return true;
        } else {
            return false;
        }
    }

    private boolean goUp(int row, int column) {
        return step(row - 1, column);
    }

    private boolean goLeft(int row, int column) {
        return step(row, column - 1);
    }

    private void updatePosition(int row, int column) {
        Cell c = new Cell(row, column);
        path.add(c);
    }
}


class Cell {
    private int row;
    private int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String toString() {
        return row + ":" + column;
    }
}