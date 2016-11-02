package sg.kristjan.topcoder.unique_triangles;

import java.util.Arrays;

class Triangle {
    private double ab;
    private double bc;
    private double ca;
    private double[] angles = new double[3];
    private static final double ROUND = 100000000.0;
    public double[] getAngles() {
        return angles;
    }

    Triangle(Point a, Point b, Point c) {
        this.ab = a.dist(b);
        this.bc = b.dist(c);
        this.ca = c.dist(a);
        angles[0] = angleCos(a, b, c);
        angles[1] = angleCos(b, c, a);
        angles[2] = angleCos(c, a, b);
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

    private double angleCos(Point a, Point b, Point c) {
        Point vecAb = new Point(b.x - a.x, b.y - a.y);
        Point vecBc = new Point(c.x - b.x, c.y - b.y);
        return Math.round(((vecAb.x * vecBc.x + vecAb.y * vecBc.y) / (a.dist(b) * b.dist(c))) * ROUND) / ROUND;
    }
}
