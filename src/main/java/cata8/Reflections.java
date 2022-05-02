package cata8;

public class Reflections {
    public static int[] reflectPoint(int[] p, int[] q) {
        return new int[]{nextCoordinate(p[0],q[0]),nextCoordinate(p[1],q[1])};
    }

    private static int nextCoordinate(int first, int second) {
        return second + (second - first);
    }
}
