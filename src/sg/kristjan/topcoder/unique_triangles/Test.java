package sg.kristjan.topcoder.unique_triangles;

/**
 * Created by kristjan on 2/11/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] x = new int[]{-4, 2, 5, -5, -4, -4, 3, 1, 1, 1, 2, 0, 1, 1, 5};
        int[] y = new int[]{5, 2, -4, 2, 1, 3, 1, -1, 2, 0, 1, 4, -3, 1, 0};
        UniqueTriangles ut = new UniqueTriangles();
        System.out.println(ut.howMany(x, y));

    /*    int[] x = new int[]{0, 8, -3, 1000, -9500, -1};
        int[] y = new int[]{7, 15, 4, 1007, -9493, 6};
        Point a = new Point(x[0], y[0]);
        Point b = new Point(x[1], y[1]);
        Point c = new Point(x[2], y[2]);
        Triangle foo = new Triangle(a, b, c);
        System.out.println(foo.isTriangle());*/

    }
}
