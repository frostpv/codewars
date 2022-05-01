package cata8;

public class CompareWithMargin {
    public static int closeCompare(double a, double b) {
        return Double.compare(a,b);
    }

    public static int closeCompare(double a, double b, double margin) {
        return Math.abs(a - b) <= margin
                ? 0
                : closeCompare(a, b);
    }
}
