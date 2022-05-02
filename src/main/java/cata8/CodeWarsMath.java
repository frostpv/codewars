package cata8;

public class CodeWarsMath {

    public static int nearestSq(final int n) {

        int toBack = 0;
        int toForward = 0;

        for (int i = n; i > 0; i--) {
            if (Math.sqrt(i) % 1 == 0) {
                toBack = i;
                break;
            }
        }

        for (int x = n; x > 0; x++) {
            if (Math.sqrt(x) % 1 == 0) {
                toForward = x;
                break;
            }
        }

        return n-toBack < toForward - n
                ? toBack
                : toForward;
    }
}
