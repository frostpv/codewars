package cata7;

public class SimpleConsecutivePairs {
    public static int solve(int[] arr) {
        int res = 0;
        if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i = i + 2) {
                if (arr[i] + 1 == arr[i + 1] || arr[i + 1] + 1 == arr[i]) {
                    res++;
                }
            }
        }
        return res;
    }
}
