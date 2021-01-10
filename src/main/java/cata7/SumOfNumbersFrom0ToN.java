package cata7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfNumbersFrom0ToN {
}

class SequenceSum2 {
    public static String showSequence(int value) {
        if (value == 0) {
            return "0=0";
        }
        if (value < 0) {
            return value+"<0";
        }
        int[] arr = IntStream.rangeClosed(0, value).toArray();
        int sum = Arrays.stream(arr).sum();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : arr) {
            stringBuilder.append(i + " ");
        }
        return stringBuilder.toString()
                .trim()
                .replaceAll(" ", "+") + " = " + sum;
    }
}
