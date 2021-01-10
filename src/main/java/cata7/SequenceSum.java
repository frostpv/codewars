package cata7;

import java.util.stream.IntStream;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        return IntStream
                .rangeClosed(0, Math.abs(n))
                .map(SequenceSum::oneSequenceSum)
                .map(x -> isMinusDigit(n, x))
                .toArray();
    }

    private static int oneSequenceSum(int n) {
        return IntStream
                .rangeClosed(0, n)
                .sum();
    }

    private static int isMinusDigit(int n, int digit) {
        return (n < 0) ? digit * -1 : digit;
    }
}
