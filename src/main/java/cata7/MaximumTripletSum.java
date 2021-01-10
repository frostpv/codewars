package cata7;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumTripletSum {
    public static int maxTriSum(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct().boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(Integer::valueOf)
                .sum();
    }
}