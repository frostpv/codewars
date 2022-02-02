package cata7;

import java.util.Arrays;
import java.util.List;


public class NiceArray {
    /**
     * A Nice array is defined to be an array where for every value n in the array,
     * there is also an element n-1 or n+1 in the array.
     **/
    public static boolean isNice(Integer[] arr) {
        List<Integer> integers = Arrays.asList(arr);
        boolean res = false;
        for (Integer integer : arr) {
            if (integers.contains(integer + 1) || integers.contains(integer - 1)) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }
}
