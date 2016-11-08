package sg.kristjan.ctci.ch08.ex8_2;

/**
 * Created by kristjan on 8/11/16.
 */
public class Test {
    public static void main(String[] args) {
        boolean[][] walls = new boolean[3][9];
        Labyrinth lab = new Labyrinth();
        System.out.println(lab.findPath(walls));

        walls = new boolean[9][9];
        walls[0][3] = Labyrinth.CLOSED;
        walls[1][0] = Labyrinth.CLOSED;
        walls[2][3] = Labyrinth.CLOSED;
        walls[2][3] = Labyrinth.CLOSED;
        walls[3][1] = Labyrinth.CLOSED;
        walls[3][3] = Labyrinth.CLOSED;
        walls[4][3] = Labyrinth.CLOSED;
        walls[5][3] = Labyrinth.CLOSED;
        walls[6][3] = Labyrinth.CLOSED;
        walls[7][3] = Labyrinth.CLOSED;
        System.out.println(lab.findPath(walls));
    }
}
