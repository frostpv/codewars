package cata8;

import java.util.Arrays;
import java.util.Comparator;

public class GravityFlip {
    private static final char RIGHT_D = 'R';

    public static int[] flip(char dir, int[] arr) {
        return dir == RIGHT_D
                ? sort(arr)
                : reverseFlip(arr);
    }

    private static int[] reverseFlip(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
