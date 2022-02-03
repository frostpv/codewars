package cata7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestPairKata {
    /**
     * Largest pair sum in array
     * */
    public static int largestPairSum(int[] numbers) {
        Arrays.sort(numbers);
        int i = numbers.length - 1;
        if (i > 0) {
            return numbers[i] + numbers[i - 1];
        }
        return 0;
    }
}
