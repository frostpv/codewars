package cata7;

import java.util.stream.Collectors;

public class SmallestValueOfAnArray {
}

class Arrays {
    private static String VALUE = "value";
    private static String INDEX = "index";

    public static int findSmallest(final int[] numbers, final String toReturn) {
        if (toReturn.equals(VALUE)) {
            return getMin(numbers);
        }
        if (toReturn.equals(INDEX)) {
            return getMinIndex(numbers);
        }

        return 0;
    }

    private static int getMin(int[] numbers) {
        return java.util.Arrays.stream(numbers)
                .min()
                .getAsInt();
    }

    private static int getMinIndex(int[] numbers) {
        return java.util.Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList())
                .indexOf(getMin(numbers));
    }
}
