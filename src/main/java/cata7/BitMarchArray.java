package cata7;

import java.util.Arrays;

public class BitMarchArray {
    public static int[][] BitMarch(int n) {
        int[][] ints = new int[9 - n][8];
        for (int i = 0; i < ints.length; i++) {
            Arrays.fill(ints[i], 8 - i - n, 8 - i, 1);
        }
        return ints;
    }
}
