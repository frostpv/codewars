package cata7;

import java.util.Arrays;

public class SortByBinaryOnes {
    public static Integer[] sort(Integer list[]) {
        Arrays.sort(list, (a, b) -> Integer.bitCount(a) > Integer.bitCount(b)
                ? -1
                : Integer.bitCount(a) < Integer.bitCount(b)
                ? 1 : a.compareTo(b));
        return list;
    }
}
