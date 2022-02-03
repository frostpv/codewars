package cata7;

import java.util.Arrays;

public class NiceArray {
    /**
     * A Nice array is defined to be an array where for every value n in the array,
     * there is also an element n-1 or n+1 in the array.
     **/
    public static boolean isNice(Integer[] arr) {
        boolean res = false;
        for (Integer integer : arr) {
            res = Arrays.asList(arr).contains(integer + 1) || Arrays.asList(arr).contains(integer - 1);
            if (!res) {
                break;
            }
        }
        return res;
    }
}
