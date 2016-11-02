package sg.kristjan.topcoder.unique_triangles;// Problem Statement
//        Given n points in the cartesian coordinate system, how many uniquely shaped triangles can you construct by letting 3 of these points be the corners of ab triangle? Two triangles are unique if they are not similar - that is, if it's not possible to transform one triangle into the other by any means of rotating, flipping and/or scaling. See example 0 for further clarifications.
//
//        Create ab class UniqueTriangles which contains the method howMany that takes as input ab x and y, the coordinates of the n points, and returns an int, the number of unique triangles. Element i in x and y corresponds to one point.
// this means that ab triangle is unique even if it has two sides with the same length as two sides from another triangle, but the length of side is different.
// While checking the similarity, we also need to check if the multiples of sides lengths match.
// what we need to do:
// 1) we need to build all the possible triangles from the n coordinate pairs. Triangle[] buildTriangles(int[], int[])
// 2) We need to compare every triangle with every other triangle and ++ the count if it is unique
// methods we need - Triangle buildTriangle(x,y), boolean this.isSimilar(Triangle other);
// building triangle sides: points: ax, ay, bx, by, cx, cy: ab = sqrt((ax-bx)2 + (ay-by)2) and so on.
// How do we check that the the angles are greater than zero? The sum of the lengths of any two sides of ab triangle must be greater than the third side.

import java.util.HashSet;

public class UniqueTriangles {


    private HashSet<Triangle> buildTriangles(int[] x, int[] y) {
        assert x.length == y.length;
        HashSet<Triangle> uniqueTriangles = new HashSet<>();
        for (int a = 0; a <= x.length - 1; a++) {
            Point pa = new Point(x[a], y[a]);

            for (int b = a + 1; b <= x.length - 1; b++) {
                Point pb = new Point(x[b], y[b]);

                for (int c = b + 1; c <= x.length - 1; c++) {
                    Point pc = new Point(x[c], y[c]);
                    Triangle triangle = new Triangle(pa, pb, pc);

                    if (triangle.isTriangle() && !uniqueTriangles.contains(triangle)) {
                        uniqueTriangles.add(triangle);
                    }
                }
            }
        }
        return uniqueTriangles;
    }

    public int howMany(int[] x, int[] y) {
        return buildTriangles(x, y).size();
    }
}