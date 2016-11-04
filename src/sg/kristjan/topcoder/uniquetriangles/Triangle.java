package sg.kristjan.topcoder.uniquetriangles;

import java.util.Arrays;

class Triangle {
    private double ab;
    private double bc;
    private double ca;
    private double[] angles = new double[3];
    private static final double ROUND = 100000000.0;

    Triangle(Point a, Point b, Point c) {
        this.ab = a.dist(b);
        this.bc = b.dist(c);
        this.ca = c.dist(a);
        angles[0] = angleCosine(a, b, c);
        angles[1] = angleCosine(b, c, a);
        angles[2] = angleCosine(c, a, b);
        Arrays.sort(angles);
    }

    public boolean equals(Object o) {
        return o.getClass() == Triangle.class && (o == this || Arrays.equals(angles, ((Triangle) o).angles));
    }

    public int hashCode() {
        return Arrays.hashCode(angles);
    }

    boolean isTriangle() {
        if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
            return !(Math.abs(angles[0]) == 1.0 || Math.abs(angles[1]) == 1.0 || Math.abs(angles[2]) == 1.0);
        }
        return false;
    }

    private double angleCosine(Point a, Point b, Point c) {
        Point firstVector = new Point(b.x - a.x, b.y - a.y);
        Point secondVector = new Point(c.x - b.x, c.y - b.y);
        return Math.round(((firstVector.x * secondVector.x + firstVector.y * secondVector.y) / (a.dist(b) * b.dist(c))) * ROUND) / ROUND;
    }
}
