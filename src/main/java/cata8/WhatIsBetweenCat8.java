package cata8;

import java.util.stream.IntStream;

public class WhatIsBetweenCat8 {
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b)
                .toArray();
    }
}
