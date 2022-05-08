package cata7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PossibilitiesArray {
    public static boolean isAllPossibilities(int[] arg) {
        Arrays.sort(arg);
        return arg.length > 0
                && IntStream.range(0, arg.length)
                .allMatch(x -> arg[x] == x);
    }
}
